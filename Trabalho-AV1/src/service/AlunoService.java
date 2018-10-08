package service;
import java.util.ArrayList;
import java.util.List;

import modelo.Aluno;
import modelo.Curso;

public class AlunoService {

	List<Aluno> listaAlunos = new ArrayList();
	
	//Create
	public void addAluno(String nome, String cpf, String matricula, String endereco, String email, long telefone, String situacao, Curso curso) {
		Aluno a = new Aluno(nome, cpf, matricula, endereco, email, telefone, situacao, curso);
		listaAlunos.add(a);
	}
	//Read
	public Aluno buscaAluno(String matricula) {
		for (Aluno aluno : listaAlunos) {
			if(aluno.getMatricula().equals(matricula)) {
				return aluno;
			}
		}
		System.out.println("Aluno não encontrado.");
		return null;
	}
	//Update
	
	public void configAlunoNome(String nome, String novonome){
		buscaAluno(nome).setNome(novonome);
	}
	public void configAlunoTel(String nome, long tel){
		buscaAluno(nome).setTelefone(tel);
	}
	public void configAlunoMat(String nome, String matricula) {
		buscaAluno(nome).setMatricula(matricula);
	}
	public void configAlunoEnd(String nome, String endereco) {
		buscaAluno(nome).setEndereco(endereco);
	}

	//Delete
	public void deletarAluno(String nome){
		listaAlunos.remove(buscaAluno(nome));
	}
	//Métodos
	public void updateSituacao(String nome) {
		if (buscaAluno(nome).listadeDisciplinas.isEmpty() ){
			buscaAluno(nome).setSituacao("Pendente");
		}
		else {
			buscaAluno(nome).setSituacao("Matriculado");
		}
	}
	
	public void listaAlunos() {
		for (Aluno aluno : listaAlunos) {
			aluno.mostraDados();
		}
	}
}
