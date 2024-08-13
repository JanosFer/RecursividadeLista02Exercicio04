package view;

import controller.FatorialDuploController;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		FatorialDuploController fatCont = new FatorialDuploController();
		Scanner ler = new Scanner(System.in);
		
		int n = 0;
		
		while(true) {
			System.out.println("Informe um valor inteiro ímpar: ");
			n = ler.nextInt();
			ler.nextLine();
			if(n % 2 != 0) {
				break;
			}else {
				System.out.println("ERRO: O valor deve ser ímpar");
			}
		}
		
		System.out.println(fatCont.fatImp(n));
		ler.close();
	}
}
