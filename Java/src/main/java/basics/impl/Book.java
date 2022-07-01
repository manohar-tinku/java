package basics.impl;

import basics.utils.Form;
import basics.utils.Genre;

import java.util.Objects;

/**
 * Create a simple representation object for books.
 * • We shall store the ISBN number, title, author, abstract, the number of pages, the cover illustration URL,
 * its major form (may be Novel, Poem, Drama, Short Story or Novella) and its genre (may be Comedy,
 * Drama, Epic, Nonsense, Lyric, Mythopoeia, Romance, Satire, Tragedy, Tragicomedy).
 * • For the latter two properties, create specific enumerations in the basics.util package.
 * • Implement the equals(), hashCode() functions based on the ISBN number, and the toString() method to
 * include each property of the object!
 * • Write a constructor that sets only the ISBN number, and write proper accessor methods for the other
 * properties.
 * • Create a Main class that demonstrates how the Book class works (instantiation, equality check, printint
 * on the console).
 */
public class Book {
    private String isbn;
    private String title;
    private String author;
    private String abstractOfBook;
    private String numberOfPages;
    private String illustrationUrl;
    private Form form;
    private Genre genre;

    public Book(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAbstractOfBook() {
        return abstractOfBook;
    }

    public void setAbstractOfBook(String abstractOfBook) {
        this.abstractOfBook = abstractOfBook;
    }

    public String getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(String numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getIllustrationUrl() {
        return illustrationUrl;
    }

    public void setIllustrationUrl(String illustrationUrl) {
        this.illustrationUrl = illustrationUrl;
    }

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", abstractOfBook='" + abstractOfBook + '\'' +
                ", numberOfPages='" + numberOfPages + '\'' +
                ", illustrationUrl='" + illustrationUrl + '\'' +
                ", form=" + form +
                ", genre=" + genre +
                '}';
    }
}
