Algoritmo Ejercicio1Reto
		Definir condicion Como Logico
	Definir dias Como Entero
	Definir A Como Entero
	Definir B Como Entero
	Definir C Como Entero
	dias <- 0
	condicion <- verdadero
	Escribir "Frecuencia con la que va Ana a la frutería (dias)"
	Leer A 
	Escribir "Frecuencia con la que va Bernardo a la frutería (dias)"
	Leer B
	Escribir "Frecuencia con la que va Carlos a la frutería (dias)"
	Leer C
	Mientras condicion = Verdadero
		dias <- dias+1
		Si dias mod A = 0 Entonces
			Si dias mod B = 0 Entonces
				Si dias mod C = 0 Entonces
					condicion <- falso
				FinSi
			FinSi
		FinSi
	FinMientras
	Escribir "Cada ",dias," se van a encontrar"
FinAlgoritmo
