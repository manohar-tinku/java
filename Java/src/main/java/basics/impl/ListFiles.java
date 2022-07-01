package basics.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *  Write a simple listing program that lists all the ”*.java” files within a specified
 * directory (it is a path passed as a command line argument). Use the
 * classes java.io.File and some utility methods like String.endsWith() and
 * File.list().
 */
public class ListFiles {
    public void javaFiles() {
        Path path= Paths.get("C:\\Users\\Manohar_Mittapally\\Desktop\\Java-Training\\java\\Java\\src\\main\\java\\basics\\");
        Stream<Path> paths= null;
        try {
            paths = Files.list(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        paths.map(s->s.toString()).filter(s->s.endsWith(".java")).forEach(s-> System.out.println(s));
    }
}
