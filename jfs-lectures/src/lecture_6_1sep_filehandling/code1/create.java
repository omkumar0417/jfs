package lecture_6_1sep_filehandling.code1;
//1 sep 2026
import java.io.*;
public class create {
    public static void main(String[] args) {
        File f=new File("dataom.txt");
       try {
           if (f.createNewFile()) {
               System.out.println("file created:"+f.getName());
           }
           else{
               System.out.println("file already exists");
           }
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
    }
}

// f.exists  - searches if file already exist