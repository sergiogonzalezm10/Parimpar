package parimpar;

import java.util.Scanner;

public class Parimpar {

	public static void main(String[] args) {
		int numero;											//Variable que almacena el número introducido posteriormente
		boolean par;								//Variable que comprueba si el número es par
		
		Scanner sc = new Scanner(System.in);				//Lee lo que introduzcamos
		System.out.println("Introduzca un número: ");		//Nos indica que escribamos el número
		numero = sc.nextInt();								//Lee el número introducido y lo guardo en su variable
		
		par = numero % 2 == 0;								//Compara el número introducido para saber si es par
		
		if (par) {											/*Colocamos un if para si es par poner que es par el número
															o sino ( else ) para decir que es impar el número*/
			System.out.println("Su número es par");
		} else  {
			System.out.println("Su número es impar");
			}	
		sc.close(); 										//Cerramos escáner
	}
}
