package Aplicacoes;

import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {
		
		String [] [] agenda = new String [24] [31];
		
		int hora;
		int dia;
		char opcao;
		
		Scanner teclado = new Scanner(System.in);
				
		System.out.println("AGENDA\n");
		
		do {
		System.out.println("Informe o dia do evento: ");
		dia = teclado.nextInt()-1;
		
		System.out.println("Digite a hora: ");
		hora = teclado.nextInt();
		
		teclado.nextLine();
		
		System.out.println("Descrição: ");
		agenda [hora] [dia] = teclado.nextLine();
		
		System.out.println("Continua S/N ? ");
		opcao = teclado.next().toUpperCase().charAt(0);
		
		}while(opcao == 'S');
		
		for (int d = 0; d < 31; d++) {
			for(int h = 0; h < 24; h++ ) {
				if(agenda [h] [d] != null) {
					System.out.printf("Dia %d hora %d : %s\n", d,h, agenda[h][d]);
					System.out.println("---------------------------------------");
				}
			}
			
		}
		
		teclado.close();
	}
}
