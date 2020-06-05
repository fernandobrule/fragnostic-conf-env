package com.fragnostic.conf.env.service

import com.fragnostic.conf.env.service.api.ConfEnvServiceApi
import com.fragnostic.conf.env.service.impl.ConfEnvServiceImpl

object CakeConfEnvService {

  val instance: ConfEnvServiceApi = new ConfEnvServiceImpl {
  }

  val confEnvServiceApi = instance.confEnvServiceApi

}
