package com.fragnostic.conf.env.service

import com.fragnostic.conf.env.service.impl.ConfEnvServiceImpl

object CakeConfEnvService {

  lazy val confEnvService = confEnvServicePiece.confServiceApi

  lazy val confEnvServicePiece = new ConfEnvServiceImpl {
  }

}
