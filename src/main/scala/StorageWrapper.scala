import java.util

trait StorageTrait {
  def addElement(element1: Int, element2: Int, element3: Int, element4: Int): util.ArrayList[Integer]

  def removeElement(elementToBeDeleted: Int): String

  def removeAllElement(): String

  def elementContains(elementToBeChecked: Int): Boolean
}

class StorageOperations extends StorageTrait {

  private val storageObject = new Storage

  // Function to call addElements and add the elements in Java ArrayList.
  def addElement(element1: Int, element2: Int, element3: Int, element4: Int): util.ArrayList[Integer] = {
    storageObject.addElement(element1, element2, element3, element4)
  }

  // Function to call removeElements of Java and remove the element from Java ArrayList.
  def removeElement(elementToBeDeleted: Int): String = {
    storageObject.removeElement(elementToBeDeleted)
  }

  // Function to call removeAllElements of Java and remove all the elements from Java ArrayList.
  def removeAllElement(): String = {
    storageObject.removeAllElements()
  }

  // Function to call checkElement of Java and check whether the element is present in Java ArrayList.
  def elementContains(elementToBeChecked: Int): Boolean = {
    storageObject.checkElement(elementToBeChecked)
  }
}