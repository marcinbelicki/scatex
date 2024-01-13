package pl.belicki.scatex.document

import pl.belicki.scatex.document.documentclass.DocumentClass

abstract class LatexDocument {

  def documentClass: DocumentClass

  def texContent: String

}
