Algoritmo ejercicioreto2
	
	continua <- Verdadero
	Definir horas Como entero
	Definir dias Como entero
	Definir precioHora Como Real
	precioHora <- 45.56
	Definir sel Como Caracter
	Definir resultado Como Real
	Definir resultadoExtra como real
	
	Mientras (continua = Verdadero)
		Escribir "Introduce cantidad dias trabajados esta semana: "
		Leer dias
		Resultado = 0
		resultadoExtra = 0
		Si (dias > 7)
			dias = 7
		FinSi
		Para i <- 1 Hasta dias Con Paso 1 Hacer
			extra = 3
			Escribir "Introduce cantidad horas trabajadas en el día " i ": "
			Leer horas
			Si (horas > 8)
				horas <- horas - 8
				resultado <- 8 * precioHora
				resultadoExtra <- resultadoExtra + (precioHora*(extra*horas)/100)
			SiNo resultado <- resultado + horas * precioHora
			FinSi
		Fin Para
		Si (resultadoExtra > ((resultado*30)/100))
			resultadoExtra = ((resultado*30)/100)
		FinSi
		Escribir "Vas a cobrar " (resultado + resultadoExtra) "esta semana xd"
		Escribir "¿Desea continuar?"
		Leer sel
		Si (sel = 'N' || sel = 'n')
			continua <- Falso
		FinSi
	FinMientras 
	
	
FinAlgoritmo
