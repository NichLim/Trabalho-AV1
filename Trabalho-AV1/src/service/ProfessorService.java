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
	
	//Receita professor - Fixed ;). (Ty brow :D)
	public void addProfessor(String nome, long telefone, String cpf, String endereco, String categoria, String disciplina) {
		Professor p = new Professor(nome, endereco, cpf, telefone, categoria, disciplina);
		listaProfessores.add(p);
	}
	
	public void addProfessor(String nome, String disciplina) {
		Professor p = new Professor(nome, disciplina);
		listaProfessores.add(p);
	}
	
	//Read
		public Professor buscarProfessor(String nome) {
			for (Professor professor : listaProfessores) {
				if(professor.getNome().equals(nome)) {
					return professor;
				}
			}
			System.out.println("Professor não encontrado.");
			return null;
		}
	
	
	
}
