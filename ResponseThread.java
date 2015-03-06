import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
public class ResponseThread extends Thread
{
	private Socket s;
	
	
	public ResponseThread(Socket s)
	{
		this.s = s;
	}
	public void run()
	{
		try
		{
			Scanner input = new Scanner(this.s.getInputStream());
			String req = input.nextLine();
			System.out.println(req);

		}
		catch(Exception e)
		{
			//i'm sure nothing will ever go wrong :)
		}
	}
}