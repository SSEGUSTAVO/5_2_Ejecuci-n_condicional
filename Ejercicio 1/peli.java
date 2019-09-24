import java.util.Scanner;

public class peli{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Introduzca el nombre de la película que desea ver: ");
	String nombre = input.next();
	System.out.print("Introduzca el precio de la película (0/300): ");
	int precio = input.nextInt();
	System.out.print("Introduzca la calificación obtenida en IMDb (0/10): ");
	double calificacion = input.nextDouble();
	if ((precio <= 120) && (calificacion > 9)){
	    System.out.println("La vida es un riesgo, carnal.");
	}
	else{
	    System.out.println("Na, mejor estudia para el exámen.");
	}
    }
}