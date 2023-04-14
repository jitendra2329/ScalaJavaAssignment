
class Calculator {
    int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    double divide(int firstNumber, int secondNumber) {
        double result = 0;
        try {
            result = (double) firstNumber / secondNumber;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        return result;
    }
}
