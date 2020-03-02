package c19Ejercicios;

import java.util.Scanner;

public class NumerosMayorMenor {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int promedio = 0;
		int suma = 0;
		int mayor = 0; 
		int menor = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame 3 numeros aleatorios: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
	
		suma = num1+num2+num3;
		promedio = suma/3;
		
		if (num1>num2 && num1>num3) {
			mayor = num1;
		}else if (num2>num1 && num2>num3) {
			mayor = num2;
		}else if  (num3>num1 && num3>num2) {
			mayor = num3;
		}
		
		if (num1<num2 && num1<num3) {
			menor = num1;
		}else if (num2<num1 && num2<num3) {
			menor = num2;
		}else if  (num3<num1 && num3<num2) {
			menor = num3;
		}
		System.out.println("La suma de los numeros es: \n" + suma);
		System.out.println("El promedio de los numeros es: \n" + promedio);
		System.out.println("El numero mayor de los numeros es: \n" + mayor);
		System.out.println("El numero menor de los numeros es: \n" + menor);
		
	
	}
}
