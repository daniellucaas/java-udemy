package javaSintaxe;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float peso;
		float altura;
		float imc;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira seu peso em quilogramas: ");
		peso = scan.nextFloat();
		System.out.print("Insira sua altura em metros quadrados: ");
		altura = scan.nextFloat();
		
		imc = peso/(altura*altura);
		System.out.println("Seu BMI é: " + imc);
		
		scan.close();
	}
}