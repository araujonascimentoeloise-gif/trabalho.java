package academia.model.main;
import java.util.Scanner;

import academia.model.aluno;

import academia.model.instrutor;



public class SistemaAcademia {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		aluno[] alunos = new aluno[10];
		instrutor[] instrutor = new instrutor[10];
		
		int contaluno = 0;
		int continstrutor = 0;
		int opcao;
		
		
	do {
		System.out.println("\n========= Sistema Academia =========");
		System.out.println("\n - Cadastrar Aluno");
		System.out.println("\n - Cadstrar Instrutor");
		System.out.println("\n - Listar Aluno");
		System.out.println("\n - Listar Instrutor ");
		System.out.println("\n - sair");
		System.out.println("\nEscolha uma Opção");
		opcao = sc.nextInt();
		sc.nextLine();
		
		switch(opcao) {
			case 1:
				System.out.println("\n========= Cadastro do Aluno =========");
				if(contaluno < alunos.length) {
					
					System.out.println("Nome: ");
					String nomea = sc.nextLine();
					
					System.out.println("Matricula:");
					String matriculaa = sc.nextLine();
					
					System.out.println("Idade");
					String idadea = sc.nextLine();
					
					System.out.println("CPF:");
					String cpf  = sc.nextLine();
					
					alunos[contaluno] = new aluno (nomea, matriculaa, idadea, cpf);
					contaluno++;
					
					System.out.println( "Aluno cadastrado com sucesso!");
					}else {
					System.out.println( "limite de alunos atingido!");
					}
				break;
				
			case 2:
				System.out.println("\n========= Cadastro do Instrutor =========");
				if(continstrutor < instrutor.length) {
					
					System.out.println("Nome: ");
					String nomei = sc.nextLine();
					
					System.out.println("Matricula:");
					String matriculai = sc.nextLine();
					
					System.out.println("Idade");
					String idadei = sc.nextLine();
					
					System.out.println("CPF:");
					String cpf  = sc.nextLine();
					
					instrutor [continstrutor] = new instrutor (nomei, matriculai, idadei, cpf);
					continstrutor++;
					
					System.out.println( "Instrutor  cadastrado com sucesso!");
					}else {
					System.out.println( "limite de instrutor atingido!");
					}
				break;
				
			case 3:
				
				
				
				
				
				
				
				
				
				
					
				}
		
		
		
			
	}
	}
		}
	}


