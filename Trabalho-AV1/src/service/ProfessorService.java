package service;
import java.util.ArrayList;
import modelo.Professor;

public class ProfessorService {
	
	ArrayList<Professor> listaProfessores = new ArrayList();
	
	//Lista de professores
	public ArrayList<Professor> getListaProfessor(){
		return this.listaProfessores;
	}
	
	//Receita professor
	public void addProfessor(String nome, long telefone, String cpf, String endereco, String categoria, String disciplina) {
		Professor p = new Professor(nome, telefone, cpf, endereco, categoria, disciplina);
		listaProfessores.add(p);
	}
	
}
