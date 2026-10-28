package ExceptionHandling;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling20 {
    public static void main (String[] args){
        try(FileReader fileReader = new FileReader("test.txt")) {
            System.out.println("File Opened successfully");

        }catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }
        System.out.println("System Completed");

            }
        }


