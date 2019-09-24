import java.util.Scanner;

public class precios{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
    	System.out.print("¿Eres de la tercera edad?, R.- ");
    	String edad = input.next();
	boolean edad1 = edad.equals("Si");
	if (edad1 == true){
	    System.out.println("El precio de entrada es de $25");
	}
	else{
	    System.out.print("¿Eres estudiante?, R.- ");
	    String alumno = input.next();
	    boolean alumno1 = alumno.equals("Si");
	    if (alumno1 == true){
	    	System.out.print("¿Tienes credencial vigente?, R.- ");
		String credencial = input.next();
		boolean credencial1 = credencial.equals("Si");
		if (credencial1 == true){
		    System.out.println("El precio de entrada es de $15");
		}
		else{
		    System.out.println("El precio de entrada es de $40");
		}
	    }
	    else{
		System.out.println("El precio de entrada es de $40");
	    }
	}
    }
}