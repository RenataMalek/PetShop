
public class Veterinario {
	
	int ID;
	String CRMV;
	String nome;
	String telefone;
	String email;
	
	void aplicarInjecao(boolean caoDoente) {
		if(caoDoente == true) {
			System.out.println("Vou aplicar injeção!");
		}else {
			System.out.println("Não precisa de injeção");
		}
	}
	
	public static void main(String[] args) {
		Animal animal1 = new Animal();
		Dono dono1 = new Dono();
		Doenca doenca1 = new Doenca();
		Veterinario vet1 = new Veterinario();
		
		boolean consultaRealizada;
		boolean caoDoente;
		boolean cura;
		
		animal1.ID = 1;
		animal1.nome = "Tob";
		animal1.raca = "pug";
		animal1.cor = "caramelo";
		animal1.idade = 3;
		
		dono1.ID = 0;
		dono1.nome = "Julian";
		dono1.telefone = "1234-5678";
		dono1.CPF = "111.222.333-44";
		dono1.email = "julian@yahoo.com.br";
		
		doenca1.ID = 0;
		doenca1.nome = "Alergia";
		doenca1.sintomas = "Irritação na pele";
		doenca1.contagioso = false;
		doenca1.remedioIndicado = "injeção antialergica";
		
		vet1.ID = 1;
		vet1.CRMV = "1234567890";
		vet1.nome = "Rosa";
		vet1.telefone = "1234-4321";
		vet1.email = "rosa@yahoo.com.br";
		
		consultaRealizada = true;
		caoDoente = true;
		cura = false;
		
		vet1.aplicarInjecao(caoDoente);
		animal1.latir();
		doenca1.cura(cura);
		dono1.pagarConsulta(consultaRealizada);
		
		System.out.println();
		
		Animal animal2 = new Animal();
		Dono dono2 = new Dono();
		Doenca doenca2 = new Doenca();
		Veterinario vet2 = new Veterinario();

		
		animal2.ID = 2;
		animal2.nome = "Bola";
		animal2.raca = "pug";
		animal2.cor = "preto";
		animal2.idade = 4;
		
		dono2.ID = 0;
		dono2.nome = "Rael";
		dono2.telefone = "5678-1234";
		dono2.CPF = "222.333.444-55";
		dono2.email = "raeln@yahoo.com.br";
		
		doenca2.ID = 1;
		doenca2.nome = "Resfriado";
		doenca2.sintomas = "Tosse";
		doenca2.contagioso = false;
		doenca2.remedioIndicado = "Vitaminas";
		
		vet2.ID = 2;
		vet2.CRMV = "0987654321";
		vet2.nome = "Flavio";
		vet2.telefone = "421-1234";
		vet2.email = "flavio@yahoo.com.br";
		
		consultaRealizada = true;
		caoDoente = false;
		cura = true;
		
		vet1.aplicarInjecao(caoDoente);
		animal1.latir();
		doenca1.cura(cura);
		dono1.pagarConsulta(consultaRealizada);
		
	}

}
