package ua.opnu;

import java.util.Arrays;

public class GenericFilterExample {

    public static <T> T[] filter(T[] input, Predicate<T> p) {
        @SuppressWarnings("unchecked")
        T[] result = (T[]) java.lang.reflect.Array.newInstance(
                input.getClass().getComponentType(),
                input.length
        );
        int counter = 0;
        for (T element : input) {
            if (p.test(element)) {
                result[counter] = element;
                counter++;
            }
        }
        return Arrays.copyOf(result, counter);
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6};
        Integer[] even = filter(numbers, n -> n % 2 == 0);
        System.out.println("Парні числа: " + Arrays.toString(even));

        String[] words = {"cat", "house", "sun", "computer"};
        String[] longWords = filter(words, s -> s.length() > 3);
        System.out.println("Довгі слова: " + Arrays.toString(longWords));
    }
}
