package modelo;

import java.util.ArrayList;
import java.util.List;
import modelo.Categoria;

public class Professor {
	//My legs are dangling of the egde, stomach full of pills didn`t work again, I pull a bullet in my head and I`m gone (GoodJob)
	//Look into the mirror and say goodbye. Climb to the roof to see if u can fly <3 (GoodJob)

	//Must Have for a Professor (To GoodJob remember)... then maybe I`ll be coding through it, cuz it`s look`s easier (GoodJob)
	//Cadastro, Listagem, Edição e Exclusão de professor.
	//Um professor deve possuir:
	//nome
	//cpf
	//endereço
	//e-mail
	//telefone
	//Categoria
	//--Especialista
	//--Mestre
	//--Doutor
	//Disciplinas
	//--Um professor deve estar associado a pelo menos uma disciplina.
	
	private String nome;
	private String cpf;
	private String endereco;
	private long telefone;
	private String categoria;
	private Disciplina disciplina;

	//Disciplinas
	public List<Disciplina> listaProfessorDisciplinas = new ArrayList();
	
	//Construtores
	public Professor(String nome, String cpf, String endereco, long telefone, String categoria, Disciplina disciplina) {
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.endereco = endereco;
		this.categoria = categoria;
		this.disciplina = disciplina;
	}
	public Professor(String nome, Disciplina disciplina) {
		this.nome = nome;
		this.disciplina = disciplina;
	}

	//Getters and Setters auto generated.(GoodJob)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
		
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	
	//Método de Listagem de Professor
	public void mostraDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Endereco: " + this.endereco);
		System.out.println("Categoria: " + this.categoria);
		System.out.println("Disciplina: " + this.disciplina);
		System.out.println("\n");
	}
	
	
}
