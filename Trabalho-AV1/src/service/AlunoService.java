package service;
import java.util.ArrayList;
import java.util.List;
import modelo.Aluno;
import modelo.Disciplina;

public class AlunoService {

	List<Aluno> listaAlunos = new ArrayList();
	
	//Create
	public void addAluno(String nome, String cpf, String matricula, String endereco, long telefone, String situacao, String curso) {
		Aluno a = new Aluno(nome, cpf, matricula, endereco, telefone, situacao, curso);
		listaAlunos.add(a);
	}
	//Read
	public Aluno buscarAluno(String matricula) {
		for (Aluno aluno : listaAlunos) {
			if(aluno.getMatricula().equals(matricula)) {
				return aluno;
			}
		}
		System.out.println("Aluno não encontrado.");
		return null;
	}
	//Update
	//Delete
	
	//Métodos

	//Retorna Falso para Pendente e Verdadeiro para Matriculado
	public boolean getSituacao(String matricula) {
		if (buscarAluno(matricula).listadeDisciplinas.isEmpty() ){
			return false;
		}
		else {
			return true;
		}
	}
	
}
