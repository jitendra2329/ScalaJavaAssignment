import com.typesafe.scalalogging.Logger

class ScalaCalculator {
  private val logger = Logger(getClass)
  private val objCalculator = new Calculator

  def addition(firstNumber: Int, secondNumber: Int): Int = {
    try {
      val result = objCalculator.add(firstNumber: Int, secondNumber: Int)
      logger.info(s"Addition operation performed. Result: $result")
      result
    } catch {
      case e: Exception =>
        logger.error("Error occurred during addition operation", e)
        throw e
    }
  }

  def subtraction(firstNumber: Int, secondNumber: Int): Int = {
    try {
      val result = objCalculator.subtract(firstNumber: Int, secondNumber: Int)
      logger.info(s"Subtraction operation performed. Result: $result")
      result
    } catch {
      case e: Exception =>
        logger.error("Error occurred during subtraction operation", e)
        throw e
    }
  }

  def multiplication(firstNumber: Int, secondNumber: Int): Int = {
    try {
      val result = objCalculator.multiply(firstNumber: Int, secondNumber: Int)
      logger.info(s"Multiplication operation performed. Result: $result")
      result
    } catch {
      case e: Exception =>
        logger.error("Error occurred during multiplication operation", e)
        throw e
    }
  }

  def division(firstNumber: Int, secondNumber: Int): Double = {
    try {
      val result = objCalculator.divide(firstNumber: Int, secondNumber: Int)
      logger.info(s"Division operation performed. Result: $result")
      result
    } catch {
      case e: Exception =>
        logger.error("Error occurred during division operation", e)
        throw e
    }
  }
}
