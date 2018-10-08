package modelo;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	private String name;
	private String codigo;
	private int carga;
	private String horario;
	private int custoProfessor;
	private int custoTotal;
	private int sala;
	
	
	//Disciplinas
	public List<Aluno> listaChamada = new ArrayList();
	
	//Salas
	public List<int[]> listaSalas = new ArrayList();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public int getCustoProfessor() {
		return custoProfessor;
	}

	public void setCustoProfessor(Professor professor) {
		if(professor.getCategoria().equals("Especialista")){
			this.custoProfessor=25;
		}
		if(professor.getCategoria().equals("Mestre")){
			this.custoProfessor=35;
		}
		if(professor.getCategoria().equals("Doutor")){
			this.custoProfessor=45;
		}
	}

	public int getCustoTotal() {
		return custoTotal;
	}

	public void setCustoTotal(int custoTotal) {
		this.custoTotal=carga*30*4*custoProfessor;
	}

	public int getSala() {
		return sala;
	}

	public void setSala(int sala) {
		if(sala<100||sala>399) {
			System.out.println("Digite um valor válido.");
		}
		else {
			this.sala = sala;
		}
	}

		
	
	public List<Aluno> getListaChamada() {
		return listaChamada;
	}

	
}
	
	
