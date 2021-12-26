package com.fragnostic.conf.env.service

class ConfEnvServiceGetBooleanTest extends BaseConfTest {

  describe("Conf Env Service Get Boolean Test") {

    it("Can Get Value As Boolean") {

      val opt = CakeConfEnvService.confEnvService.getBoolean(key = keyEnvBoolean) fold (
        error => throw new IllegalStateException(error),
        opt => opt)

      assertResult(opt.get)(valueEnvBoolean)

    }

  }

}

