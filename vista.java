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
					"5. Salir\n";

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
					"2. Ver inventario y usar item\n" +
					"3. Saltar turno\n" +
					"4. Escapar\n";

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
	public int elejirCombatiente(){
		int op=0;
				try{
			String s = "¿Que comabiente deseas ser?\n" +
					"1. Guerrero\n" +
					"2. Explorador\n";

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
	public int elejirEnemigoAtaque(){
		int op=0;
				try{
			String s = "¿A quien deseas atacar?\n" +
					"1. Esqueleto\n" +
					"2. Demonio\n" +
					"3. Zombie\n";

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
  public void Turnojugador(){
    System.out.println("Es tu turno");
  }

	/*Metodo para mostrar mensaje de despedida ae usuario
	*/
	public void TiposCombatientes(){
		System.out.println("Los combatientes son: ");
		System.out.println("Guerrero: Este gerrero tiene una gran cantidad de vida y de ataque, pero no mucha capacidad en la mochila para llevar items");
		System.out.println("Explorador: Un explorador, el cual tiene una vida y ataque normal pero tiene una mochila muy grande para llevar muchisimos items utiles en la batalla");
	}
	/*Metodo para mostrar mensaje de despedida ae usuario
	*/
	public void TiposEnemigos(){
		System.out.println("Los enemigos son: ");
		System.out.println("Esqueleto: Un esqueleto salido de las tumbas para servir a su amo. Tiene una vida y ataque bajos pero, recuerda, si hay uno, hay mas...");
		System.out.println("Demonio: Sacado del infierno. Un demonio tiene una una poca cantidad de vida, pero a cambio tienen una fuerza superior.");
		System.out.println("Zombies: Los muertos vivientes estan entre nosotros. Tienen un ataque bajo pero una gran cantidad de vida. Recuerda ¡la cabeza es su punto debil!");
		System.out.println("Gran Esqueleto: Es el amo de los esqueletos. Posee el triple de vida y ataque de un esqueleto normal.");
		System.out.println("Jefe Demonio Aamon: Es un demonio temido en el mismo infierno. Posee el doble de ataque y el triple de vida que un demonio normal");
		System.out.println("Gran Zombie: Deseando volver a ser un humano y envidiando a todo aquel humano que se ponga en su camino. Este zombie tiene el triple de vida y el doble de ataque que un zombie normal.");
	}
	/*Metodo para mostrar mensaje de despedida ae usuario
	*/
	public void TiposItems(){
		System.out.println("Los Items son: ");
		System.out.println("Pocion de ataque: Aumenta el ataque en 10 puntos.");
		System.out.println("Pocion de vida:Aumenta la vida en 10 puntos.");
		System.out.println("Hiperpocion de ataque: Aumenta el ataque en 20 puntos.");
		System.out.println("Hiperpocion de vida: Aumenta la vida en 20 puntos.");
		System.out.println("Comida: Aumenta la vida en 5 puntos");
	}

  /*Metodo para mostrar mensaje de despedida ae usuario
	*/
  public void Turnoenemigo(){
    System.out.println("Es el turno del enemigo");
  }

	/*Metodo para mostrar mensaje de despedida ae usuario
	*/
	public void Enemigosgenerados(){
		System.out.println("¡Han aparecido 3 enemigos frente a ti! 1. Esqueleto, 2. Demonio, 3. Zombie");
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
	public void EnemigoSinVida(){
		System.out.println("El enemigo ya no tiene vida");
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
	/*Metodo para mostrar mensaje
	*/
	public void items(){
    System.out.println("Los items son: ");
  }
	/*Metodo para leer el archivo
	*/
  public void Estatus(int vida){
    System.out.println("La vida restante es de: "+vida+" puntos");
  }
	/*Metodo para mostrar mensaje de despedida ae usuario
	*/
  public void VidaAumentada(int vida){
    System.out.println("Se a aumentado la vida a: "+vida+" puntos");
  }
	/*Metodo para mostrar mensaje de despedida ae usuario
	*/
  public void AtaqueAumentado(int ataque){
    System.out.println("Se a aumentado el ataque a: "+ataque+" puntos");
  }
	/*Metodo para mostrar mensaje de despedida ae usuario
	*/
	public void Eleccion(String combatiente){
    System.out.println("Haz elejido ser un: "+combatiente);
  }
	/*Metodo para mostrar mensaje de despedida ae usuario
	*/
  public void VidaRegenerada(int vida){
    System.out.println("Se a regenerado la vida a: "+vida+" puntos");
  }
	/*Metodo para mostrar mensaje de despedida ae usuario
	*/
	public void Envenenado(int vida){
		System.out.println("¡Te han envenenado! Se a reducido tu vida a: "+vida+" puntos");
	}
	/*Metodo para mostrar mensaje de despedida ae usuario
	*/
	public void Atacado(int vida){
		System.out.println("El enemigo te ha atacado");
		System.out.println("Se a reducido tu vida a: "+vida+" puntos");
	}

	public void Ataque(int vida){
		System.out.println("Haz atacado al enemigo");
		System.out.println("Se a reducido la vida del enemigo a: "+vida+" puntos");
	}
	/*Metodo para mostrar mensaje de despedida ae usuario
	*/
  public void PocionVida(int vida){
    System.out.println("Haz usado una pocion de vida, tu vida es de : "+vida+" puntos");
  }
	/*Metodo para mostrar mensaje de despedida ae usuario
	*/
	public void PocionAtaque(int ataque){
		System.out.println("Haz usado una pocion de aumento de ataque, tu ataque es de : "+ataque+" puntos");
	}
	/*Metodo para mostrar mensaje de despedida ae usuario
	*/
	public void HPocionAtaque(int ataque){
		System.out.println("Haz usado una Hiperpocion de aumento de ataque, tu ataque es de : "+ataque+" puntos");
	}

	public void HPocionVida(int vida){
		System.out.println("Haz usado una Hiperpocion de vida, tu vida es de : "+vida+" puntos");
	}
	/*Metodo para mostrar mensaje de despedida ae usuario
	*/
	public void Comida(int vida){
		System.out.println("Haz tomado un pedazo de comida, tu vida es de : "+vida+" puntos");
	}
}
