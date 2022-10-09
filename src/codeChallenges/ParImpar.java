package codeChallenges;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		Scanner numero = new Scanner(System.in);
		
		//VARIABLE PARA GUARDAR EL NUMERO
		int num;
		
		System.out.println("Por favor  ingrese un número");
		num = numero.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num + " es un número par");
		}
		else {
			System.out.println(num + " es un número impar");
		} 
		
		//CIERRE DE SCANNER
		numero.close();

	}//MAIN

}// CLASE PARIMPAR
