
public class Doenca {
	
	int ID;
	String nome;
	String sintomas;
	boolean contagioso;
	String remedioIndicado;
	
	void cura(boolean cura) {
		if(cura == true) {
			System.out.println("Seu animal está bem!");
		}else {
			System.out.println("Ele ainda não está bem, volte amanhã para mais remedios");
		}
	}

}
