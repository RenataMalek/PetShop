
public class Doenca {
	
	int ID;
	String nome;
	String sintomas;
	boolean contagioso;
	String remedioIndicado;
	
	void cura(boolean cura) {
		if(cura == true) {
			System.out.println("Seu animal est� bem!");
		}else {
			System.out.println("Ele ainda n�o est� bem, volte amanh� para mais remedios");
		}
	}

}
