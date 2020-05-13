package Amir.gl35;

import java.time.LocalDateTime;

public class Affiche implements Affichage {

	public void afficher(String message) {
		// TODO Auto-generated method stub
		System.out.println(LocalDateTime.now()+" : "+message);
	}
}
