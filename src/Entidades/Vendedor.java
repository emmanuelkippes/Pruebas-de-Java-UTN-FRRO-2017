package Entidades;

public class Vendedor extends Empleado {
		public Vendedor(int dni, String nombre, String apellido, String email, double sueldoBase, double porcenComision, double totalVentas) {
		super(dni, nombre, apellido, email, sueldoBase);
		this.porcenComision=porcenComision;
		this.totalVentas=totalVentas;
	}
	private double porcenComision;
	private double totalVentas;
	
	public double getPorcenComision() {
		return porcenComision;
	}
	public double getTotalVentas() {
		return totalVentas;
	}
	public void setPorcenComision(double porcenComision) {
		this.porcenComision = porcenComision;
	}
	public void setTotalVentas(double totalVentas) {
		this.totalVentas = totalVentas;
	}
	
	public double getSueldo() {
		return getSueldoBase() + (getPorcenComision()*getTotalVentas()/100);
	}
	
	
		
}
