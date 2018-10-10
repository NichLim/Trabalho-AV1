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
		Aluno aluno = new Aluno();
		Aluno a = new Aluno();
		
		Scanner teclado = new Scanner(System.in);
	
		
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
		
		
		
		//Menu......
		int ops=-1;
		int opsaluno=-1;
		int opsedaluno=-1;
		int opsprofessor=-1;
		int opsedprofessor=-1;


		while(ops!=0){
			System.out.println("Escolha uma opção para acessar a área desejada:");
			System.out.println("1 - Aluno");
			System.out.println("2 - Professor");
			System.out.println("3 - Curso");
			System.out.println("4 - Disciplina");
			System.out.println("0 - Sair");


			switch(ops){
			case 1:
			while(opsaluno!=0){
				System.out.println("Digite a ação desejada:");
				System.out.println("1 - Cadastrar aluno.");
				System.out.println("2 - Listar todos os alunos.");
				System.out.println("3 - Buscar aluno.");
				System.out.println("4 - Editar aluno.");
				System.out.println("5 - Excluir aluno.");
				System.out.println("0 - Sair");
				
				switch(opsaluno) {
				case 1:
				System.out.println("Digite o nome:");
				aluno.setNome(teclado.nextLine());
				
				System.out.println("Digite o cpf:");
				aluno.setCpf(teclado.nextLine());
				
				System.out.println("Digite a matricula:");
				aluno.setMatricula(teclado.nextLine());
				
				System.out.println("Digite o endereço:");
				aluno.setEndereco(teclado.nextLine());
				
				System.out.println("Digite o email:");
				aluno.setEmail(teclado.nextLine());
				
				System.out.println("Digite o Curso:");
				aluno.setCurso(cursosvc.buscaCurso(teclado.nextLine()));
				break;

				case 2:
				alunosvc.listaAlunos();
				break;

				case 3:
				System.out.println("Digite o nome do aluno:");
				alunosvc.buscaAluno(teclado.nextLine());
				break;
				
				case 4:
				while(opsedaluno!=0){
					switch(opsedaluno) {
					System.out.println("Digite o que deseja editar:");
					System.out.println("1 - Nome.");
					System.out.println("2 - Cpf.");
					System.out.println("3 - Matricula.");
					System.out.println("4 - Editar aluno.");
					System.out.println("5 - Excluir aluno.");
					System.out.println("0 - Sair");
					
					case 1:
					System.out.println("Digite o nome atual do aluno:");
					a = alunosvc.buscaAluno(teclado.nextLine());
					System.out.println("Digite o novo nome do aluno");
					alunosvc.configAlunoNome(a, teclado.nextLine());
					break;
					
					case 2:
					System.out.println("Digite o nome atual do aluno:");
					a = alunosvc.buscaAluno(teclado.nextLine());
					System.out.println("Digite o novo cpf do aluno;");
					alunosvc.configAlunoCPF(a, teclado.nextLine());
					break;
					
					case 3:
					System.out.println("Digite o nome atual do aluno:");
					a = alunosvc.buscaAluno(teclado.nextLine());
					System.out.println("Digite a nova matricula:");
					alunosvc.configAlunoMat(a, teclado.nextLine());
					break;
					
					case 3:
					System.out.println("Digite o endereço:");
					alunosvc.setEndereco(a, teclado.nextLine());
				
					System.out.println("Digite o email:");
					alunosvc.setEmail(a, teclado.nextLine());
				
					System.out.println("Digite o Curso:");
					alunosvc.setCurso(a, cursosvc.buscaCurso(teclado.nextLine()));
					}
				break;
				}
			}

				case 5:
				System.out.println("Digite o nome do aluno");
				alunosvc.remove(teclado.nextLine);
				break;
				}
			



			}
			break;
			
			default:
			
			break;

			}
			
		}
	}
}
