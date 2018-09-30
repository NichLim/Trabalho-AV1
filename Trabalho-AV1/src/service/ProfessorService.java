package service;
import java.util.ArrayList;
import java.util.List;

import modelo.Professor;

public class ProfessorService {
	
	List<Professor> listaProfessores = new ArrayList();
	
	//Lista de professores
	public List<Professor> getListaProfessor(){
		return this.listaProfessores;
	}
	
	//Receita professor - Fixed ;).
	public void addProfessor(String nome, long telefone, String cpf, String endereco, String categoria, String disciplina) {
		Professor p = new Professor(nome, endereco, cpf, telefone, categoria, disciplina);
		listaProfessores.add(p);
	}
	
}
