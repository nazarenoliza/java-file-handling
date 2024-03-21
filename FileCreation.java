/**
 * FileCreation
 */
import java.io.File;
import java.io.IOException;
public class FileCreation {

    public static void main(String[] args) {
   
       File texFile = new File("main.txt");
     
    try {
        if (texFile.createNewFile()) {
            System.out.println("File is Created");
        } else{
          System.out.println("File is Existing Already");  
        }

        
        texFile.createNewFile();
        
    } catch (IOException e) {
       System.err.println("Nag error sya");
    }
    }
}
