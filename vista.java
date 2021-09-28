/***************************************************
Vista.java
Autor: Diego Morales
Fecha: 28/09/2021

Vista. Responsable de toda interaccion con el usuario.
***************************************************/
import java.util.Scanner;
public class vista{
	private Scanner scan;

	public vista(){
		scan = new Scanner(System.in);
	}
  /*Metodo para elegír una opción
  @return número de opción
  */
	public int menuOpciones(){
		int op=0;
				try{
			String s = "¿Que deseas hacer?\n" +
					"1. Inicial batalla\n" +
					"2. Ver tipos de combatientes\n" +
					"3. Ver tipos de enemigos\n" +
          "4. Ver tipos items\n" +
					"5. Salir\n"

		System.out.println(s);
		op = scan.nextInt();
	}catch (Exception e){
				error();
				scan.next();
		}
		return op;
	}

  /*Metodo para elegír una opción dentro de la batalla
  @return número de opción
  */
  public int menuBatalla(){
		int op=0;
				try{
			String s = "¿Que deseas hacer?\n" +
					"1. Atacar\n" +
					"2. Ver inventario\n" +
					"3. Saltar turno\n" +
					"4. Salir\n"

		System.out.println(s);
		op = scan.nextInt();
	}catch (Exception e){
				error();
				scan.next();
		}
		return op;
	}

  /*Metodo para mostrar mensaje de despedida ae usuario
	*/
  public void Turojugador(){
    System.out.println("Es tu turno");
  }

  /*Metodo para mostrar mensaje de despedida ae usuario
	*/
  public void Turoenemigo(){
    System.out.println("Es el turno del enemigo");
  }

  /*Metodo para mostrar mensaje de despedida ae usuario
	*/
  public void Final(){
    System.out.println("¡La batalla ha terminado!");
  }

	/*Metodo para mostrar mensaje de despedida ae usuario
	*/
	public void despedida(){
		System.out.println("Gracias por usar este programa, adios");
	}
	/*Metodo para mostrar mensaje de bienvenida al usuario
	*/
	public void bienvenida(){
		System.out.println("¡Bienvendio(a) comabtiente!");
	}

	/*Metodo para mostrar mensaje
	*/
	public void opcionInvalida(){
		System.out.println("Has elegido una opción inválida.");
	}

	/*Metodo para mostrar mensaje
	*/
	public void Ganar(){
		System.out.println("No quedan mas enemigos ¡Haz ganado!");
	}

  /*Metodo para mostrar mensaje
  */
  public void Perder(){
    System.out.println("No te quedan puntos de vida ¡Haz perdido!");
  }
	/*Metodo para mostrar mensaje
	*/
  public void error(){
    System.out.println("Ha ocurrido un error");
  }
	/*Metodo para leer el archivo
	*/
  public void Estatus(int vida){
    System.out.println("La vida restante es de: "+vida);
  }
}
