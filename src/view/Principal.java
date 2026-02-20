package view;

import java.util.Arrays;
import java.util.Random;

import controller.TotalNegativosVetorController;

public class Principal {

	public static void main(String[] args) {
		TotalNegativosVetorController total = new TotalNegativosVetorController();
		Random random = new Random();
		
		String reset = "\u001B[0m";
		String verde = "\u001B[32m";
		
		int i;
		int [] vet = new int[10];
		int tamanho = vet.length;
		
		for(i=0; i<vet.length; i++) {
			vet[i] = random.nextInt(100) - 50;
		}
		
		int res = total.totalNegativos(vet, tamanho);
		
		System.out.println("Vetor gerado: " + Arrays.toString(vet));
		System.out.println("Total de números negativos do vetor: "+verde+res+reset);

	}

}
