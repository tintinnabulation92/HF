import java.util.ArrayList;

public class Portal {

	private ArrayList<String> polaPolozenia;
	
	public void setPolaPolozenia(ArrayList<String> ppol){
		this.polaPolozenia = ppol;
	}
	
	public String sprawdz(String ruch){
		String wynik = "pudlo";
		int indeks = polaPolozenia.indexOf(ruch); 
		
		if (indeks >=0) {
			polaPolozenia.remove(indeks);
			
			if (polaPolozenia.isEmpty()){
				wynik = "zatopiony";
				System.out.println(wynik);
			}
			
			else {
				wynik = "trafiony";
				System.out.println(wynik);
				for(int x =0; x<polaPolozenia.size(); x++){
					System.out.println(polaPolozenia.get(x));
				}
			}
		}
		
		return wynik;
	}
}
