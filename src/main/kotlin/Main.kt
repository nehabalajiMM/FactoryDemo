import creator.Application
import utils.DocumentType

fun main(args: Array<String>) {
    val drawingApplication = Application.getApplicationType(DocumentType.Drawing)
    val drawingDocument = drawingApplication.createDocument()
    drawingDocument.showDocumentInfo()

    val wordApplication = Application.getApplicationType(DocumentType.Word)
    val wordDocument = wordApplication.createDocument()
    wordDocument.showDocumentInfo()
}