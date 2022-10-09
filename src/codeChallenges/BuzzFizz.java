package codeChallenges;

import java.util.Scanner;

public class BuzzFizz {

	public static void main(String[] args) {
		
		Scanner numero = new Scanner(System.in);
		
		//VARIABLE PARA GUARDAR EL NÚMERO
		int num;
		
		System.out.println("Por favor  ingrese un número");
		num = numero.nextInt();
		
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("Fizz Buzz");
			
		} else if (num % 3 == 0) {
			System.out.println("Buzz");
			
		} else if (num % 5 == 0) {
			System.out.println("Fizz");
			
		} else {
			System.out.println(num);
		}
		
		// CIERRE DE SCANNER
		numero.close();


	} //MAIN

} //CLASS BUZZFIZ


