package reot;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ejercicio6();
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
		System.out.println("La precisi�n es de "+preOut);
	}
	
	public static void ejercicio4() {
		int num1 = numIn(1);
		int num2 = numIn(2);
		String s[] = {"Suma","Resta","Multiplicaci�n","Divisi�n","Elevar el primer n� al segundo","Solicitar otros n�meros","Salir"};
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
				System.out.println("No es una opci�n valida");
				break;
			}
		}
	}
	
	public static int numIn(int n) {
		System.out.println("Introduce n�mero "+n+": ");
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
		System.out.println("Seleccione una opci�n: ");
		int input = sc.nextInt();
		input = input - 'a';
		if(input >= 0 && input <= l.size()) {
			System.out.println(input);
			return (input);
		}
		return -1;
	}
	
	public static void ejercicio6() {
		String nombre, nombreMax = "";
		int pulsRepos, pulsPost1, pulsPost2, recuPrcnt;
		int recuMax = 0;
		boolean condicion = false;
		do {
			System.out.println("Introduce nombre atleta:");
			nombre = sc.next();
			if(nombre.equals("salir")) {
				condicion = true;
				break;
			}
			System.out.println("Introduce pulsaciones en reposo");
			pulsRepos = sc.nextInt();
			System.out.println("Introduce pulsaciones despu�s de hacer ejercicio");
			pulsPost1 = sc.nextInt();
			System.out.println("Introduce pulsaciones 3 minutos despu�s de hacer ejecercicio");
			pulsPost2 = sc.nextInt();
			recuPrcnt = (pulsRepos*100)/pulsPost2;
			if(recuPrcnt >= 100) {
				recuPrcnt = 100;
				System.out.println("Atleta en plena forma");
			} else if(recuPrcnt >= 50) {
				System.out.println("Le atleta est� en plena forma");
			} else {
				System.out.println("Le atleta necesita revisi�n m�dica");
			}
			System.out.println("La recuperaci�n de "+nombre+" es de "+recuPrcnt+"%");
			if(recuPrcnt > recuMax) {
				recuMax = recuPrcnt;
				nombreMax = nombre;
			}
		} while(!condicion);
		if(!nombreMax.equals(""))
			System.out.println("Mejor atleta: "+nombreMax+" con una "
				+ "recuperaci�n del "+recuMax+"%");
	}

}
