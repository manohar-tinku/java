package basics.impl;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *  Write a program that prints the working directory to the console.
 */
public class PresentWorkingDirectory {
    public void pwd(){
        System.out.println(System.getProperty("user.dir"));

        Path path= Paths.get("");
        System.out.println(path.toAbsolutePath().toString());
    }
}
