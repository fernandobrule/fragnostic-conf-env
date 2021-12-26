package com.fragnostic.conf.env.service

import org.scalatest.funspec.AnyFunSpec

import java.util.Locale

trait BaseConfTest extends AnyFunSpec {

  protected val keyEnv: String = "TEST_KEY_ENV"
  protected val valueEnv = "yep"

  protected val keyEnvShort: String = "TEST_KEY_ENV_SHORT"
  protected val valueEnvShort: Short = 123

  protected val keyEnvInt: String = "TEST_KEY_ENV_INT"
  protected val valueEnvInt: Int = 456

  protected val keyEnvLong: String = "TEST_KEY_ENV_LONG"
  protected val valueEnvLong: Long = 789

  protected val keyEnvBoolean: String = "TEST_KEY_ENV_BOOLEAN"
  protected val valueEnvBoolean: Boolean = true

  protected val valueEnvEsCl = "muchas gracias"
  protected val valueEnvEnUs = "many thanks"
  protected val valueEnvPtBr = "muito obrigado"

  //
  // es/CL
  //
  protected val localeEsCl: Locale = new Locale.Builder().setRegion("CL").setLanguage("es").build()
  //
  // pt/BR
  //
  protected val localePtBr: Locale = new Locale.Builder().setRegion("BR").setLanguage("pt").build()
  //
  // en/US
  //
  protected val localeEnUs: Locale = new Locale.Builder().setRegion("US").setLanguage("en").build()

}
