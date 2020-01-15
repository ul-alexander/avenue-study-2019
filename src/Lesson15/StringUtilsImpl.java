package Lesson15;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilsImpl implements StringUtils {

    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1 == null || number2 == null) {
            throw new NullPointerException("Ошибка , Одно из чисел пустое!");
        }

        double num1;

        try {
            num1 = Double.parseDouble(number1);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Первый параметр не является числом");
        }


        double num2;

        try {
            num2 = Double.parseDouble(number2);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Второй параметр не является числом");
        }

        if (num2 == 0.0) {
            throw new ArithmeticException("На 0 делить нельзя");
        }

        return num1 / num2;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {

        if (text == null || word == null) {
            throw new NullPointerException("Один из передаваемых параметров пустой...");
        }
        ArrayList<Integer> list = new ArrayList<>();

        try {
            Pattern pattern = Pattern.compile("\\b" + word);
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()) {
                list.add(matcher.start());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++){
            result[i] = list.get(i);
        }

        return result;


    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        return new double[0];
    }

}
