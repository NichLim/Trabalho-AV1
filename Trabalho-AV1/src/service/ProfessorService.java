package service;
import java.util.ArrayList;
import java.util.List;

import modelo.Aluno;
import modelo.Categoria;
import modelo.Disciplina;
import modelo.Professor;

public class ProfessorService {
	
	List<Professor> listaProfessores = new ArrayList();
	
	//Lista de professores
	public List<Professor> getListaProfessor(){
		return this.listaProfessores;
	}
	
	
	//Receita professor - Fixed ;). (Ty brow :D)
	public void addProfessor(String nome, String cpf, String endereco, int telefone, String categoria, Disciplina disciplina) {
		Professor p = new Professor(nome, endereco, cpf, telefone, categoria, disciplina);
		listaProfessores.add(p);
	}
	
	public void addProfessor(String nome, Disciplina disciplina) {
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
		//Update
		
		public void upProfessorNome(String nome, String novonome){
			buscaProfessor(nome).setNome(novonome);
		}
		public void upProfessorTel(String nome, int tel){
			buscaProfessor(nome).setTelefone(tel);
		}
		public void upProfessorDisciplina(String nome, Disciplina disciplina) {
			buscaProfessor(nome).setDisciplina(disciplina);
		}
		public void upProfessorEnd(String nome, String endereco) {
			buscaProfessor(nome).setEndereco(endereco);
		}

		//Delete
		public void deletarProfessor(String nome){
			listaProfessores.remove(buscaProfessor(nome));
		}

}
