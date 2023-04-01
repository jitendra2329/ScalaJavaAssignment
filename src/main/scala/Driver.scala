
import scala.jdk.CollectionConverters.CollectionHasAsScala

object Driver extends App {
  private val objectCalculator = new Calculator

  private val firstNumber = 10
  private val secondNumber = 20

  println(objectCalculator.add(firstNumber, secondNumber))
  println(objectCalculator.subtract(firstNumber, secondNumber))
  println(objectCalculator.multiply(firstNumber, secondNumber))
  println(objectCalculator.divide(firstNumber, secondNumber))

  println(objectCalculator.divide(10, 0))

  private val storageObject = new Storage
  val element1 = 2
  val element2 = 3
  val element3 = 4
  val element4 = 6

  private val javaArrayList = storageObject.addElement(element1, element2, element3, element4)

  // Converting the Arraylist to Scala List.
  private val scalaList = javaArrayList.asScala.toList
  println(scalaList)

  println(storageObject.removeElement(element1))
  println(storageObject.checkElement(element4))
  println(storageObject.removeAllElements())
}