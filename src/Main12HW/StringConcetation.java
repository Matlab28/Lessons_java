package Main12HW;

import java.util.Scanner;

public class StringConcetation {
    public String word;
    public int times;

    public StringConcetation(String word, int times) {
        this.word = word;
        this.times = times;
    }

    @Override
    public String toString() {
        return "StringConcetation{" +
                "word='" + word + '\'' +
                ", times=" + times +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string - ");
        String word = scanner.nextLine();
        System.out.print("Enter the number of times to concatenate - ");
        int times = scanner.nextInt();
        StringConcetation text = new StringConcetation(word, times);
        System.out.println(text);

        int[] array = new int[times];

        System.out.println(word.repeat(times));
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
////            array[i] = word
//
//        }
//        System.out.println("The concatenated string is - " + (text*word));
//        System.out.println("Enter a string - " + text.word);
//        System.out.println("Enter the number of times to concatenate - " + text.times);
    }
}
