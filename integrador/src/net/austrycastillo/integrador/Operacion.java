package net.austrycastillo.integrador;

public class Operacion {
	// método para realizar retiros
	public static String retirar(double saldo, double monto) {
		String msn = "";
		if (monto < saldo) {
			saldo -= monto; // saldo = saldo - monto;
			msn = "Retiro correcto, su saldo actualizado es " + saldo;
		} else
			msn = "Saldo insuficiente";

		return msn;
	}
}
