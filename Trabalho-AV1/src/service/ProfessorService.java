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
		public Professor buscarProfessor(String nome) {
			for (Professor professor : listaProfessores) {
				if(professor.getNome().equals(nome)) {
					return professor;
				}
			}
			System.out.println("Professor não encontrado.");
			return null;
		}
	
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
			listaProfessores.remove(buscarProfessor(nome));
		}
		
		//I still don't understand this method. (GoodJob)
		public void povoaProfessor() {
			
		}
	

}
