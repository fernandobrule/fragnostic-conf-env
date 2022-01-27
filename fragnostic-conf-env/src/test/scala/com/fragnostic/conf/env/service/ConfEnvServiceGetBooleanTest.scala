package com.fragnostic.conf.env.service

class ConfEnvServiceGetBooleanTest extends BaseConfTest {

  describe("Conf Env Service Get Boolean Test") {

    it("Can Get Value As Boolean") {

      val value = CakeConfEnvService.confEnvService.getBoolean(key = keyEnvBoolean) fold (
        error => throw new IllegalStateException(error),
        value => value //
      )

      assertResult(valueEnvBoolean)(value)
    }

    it("Can Not Get Value As Boolean") {

      val value = CakeConfEnvService.confEnvService.getBoolean(key = keyEnvThatDoesNotExists) fold (
        error => error,
        value => value //
      )

      assertResult(valueEnvThatDoesNotExists)(value)
    }

  }

}

