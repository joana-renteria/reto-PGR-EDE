Proceso ejercicio5
	Definir numMin Como Entero
	Definir numMax Como Entero
	Definir aux Como Entero
	Definir cont Como Entero
	Definir num Como Entero
	Definir salir Como Logico
	Definir val Como Entero
	Definir resta Como Entero
	numMin <- 0
	numMax <- 0
	aux <- 0
	cont <- 0
	num <- 0
	salir <- Falso
	
	Escribir "Introduce el numero minimo"
	leer numMin
	
	Escribir "Introduce el numero maximo"
	leer numMax
	
	Mientras numMin < 0
		Escribir "El numero menor introducido no puede ser negativo introduce otro numero: "
		Leer numMin
	FinMientras
	
	Mientras numMax < 0
		Escribir "El numero mayor introducido no puede ser negativo introduce otro numero: "
		leer numMax
	FinMientras
	
	Si (numMax < numMin) Entonces
		Escribir "El numero ",numMin," es mayor que ",numMax," hay que cambiarlos"
		
		aux <- numMax
		numMax <- numMin
		numMin <- aux
	FinSi
	
	val <- Aleatorio(numMin, numMax);
	
	Escribir val
	
	resta <- numMax - numMin
	
	Hacer
		Si (resta <= 10) Entonces
			Escribir "Tienes 3 oportunidades para adivinar el numero"
			
			Para cont <- 1 Hasta 3 Con Paso cont + 1 Hacer 
				Escribir "Introduce un numero: "
				Leer num
				
				Si num > val Entonces
					Escribir "El numero a adivinar es menor al introducido te quedan ",(3 - cont)," intentos"
				SiNo 
					Si num < val Entonces
						Escribir "El numero a adivinar es mayor al introducido te quedan ",(3 - cont)," intentos"
					FinSi
				FinSi
				
				Si num = val Entonces
					Escribir "Enhorabuena, lo has conseguido, te ha costado ",cont," intentos."
					salir <- Verdadero
					cont <- 3
				SiNo
					Si cont = 3 Entonces
						Escribir "Has fallado, no has acertado el numero, el numero era ",val
						salir <- Verdadero
					FinSi
				FinSi
			FinPara
		FinSi
		
		Si (resta >= 11 && resta <= 50) Entonces
			Escribir "Tienes 5 oportunidades para adivinar el numero"
			
			Para cont <- 1 Hasta 5 Con Paso cont + 1 Hacer 
				Escribir "Introduce un numero: "
				Leer num
				
				Si num > val Entonces
					Escribir "El numero a adivinar es menor al introducido te quedan ",(5 - cont)," intentos"
				SiNo 
					Si num < val Entonces
						Escribir "El numero a adivinar es mayor al introducido te quedan ",(5 - cont)," intentos"
					FinSi
				FinSi
				
				Si num = val Entonces
					Escribir "Enhorabuena, lo has conseguido, te ha costado ",cont," intentos."
					salir <- Verdadero
					cont <- 5
				SiNo
					Si cont = 5 Entonces
						Escribir "Has fallado, no has acertado el numero, el numero era ",val
						salir <- Verdadero
					FinSi
				FinSi
			FinPara
		FinSi
		
		Si (resta > 50) Entonces
			Escribir "Tienes 5 oportunidades para adivinar el numero"
			
			Para cont <- 1 Hasta 8 Con Paso cont + 1 Hacer 
				Escribir "Introduce un numero: "
				Leer num
				
				Si num > val Entonces
					Escribir "El numero a adivinar es menor al introducido te quedan ",(8 - cont)," intentos"
				SiNo 
					Si num < val Entonces
						Escribir "El numero a adivinar es mayor al introducido te quedan ",(8 - cont)," intentos"
					FinSi
				FinSi
				
				Si num = val Entonces
					Escribir "Enhorabuena, lo has conseguido, te ha costado ",cont," intentos."
					salir <- Verdadero
					cont <- 8
				SiNo
					Si cont = 8 Entonces
						Escribir "Has fallado, no has acertado el numero, el numero era ",val
						salir <- Verdadero
					FinSi
				FinSi
			FinPara
		FinSi
	Hasta Que (!salir )
	
FinProceso
