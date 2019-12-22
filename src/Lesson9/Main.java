package Lesson9;

public class Main {
    public static void main(String[] args) {

        //Дробь 1
        FractionNumberImpl fractionNumber1 = new FractionNumberImpl(1,5);
        //Дробь 2
        FractionNumberImpl fractionNumber2 = new FractionNumberImpl(10,15);
        //////////////////////////////////
        System.out.println(fractionNumber1);

        //Интерфейс калькулятора

        FractionNumberOperationImpl calculator = new FractionNumberOperationImpl();

        int number1 = 10;
        int number2 = 6;

        //Addition (сложение)
        //Subtraction (вычитание)
        //Multiplication (умножение)
        //Division (деление)
    }
}
