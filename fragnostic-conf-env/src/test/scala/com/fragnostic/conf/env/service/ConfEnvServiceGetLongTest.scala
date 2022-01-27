package com.fragnostic.conf.env.service

class ConfEnvServiceGetLongTest extends BaseConfTest {

  describe("Conf Env Service Get Long Test") {

    it("Can Get Value As Long") {

      val opt = CakeConfEnvService.confEnvService.getLong(key = keyEnvLong) fold (
        error => throw new IllegalStateException(error),
        opt => opt //
      )

      assert(opt !== None)
      assertResult(opt.get)(valueEnvLong)

    }

  }

}

