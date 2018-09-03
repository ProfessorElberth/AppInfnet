package testes;

import negocio.Aluno;

public class TestaAluno {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();		
		a1.graduacao = "G".equals(args[0]);
		a1.matricula = Integer.valueOf(args[1]);
		a1.mensalidade = Float.valueOf(args[2]);
		a1.nome = args[3];
		
		Aluno a2 = new Aluno(args[3], Integer.valueOf(args[1]));		
		a2.graduacao = "G".equals(args[0]);
		a2.mensalidade = Float.valueOf(args[2]);
		
		Aluno a3 = new Aluno(args[3], Integer.valueOf(args[1]), Float.valueOf(args[2]), "G".equals(args[0]));
		System.out.println("Matrícula: " + a3.matricula);
	}
}
