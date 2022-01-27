package com.fragnostic.conf.env.service

class ConfEnvServiceGetIntTest extends BaseConfTest {

  describe("Conf Env Service Get Int Test") {

    it("Can Get Value As Int") {

      val value = CakeConfEnvService.confEnvService.getInt(key = keyEnvInt) fold (
        error => throw new IllegalStateException(error),
        value => value //
      )

      assertResult(valueEnvInt)(value)
    }

    it("Can Not Get Value As Int") {

      val value = CakeConfEnvService.confEnvService.getInt(key = keyEnvThatDoesNotExists) fold (
        error => error,
        value => value //
      )

      assertResult(valueEnvThatDoesNotExists)(value)
    }

  }

}

