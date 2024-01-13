package pl.belicki.scatex.document.documentclass

import pl.belicki.scatex.util.Content

trait FontSize extends Content

object FontSize {
  case object TenPt extends FontSize {
    override val texContent: String = "10pt"
  }

  case object ElevenPt extends FontSize {
    override val texContent: String = "11pt"
  }

  case object TwelvePt extends FontSize {
    override val texContent: String = "12pt"
  }
}

