package com.fragnostic.conf.env.service

class ConfEnvServiceGetStringTest extends BaseConfTest {

  describe("Conf Env Service Get String Test") {

    it("Can Get Value As String") {

      val value = CakeConfEnvService.confEnvService.getString(key = keyEnv) fold (
        error => throw new IllegalStateException(error),
        value => value //
      )

      assertResult(valueEnv)(value)
    }

    it("Can Not Get Value As String") {

      val value = CakeConfEnvService.confEnvService.getString(key = keyEnvThatDoesNotExists) fold (
        error => error,
        value => value //
      )

      assertResult(valueEnvThatDoesNotExists)(value)
    }

    it("Can Get Value As String es/CL") {

      val value = CakeConfEnvService.confEnvService.getString(localeEsCl, keyEnv) fold (
        error => throw new IllegalStateException(error),
        value => value //
      )

      assertResult(valueEnvEsCl)(value)
    }

    it("Can Get Value As String pt/BR") {

      val value = CakeConfEnvService.confEnvService.getString(localePtBr, keyEnv) fold (
        error => throw new IllegalStateException(error),
        value => value //
      )

      assertResult(valueEnvPtBr)(value)
    }

    it("Can Get Value As String en/US") {

      val value = CakeConfEnvService.confEnvService.getString(localeEnUs, keyEnv) fold (
        error => throw new IllegalStateException(error),
        value => value //
      )

      assertResult(valueEnvEnUs)(value)

    }

  }

}
