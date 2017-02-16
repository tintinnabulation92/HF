import java.io.*;

public class Pomocnik {
	
	public String pobierzDaneWejsciowe(String komunikat){
		String wierszWej = null;
		System.out.println(komunikat + "  ");
		try{
			BufferedReader sw = new BufferedReader(new InputStreamReader(System.in));
			wierszWej = sw.readLine();
				if (wierszWej.length() == 0)
					return null;
			}
		catch (IOException e){
			System.out.println("IoException: " + e);
		}
		return wierszWej;
	}
}
