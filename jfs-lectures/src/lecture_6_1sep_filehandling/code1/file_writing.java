package lecture_6_1sep_filehandling.code1;

import java.io.FileWriter;
import java.io.IOException;

public class file_writing {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("Dataom.txt");
        fw.write("java file writer example \n it is very easy");
        fw.close();
        System.out.println("file writing sucessfull");
    }
}
