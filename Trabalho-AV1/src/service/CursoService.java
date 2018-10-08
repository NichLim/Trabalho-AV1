package service;

import java.util.ArrayList;
import java.util.List;

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
	public Curso buscaCurso(String nome) {
		for (Curso curso : listadeCursos) {
			if(curso.getNome().equals(nome)) {
				return curso;
			}	
		}
		System.out.println("Curso n�o encontrado.");
		return null;
	}	
	
	//Update
	public void configCoordernador(String nome) {
		ProfessorService profsvc = new ProfessorService();
		Curso aux = new Curso(); 
		if (profsvc.buscaProfessor(nome).getNome().equals(nome)) {
			aux.setCoordenador(profsvc.buscaProfessor(nome));
		}
	}
	
	//Delete
	public void deletaCurso(String nome) {
		listadeCursos.remove(buscaCurso(nome));
	}
	
	//M�todos
	public void povoaCurso() {
	ProfessorService profsvc = new ProfessorService();
	addCurso("Matem�tica", "320", "Noite", profsvc.buscaProfessor("Edson"));
	addCurso("Administra��o", "301", "Noite", profsvc.buscaProfessor("Francisco"));
	addCurso("Ciencia de Computa��o", "1111", "Manh�", profsvc.buscaProfessor("Diego"));
	addCurso("Contabilidade", "720", "Tarde", profsvc.buscaProfessor("Edson"));
	}
	public void gradeCursos() {
		
	}
	
	public void listaCursos() {
		for (Curso curso : listadeCursos) {
			curso.mostraDados();
		}
		
	}
	
}
