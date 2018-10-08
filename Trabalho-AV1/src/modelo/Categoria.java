package modelo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Categoria {
	private String cat;	
	Scanner teclado = new Scanner(System.in);		
	
	public String addGato(String nome) {
	System.out.println("Qual a categoria do professor? \n");
	System.out.println("(1) Especialista");
	System.out.println("(2) Mestre");
	System.out.println("(3) Doutor");
	
	int ops = -1;
	switch (ops) {
		case 1:
			this.cat = "Especialista";
			break;
		case 2:
			this.cat = "Mestre";
			break;
		case 3:
			this.cat = "Doutor";
			break;
		}
	return this.cat;
	}
	
}