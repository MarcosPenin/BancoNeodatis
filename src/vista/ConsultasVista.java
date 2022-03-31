package vista;

import modelo.Cliente;
import modelo.Movimiento;

public class ConsultasVista {

	public static void imprimirCliente(Cliente c) {
		System.out.println(c.toString());
		
	}

	public static void imprimirMovimiento(Movimiento m) {
		System.out.println(m.toString());
		
	}

}
