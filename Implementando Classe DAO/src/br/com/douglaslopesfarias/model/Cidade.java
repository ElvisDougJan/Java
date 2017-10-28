package br.com.douglaslopesfarias.model;

public class Cidade {
	
	private String nome;
	private String uf;
	private int codigo;
	
	
	
	public Cidade() {
		
	}

	public Cidade(String nome, String uf, int codigo) {
		super();
		this.nome = nome;
		this.uf = uf;
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	@Override
	public String toString() {
		return "Cidade nome=" + nome + ", uf=" + uf + ", codigo=" + codigo;
	}
	
	
	
}
