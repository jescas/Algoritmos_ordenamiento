/**
 * @author Jesús Petrona Castro
 * =======================================================================
 *                               INSERTION SORT
 * =======================================================================
 * ***********************************************************************
 * ***********************************************************************
 * ** Ordenamiento usando el algoritmo de inserción (insertion sort)    **
 * ** El algoritmo implementado ordena los valores de menor a mayor     **
 * ** pero puede ser modificado para ordenar de mayor a menor cambiando **
 * ** el símbolo < por el de > en la comparación de los valores.        **
 * ***********************************************************************
 * ***********************************************************************
 */
import java.util.Arrays;

public class InsertionSort{
   public static void main(String[] args) {
		System.out.println("Se realiza ordenamiento para los valores: "+Arrays.toString(args));
		int arrayNum[] = convertInteger(args); //Comentar si no se ejecutará desde la consola
		//int arrayNum[] = {5, -1, 100, 6, 0, 6, -9, 32, 1, 100, 10, 2}; //Descomentar para usar valores requeridos
		if(arrayNum != null && arrayNum.length > 0){
			insertionSort(arrayNum);
			System.out.println("Valores ordenados: "+Arrays.toString(arrayNum));
		}else{
			System.out.println("No se puede ordenar un arreglo vacío o nulo.");
		}
		
	}

	/**
	 * Implementa algoritmo de ordenamiento por inserción.
	 * @param arrayNum
	 */
	private static void insertionSort(int[] arrayNum) {
		int j = 0;
		for (int i = 1; i < arrayNum.length; i++) {
			j = i;
			while (j > 0 && arrayNum[j] < arrayNum[j - 1]) { //Si se cambia el segúndo sínbolo < por el de > el algoritmo lo ordenará de mayor a menor
				swap(arrayNum, j, j - 1);
				j--;
			}
		}
	}

	/**
	 * Realiza el intercambio de valores
	 * @param arrayNum
	 * @param from
	 * @param to
	 */
	private static void swap(int[] arrayNum, int from, int to) {
		int valueFrom = arrayNum[from];
		arrayNum[from] = arrayNum[to];
		arrayNum[to] = valueFrom;
	}

	
	private static int[] convertInteger(String[] args) {
		int numbers[] = new int[args.length];
		try {
			for (int i = 0; i < args.length; i++) {
				numbers[i] = Integer.parseInt(args[i]);
			}
		} catch (NumberFormatException e) {
			numbers = null;
			System.err.println("No se pudo realizar el parseo: " + e);
		}
		return numbers;
	}
}