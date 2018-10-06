package service;

import java.util.ArrayList;
import java.util.List;

import modelo.Aluno;
import modelo.Curso;
import modelo.Professor;

public class CursoService {

	List<Curso> listadeCursos = new ArrayList();
	
	//Create
	public void addCurso(String nome, String codigo, String turno, Professor coordenador) {
		Curso c = new Curso(nome, codigo, turno, coordenador);
		listadeCursos.add(c);
	}
	//Read
		
	//Update
	
	//Delete
	
	//Métodos
	public void povoaCurso() {
		ProfessorService profsvc = new ProfessorService();
		
		Curso adm = new Curso("Administração", "301", "Noite", profsvc.buscarProfessor("Francisco"));
		Curso cienc = new Curso("Ciencia de Computação", "1111", "Manhã", profsvc.buscarProfessor("Diego"));
		Curso cont = new Curso("Contabilidade", "720", "Tarde", profsvc.buscarProfessor("Edson"));
				
	}
	public void gradeCursos() {
		
	}
	
}
