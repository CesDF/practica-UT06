import java.util.Scanner;

public class UT06_Practica {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array=new int[20];
		
		for (int i=0; i<20; i++) {
			
			array[i]=(int)Math.round(Math.random()*10);
			
		}
		
		Scanner sc=new Scanner(System.in);
		int opcion;
		do {
			//Imprimir el menú
			System.out.println("\nElija una opción: \n1: Imprimir el mayor valor del array. \n2: Imprimir el menor valor del array. \n3: Calcular la media de todos los valores del array. \n4: Imprimir todos los valores del array.");
			opcion=sc.nextInt();

			switch (opcion) {
				case 1: System.out.println("El valor máximo del array es " + ImprimirMayor(array)); 
				break;
				case 2: System.out.println("El valor mínimo del array es " + ImprimirMenor(array)); 
				break;
				case 3: System.out.println("El valor medio de los valores del array es " + Media(array)); 
				break;
				case 4: ImprimirTodos(array); 
				break;
			}
		} while (opcion!=0);
		

	}
	
	public static int ImprimirMayor(int[] array) {
		int mayor=array[0];
		for (int i=0;i<array.length; i++) {
			if (array[i]>mayor)mayor=array[i];
		}
		return mayor;
		}
	
	
	public static int ImprimirMenor(int[] array) {
		int menor=array[0];
		for (int i=0;i<array.length; i++) {
			if (array[i]<menor)menor=array[i];
		}
		return menor;
	}
	
	public static int Media(int[] array) {
		int media=array[0];
		for (int i=0;i<array.length; i++) {
			media=media+array[i];
			media=media/array.length;
		}
		return media;
	}
	
	public static void ImprimirTodos(int[] array) {
	
		for (int todos:array) {
		
			System.out.print(todos + " "); 
		
		}
			
	}
	
	/*public static void ContarRepetidos(int[] array) {
		
		int aux =0;
		for (int i=0;i<array.length;i++) {
			for (int j=0;j<array.length;j++) {
				if (array[i]==array[j])
					aux++;
			}
			System.out.println("El número introducido se encuentra repetido " + aux++ + " veces");
		}
		
	}*/

}
