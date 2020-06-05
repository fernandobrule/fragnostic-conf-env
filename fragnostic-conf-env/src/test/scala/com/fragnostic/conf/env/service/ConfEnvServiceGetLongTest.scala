package com.fragnostic.conf.env.service

import com.fragnostic.conf.env.service.support.BaseConfTest

class ConfEnvServiceGetLongTest extends BaseConfTest {

  describe("Conf Env Service Get Long Test") {

    it("Can Get Value As Long") {

      val opt = CakeConfEnvService.confEnvServiceApi.getLong(key = keyEnvLong) fold (
        error => throw new IllegalStateException(error),
        opt => opt)

      opt should not be None
      opt.get should be(valueEnvLong)

    }

  }

}

