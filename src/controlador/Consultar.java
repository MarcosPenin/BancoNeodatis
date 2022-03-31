package controlador;

import java.util.HashSet;
import java.util.Set;

import org.neodatis.odb.ODB;
import org.neodatis.odb.Objects;
import org.neodatis.odb.core.query.IQuery;
import org.neodatis.odb.core.query.criteria.ICriterion;
import org.neodatis.odb.core.query.criteria.Where;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;

import modelo.*;
import vista.ConsultasVista;
import vista.Mensajes;

public class Consultar {

	public static void clientesEmpiezanC(ODB odb) {

		ICriterion criterio = Where.like("nombre", "C%");
		IQuery query = new CriteriaQuery(Cliente.class, criterio);
		Objects clientes = odb.getObjects(query);

		Mensajes.empiezanConC();
		while (clientes.hasNext()) {
			Cliente cliente = (Cliente) clientes.next();
			ConsultasVista.imprimirCliente(cliente);
		}

	}

	public static void clientesRicos(ODB odb) {

		ICriterion criterio = Where.ge("saldoActual", 201.000);
		IQuery query = new CriteriaQuery(CuentaCorriente.class, criterio);
		Objects cuentas = odb.getObjects(query);

//El Set es necesario para que no salga duplicado un cliente con dos cuentas corrientes seleccionadas
		if (!cuentas.isEmpty()) {
			Set<Cliente> clientesRicos = new HashSet<>();
			Mensajes.clientesRicos();

			while (cuentas.hasNext()) {
				CuentaCorriente cuenta = (CuentaCorriente) cuentas.next();
				for (Cliente c : cuenta.getClientes()) {
					clientesRicos.add(c);
				}
			}
			for (Cliente c : clientesRicos) {
				ConsultasVista.imprimirCliente(c);
			}

		} else {
			Mensajes.sinClientesRicos();
		}
	}

	public static void clientesNumerosRojos(ODB odb) {

		// ICriterion criterio = Where.lt("saldoActual", 0);
		// IQuery query = new CriteriaQuery(Cuenta.class, criterio);
		// Es más sencillo sacando los clientes

		IQuery query = new CriteriaQuery(CuentaCorriente.class);
		Objects<Cliente> clientes = odb.getObjects(query);
		int saldoTotalCliente = 0;
		boolean flag = false;

		if (!clientes.isEmpty()) {
			while (clientes.hasNext()) {
				Cliente cliente = clientes.next();
				for (Cuenta c : cliente.getCuentas()) {
					saldoTotalCliente += c.getSaldoActual();
				}
				if (saldoTotalCliente < 0) {
					ConsultasVista.imprimirCliente(cliente);
					flag = true;
				}
			}
			if (!flag) {
				Mensajes.sinClientesNumerosRojos();
			}

		} else {
			Mensajes.sinClientes();
		}

	}

}
