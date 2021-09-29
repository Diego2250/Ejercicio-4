/***************************************************
Controlador.java
Autor: Diego Morales
Fecha: 28/09/2021

Driver program. Instancia la vista y el modelo,
y los comunica de acuerdo con las elecciones del
usuario.
***************************************************/
import java.util.Random;
import java.util.ArrayList;
public class controlador{
	public static void main(String[] args){
    int opcion=0;
		int combatiente=0;
		int accion=0;
		int accionenemigo=0;
		int jefe=0;
		int oleadas=2;
		int vida=0;
		int vida1=0;
		int vida2=0;
		String tipo_combatiente="";
		Random r = new Random();
    vista v = new vista();
		jugador guerre = new jugador(0,0,"",0);
		jugador explo = new jugador(0,0,"",0);
		enemigo esque = new enemigo (0, 0, "");
		enemigo demon = new enemigo (0, 0, "");
		enemigo zomb = new enemigo (0, 0, "");
    v.bienvenida();
    while (opcion != 5){
      opcion = v.menuOpciones();
      switch(opcion){
        case 1:
/**************************Combate***********************************/
				combatiente=v.elejirCombatiente();
				switch(combatiente){
					case 1:
					tipo_combatiente="Guerrero";
					guerre = new jugador(80,15,"",5);
					vida=guerre.getVida();
					v.Eleccion(tipo_combatiente);
					break;
					case 2:
					tipo_combatiente="Explorador";
					explo = new jugador(60,10,"",10);
					v.Eleccion(tipo_combatiente);
					vida=explo.getVida();
					break;
				}
				while (oleadas!=0) {
					esque = new enemigo (20, 10, "Aumentar vida");
					demon = new enemigo (25, 30, "Aumentar ataque");
					zomb = new enemigo (40, 25, "Envenenamiento");
					v.Enemigosgenerados();
					while(accion!=4){
						vida1=guerre.getVida();
						vida2=explo.getVida();
						if ((vida1<=0)&&vida2==0||vida2<=0&&vida1==0) {
							v.Final();
							oleadas=0;
							break;
						}else{
						int venemigo;
						v.Turnojugador();
						accion=v.menuBatalla();
						switch(accion){
							case 1:
							int enemigoa = v.elejirEnemigoAtaque();
							switch(enemigoa){
								case 1:
								if (tipo_combatiente=="Guerrero") {
									guerre.atacar(esque);
									venemigo=esque.getVida();
									v.Ataque(venemigo);
								}else{
									explo.atacar(esque);
									venemigo=esque.getVida();
									v.Ataque(venemigo);
								}
								break;
								case 2:
								if (tipo_combatiente=="Guerrero") {
									guerre.atacar(demon);
									venemigo=demon.getVida();
									v.Ataque(venemigo);
								}else{
									explo.atacar(demon);
									venemigo=demon.getVida();
									v.Ataque(venemigo);
								}
								break;
								case 3:
								if (tipo_combatiente=="Guerrero") {
									guerre.atacar(zomb);
									venemigo=zomb.getVida();
									v.Ataque(venemigo);
								}else{
									explo.atacar(zomb);
									venemigo=zomb.getVida();
									v.Ataque(venemigo);
								}

								break;
							}


							break;
							case 2:
							v.items();
							break;
							case 3:
							break;
							case 4:
							oleadas=0;
							v.Final();
							v.Perder();
							break;
							default:
							v.opcionInvalida();
							break;
						}
						v.Turnoenemigo();
						int vjugador;
						String habilidad;
						int rival=r.nextInt(3);
						rival+=1;
						int n=r.nextInt(2);
						n+=1;
						switch(rival){
							case 1:
							switch(n){
									case 1:
											if (tipo_combatiente=="Guerrero") {
												esque.atacar(guerre);
												vjugador=guerre.getVida();
												v.Atacado(vjugador);
											}else{
												esque.atacar(explo);
												vjugador=explo.getVida();
												v.Atacado(vjugador);
											}
											break;
									case 2:
											if (tipo_combatiente=="Guerrero") {
											habilidad=esque.getHabilidad();
											esque.usarHabilidad(habilidad, guerre);
										}else{
											habilidad=esque.getHabilidad();
											esque.usarHabilidad(habilidad, explo);
										}
											break;
								}
								break;
							case 2:
								switch(n){
									case 1:
											if (tipo_combatiente=="Guerrero") {
												demon.atacar(guerre);
												vjugador=guerre.getVida();
												v.Atacado(vjugador);
											}else{
												demon.atacar(explo);
												vjugador=explo.getVida();
												v.Atacado(vjugador);
											}
											break;
									case 2:
											if (tipo_combatiente=="Guerrero") {
											habilidad=demon.getHabilidad();
											demon.usarHabilidad(habilidad, guerre);
										}else{
											habilidad=demon.getHabilidad();
											demon.usarHabilidad(habilidad, explo);
										}
											break;


										}
							break;
							case 3:
								switch(n){
									case 1:
											if (tipo_combatiente=="Guerrero") {
												zomb.atacar(guerre);
												vjugador=guerre.getVida();
												v.Atacado(vjugador);
											}else{
												zomb.atacar(explo);
												vjugador=explo.getVida();
												v.Atacado(vjugador);
											}
									break;
									case 2:
										if (tipo_combatiente=="Guerrero") {
										habilidad=zomb.getHabilidad();
										zomb.usarHabilidad(habilidad, guerre);
									}else{
										habilidad=esque.getHabilidad();
										zomb.usarHabilidad(habilidad, explo);
									}
									break;
								}
							break;
						}
						oleadas=0;
				}
			}
			}

        break;
/**************************Combate***********************************/
        case 2:
				v.TiposCombatientes();
        break;
        case 3:
				v.TiposEnemigos();
        break;
        case 4:
				v.TiposItems();
        break;
        case 5:
        v.despedida();
        break;
        default:
        v.opcionInvalida();
        break;
      }
    }
  }

}
