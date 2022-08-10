import java.util.Objects;

public class Book {
    private final Author author;
    private final String title;
    private int yearOfPublication;

    public Book (String title,int yearOfPublication, Author author){
        this.author=author;
        this.title=title;
        this.yearOfPublication=yearOfPublication;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle(){
        return this.title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Книга: " + title + " " +  yearOfPublication + " "+ author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && author.equals(book.author) && title.equals(book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, yearOfPublication);
    }
}

