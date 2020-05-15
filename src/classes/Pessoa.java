package classes;

public class Pessoa {

	String nome;
	
	Pessoa(String name){
		System.out.println("testes autor"+name);
		this.nome=name;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	void Avaliar(int codigo, double estrelas) {		
	}

}

