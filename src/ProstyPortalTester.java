import java.util.ArrayList;

public class ProstyPortalTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int iloscRuchow = 0;
		//ProstyPortal portal1 = new ProstyPortal();
		Portal newPortal = new Portal();
		
		ArrayList<String> lista1 = new ArrayList<String>();
		lista1.add("9");
		lista1.add("8");
		lista1.add("7");
		//portal1.setPolaPolozenia();
		Pomocnik pomocnik = new Pomocnik(); 
		newPortal.setPolaPolozenia(lista1);
		/*
		int losowaLiczba = (int) (Math.random()*5);
		int[] losoweLiczby = new int[3];
		losoweLiczby[0] = losowaLiczba;
		losoweLiczby[1] = ++losowaLiczba;
		losoweLiczby[2] = ++losowaLiczba;
		*/
		 
		
		
		//portal1.setPolaPolozenia(losoweLiczby);
		boolean czyIstnieje = true;
		
			while (czyIstnieje == true){
				String pole = pomocnik.pobierzDaneWejsciowe("Podaj Liczbe");
				
				
				String wynik = newPortal.sprawdz(pole); 
				
				iloscRuchow++;
				
				if (wynik.equals("zatopiony")){
					czyIstnieje = false;
				}
				System.out.println(iloscRuchow + " ruchow");
				
			}
	}

}
