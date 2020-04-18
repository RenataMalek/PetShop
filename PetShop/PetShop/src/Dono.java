
public class Dono {

	int ID;
	String nome;
	String telefone;
	String email;
	String CPF;
	
	void pagarConsulta(boolean consultaRealizada) {
		if(consultaRealizada == true) {
			System.out.println("Fim da consulta, o dono pagou");
		}else {
			System.out.println("O dono não veio na consulta, e não pagou");
		}
	}
}
