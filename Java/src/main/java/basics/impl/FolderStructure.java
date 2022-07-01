package basics.impl;

import java.io.File;

/**
 *  Write a program that display the structure of a specified folder recursively
 */
public class FolderStructure {
    public void print(){
       scan(new File("src"),"|-");
    }

    private void scan(File file,String path) {
        File[] files=file.listFiles();
        for (int i = 0; i < files.length; i++) {
            if(files[i].isDirectory()){
                System.out.println(path+files[i].getName().toString());
                scan(files[i],path+"--");
            }
            else{
                System.out.println(path+files[i].getName().toString());
            }
        }
    }
}
