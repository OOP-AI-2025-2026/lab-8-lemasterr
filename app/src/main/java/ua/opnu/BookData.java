package ua.opnu;

import java.util.Arrays;

public class BookData implements Comparable<BookData> {

    private String title;
    private String author;
    private int reviews;
    private double total;

    public BookData(String title, String author, int reviews, double total) {
        this.title = title;
        this.author = author;
        this.reviews = reviews;
        this.total = total;
    }

    public double getRating() {
        if (reviews == 0) {
            return 0.0;
        }
        return total / reviews;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(BookData other) {
        double thisRating = this.getRating();
        double otherRating = other.getRating();
        int ratingCompare = Double.compare(otherRating, thisRating);
        if (ratingCompare != 0) {
            return ratingCompare;
        }
        return this.title.compareTo(other.title);
    }

    @Override
    public String toString() {
        return "BookData{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", reviews=" + reviews +
                ", total=" + total +
                ", rating=" + getRating() +
                '}';
    }

    public static void main(String[] args) {
        BookData b1 = new BookData("Java Basics", "Smith", 10, 45.0);
        BookData b2 = new BookData("Advanced Java", "Brown", 5, 25.0);
        BookData b3 = new BookData("Algorithms", "Knuth", 0, 0.0);
        BookData b4 = new BookData("Java Basics", "Other", 10, 45.0);

        BookData[] books = {b1, b2, b3, b4};
        System.out.println("До сортування:");
        for (BookData b : books) {
            System.out.println(b);
        }

        Arrays.sort(books);

        System.out.println("Після сортування (вищий рейтинг -> раніше):");
        for (BookData b : books) {
            System.out.println(b);
        }
    }
}
