Proceso ejercicio3
	Definir val Como Real
	Definir preIn Como Real
	Definir aux Como Real
	Definir condicion Como Logico
	Definir raizC Como Real
	Definir preOut Como Real
	val <- 0
	preIn <- 0
	
	Escribir "Introduce un valor: "
	leer val
	
	//AVISO: Si se queda pillado introduce un error mas grande
	Escribir "Introduce el error deseado [0]"
	leer preIn
	
	aux <- val/2
	condicion <- Falso
	raizC <- 0
	Mientras !condicion
		raizC <- aux - (aux * aux - val) / (2 * aux)
		Si ((raizC * raizC) = val | abs((raizC * raizC) - val) < preIn) Entonces
			condicion <- Verdadero
			aux <- raizC
		FinSi
	FinMientras
	Escribir "La raiz cuadrada de ",val," es ",raizC
	preOut <- (val / (raizC * raizC)) * 100
	Escribir "La precisión es de ",preOut
FinProceso
