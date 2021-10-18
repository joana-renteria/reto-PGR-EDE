Proceso ejercicio4
	Definir num1 Como Entero
	Definir num2 Como Entero
	Definir opci Como Caracter
	Definir salir Como Logico
	num1 <- 0
	num2 <- 0
	salir <- Falso
	
	Escribir "Introduce dos numeros que sean mayores que 0"
	
	Mientras num1<=0 O num2<=0 Hacer
		Escribir 'Introducir numero1: '
		Leer num1
		Escribir 'Introducir numero2: '
		Leer num2
	FinMientras
	Repetir
		Escribir '----MENU--------------------------'
		Escribir 'a) Suma'
		Escribir 'b) Resta'
		Escribir 'c) Multiplicacion'
		Escribir 'd) Division'
		Escribir 'e) Elevar el primer nº al segundo'
		Escribir 'f) Solicitar otros números'
		Escribir 's) Salir'
		Escribir 'Seleccione una opción:'
		Leer opci
		Segun opci  Hacer
			'a':
				Escribir num1,' + ',num2,' = ',num1+num2
			'b':
				Si num1>=num2 Entonces
					Escribir num1,' - ',num2,' = ',num1-num2
				SiNo
					Escribir num2,' - ',num1,' = ',num2-num1
				FinSi
			'c':
				Escribir num1,' * ',num2,' = ',num1*num2
			'd':
				Escribir num1,' / ',num2,' = ',num1/num2
			'e':
				Escribir num1,' ^ ',num2,' = ',num1^num2
			'f':
				Escribir "Introduce dos numeros que sean mayores que 0"
				Repetir
					Escribir 'Introducir numero1: '
					Leer num1
					Escribir 'Introducir numero2: '
					Leer num2
				Mientras Que (num1<=0 | num2<=0)
			's':
				salir <- Verdadero
			De Otro Modo:
				Escribir 'Hola'
		FinSegun
	Mientras Que (!salir)
FinProceso
