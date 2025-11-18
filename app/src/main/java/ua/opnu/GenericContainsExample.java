package ua.opnu;

public class GenericContainsExample {

    public static <T extends Comparable<? super T>, V extends T> boolean contains(T[] array, V element) {
        for (T value : array) {
            if (value.compareTo(element) == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] words = {"hello", "world", "java"};
        boolean hasJava = contains(words, "java");
        boolean hasKotlin = contains(words, "kotlin");
        System.out.println("Масив містить 'java': " + hasJava);
        System.out.println("Масив містить 'kotlin': " + hasKotlin);

        Integer[] nums = {1, 5, 10};
        boolean has5 = contains(nums, 5);
        boolean has7 = contains(nums, 7);
        System.out.println("Масив містить 5: " + has5);
        System.out.println("Масив містить 7: " + has7);
    }
}
