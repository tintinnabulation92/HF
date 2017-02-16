
public class ProstyPortal {

	private int [] polePolozenia;
	private int iloscTrafien;
	
	String sprawdz(String pole){
		
		int pole1 = Integer.parseInt(pole);
		String wynik = "pudlo";
		for (int x : polePolozenia){
			if(x == pole1){
				wynik = "trafiony";
				iloscTrafien++;
				break;
			}
		}
		
		if (iloscTrafien == 3){
			wynik = "zatopiony";
		}
		System.out.println(wynik);
		return wynik;
	}
	
	
	public void setPolaPolozenia(int[] ppol){
		
		this.polePolozenia = ppol;
	}
}
