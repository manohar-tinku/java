package basics;

import basics.impl.*;
import basics.utils.Form;
import basics.utils.Genre;

public class Main {
    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        reverseString.reverse();

        ListFiles listFiles = new ListFiles();
        listFiles.javaFiles();

        Trigonometry trigonometry = new Trigonometry();
        trigonometry.findRatios();

        Dice dice = new Dice();
        dice.play();

        PresentWorkingDirectory presentWorkingDirectory = new PresentWorkingDirectory();
        presentWorkingDirectory.pwd();

        FolderStructure folderStructure = new FolderStructure();
        folderStructure.print();

        Book book1 = new Book("1");
        Book book2 = new Book("1");

        System.out.println(book1 == book2);
        System.out.println(book1.equals(book2));

        book1.setAuthor("Manohar");
        book1.setAbstractOfBook("Knowledge earn");
        book1.setForm(Form.DRAMA);
        book1.setTitle("Boom");
        book1.setGenre(Genre.COMEDY);
        book1.setIllustrationUrl("www.manohar.com");

        System.out.println(book1.toString());
    }
}