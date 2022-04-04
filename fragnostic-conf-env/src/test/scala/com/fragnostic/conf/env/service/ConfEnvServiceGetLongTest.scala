package com.fragnostic.conf.env.service

class ConfEnvServiceGetLongTest extends BaseConfTest {

  describe("Conf Env Service Get Long Test") {

    it("Can Get Value As Long") {

      val value = CakeConfEnvService.confEnvService.getLong(key = keyEnvLong) fold (
        error => throw new IllegalStateException(error),
        value => value //
      )

      assertResult(valueEnvLong)(value)
    }

    it("Can Not Get Value As Long") {

      val value = CakeConfEnvService.confEnvService.getLong(key = keyEnvThatDoesNotExists) fold (
        error => error,
        value => value //
      )

      assertResult(valueEnvThatDoesNotExists)(value)
    }

  }

}

