package filehandling;
import java.io.*;

public class File2 {
public static void main(String[] args) throws IOException {
	 File f=new File("abc.txt");
	 System.out.println(f.exists());
	 
	 f.createNewFile();
	 System.out.println(f.exists());
	 
	
	 
	 
}
}
