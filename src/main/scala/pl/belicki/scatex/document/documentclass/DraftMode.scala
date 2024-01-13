package pl.belicki.scatex.document.documentclass

import pl.belicki.scatex.util.Content

class DraftMode(isSet: Boolean) extends Content {
  lazy val texContent: String = if (isSet) "draft" else ""
}
