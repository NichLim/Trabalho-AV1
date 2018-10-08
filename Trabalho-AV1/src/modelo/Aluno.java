package modelo;

import java.util.ArrayList;
import java.util.List;
import modelo.Disciplina;

public class Aluno {

	//Atributos
	private String nome;
	private String cpf;
	private String matricula;
	private String endereco;
	private String email;
	private long telefone;
	private String situacao;
	private Curso curso;
	
	//Lista de Disciplinas
	public List<Disciplina> listadeDisciplinas = new ArrayList();
		
	//Construtor
	public Aluno(String nome, String cpf, String matricula, String endereco, String email, long telefone, String situacao, Curso curso) {
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
		this.situacao = situacao;
		this.curso = curso;
	}
	//construtor vazio pra testes
	public Aluno() {
		
	}

	//Getters e Setters
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
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Disciplina> getListadeDisciplinas() {
		return listadeDisciplinas;
	}
	public void setListadeDisciplinas(List<Disciplina> listadeDisciplinas) {
		this.listadeDisciplinas = listadeDisciplinas;
	}
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	public String getSituacao() {
		return situacao;
	}
	
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	//Métodos
	public List<Disciplina> getDisciplinas(){
		return this.listadeDisciplinas;
	}
	
	public void mostraDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Matricula: " + this.matricula);
		System.out.println("Situacao: " + this.situacao);
		System.out.println("Endereço: " + this.endereco);
		System.out.println("Email: " + this.email);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("Curso: " + this.curso.getNome());
		System.out.println("\n");
	}
}
