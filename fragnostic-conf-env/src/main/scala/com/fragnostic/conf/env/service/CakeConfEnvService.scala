package com.fragnostic.conf.env.service

import com.fragnostic.conf.env.service.impl.ConfEnvServiceImpl

object CakeConfEnvService {

  val confServiceApi = (new ConfEnvServiceImpl {
  }).confServiceApi

}
