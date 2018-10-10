package service;

import java.util.ArrayList;
import java.util.List;

import modelo.Aluno;
import modelo.Professor;
import modelo.Disciplina;

public class DisciplinaService {

	//Disciplinas
	public List<Aluno> listaChamada = new ArrayList();
	public List<Disciplina> listaDisciplinas = new ArrayList();
	
	public List<Aluno> getListaChamada(){
		return this.listaChamada;
	}
	
	public void addDisciplina(String name, String codigo, String horario, int sala){
		Disciplina disciplina = new Disciplina(name, codigo, horario, sala);
	}
	
	public void listaChamada() {
		for (Aluno aluno : listaChamada) {
			aluno.mostraDados();
		}
	}

	public Disciplina buscaDisciplina(String name) {
		for (Disciplina disciplina : listaDisciplinas) {
			if(disciplina.getName().equals(name)) {
				return disciplina;
			}
		}
		return null;
	}
}
