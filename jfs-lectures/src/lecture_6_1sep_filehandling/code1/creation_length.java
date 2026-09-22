package lecture_6_1sep_filehandling.code1;

import java.io.File;

public class creation_length {
    public static void main(String[] args) {
        File f=new File("dataom.txt");
        try{
            if(f.exists()){
                System.out.println("file created:"+f.getName());
                System.out.println("file length:"+f.length());
                System.out.println(f.getAbsolutePath());
            }
            else{
                System.out.println("file does not exist");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
