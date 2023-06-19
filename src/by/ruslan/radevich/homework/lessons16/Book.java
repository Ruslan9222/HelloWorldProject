package by.ruslan.radevich.homework.lessons16;

public class Book {
    private String author;
    private String titleOfTHeBook;
    private int yearOfPublication;

    public Book(String author, String titleOfTHeBook, int yearOfPublication) {
        this.author = author;
        this.titleOfTHeBook = titleOfTHeBook;
        this.yearOfPublication = yearOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitleOfTHeBook() {
        return titleOfTHeBook;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitleOfTHeBook(String titleOfTHeBook) {
        this.titleOfTHeBook = titleOfTHeBook;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", titleOfTHeBook='" + titleOfTHeBook + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }
}
