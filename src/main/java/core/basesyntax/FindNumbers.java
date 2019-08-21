package core.basesyntax;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class FindNumbers {
    public static void main(String args[]) {
        getAllNumbers(" 1 223-skndkn-29ndDFIP qsk    olnfd-1   9  29wsssa;s-ls-1 2-wpskmsckn");
    }

    /**
     * <p>Реализуйте метод getAllNumbers(String text) который принимает строку, cодержащую буквы,
     * целые числа и иные символы.</p>
     *
     * <p>Требуется: все числа, которые встречаются в строке, поместить в отдельный целочисленный
     * массив, каждый элемент этого массива умножить на 2. Метод должен возвращать этот массив.</p>
     *
     * <p>Пример: если дана строка "data 48 call 9 read13 blank0a", то в массиве должны оказаться
     * числа 96, 18, 26 и 0.</p>
     */
    public static int[] getAllNumbers(String text) {
        text = text.replaceAll("[^-?0-9]+", " ");
        String[] strArray = text.trim().split(" ");
        int[] numbers = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            numbers[i] = Integer.parseInt(strArray[i]) * 2;
        }
        return numbers;
    }
}
