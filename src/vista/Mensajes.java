package vista;

import modelo.CuentaPlazo;

public class Mensajes {

	public static void cuentaRepetida() {
		System.out.println("Ya existe una cuenta con ese n�mero");

	}

	public static void cuentaCreada() {
		System.out.println("Cuenta creada con �xito");

	}

	public static void cuentaNoExiste() {
		System.out.println("La cuenta que busca no existe");

	}

	public static void movimientoGuardado() {
		System.out.println("El movimiento se ha guardado con �xito");

	}

	public static void interesesModificados(CuentaPlazo c) {
		System.out.println("Se han modificado los intereses de la cuenta " + c.getNumero());

	}

}
