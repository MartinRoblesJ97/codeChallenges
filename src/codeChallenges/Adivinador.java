package codeChallenges;

import java.util.Random;
import java.util.Scanner;

/* JUEGO
 * 1. SE DEBE ELEGIR UN NÚMERO ALEATORIO DEL 1 AL 10
 * 2. SE PEDIRÁ AL USUARIO QUE ADIVINE ESTE NÚMERO
 * 3. SE PEDIRÁ UN NÚMERO EN TANTO EL USUAIRO NO ADIVINE EL NÚMERO
 * 4. SE DEBERÁ ANUNCIAR SI EL NÚMERO INGRESADO ES MAYOR O MENOR AL NÚMERO QUE SE BUSCA
 * */

public class Adivinador {
	
	public static void main(String[] args) {
		
		Scanner juego = new Scanner(System.in);
		Random rand = new Random();
		
		//NÚMERO RANDOM
		int randomNumber = rand.nextInt(10)+1;
		
		//ALMACENAR EL NÚMERO INGRESADO
		int numero = 0;
		
		while(numero!= randomNumber) {
			System.out.println("Por favor ingrese un número del 1 al 10");
			numero = juego.nextInt();
			
			if(numero == randomNumber) {
				System.out.println("Felicidades :)");
				
			} else if (numero <= randomNumber) {
				System.out.println("El número ingresado es menor");
				
			} else {
				System.out.println("El número ingresado es mayor");
			}
			
		}
		
		juego.close();

	} // MAIN

} //CLASS ADIVINADOR


