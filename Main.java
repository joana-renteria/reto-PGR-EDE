package reot;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ejercicio6();
	}
	
		public static void ejercicio1() {
		int dias=0;
		int A, B, C; 
		boolean condicion=true;
		
		System.out.println("Frecuencia con la que va Ana a la frutería (dias)");
		A = sc.nextInt();
		
		System.out.println("Frecuencia con la que va Bernardo a la frutería (dias)");
		B = sc.nextInt();
		
		System.out.println("Frecuencia con la que va Carlos a la frutería (dias)");
		C = sc.nextInt();
		
		while (condicion) {
			dias++;
			if (dias % A == 0)
					if (dias%B == 0)
						if (dias%C == 0)
							condicion = false;
			
		}
		System.out.println("Cada " + dias + " se van a encontrar");
	}

	public static void ejercicio2() {
		boolean continua=true;
		int horas, dias;
		double precioHora=45.56;
		double resultado;
		double resultadoExtra;
		while (continua) {
			System.out.println("Introduce cantidad dias trabajados esta semana: ");
			dias=sc.nextInt();
			resultado = 0;
			resultadoExtra = 0;
			if (dias>7)
				dias=7;
			for (int i= 1; i<=dias; i++) {
				int extra=3;
				System.out.println("Introduce cantidad horas trabajadas en el dia " + i + ": ");
				horas=sc.nextInt();
				if (horas>8) {
					horas=horas-8;
					resultado = 8*precioHora;
					resultadoExtra += ((precioHora*(extra*horas))/100);
				} else {
					resultado += horas*precioHora;
				}
			}
			if(resultadoExtra > ((resultado*30)/100)) {
				resultadoExtra = ((resultado*30)/100);
			}
			System.out.println("Vas a cobrar " + (resultado + resultadoExtra) + " esta semana xd");
			System.out.println("¿Desea continuar?");
			if (sc.next().charAt(0)=='N') {
				continua=false; 
			}
		} 		
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
		Scanner sc = new Scanner(System.in);
		int num1=0, num2=0;
		String opci;
		boolean salir=false;
		
		System.out.println("Introduce dos numeros que sean mayores que 0");
		
		while (num1<=0 || num2<=0) {
			System.out.println("Introducir numero1: ");
			num1 = sc.nextInt();
			System.out.println("Introducir numero2: ");
			num2 = sc.nextInt();
		}
		do {
			System.out.println("----MENU--------------------------");
			System.out.println("a) Suma");
			System.out.println("b) Resta");
			System.out.println("c) Multiplicacion");
			System.out.println("d) Division");
			System.out.println("e) Elevar el primer nº al segundo");
			System.out.println("f) Solicitar otros números");
			System.out.println("s) Salir");
			System.out.println("Seleccione una opción:");
			opci = sc.next();
			switch (opci.charAt(0)) {
			case 'a':
				System.out.println(num1+" + "+num2+" = "+(num1+num2));
				break;
			case 'b':
				if (num1>=num2) {
					System.out.println(num1+" - "+num2+" = "+(num1-num2));
				} else {
					System.out.println(num2+" - "+num1+" = "+(num2-num1));
				}
				break;
			case 'c':
				System.out.println(num1+" * "+num2+" = "+(num1*num2));
				break;
			case 'd':
				System.out.println(num1+" / "+num2+" = "+(num1/num2));
				break;
			case 'e':
				System.out.println(num1+" ^ "+num2+" = "+(num1^num2));
				break;
			case 'f':
				System.out.println("Introduce dos numeros que sean mayores que 0");
				do {
					System.out.println("Introducir numero1: ");
					num1 = sc.nextInt();
					System.out.println("Introducir numero2: ");
					num2 = sc.nextInt();
				} while (num1<=0 || num2<=0);
				break;
			case 's':
				salir = true;
				break;
			default:
				System.out.println("Hola");
			}
		} while (!salir);
	}

	public static void ejercicio5() {

		Scanner sc = new Scanner(System.in);

		int numMin, numMax, aux, cont, numero;
		boolean salir = false;

		System.out.println("Introduce el numero minimo");
		numMin = sc.nextInt();

		System.out.println("Introduce el numero maximo");
		numMax = sc.nextInt();
		
		while(numMin<0) {
			System.out.println("El numero menor introducido no puede ser negativo introduce otro numero: ");
			numMin = sc.nextInt();
		}
		
		while(numMax<0) {
			System.out.println("El numero mayor introducido no puede ser negativo introduce otro numero: ");
			numMax = sc.nextInt();
		}
		
		if (numMax < numMin) {
			System.out.println("El numero " + numMin + " es mayor que " + numMax + " hay que cambiarlos");

			aux = numMax;
			numMax = numMin;
			numMin = aux;
		}

		int val = (int)Math.random() * (numMax - numMin + 1) + numMin;

		int resta = numMax - numMin;

		do {
			if (resta <= 10) {
				System.out.println("Tienes 3 oportunidades para adivinar el numero");

				for (cont = 1; cont <= 3; cont++) {
					System.out.println("Introduce un numero: ");
					numero = sc.nextInt();

					if (numero > valor) {
						System.out.println(
								"El numero a adivinar es menor al introducido te quedan " + (3 - cont) + " intentos");
					} else if (numero < valor) {
						System.out.println(
								"El numero a adivinar es mayor al introducido te quedan " + (3 - cont) + " intentos");
					}

					if (numero == valor) {
						System.out.println("Enhorabuena, lo has conseguido, te ha costado " + cont + " intentos.");
						salir = true;
						cont = 3;
					} else if (cont == 3) {
						System.out.println("Has fallado, no has acertado el numero, el numero era " + valor);
						salir = true;
					}
				}

			}

			if (resta >= 11 && resta <= 50) {
				System.out.println("Tienes 5 oportunidades para adivinar el numero");

				for (cont = 1; cont <= 5; cont++) {
					System.out.println("Introduce un numero: ");
					numero = sc.nextInt();

					if (numero > valor) {
						System.out.println(
								"El numero a adivinar es menor al introducido te quedan " + (5 - cont) + " intentos");
					} else if (numero < valor) {
						System.out.println(
								"El numero a adivinar es mayor al introducido te quedan " + (5 - cont) + " intentos");
					}

					if (numero == valor) {
						System.out.println("Enhorabuena, lo has conseguido, te ha costado " + cont + " intentos.");
						salir = true;
						cont = 5;
					} else if (cont == 5) {
						System.out.println("Has fallado, no has acertado el numero, el numero era " + valor);
						salir = true;
					}
				}
			}

			if (resta > 50) {
				System.out.println("Tienes 8 oportunidades para adivinar el numero");

				for (cont = 1; cont <= 8; cont++) {
					System.out.println("Introduce un numero: ");
					numero = sc.nextInt();

					if (numero > valor) {
						System.out.println(
								"El numero a adivinar es menor al introducido te quedan " + (8 - cont) + " intentos");
					} else if (numero < valor) {
						System.out.println(
								"El numero a adivinar es mayor al introducido te quedan " + (8 - cont) + " intentos");
					}

					if (numero == valor) {
						System.out.println("Enhorabuena, lo has conseguido, te ha costado " + cont + " intentos.");
						salir = true;
						cont = 8;
					} else if (cont == 8) {
						System.out.println("Has fallado, no has acertado el numero, el numero era " + valor);
						salir = true;
					}
				}
			}
		} while (!salir);
	}
	
	public static void ejercicio6() {
		String nombre, nombreMax = "";
		int pulsRepos, pulsPost1, pulsPost2, recuPrcnt;
		int recuMax = 0;
		boolean condicion = false;

		while(!condicion) {
			System.out.println("Introduce nombre atleta (escribe salir para terminar):");
			nombre = sc.next();
			if(nombre.equals("salir")) {
				condicion = true;
			} else {
				System.out.println("Introduce pulsaciones en reposo");
				pulsRepos = sc.nextInt();
				System.out.println("Introduce pulsaciones después de hacer ejercicio");
				pulsPost1 = sc.nextInt();
				System.out.println("Introduce pulsaciones 3 minutos después de hacer ejecercicio");
				pulsPost2 = sc.nextInt();
				recuPrcnt = (pulsRepos*100)/pulsPost2;
				if(recuPrcnt >= 100) {
					recuPrcnt = 100;
					System.out.println("Atleta en plena forma");
				} else if(recuPrcnt >= 50) {
					System.out.println("Le atleta está en plena forma");
				} else {
					System.out.println("Le atleta necesita revisión médica");
				}
				System.out.println("La recuperación de "+nombre+" es de "+recuPrcnt+"%");
				if(recuPrcnt > recuMax) {
					recuMax = recuPrcnt;
					nombreMax = nombre;
				}
			}
		}
		if(!nombreMax.equals(""))
			System.out.println("Mejor atleta: "+nombreMax+" con una "
				+ "recuperación del "+recuMax+"%");
	}
	
	public static void ejercicio7() {
		String nombre = "";
		boolean condicion = false;
		int noVax = 0;
		while(!condicion) {
			System.out.println("Introduce nombre (escribe 'salir' para finalizar):");
			nombre = sc.next();
			if(nombre.equals("salir")) {
				condicion = true;
			} else {
				System.out.println("(P)fizer, (M)oderna o (N)inguna?");
				String input = sc.next();
				if(input.equals("P")) {
					System.out.println("Cuantas dosis?");
					short dosis = (short) sc.nextInt();
					if(dosis < 2) {
						noVax++;
					} else {
						System.out.println("Meses desde la última dosis:");
						short meses = (short) sc.nextInt();
						if((6 - meses) > 0) {
							System.out.println("Le quedan "+(6-meses)+ " meses de protección");
						} else {
							System.out.println("No tiene protección");
						}
					}
				} else if(input.equals("M")) {
					System.out.println("Meses desde la última dosis:");
					short meses = (short) sc.nextInt();
					if((6 - meses) > 0) {
						System.out.println("Le quedan "+(6-meses)+ " meses de protección");
					} else {
						System.out.println("No tiene protección");
					}
				} else if(input.equals("N")) {
					System.out.println("No tiene protección");
					noVax++;
				} else {
					System.out.println("Error. Introduce una opción valida");
				}
			}
		}
		System.out.println("Gente sin vacunar: "+noVax);
	}

}
