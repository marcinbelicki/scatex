package pl.belicki.scatex.document.documentclass

import pl.belicki.scatex.util.Content

trait PaperSize extends Content

object PaperSize {
  case object A4Paper extends PaperSize {
    override val texContent: String = "a4paper"
  }

  case object LetterPaper extends PaperSize {
    override val texContent: String = "letterpaper"
  }

  case object A5Paper extends PaperSize {
    override val texContent: String = "a5paper"
  }

  case object B5Paper extends PaperSize {
    override val texContent: String = "b5paper"
  }
}
