import java.io.*;
public class ExcepTest {
    public static void main (String[] args) {
        try {
            int a[] = new int[2];
            System.out.println("Access element three: " +a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown: " +e);
        }
   
        try {
            FileInputStream file = new FileInputStream("sony.txt");
            byte x = (byte) file.read();
        } catch (FileNotFoundException f) {
            f.printStackTrace();
        }catch (IOException i) {
            i.printStackTrace();
        } 
        System.out.println("Out of the block");
    }
}

