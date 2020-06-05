package com.fragnostic.conf.env.service

import com.fragnostic.conf.env.service.support.BaseConfTest

class ConfEnvServiceGetStringTest extends BaseConfTest {

  describe("Conf Env Service Get String Test") {

    it("Can Get Value As String") {

      val opt = CakeConfEnvService.confEnvServiceApi.getString(key = keyEnv) fold (
        error => throw new IllegalStateException(error),
        opt => opt)

      opt should not be None
      opt.get should be(valueEnv)
    }

    it("Can Get Value As String es/CL") {

      val opt = CakeConfEnvService.confEnvServiceApi.getString(locale = Some(localeEsCl), key = keyEnv) fold (
        error => throw new IllegalStateException(error),
        opt => opt)

      opt should not be None
      opt.get should be(valueEnvEsCl)
    }

    it("Can Get Value As String pt/BR") {

      val opt = CakeConfEnvService.confEnvServiceApi.getString(locale = Some(localePtBr), key = keyEnv) fold (
        error => throw new IllegalStateException(error),
        opt => opt)

      opt should not be None
      opt.get should be(valueEnvPtBr)
    }

    it("Can Get Value As String en/US") {

      val opt = CakeConfEnvService.confEnvServiceApi.getString(locale = Some(localeEnUs), key = keyEnv) fold (
        error => throw new IllegalStateException(error),
        opt => opt)

      opt should not be None
      opt.get should be(valueEnvEnUs)
    }

  }

}
