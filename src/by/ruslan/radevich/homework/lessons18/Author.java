package by.ruslan.radevich.homework.lessons18;

public class Author {
    private String FirstName;
    private String LastName;
    private String title;

    public Author(String firstName, String lastName, String title, String line) {
        FirstName = firstName;
        LastName = lastName;
        this.title = title;

    }

    public Author() {
    }

    public Author(String william, String shakespeare, String s) {
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    @Override
    public String toString() {
        return "Author{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
