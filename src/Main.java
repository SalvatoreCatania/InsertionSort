import java.util.Arrays;

public class Main {
	
	public static void insertionSort(int [] ar) {
		//Inizio a scorrere il vettore
		for(int i = 1; i < ar.length; i++) {
			//Key è il valore che uso per il confronto
			int key = ar[i];
			
			//J è l'indice che usiamo per scorrere all'indietro il vettore
			int j = i - 1;
			//Se j >= 0 (Possiamo ancora scorrere il vettore) e il valore con indice J è maggiore dell'elemento di confronto
			//Inverto i valori e progressivamente la stessa operazione viene effettuata per quelli precedenti
			while(j >= 0 && ar[j] > key) {
				ar[j + 1] = ar[j];
				j = j - 1;
			}
			ar[j + 1] = key;
		}
	}
	
	public static void main(String [] args) {
		int arr[] = { 12, 11, 13, 5, 6 }; 
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
}
