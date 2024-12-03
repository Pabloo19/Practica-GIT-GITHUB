import java.util.Scanner;
public class HorarioExtraescolar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String dia;
		System.out.printf("Introduce un dia de la semana: " );
		dia = teclado.nextLine();
		dia = dia.toUpperCase();
		
		switch (dia) {
			case "LUNES": System.out.printf("Tienes PSICOMOTRICIDAD\n");
			break;
			case "MARTES": System.out.printf("Tienes NATACION\n");
			break;
			case "SABADO", "DOMINGO": System.out.printf("Sin actividad\n");
			break;
			default:
			System.out.println("Dia incorrecto\n");
			break;
		}
	}
}
