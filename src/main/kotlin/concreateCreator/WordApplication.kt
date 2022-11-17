package concreateCreator

import concreateProduct.WordDocument
import creator.Application

class WordApplication: Application() {
    override fun createDocument() = WordDocument()
}