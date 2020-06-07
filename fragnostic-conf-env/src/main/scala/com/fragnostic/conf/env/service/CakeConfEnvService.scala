package com.fragnostic.conf.env.service

import com.fragnostic.conf.base.service.api.ConfServiceApi
import com.fragnostic.conf.env.service.impl.ConfEnvServiceImpl

object CakeConfEnvService {

  val instance: ConfServiceApi = new ConfEnvServiceImpl {
  }

  val confEnvServiceApi = instance.confServiceApi

}
