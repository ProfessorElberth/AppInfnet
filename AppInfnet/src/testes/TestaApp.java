package testes;

import auxiliar.Constante;

public class TestaApp {

	public static void main(String[] args) {
		
		System.out.println("Vers�o: " + Constante.VERSAO);
		
		String[] titulos = new String[4];
		titulos[0] = "Nome: ";
		titulos[1] = "Filhos: ";
		titulos[2] = "Idade: ";
		titulos[3] = "Sal�rio: ";
		
//		String[] header = {"Nome: ", "Filhos: ", "Idade: ", "Sal�rio: "};
		
		if(args.length == 4) {			
			for (int i = 0; i < args.length; i++) {
				System.out.println(titulos[i] + args[i]);
			}
		} else {
			System.err.println("Imposs�vel executar a aplica��o");
		}
	}
}
