
public class ProstyPortalTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int iloscRuchow = 0;
		//ProstyPortal portal1 = new ProstyPortal();
		Portal newPortal = new Portal();
		
		//portal1.setPolaPolozenia();
		Pomocnik pomocnik = new Pomocnik(); 
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
				
				//tu gdzies jest bld jakas zmienna jest niezainicjowanasa
				String wynik = newPortal.sprawdz(pole); //null pointer jako 2 blad
				
				iloscRuchow++;
				
				if (wynik.equals("zatopiony")){
					czyIstnieje = false;
				}
				System.out.println(iloscRuchow + " ruchow");
				
			}
	}

}
