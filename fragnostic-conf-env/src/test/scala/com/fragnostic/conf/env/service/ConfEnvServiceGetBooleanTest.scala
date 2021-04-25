package com.fragnostic.conf.env.service

import com.fragnostic.conf.env.service.support.BaseConfTest

class ConfEnvServiceGetBooleanTest extends BaseConfTest {

  describe("Conf Env Service Get Boolean Test") {

    it("Can Get Value As Boolean") {

      val opt = CakeConfEnvService.confEnvService.getBoolean(key = keyEnvBoolean) fold (
        error => throw new IllegalStateException(error),
        opt => opt)

      opt should not be None
      opt.get should be(valueEnvBoolean)

    }

  }

}

