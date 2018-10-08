package teste;

import modelo.Aluno;
import modelo.Curso;
import modelo.Disciplina;
import modelo.Professor;
import service.AlunoService;
import service.CursoService;
import service.ProfessorService;

public class Programa {
	
	public static void main(String[]args) {
		CursoService cursosvc = new CursoService();
		AlunoService alunosvc = new AlunoService();
		ProfessorService profsvc = new ProfessorService();

		alunosvc.povoaAluno();
		profsvc.povoaProfessor();
		cursosvc.povoaCurso();
		alunosvc.povoaAluno();		
		System.out.println("Professores:");
		profsvc.listaProfessor();
		
		System.out.println("Cursos: ");
		
		cursosvc.listaCursos();
		
		
		
		alunosvc.buscaAluno("11117207").setCurso(cursosvc.buscaCurso("Ciencia de Computação"));
		alunosvc.buscaAluno("11117207").mostraDados();
		
		
		//Lista todos os alunos A
		
		/*public void listaDisciplinas() {
		for (Aluno aux : aluno.getDisciplinas()) {
			System.out.println("Disciplina: " + aux.getNome());
		}
		
		}*/
	}
}
