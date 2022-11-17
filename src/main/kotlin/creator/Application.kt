package creator

import concreateCreator.DrawingApplication
import concreateCreator.WordApplication
import product.Document
import utils.DocumentType

abstract class Application {
    abstract fun createDocument(): Document

    companion object{
        fun getApplicationType(documentType: DocumentType): Application {
            return when (documentType) {
                DocumentType.Drawing -> DrawingApplication()
                DocumentType.Word -> WordApplication()
                else -> throw Exception("Invalid document type")
            }
        }
    }
}