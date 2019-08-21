package core.basesyntax;

public class FindNumbers {

    public static int[] getAllNumbers(String text) {
        text = text.replaceAll("[^-?0-9]+", " ");
        String[] strings = text.trim().split(" ");
        int[] numbers = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            numbers[i] = Integer.parseInt(strings[i]) * 2;
        }
        return numbers;
    }
}
