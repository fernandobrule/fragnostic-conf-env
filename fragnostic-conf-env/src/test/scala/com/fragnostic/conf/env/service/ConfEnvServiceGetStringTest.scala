package com.fragnostic.conf.env.service

class ConfEnvServiceGetStringTest extends BaseConfTest {

  describe("Conf Env Service Get String Test") {

    it("Can Get Value As String") {

      val opt = CakeConfEnvService.confEnvService.getString(key = keyEnv) fold (
        error => throw new IllegalStateException(error),
        opt => opt)

      assertResult(opt.get)(valueEnv)
    }

    it("Can Get Value As String es/CL") {

      val opt = CakeConfEnvService.confEnvService.getString(localeEsCl, keyEnv) fold (
        error => throw new IllegalStateException(error),
        opt => opt)

      assertResult(opt.get)(valueEnvEsCl)
    }

    it("Can Get Value As String pt/BR") {

      val opt = CakeConfEnvService.confEnvService.getString(localePtBr, keyEnv) fold (
        error => throw new IllegalStateException(error),
        opt => opt)

      assertResult(opt.get)(valueEnvPtBr)
    }

    it("Can Get Value As String en/US") {

      val opt = CakeConfEnvService.confEnvService.getString(localeEnUs, keyEnv) fold (
        error => throw new IllegalStateException(error),
        opt => opt //
      )

      assert(opt !== None)
      assertResult(opt.get)(valueEnvEnUs)

    }

  }

}
