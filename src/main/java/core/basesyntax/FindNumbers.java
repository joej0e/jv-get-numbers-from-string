package core.basesyntax;

public class FindNumbers {
    
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
