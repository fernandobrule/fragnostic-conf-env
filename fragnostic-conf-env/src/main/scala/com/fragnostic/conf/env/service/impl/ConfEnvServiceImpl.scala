package com.fragnostic.conf.env.service.impl

import com.fragnostic.conf.base.service.api.ConfServiceApi
import com.fragnostic.conf.base.service.support.{ KeySupport, TypesSupport }

/**
 * Configuration from Environment
 */
trait ConfEnvServiceImpl extends ConfServiceApi {

  def confServiceApi = new DefaultConfEnvService

  class DefaultConfEnvService extends ConfServiceApi with TypesSupport with KeySupport {

    override def getString(key: String): Either[String, Option[String]] =
      Right(Option(System.getenv(key)))

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
