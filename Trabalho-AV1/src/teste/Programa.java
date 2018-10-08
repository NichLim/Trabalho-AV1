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
		
		profsvc.addProfessor("Edson", 993571547, "320.485.487-20", "Rua 17, 300", null, "Matemática Discreta");
		profsvc.addProfessor("Francisco", 987405087, "157.545.487-10", "Rua Glicen, 20", null,  "Teoria Administrativa");
		profsvc.addProfessor("Diego", 996781517, "151.577.843-18", "Rua Joao Neto, 1587", null, "Programação Orientada a Objetos");;
		cursosvc.addCurso("Matemática", "320", "Noite", profsvc.buscaProfessor("Edson"));
		cursosvc.addCurso("Administração", "301", "Noite", profsvc.buscaProfessor("Francisco"));
		cursosvc.addCurso("Ciencia de Computação", "1111", "Manhã", profsvc.buscaProfessor("Diego"));
		cursosvc.addCurso("Contabilidade", "720", "Tarde", profsvc.buscaProfessor("Edson"));
		alunosvc.addAluno("Joana", "200.584.203-20", "30551", "Rua 50, 280", "joana100@gmail.com", 30558047, "Pendente", cursosvc.buscaCurso("Administração"));
		alunosvc.addAluno("Francisco", "500.874.843-10", "72060", "Rua 13 de Maio, 1580", "chiquim@hotmail.com", 987201158, "Pendente", cursosvc.buscaCurso("Contabilidade"));
		alunosvc.addAluno("Nicholas", "072.151.484-15", "11117207", "Rua Einstein, 1318", "nicholaspointcom@gmail.com", 997948729, null, cursosvc.buscaCurso("Ciencia de Computação"));
		
		
				
		System.out.println("Professores:");
		profsvc.listaProfessor();
		
		System.out.println("Cursos: ");
		cursosvc.listaCursos();
		
		System.out.println("Alunos: ");
		alunosvc.listaAlunos();
		
		
		
		
		//Lista todos os alunos A
		
		/*public void listaDisciplinas() {
		for (Aluno aux : aluno.getDisciplinas()) {
			System.out.println("Disciplina: " + aux.getNome());
		}
		
		}*/
	}
}
