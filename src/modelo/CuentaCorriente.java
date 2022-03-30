package modelo;

import java.util.ArrayList;
import java.util.Set;

public class CuentaCorriente extends Cuenta {

	private ArrayList<Movimiento> movimientos;

	public CuentaCorriente() {}
	
	public CuentaCorriente(int numero, String sucursal, float saldoActual, Set<Cliente> clientes) {
		super(numero, sucursal, saldoActual, clientes);
	}

	public CuentaCorriente(int numero, String sucursal, float saldoActual, Set<Cliente> clientes,
			ArrayList<Movimiento> movimientos) {
		super(numero, sucursal, saldoActual, clientes);
		this.movimientos = movimientos;
	}

	public ArrayList<Movimiento> getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(ArrayList<Movimiento> movimientos) {
		this.movimientos = movimientos;
	}

	public void addMovimiento(Movimiento m) {
		this.movimientos.add(m);
	}
	
	
	
}
