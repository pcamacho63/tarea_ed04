package cuentas;
/**
 * Esta clase define los métodos y atributos de una cuenta bancaria.
 * @author Pablo Camacho Gándara
 * @version 12.02.2023
 */
public class CCuenta {
/**
 * Define el nombre del propietario de la cuenta.
 */
	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInterés;

	public CCuenta() {
	}

	public CCuenta(String nom, String cue, double sal, double tipo) {
		setNombre(nom);
		setCuenta(cue);
		setSaldo(sal);
	}
/**
 * 
 * @return Nos devuelve el saldo de la cuenta.
 */
	public double estado() {
		return getSaldo();
	}
/**
 * 
 * @param cantidad Cantidad de saldo que deseamos añadir a la cuenta.
 * @throws Exception No se permite ingresar una cantidad negativa.
 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		setSaldo(getSaldo() + cantidad);
	}
/**
 * 
 * @param cantidad Cantidad de saldo que deseamos retirar de la cuenta.
 * @throws Exception Ni se puede retirar una cantidad negativa ni tampoco retirar más saldo del que tenemos.
 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		setSaldo(getSaldo() - cantidad);
	}
/**
 * 
 * @param cantidad Cantidad de saldo que utilizaremos para realizar una serie de operaciones.
 * 
 */
	public static void operativa_cuenta(float cantidad) {
		CCuenta cuenta1;
		double saldoActual;

		cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
		saldoActual = cuenta1.estado();
		System.out.println("El saldo actual es" + saldoActual);

		try {
			cuenta1.retirar(2300);
		} catch (Exception e) {
			System.out.print("Fallo al retirar");
		}
		try {
			System.out.println("Ingreso en cuenta");
			cuenta1.ingresar(695);
		} catch (Exception e) {
			System.out.print("Fallo al ingresar");
		}
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTipoInterés() {
		return tipoInterés;
	}

	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
