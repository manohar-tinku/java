package basics;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * Write a program that sorts the words of the specified input file lexicographically, and writes its result
 * both to the console and to a specified output file. Before the processing, eliminate all non-alhanumeric
 * characters from the words
 * $ cat input.txt
 * Ph'nglui mglw'nafh Cthulhu R'lyeh wgah'nagl fhtagn
 * $ java collections.StringSorter input.txt output.txt
 * [Cthulhu, Phnglui, Rlyeh, fhtagn, mglwnafh, wgahnagl]
 * $ cat output.txt
 * Cthulhu
 * Phnglui
 * Rlyeh
 * fhtagn
 * mglwnafh
 * wgahnag
 */
public class SortLexicographical {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new FileReader(args[0]));
        FileWriter fileWriter=new FileWriter(args[1],true);
        String line="";
        while((line=bufferedReader.readLine())!=null){
            line=line.replaceAll("[^a-zA-Z0-9 ]","");
            String[] strings=line.split(" ");
            Arrays.sort(strings);
            for (String s:
                 strings) {
                fileWriter.write(s+"\n");
                System.out.println(s);
            }
        }
        fileWriter.close();
    }
}
