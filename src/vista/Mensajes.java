package vista;

import modelo.CuentaPlazo;

public class Mensajes {

	public static void cuentaRepetida() {
		System.out.println("Ya existe una cuenta con ese número");

	}

	public static void cuentaCreada() {
		System.out.println("Cuenta creada con éxito");

	}

	public static void cuentaNoExiste() {
		System.out.println("La cuenta que busca no existe");

	}

	public static void movimientoGuardado() {
		System.out.println("El movimiento se ha guardado con éxito");

	}

	public static void interesesModificados(CuentaPlazo c) {
		System.out.println("Se han modificado los intereses de la cuenta " + c.getNumero());

	}

}
