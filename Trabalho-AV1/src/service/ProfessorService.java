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
		public Professor buscaProfessor(String nome) {
			for (Professor professor : listaProfessores) {
				if(professor.getNome().equals(nome)) {
					return professor;
				}
			}
			System.out.println("Professor não encontrado.");
			return null;
		}
	
	//Método de Listagem de professores
	public void listaProfessor() {
		for (Professor professor : listaProfessores) {
			professor.mostraDados();
		}
	}
	//Método de Povoação da Lista de Professores
	
	public void povoaProfessor() {
		addProfessor("Edson", 993571547, "320.485.487-20", "Rua 17, 300", "Mestre", "Matemática Discreta");
		addProfessor("Francisco", 987405087, "157.545.487-10", "Rua Glicen, 20", "Pós",  "Teoria Administrativa");
		addProfessor("Diego", 996781517, "151.577.843-18", "Rua Joao Neto, 1587", "Mestre", "Programação Orientada a Objetos");
	}
	
}
