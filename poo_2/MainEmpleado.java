package poo_2;

import java.util.*; 

public class MainEmpleado {
	
	public static void main(String[] args) {
		
/*		Empleado empleado1=new Empleado("Paco Gómez", 85000, 1990, 12, 17);
		Empleado empleado2=new Empleado("Ana López", 95000, 1995, 6, 2);
		Empleado empleado3=new Empleado("María Martín", 105000, 2002, 3, 15);
		
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		System.out.println("Nombre: " + empleado1.dameNombre() + " Sueldo: " 
				+ empleado1.dameSueldo() + " Fecha de alta " + empleado1.dameFechaContrato());
		System.out.println("Nombre: " + empleado2.dameNombre() + " Sueldo: " 
				+ empleado2.dameSueldo() + " Fecha de alta " + empleado2.dameFechaContrato());
		System.out.println("Nombre: " + empleado3.dameNombre() + " Sueldo: " 
				+ empleado3.dameSueldo() + " Fecha de alta " + empleado3.dameFechaContrato());
*/
		Jefatura jefe_RRHH=new Jefatura("Juan", 55000, 2006, 9, 25);
		jefe_RRHH.estableceIncentivo(2570);
		
		// ARRAY
		Empleado[] misEmpleados=new Empleado[6];
		misEmpleados[0]=new Empleado("Paco Gómez", 85000, 1990, 12, 17);
		misEmpleados[1]=new Empleado("Ana López", 95000, 1995, 6, 2);
		misEmpleados[2]=new Empleado("María Martín", 105000, 2002, 3, 15);
		misEmpleados[3]=new Empleado("Jose Fernández", 3000, 2000,1,1);
		
		// POLIMORFISMO. Principio de sustitución
		// Usamos un objeto de subclase cuando espera uno de superclase
		misEmpleados[4]=jefe_RRHH;
	
		misEmpleados[5]=new Jefatura("María", 95000, 1999, 5, 4);
		
		// CASTING DE OBJETOS
		Jefatura jefa_Finanzas=(Jefatura) misEmpleados[5]; 
		jefa_Finanzas.estableceIncentivo(5000);
		 
		
		Empleado director_comercial=new Jefatura("Sandra", 85000, 2012, 05, 04);
		
		Comparable ejemplo = new Empleado("Elisabeth", 95000, 2011, 06, 07);
		
		
		// INTERFACES
		if(director_comercial instanceof Empleado) {
			System.out.println("Es de tipo Jefatura");
		}
		
		if(ejemplo instanceof Comparable) {
			System.out.println("Implementa la interfaz comparable");
		}
		
		System.out.println(jefa_Finanzas.tomar_decisiones("Dar días de vacaciones"));
		
		System.out.println("El jefe " + jefa_Finanzas.dameNombre() + " tiene un bonus de: "
				+ jefa_Finanzas.establece_bonus(500)); 
		
		System.out.println(misEmpleados[3].dameNombre() + " tiene un bonus de: "
				+ misEmpleados[3].establece_bonus(200));
		
		
		System.out.println("\n ********* \n");
	
		// FOR mejorado
		for(Empleado e: misEmpleados) {
			e.subeSueldo(5);
		}
		for(Empleado e: misEmpleados) {
			System.out.println("Nombre: " + e.dameNombre() + " Sueldo: " +e.dameSueldo() 
					+ " Fecha de Alta: " + e.dameFechaContrato());
		}
		
		// FOR normal
/*		for(int i=0;i<3;i++) {
			misEmpleados[i].subeSueldo(5);
		}
		for(int i=0;i<3;i++) {
			System.out.println("Nombre: " + misEmpleados[i].dameNombre() + " Sueldo: " + misEmpleados[i].dameSueldo() 
					+ " Fecha de Alta: " + misEmpleados[i].dameFechaContrato());
		}
*/		
		
		Arrays.sort(misEmpleados);
		
	}
}