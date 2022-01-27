package com.fragnostic.conf.env.service.impl

import com.fragnostic.conf.base.service.api.ConfServiceApi
import com.fragnostic.conf.base.service.support.{ KeyComposeSupport, TypesSupport }
import org.slf4j.{ Logger, LoggerFactory }

import java.util.Locale
import scala.util.Try

/**
 * Configuration from Environment
 */
trait ConfEnvServiceImpl extends ConfServiceApi {

  private[this] val logger: Logger = LoggerFactory.getLogger("ConfEnvServiceImpl")

  def confServiceApi = new DefaultConfEnvService

  class DefaultConfEnvService extends ConfServiceApi with TypesSupport with KeyComposeSupport {

    override def getString(key: String): Either[String, String] =
      Try(System.getenv(key)) fold (
        error => {
          logger.error(s"getString() - erro trying to get key[$key], $error")
          Left("conf.env.service.get.string.error")
        },
        theString => {
          Option(theString) match {
            case None => Left(s"conf.env.service.get.string.error.envar__${key}__does.not.exists")
            case Some(value) => Right(value)
          }
        } //
      )

    override def getString(locale: Locale, key: String): Either[String, String] =
      Right(System.getenv(compose(locale, key)))

    override def getShort(key: String): Either[String, Short] =
      getString(key = key) fold (
        error => Left(error),
        opt => toShort(opt) fold (
          error => Left(error),
          newShort => Right(newShort) //
        ) //
      )

    override def getInt(key: String): Either[String, Int] =
      getString(key = key) fold (
        error => Left(error),
        opt => toInt(opt) //
      )

    override def getLong(key: String): Either[String, Long] =
      getString(key = key) fold (
        error => Left(error),
        opt => toLong(opt) //
      )

    override def getBoolean(key: String): Either[String, Boolean] =
      getString(key = key) fold (
        error => Left(error),
        opt => toBoolean(opt) //
      )

  }

}
