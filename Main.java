package reot;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//ejercicio3();
		ejercicio4();
	}

	//https://www2.math.upenn.edu/~kazdan/202F09/sqrt.pdf
	public static void ejercicio3() {
		System.out.println("Introduce un valor:");
		int valor = sc.nextInt();
		System.out.println("Introduce el error deseado [0]");
		double preIn = sc.nextDouble();
		double aux = (double) (valor / 2);
		boolean condicion = false;
		double raizC = 0;
		while(!condicion) {
			raizC = aux - (aux * aux - (double) valor) / (2 * aux);
			//if (Math.abs(aux - raizC) < preIn) condicion = true;
			if((raizC*raizC) == valor || Math.abs((raizC*raizC) - valor) < preIn) condicion = true;
			aux = raizC;
		}
		System.out.println("La raiz cuadrada de "+valor+" es "+raizC);
		double preOut = ((int) valor / (raizC * raizC)) * 100;
		System.out.println("La precisión es de "+preOut);
	}
	
	public static void ejercicio4() {
		int num1 = numIn(1);
		int num2 = numIn(2);
		String s[] = {"Suma","Resta","Multiplicación","División","Elevar el primer nº al segundo","Solicitar otros números","Salir"};
		for(int valor = opciones(s); valor <= '6'; valor = opciones(s)) {
			switch (valor) {
			case 0:
				System.out.println(num1+num2);
				break;
			case 1:
				System.out.println(num1-num2);
				break;
			case 2:
				System.out.println(num1*num2);
				break;
			case 3:
				System.out.println(num1/num2);
				break;
			case 4:
				System.out.println(num1^num2);
				break;
			case 5:
				num1 = numIn(1);
				num2 = numIn(2);
				break;
			case 6:
				System.out.println("Chao");
				break;
			default:
				System.out.println("No es una opción valida");
				break;
			}
		}
	}
	
	public static int numIn(int n) {
		System.out.println("Introduce número "+n+": ");
		int a = sc.nextInt();
		while(a <= 0) {
			System.out.println("Vuelve a introducirlo xd");
			a = sc.nextInt();
		}
		return a;
	}

	public static int opciones(String[] s) {
		// List<String> l = new List<String>();
		System.out.println("----MENU--------------------------");
		List<String> l = Arrays.asList(s);
		for(int i = 0; i < l.size(); i++) {
			System.out.println((char)('a'+i) + ") " + l.get(i));
		}
		System.out.println("Seleccione una opción: ");
		int input = sc.nextInt();
		input = input - 'a';
		if(input >= 0 && input <= l.size()) {
			System.out.println(input);
			return (input);
		}
		return -1;
	}

}
