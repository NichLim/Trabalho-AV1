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
	private long telefone;
	private String situacao;
	private String curso;
	
	//Lista de Disciplinas
	public List<Disciplina> listadeDisciplinas = new ArrayList();
	
	//Construtor
	public Aluno(String nome, String cpf, String matricula, String endereco, long telefone, String situacao, String curso) {
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.endereco = endereco;
		this.telefone = telefone;
		this.situacao = situacao;
		this.curso = curso;
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
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	
}
