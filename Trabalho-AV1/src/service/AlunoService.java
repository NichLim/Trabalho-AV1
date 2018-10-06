package service;
import java.util.ArrayList;
import java.util.List;

import modelo.Aluno;
import modelo.Curso;

public class AlunoService {

	List<Aluno> listaAlunos = new ArrayList();
	
	//Create
	public void addAluno(String nome, String cpf, String matricula, String endereco, long telefone, String situacao, Curso curso) {
		Aluno a = new Aluno(nome, cpf, matricula, endereco, telefone, situacao, curso);
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
	
	public void configAlunoNome(Aluno obj, String nome){
		obj.setNome(nome);
	}
	public void configAlunoTel(Aluno obj, long tel){
		obj.setTelefone(tel);
	}
	public void configAlunoMat(Aluno obj, String matricula) {
		obj.setMatricula(matricula);
	}
	public void configAlunoEnd(Aluno obj, String endereco) {
		obj.setEndereco(endereco);
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
	

	public void povoaAluno() {
		
	}
}
