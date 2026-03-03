package introduccion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

	  static List<String> estudiantes = new ArrayList<>();
	    static List<Double> calificaciones = new ArrayList<>();
		static  Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        System.out.println("Bienvenido al sistema de gestión de estudiantes.");

	        while (true) {
	        	mostrarmenu();
	      	            int opcion;
	      	          if (scanner.hasNextInt()) {
	      	            opcion = scanner.nextInt();
	      	            scanner.nextLine(); 
	      	        } else {
	      	            System.out.println("Debe ingresar un número válido.");
	      	            scanner.nextLine(); 
	      	            continue; 
	      	        }
	      	            
	      	            switch (opcion){
	      	            case 1: estudianteAgregar();
	      	            break;
	      	            case 2:  estudianteLista();
	      	            break;
	      	            case 3:  estudianteCalcprom();
	      	            break;
	      	            case 4:  estudianteMaxcalificacion();
	      	            break;
	      	            case 5:   System.out.println("Salida del programa ");
	      	            return;
	      	            default: System.out.println("Error opcion Incorrecta"); }
	        }}   
		
		
		
		public static void mostrarmenu() {
		System.out.println("\n1. Agregar estudiante");
        System.out.println("2. Mostrar lista de estudiantes");
        System.out.println("3. Calcular promedio de calificaciones");
        System.out.println("4. Mostrar estudiante con la calificación más alta");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
		
		} 	            
// PARTE 1
		   public static void estudianteAgregar() {
		System.out.print("Ingrese el nombre del estudiante: ");
		String nombre = scanner.nextLine();
        double calificacion = -1;

		while (calificacion < 0 || calificacion > 100) {
		    try {
		        System.out.print("Ingrese la calificación del estudiante: ");
		        calificacion = Double.parseDouble(scanner.nextLine());

		        if (calificacion < 0 || calificacion > 100) {
		            System.out.println("La calificación debe estar entre 0 y 100.");
		        }

		    } catch (NumberFormatException e) {
		        System.out.println("Ingrese un número válido.");
		    }
		}

		estudiantes.add(nombre);
		calificaciones.add(calificacion);

		System.out.println("Estudiante agregado correctamente.");

}

//PARTE 2
		public static void estudianteLista() {      

            if (estudiantes.isEmpty()) {
                System.out.println("No hay estudiantes registrados.");
            } else {
                System.out.println("\nLista de estudiantes:");
                for (int i = 0; i < estudiantes.size(); i++) {
                    System.out.println(estudiantes.get(i) +
                            " - Calificación: " + calificaciones.get(i));
                }
            }
            }
//PARTE 3
	             public static void estudianteCalcprom() {

	                if (calificaciones.isEmpty()) {
	                    System.out.println("No hay calificaciones registradas.");
	                } else {
	                    double suma = 0;

	                    for (double calificacion : calificaciones) {
	                        suma += calificacion;
	                    }

	                    double promedio = suma / calificaciones.size();
	                    System.out.println("El promedio de calificaciones es: " + promedio);
	                }
	                }
//PARTE 4
	            
	             public static void estudianteMaxcalificacion() {
	                if (calificaciones.isEmpty()) {
	                    System.out.println("No hay calificaciones registradas.");
	                } else {

	                    double maxCalificacion = calificaciones.get(0);
	                    String estudianteMax = estudiantes.get(0);

	                    for (int i = 1; i < calificaciones.size(); i++) {
	                        if (calificaciones.get(i) > maxCalificacion) {
	                            maxCalificacion = calificaciones.get(i);
	                            estudianteMax = estudiantes.get(i);
	                        }
	                    }
	                    System.out.println("El estudiante con la calificación más alta es: "
	                            + estudianteMax + " con " + maxCalificacion);
	                }
	             }
}