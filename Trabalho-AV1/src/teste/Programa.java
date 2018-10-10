package teste;

import modelo.Aluno;
import modelo.Curso;
import modelo.Disciplina;
import modelo.Professor;
import service.AlunoService;
import service.DisciplinaService;
import service.CursoService;
import service.ProfessorService;
import java.util.Scanner;

public class Programa {
	
	public static void main(String[]args) {
		CursoService cursosvc = new CursoService();
		AlunoService alunosvc = new AlunoService();
		ProfessorService profsvc = new ProfessorService();
		DisciplinaService discsvc = new DisciplinaService();
		Scanner s = new Scanner(System.in);
	
		
		discsvc.addDisciplina("Matematica Discreta", "MA01", "18:30 - 20:00", 100);
		discsvc.addDisciplina("Teoria Administrativa", "AD01", "18:30 - 20:00", 101);
		discsvc.addDisciplina("Programacao Orientada a Objetos", "ST01", "20:30 - 22:00", 102);
		profsvc.addProfessor("Edson", "320.485.487-20", "Rua 17, 300", 993571547, "Especialista", discsvc.buscaDisciplina("Matematica Discreta"));
		profsvc.addProfessor("Francisco", "157.545.487-10", "Rua Glicen, 20", 987405087, "Doutor",  discsvc.buscaDisciplina("Teoria Administrativa"));
		profsvc.addProfessor("Diego", "151.577.843-18", "Rua Joao Neto, 1587", 996781517, "Mestre", discsvc.buscaDisciplina("Programacao Orientada a Objetos"));
		cursosvc.addCurso("Matematica", "320", "Noite", profsvc.buscaProfessor("Edson"));
		cursosvc.addCurso("Administracao", "301", "Noite", profsvc.buscaProfessor("Francisco"));
		cursosvc.addCurso("Ciencia de Computacao", "1111", "Manha", profsvc.buscaProfessor("Diego"));
		cursosvc.addCurso("Contabilidade", "720", "Tarde", profsvc.buscaProfessor("Edson"));
		alunosvc.addAluno("Joana", "200.584.203-20", "30551", "Rua 50, 280", "joana100@gmail.com", 30558047, "Pendente", cursosvc.buscaCurso("Administracao"));
		alunosvc.addAluno("Francisco", "500.874.843-10", "72060", "Rua 13 de Maio, 1580", "chiquim@hotmail.com", 987201158, "Pendente", cursosvc.buscaCurso("Contabilidade"));
		alunosvc.addAluno("Nicholas", "072.151.484-15", "11117207", "Rua Einstein, 1318", "nicholaspointcom@gmail.com", 997948729, null, cursosvc.buscaCurso("Ciencia de Computacao"));
		cursosvc.buscaCurso("Ciencia de Computacao").addDscGrade(discsvc.buscaDisciplina("Programacao Orientada a Objetos"));
		
		
				
		System.out.println("Professores:");
		profsvc.listaProfessor();
		
		System.out.println("Cursos: ");
		cursosvc.listaCursos();
		
		System.out.println("Alunos: ");
		alunosvc.listaAlunos();
		
		
		System.out.println("Grade Curso Ciencia da Computacao: ");
		cursosvc.buscaCurso("Ciencia de Computacao").listaGrade();		
		
		
		//Lista todos os alunos A
		
		/*public void listaDisciplinas() {
		for (Aluno aux : aluno.getDisciplinas()) {
			System.out.println("Disciplina: " + aux.getNome());
		}
		
		}*/
	}
}
