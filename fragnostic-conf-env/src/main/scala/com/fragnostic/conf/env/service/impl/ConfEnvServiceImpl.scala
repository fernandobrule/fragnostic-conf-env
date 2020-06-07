package com.fragnostic.conf.env.service.impl

import java.util.Locale

import com.fragnostic.conf.env.service.api.ConfEnvServiceApi
import com.fragnostic.conf.service.support.{ KeySupport, TypesSupport }

/**
 * Configuration from Environment
 */
trait ConfEnvServiceImpl extends ConfEnvServiceApi {

  def confEnvServiceApi = new DefaultConfEnvService

  class DefaultConfEnvService extends ConfEnvServiceApi with TypesSupport with KeySupport {

    override def getString(key: String): Either[String, Option[String]] =
      Right(Option(System.getenv(key)))

    override def getString(locale: Locale, key: String): Either[String, Option[String]] =
      Right(Option(System.getenv(compose(Some(locale), key))))

    override def getShort(key: String): Either[String, Option[Short]] =
      getString(key = key) fold (
        error => Left(error),
        opt => toShort(opt))

    override def getInt(key: String): Either[String, Option[Int]] =
      getString(key = key) fold (
        error => Left(error),
        opt => toInt(opt))

    override def getLong(key: String): Either[String, Option[Long]] =
      getString(key = key) fold (
        error => Left(error),
        opt => toLong(opt))

  }

}