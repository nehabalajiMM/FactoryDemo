package concreateProduct

import product.Document

class DrawingDocument: Document {
    override fun showDocumentInfo() {
        println("This is a drawing document")
    }
}