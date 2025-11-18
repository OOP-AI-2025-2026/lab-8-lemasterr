package ua.opnu;

public class TupleDemo {

    public static void main(String[] args) {
        GenericTwoTuple<String, Integer> studentRating =
                new GenericTwoTuple<>("Іванов Петро", 87);
        System.out.println("TwoTuple студента: " + studentRating);
        System.out.println("Ім'я: " + studentRating.getFirst());
        System.out.println("Рейтинг: " + studentRating.getSecond());

        System.out.println("----------");

        GenericTwoTuple<String, Boolean> featureFlag =
                new GenericTwoTuple<>("dark_mode_enabled", true);
        System.out.println("TwoTuple фічі: " + featureFlag);

        System.out.println("----------");

        GenericThreeTuple<String, Integer, Double> productInfo =
                new GenericThreeTuple<>("Ноутбук", 5, 24999.99);
        System.out.println("ThreeTuple товару: " + productInfo);
        System.out.println("Назва: " + productInfo.getFirst());
        System.out.println("Кількість: " + productInfo.getSecond());
        System.out.println("Ціна: " + productInfo.getThree());

        System.out.println("----------");

        GenericThreeTuple<String, String, Integer> studentInfo =
                new GenericThreeTuple<>("Антонович Микита Юрійович", "АІ243", 2);
        System.out.println("Інформація про студента: " + studentInfo);
    }
}
