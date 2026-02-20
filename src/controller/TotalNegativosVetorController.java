package controller;

public class TotalNegativosVetorController {
	
	public TotalNegativosVetorController() {
		super();
	}
	
	public int totalNegativos(int[] vet, int tamanho) {
		//condição de parada caso tenha percorrido todo  o vetor
		if(tamanho == 0) {
			return 0;
		}
		// Se o valor for negativo, soma 1 + a função.
        // Se for positivo, soma 0.
		if (vet[tamanho - 1] < 0) {
            return 1 + totalNegativos(vet, tamanho - 1);
        } else {
            return 0 + totalNegativos(vet, tamanho - 1);
        }
	}
}
