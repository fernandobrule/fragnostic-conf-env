package com.fragnostic.conf.env.service

class ConfEnvServiceGetIntTest extends BaseConfTest {

  describe("Conf Env Service Get Int Test") {

    it("Can Get Value As Int") {

      val opt = CakeConfEnvService.confEnvService.getInt(key = keyEnvInt) fold (
        error => throw new IllegalStateException(error),
        opt => opt //
      )

      assert(opt !== None)
      assertResult(opt.get)(valueEnvInt)

    }

  }

}

