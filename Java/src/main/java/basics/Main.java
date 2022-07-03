package basics;

import basics.impl.*;
import basics.utils.Form;
import basics.utils.Genre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

        List<SimpleDate> list=new ArrayList<>();
        list.add(new SimpleDate(2000,12,1));
        list.add(new SimpleDate(2002,6,1));
        list.add(new SimpleDate(1999,7,1));
        list.add(new SimpleDate(2004,1,3));
        list.add(new SimpleDate(2004,2,1));
        list.add(new SimpleDate(2004,1,1));

        Collections.sort(list);

        list.forEach(s-> System.out.println(s));
    }
}