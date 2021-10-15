Algoritmo PROG1
	num <- 1
	Mientras num<101 Hacer
		Si num MOD 2=0 Entonces
			Escribir num
		FinSi
		num <- num+1
	FinMientras
FinAlgoritmo



Algoritmo PROG2
	num <- 1
	cont <- 1
	Mientras num<101 Hacer
		Si num MOD 2<>0 Entonces
			Escribir num
			cont <- cont+1
		FinSi
		num <- num+1
	FinMientras
	Escribir 'Cantidad de números impares ',cont
FinAlgoritmo
