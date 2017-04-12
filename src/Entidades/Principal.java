package Entidades;

import java.awt.Event;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	private static ArrayList<Empleado> ListadeEmpleados;
	public static void main(String[] args) {
		ListadeEmpleados = new ArrayList<>();
		cargarempleado();
		mostarsueldo();
	}
		
	private static void cargarempleado() {
		Scanner lectura = new Scanner (System.in);
		System.out.println("Ingrese DNI");
		String lecdni = lectura.nextLine();
		int dni=Integer.parseInt(lecdni);
		System.out.println("Ingrese Nombre");
		String nombre = lectura.nextLine();
		System.out.println("Ingrese Apellido");
		String apellido = lectura.nextLine();
		System.out.println("Ingrese Email");
		String email = lectura.nextLine();
		System.out.println("Ingrese sueldoBase");
		double sueldoBase = lectura.nextDouble();
		
		System.out.println("El Empleado es Administrador? 1=SI/2=NO");
		String RespuestaAdministrador = lectura.nextLine();
		
		if (RespuestaAdministrador == "1") {
			System.out.println("Ingrese hsExtra");
			double hsExtra = lectura.nextDouble();
			System.out.println("Ingrese hsMes");
			double hsMes = lectura.nextDouble();
			ListadeEmpleados.add(new Administrativo (dni,nombre,apellido,email,sueldoBase,hsExtra,hsMes));
		}else {
			System.out.println("Ingrese porcenComision");
			String lecporcenComision = lectura.nextLine();
			double porcenComision = Double.parseDouble(lecporcenComision);
			System.out.println("Ingrese totalVentas");
			String lectotalVentas = lectura.nextLine();
			double totalVentas = Double.parseDouble(lectotalVentas);
			ListadeEmpleados.add(new Administrativo (dni,nombre,apellido,email,sueldoBase,porcenComision,totalVentas));
		}
		
		lectura.close();
	}

	private static void mostarsueldo() {
		double sueldo;
		Scanner lectura = new Scanner (System.in);
		for (Empleado nro : ListadeEmpleados) {
			sueldo=nro.getSueldo();
			System.out.println("El sueldo es "+sueldo);
		}
		lectura.close();
		
	}

		

}
 