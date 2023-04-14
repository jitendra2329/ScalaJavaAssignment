
import scala.jdk.CollectionConverters.CollectionHasAsScala

object Driver extends App {
  private val objectCalculator = new ScalaCalculator

  private val firstNumber = 10
  private val secondNumber = 20

  println(objectCalculator.addition(firstNumber, secondNumber))
  println(objectCalculator.subtraction(firstNumber, secondNumber))
  println(objectCalculator.multiplication(firstNumber, secondNumber))
  println(objectCalculator.division(firstNumber, secondNumber))

  private val storageObject = new StorageOperations
  private val firstElement = 2
  private val secondElement = 3
  private val thirdElement = 4
  private val fourthElement = 6

  private val javaArrayList = storageObject.addElement(firstElement, secondElement, thirdElement, fourthElement)

  // Converting the Arraylist to Scala List.
  private val scalaList = javaArrayList.asScala.toList
  println(scalaList)

  println(storageObject.removeElement(firstElement))
  println(storageObject.elementContains(secondElement))
  println(storageObject.removeAllElement())
}