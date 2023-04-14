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
    try {
      logger.info("Adding elements to storage")
      storageObject.addElement(firstElement, secondElement, thirdElement, fourthElement)
    } catch {
      case ex: Exception => {
        logger.error("Exception while adding elements to storage", ex)
        throw ex
      }
    }
  }

  def removeElement(elementToBeDeleted: Int): String = {
    try {
      logger.info(s"Removing element: $elementToBeDeleted")
      storageObject.removeElement(elementToBeDeleted)
    } catch {
      case ex: Exception => {
        logger.error(s"Exception while removing element: $elementToBeDeleted", ex)
        throw ex
      }
    }
  }

  def removeAllElement(): String = {
    try {
      logger.info("Removing all elements from storage")
      storageObject.removeAllElements()
    } catch {
      case ex: Exception => {
        logger.error("Exception while removing all elements from storage", ex)
        throw ex
      }
    }
  }

  def elementContains(elementToBeChecked: Int): Boolean = {
    try {
      logger.info(s"Checking if element exists: $elementToBeChecked")
      storageObject.checkElement(elementToBeChecked)
    } catch {
      case ex: Exception => {
        logger.error(s"Exception while checking if element exists: $elementToBeChecked", ex)
        throw ex
      }
    }
  }
}
