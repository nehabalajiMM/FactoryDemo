package concreateProduct

import product.Document

class WordDocument: Document {
    override fun showDocumentInfo() {
        println("This is a word document")
    }
}