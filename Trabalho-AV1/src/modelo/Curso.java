package modelo;
import java.util.ArrayList;
import java.util.List;

public class Curso {
	private String nome;
	private String codigo;
	private String turno;
	private Professor coordenador;
	List<Disciplina> gradeCurso = new ArrayList();
	
	//Construtor
	public Curso() {
		
	}
	public Curso(String nome, String codigo, String turno, Professor coordenador) {
		this.codigo = codigo;
		this.nome = nome;
		this.turno = turno;
		this.coordenador = coordenador;
	}
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public Professor getCoordenador() {
		return coordenador;
	}
	public void setCoordenador(Professor coordenador) {
		this.coordenador = coordenador;
	}
	public List<Disciplina> getGradeCurso() {
		return gradeCurso;
	}
	public void setGradeCurso(List<Disciplina> gradeCurso) {
		this.gradeCurso = gradeCurso;
	}
	
	//Métodos
	public void mostraDados() {
		System.out.println("Nome do Curso: " + this.nome);
		System.out.println("Código do Curso: " + this.codigo);
		System.out.println("Turno do Curso: " + this.turno);
		System.out.println("Professor Coordenador: " + this.coordenador.getNome());
		System.out.println("\n");
	}
}
