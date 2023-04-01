
class Calculator {
    int add(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        return sum;
    }

    int subtract(int firstNumber, int secondNumber) {
        int difference = firstNumber - secondNumber;
        return difference;
    }

    int multiply(int firstNumber, int secondNumber) {
        int product = firstNumber * secondNumber;
        return product;
    }

    double divide(int firstNumber, int secondNumber) {
        double result = 0;
        try {
            result = firstNumber / secondNumber;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        return result;
    }
}
