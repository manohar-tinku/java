package basics.impl;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *  Write a program that prints the working directory to the console.
 */
public class PresentWorkingDirectory {
    public void pwd(){
        System.out.println(System.getProperty("user.dir"));

        System.out.println(Paths.get("").toAbsolutePath());

        System.out.println(FileSystems.getDefault().getPath("").toAbsolutePath());

        System.out.println(Path.of("").toAbsolutePath());
    }
}
