/******************************************************************
jugador.java
Autor: Diego Morales
Última modificación: 28/09/2021

Modelo de jugador para uso del Controlador.
******************************************************************/
public class jugador extends enemigo{
  private int items;
  vista v = new vista();
    /*Costructor de clase*/
  public jugador(int v, int a, String h, int i){
    super(v, a, "");
    items=i;
  }
  /*Metodo para usar item
  */
  public void usarItem(String item){
      switch(item){
        case("PocionA"):
        this.ataque=this.ataque+10;
        this.setAtaque(this.ataque);
        v.PocionAtaque(ataque);
        break;
        case("PocionV"):
        this.vida=this.vida+10;
        this.setVida(this.vida);
        v.PocionVida(vida);
        break;
        case("HiperpocionA"):
        this.ataque=this.ataque+20;
        this.setAtaque(this.ataque);
        v.HPocionAtaque(ataque);
        break;
        case("HiperpocionV"):
        this.vida=this.vida+20;
        this.setVida(this.vida);
        v.HPocionVida(vida);
        break;
        case("Comida"):
        this.vida=this.vida+5;
        this.setVida(this.vida);
        v.Comida(vida);
        break;
      }
  }
  /*Metodo para atacar al enemigo
  */
  public void atacar(enemigo e){
    int venemigo=e.getVida();
    if (venemigo<=0) {
      v.EnemigoSinVida();
      e.setVida(0);
    }else{
      venemigo=venemigo-this.ataque;
      e.setVida(venemigo);
    }
  }
}
