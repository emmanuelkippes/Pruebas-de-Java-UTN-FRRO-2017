package Entidades;

public class Administrativo extends Empleado {
	public Administrativo(int dni, String nombre, String apellido, String email, double sueldoBase, double hsExtra, double hsMes) {
		super(dni, nombre, apellido, email, sueldoBase);
		this.hsExtra=hsExtra;
		this.hsMes=hsMes;
	}
	private double hsExtra;
	private double hsMes;
	
	public double getHsExtra() {
		return hsExtra;
	}
	public double getHsMes() {
		return hsMes;
	}
	public void setHsExtra(double hsExtra) {
		this.hsExtra = hsExtra;
	}
	public void setHsMes(double hsMes) {
		this.hsMes = hsMes;
	}
	
	
	public double getSueldo() {
		return getSueldoBase()*((getHsExtra()*1.5)+getHsMes())/getHsMes();
	}

}
