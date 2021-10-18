Algoritmo ejercicio6
	Definir nombre Como Cadena
	Definir condicion Como Logico
	Definir noVax Como Entero
	Definir input Como Cadena
	Definir dosis Como Real
	Definir mese Como Real
	nombre <- ""
	condicion <- Falso
	noVax <- 0
	input <- ""
	dosis <- 0
	meses <- 0
	
	Mientras (!condicion)
		Escribir "Introduce nombre (escribe salir para finalizar):"
		Leer nombre
		
		Si nombre = "salir" Entonces
			condicion <- Verdadero
		SiNo
			Escribir "(P)fizer, (M)oderna o (N)inguna?"
			Leer input
			Si input = "P"
				Escribir "Cuantas dosis?"
				Leer dosis
				Si dosis < 2 Entonces
					noVax <- noVax+1
				SiNo
					Escribir "Meses desde la última dosis:"
					Leer meses
					Si ((6 - meses) > 0) Entonces
						Escribir "Le quedan ",(6-meses)," de protección"
					SiNo
						Escribir "No tiene protección"
					FinSi
				FinSi
			SiNo
				Si input="M" Entonces
					Escribir "Cuantas dosis?"
					Leer dosis
					Si dosis < 2 Entonces
						noVax <- noVax+1
					SiNo
						Escribir "Meses desde la última dosis:"
						Leer meses
						Si ((6 - meses) > 0) Entonces
							Escribir "Le quedan ",(6-meses)," de protección"
						SiNo
							Escribir "No tiene protección"
						FinSi
					FinSi
				FinSi
			SiNo 
				Si input = "N" Entonces
					Escribir "No tiene protección"
					noVax <- noVax+1
				FinSi
			SiNo
				Escribir "Error. Introduce una opción valida"
			FinSi
		FinSi
	FinMientras
	
	
FinAlgoritmo
