import com.typesafe.scalalogging.Logger

class ScalaCalculator {
  private val logger = Logger(getClass)
  private val objCalculator = new Calculator

  def addition(firstNumber: Int, secondNumber: Int): Int = {
    val result = objCalculator.add(firstNumber: Int, secondNumber: Int)
    logger.info(s"Addition operation performed. Result: $result")
    result
  }

  def subtraction(firstNumber: Int, secondNumber: Int): Int = {
    val result = objCalculator.subtract(firstNumber: Int, secondNumber: Int)
    logger.info(s"Subtraction operation performed. Result: $result")
    result
  }

  def multiplication(firstNumber: Int, secondNumber: Int): Int = {
    val result = objCalculator.multiply(firstNumber: Int, secondNumber: Int)
    logger.info(s"Multiplication operation performed. Result: $result")
    result
  }

  def division(firstNumber: Int, secondNumber: Int): Double = {
    val result = objCalculator.divide(firstNumber: Int, secondNumber: Int)
    logger.info(s"Division operation performed. Result: $result")
    result
  }
}
