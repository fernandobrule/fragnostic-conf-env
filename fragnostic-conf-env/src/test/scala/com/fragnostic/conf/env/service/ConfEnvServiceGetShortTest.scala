package com.fragnostic.conf.env.service

class ConfEnvServiceGetShortTest extends BaseConfTest {

  describe("Conf Env Service Get Short Test") {

    it("Can Get Value As Short") {

      val opt = CakeConfEnvService.confEnvService.getShort(key = keyEnvShort) fold (
        error => throw new IllegalStateException(error),
        opt => opt)

      opt should not be None
      opt.get should be(valueEnvShort)

    }

  }

}

