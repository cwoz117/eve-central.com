package com.evecentral

import cc.spray.http.MediaTypes._
import java.util.concurrent.TimeUnit
import akka.actor.{PoisonPill, Actor, Scheduler}
import cc.spray.Directives
import cc.spray.ScalateSupport

trait FrontEndService extends Directives with ScalateSupport {

  val frontEndService = {
      path("") {
        get {
          render("com/evecentral/templates/test.ssp", Map())
        }
      }
  }

}