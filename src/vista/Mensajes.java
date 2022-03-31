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

	public static void clienteNoExiste() {
		System.out.println("El cliente que busca no existe");
		
	}

	public static void noEsPlazo() {
		System.out.println("La cuenta indicada no es de plazo fijo");
		
	}

	public static void empiezanConC() {
		System.out.println("CLIENTES QUE EMPIEZAN CON C\n");
		
	}

	public static void clientesRicos() {
		System.out.println("CLIENTES CON MÁS DE UNA CUENTA CORRIENTE\n");
		
	}

	public static void sinClientesRicos() {
		System.out.println("No existen clientes con tanto dinero en la cuenta");
		
	}

	public static void sinClientes() {
		System.out.println("Todavía no se ha registrado ningún cliente");
		
	}

	public static void sinClientesNumerosRojos() {
		System.out.println("No existen clientes en números rojos");
	}

}
