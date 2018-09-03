package negocio;

public class Aluno {

	public String nome;
	public int matricula;
	public float mensalidade;
	public boolean graduacao;

	public Aluno() {
		matricula = 999;
	}
	
	public Aluno(String nome, int matricula) {
		this();
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public Aluno(String nome, int matricula, float mensalidade, boolean graduacao) {
		this(nome, matricula);
		this.mensalidade = mensalidade;
		this.graduacao = graduacao;		
	}
}