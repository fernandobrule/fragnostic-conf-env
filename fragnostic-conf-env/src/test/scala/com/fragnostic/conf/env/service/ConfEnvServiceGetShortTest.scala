package com.fragnostic.conf.env.service

class ConfEnvServiceGetShortTest extends BaseConfTest {

  describe("Conf Env Service Get Short Test") {

    it("Can Get Value As Short") {

      val value = CakeConfEnvService.confEnvService.getShort(key = keyEnvShort) fold (
        error => throw new IllegalStateException(error),
        value => value //
      )

      assertResult(valueEnvShort)(value)
    }

    it("Can Not Get Value As Short") {

      val value = CakeConfEnvService.confEnvService.getShort(key = keyEnvThatDoesNotExists) fold (
        error => error,
        value => value //
      )

      assertResult(valueEnvThatDoesNotExists)(value)
    }

  }

}

