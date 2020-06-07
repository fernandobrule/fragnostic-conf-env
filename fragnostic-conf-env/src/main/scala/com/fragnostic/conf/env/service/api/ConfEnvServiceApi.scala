package com.fragnostic.conf.env.service.api

import java.util.Locale

/**
 * Configuration from Environment
 */
trait ConfEnvServiceApi {

  def confEnvServiceApi: ConfEnvServiceApi

  trait ConfEnvServiceApi {

    def getString(key: String): Either[String, Option[String]]

    def getString(locale: Locale, key: String): Either[String, Option[String]]

    def getShort(key: String): Either[String, Option[Short]]

    def getInt(key: String): Either[String, Option[Int]]

    def getLong(key: String): Either[String, Option[Long]]

  }

}
