package net.austrycastillo.integrador;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// PROYECTO INTEGRADOR
		// CREAR VARIABLES
		double saldo = 2000, monto;
		int clave = 123, opcion, claveIngresada;
		int c = 1;// contador
		String menu[] = { "1 - saldo", "2 - retiro", "3 - depósito", "4 - salir" };
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Ingresa tu password");
		claveIngresada = sc.nextInt();
		if (clave == claveIngresada) {
			System.out.println("Bienvenido");
			System.out.println("Seleccione una opción del menú:");
			for (int i = 0; i < menu.length; i++) {
				System.out.println(menu[i]);
			}
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Su saldo es " + saldo);
				break;
			case 2:
				System.out.println("ingrese el monto a retirar");
				monto = sc.nextDouble();
				System.out.println(Operacion.retirar(saldo, monto));
				break;
			default:
				System.out.println("No existe esa opción");

			}
			c = 4;
		} else {
			System.out.println("Clave incorrecta");
			c++;
		}
	} while (c <= 3);
	System.out.println("Chao");
	}
}
