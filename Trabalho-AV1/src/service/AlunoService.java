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
	public void addAluno(Aluno a){
		listaAlunos.add(a);
	}
	//Read
	public Aluno buscaAluno(String matricula) {
		for (Aluno aluno : listaAlunos) {
			if(aluno.getMatricula().equals(matricula)) {
				return aluno;
			}
		}
		System.out.println("Aluno n�o encontrado.");
		return null;
	}
	//Update
	
	public void configAlunoNome(Aluno aluno, String novonome){
		aluno.setNome(novonome);
	}
	public void configAlunoTel(Aluno aluno, long tel){
		aluno.setTelefone(tel);
	}
	public void configAlunoMat(Aluno aluno, String matricula) {
		aluno.setMatricula(matricula);
	}
	public void configAlunoCPF(Aluno aluno, String cpf){
		aluno.setCpf(cpf);
	}
	public void configAlunoEnd(Aluno aluno, String endereco) {
		aluno.setEndereco(endereco);
	}

	//Delete
	public void deletarAluno(String nome){
		listaAlunos.remove(buscaAluno(nome));
	}
	//M�todos
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
