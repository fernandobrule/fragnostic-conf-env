package com.fragnostic.conf.env.service

import com.fragnostic.conf.env.service.support.BaseConfTest

class ConfEnvServiceGetIntTest extends BaseConfTest {

  describe("Conf Env Service Get Int Test") {

    it("Can Get Value As Int") {

      val opt = CakeConfEnvService.confEnvService.getInt(key = keyEnvInt) fold (
        error => throw new IllegalStateException(error),
        opt => opt)

      opt should not be None
      opt.get should be(valueEnvInt)

    }

  }

}

