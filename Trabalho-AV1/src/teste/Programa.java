package teste;

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
		
		
		//Lista todos os alunos A
		
		/*public void listaDisciplinas() {
		for (Aluno aux : aluno.getDisciplinas()) {
			System.out.println("Disciplina: " + aux.getNome());
		}
		
		}*/
	}
}
