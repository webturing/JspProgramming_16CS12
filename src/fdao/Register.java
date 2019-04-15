package fdao;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Register {
	public static void main(String[] args) {
		try {
			PrintWriter pw=new PrintWriter(new FileWriter("users.txt",true));
			Scanner cin=new Scanner(System.in);
			
			while(cin.hasNext())
			{
				String username=cin.next();
				String password=cin.next();
				pw.println(username+" "+password);
			}
			cin.close();			
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
