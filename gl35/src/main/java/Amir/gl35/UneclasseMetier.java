package Amir.gl35;

public class UneclasseMetier  {
	private Affiche a;
	public UneclasseMetier(Affiche a) {
		this.a = a;
	}
	public void uneMethodeMetiermetier() {
		a.afficher("Début de uneMethodeMetier");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a.afficher("fin de uneMethodeMetier");
	}
}
