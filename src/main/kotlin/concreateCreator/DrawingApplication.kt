package concreateCreator

import concreateProduct.DrawingDocument
import creator.Application
import product.Document

class DrawingApplication: Application() {
    override fun createDocument() = DrawingDocument()
}