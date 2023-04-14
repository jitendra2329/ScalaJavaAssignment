import com.typesafe.scalalogging.Logger

import java.util

trait StorageTrait {
  def addElement(firstElement: Int, secondElement: Int, thirdElement: Int, fourthElement: Int): util.ArrayList[Integer]

  def removeElement(elementToBeDeleted: Int): String

  def removeAllElement(): String

  def elementContains(elementToBeChecked: Int): Boolean
}

class StorageOperations extends StorageTrait {
  private val logger: Logger = Logger(getClass.getName)
  private val storageObject = new Storage

  def addElement(firstElement: Int, secondElement: Int, thirdElement: Int, fourthElement: Int): util.ArrayList[Integer] = {
    logger.info("Adding elements to storage")
    storageObject.addElement(firstElement, secondElement, thirdElement, fourthElement)
  }

  def removeElement(elementToBeDeleted: Int): String = {
    logger.info(s"Removing element: $elementToBeDeleted")
    storageObject.removeElement(elementToBeDeleted)
  }

  def removeAllElement(): String = {
    logger.info("Removing all elements from storage")
    storageObject.removeAllElements()
  }

  def elementContains(elementToBeChecked: Int): Boolean = {
    logger.info(s"Checking if element exists: $elementToBeChecked")
    storageObject.checkElement(elementToBeChecked)
  }
}
