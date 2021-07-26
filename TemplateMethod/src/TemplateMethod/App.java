package TemplateMethod;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("Ingrese un numero");
		Scanner Leer = new Scanner(System.in);
		int numero = Leer.nextInt();
		
		ClaseConcreta1 operacion1 = new ClaseConcreta1();
		ClaseConcreta2 operacion2 = new ClaseConcreta2();
		
		//impresion
		System.out.println("Resultados ejecutados por la ClaseAbstracta1");
		System.out.println("multiplicacion: "+operacion1.multiplicar(numero));
		System.out.println("suma: "+operacion1.sumar(numero));

		System.out.println("Resultados ejecutados por la ClaseAbstracta2");
		System.out.println("multiplicacion: "+operacion2.multiplicar(numero));
		System.out.println("suma: "+operacion2.sumar(numero));
	}

}
