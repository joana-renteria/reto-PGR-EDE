Proceso ejercicio6
	Definir nombre Como Cadena
	Definir nombreMax Como Cadena
	Definir pulsRepos Como Entero
	Definir pulsPost1 Como Entero
	Definir pulsPost2 Como Entero
	Definir recuPrcnt Como Entero
	Definir recuMax Como Entero
	Definir condicion Como Logico
	nombre <- ""
	nombreMax <- ""
	pulsRepos <- 0
	pulsPost1 <- 0
	pulsPost2 <- 0
	recuPrcnt <- 0
	recuMax <- 0;
	condicion <- Falso
	
	Mientras (!condicion)
		Escribir "Introduce nombre atleta (escribe salir para terminar):"
		Leer nombre
		
		Si nombre = "salir" Entonces
			condicion <- Verdadero
		SiNo
			Escribir "Introduce pulsaciones en reposo"
			Leer pulsRepos
			Escribir "Introduce pulsaciones después de hacer ejercicio"
			Leer pulsPost1
			Escribir "Introduce pulsaciones 3 minutos después de hacer ejecercicio"
			Leer pulsPost2
			
			recuPrcnt <- redon((pulsRepos*100) / pulsPost2)
			
			Si (recuPrcnt >= 100)
				recuPrcnt <- 100
				Escribir "Atleta en plena forma"
			SiNo
				Si(recuPrcnt>=50)
					Escribir "Necesita entrenamiento"
				SiNo
					Escribir "Le atleta necesita revisión médica"
				FinSi
			FinSi
			Escribir "La recuperación de ",nombre," es de ",recuPrcnt,"%"
			Si (recuPrcnt > recuMax)
				recuMax <- recuPrcnt
				nombreMax <- nombre
			FinSi
		FinSi
		
	FinMientras
	Si (!nombreMax = "")
		Escribir "Mejor atleta: ",nombreMax," con una recuperación del ",recuMax,"%"
	FinSi
FinProceso
