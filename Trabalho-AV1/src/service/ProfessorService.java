package service;
import java.util.ArrayList;
import java.util.List;

import modelo.Aluno;
import modelo.Categoria;
import modelo.Professor;

public class ProfessorService {
	
	List<Professor> listaProfessores = new ArrayList();
	
	//Lista de professores
	public List<Professor> getListaProfessor(){
		return this.listaProfessores;
	}
	
	//Receita professor - Fixed ;). (Ty brow :D)
	public void addProfessor(String nome, long telefone, String cpf, String endereco, Categoria categoria, String disciplina) {
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
		//Update
		
		public void upProfessorNome(Professor p, String nome){
			p.setNome(nome);
		}
		public void upProfessorTel(Professor p, long tel){
			p.setTelefone(tel);
		}
		public void upProfessorCat(Professor p, Categoria categoria, String cat) {
			p.setCategoria(categoria, cat);
		}
		public void upProfessorEnd(Professor p, String endereco) {
			p.setEndereco(endereco);
		}

		//Delete
		public void deletarProfessor(String nome){
			listaProfessores.remove(buscaProfessor(nome));
		}
		
		//I still don't understand this method. (GoodJob)
	public void povoaProfessor() {
		addProfessor("Edson", 993571547, "320.485.487-20", "Rua 17, 300", null, "Matemática Discreta");
		addProfessor("Francisco", 987405087, "157.545.487-10", "Rua Glicen, 20", null,  "Teoria Administrativa");
		addProfessor("Diego", 996781517, "151.577.843-18", "Rua Joao Neto, 1587", null, "Programação Orientada a Objetos");
	}

}
