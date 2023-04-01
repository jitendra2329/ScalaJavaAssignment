class ScalaCalculator {
  private val objCalculator = new Calculator

  def addition(firstNumber: Int, secondNumber: Int): Int =
    objCalculator.add(firstNumber: Int, secondNumber: Int)

  def subtraction(firstNumber: Int, secondNumber: Int): Int =
    objCalculator.subtract(firstNumber: Int, secondNumber: Int)

  def multiplication(firstNumber: Int, secondNumber: Int): Int =
    objCalculator.multiply(firstNumber: Int, secondNumber: Int)

  def division(firstNumber: Int, secondNumber: Int): Double =
    objCalculator.divide(firstNumber: Int, secondNumber: Int)


}
