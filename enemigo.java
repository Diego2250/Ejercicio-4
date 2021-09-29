/******************************************************************
enemigo.java
Autor: Diego Morales
Última modificación: 28/09/2021

Modelo de enemigo para uso del Controlador.
******************************************************************/
public class enemigo{
  protected String habilidad;
  protected int vida;
  protected int ataque;
  private int vjugador;
  vista vista = new vista();
    /*Costructor de clase*/
  public enemigo(int v, int a, String h){
    vida=v;
    ataque=a;
    habilidad=h;
  }
  /*Metodo para cambiar el valor de vida
  */
  public void setVida(int newVida){
    this.vida=newVida;
  }
  /*Metodo para cambiar el valor de ataque
  */
  public void setAtaque(int newAtaque){
    this.ataque=newAtaque;
  }

  public int getVida(){
    return vida;
  }
  /*Metodo para devolver el valor de ataque
    @return valor de ataque
    */
  public int getAtaque(){
    return ataque;
  }
  /*Metodo para devolver el valor de habilidad
    @return valor de habilidad
    */
  public String getHabilidad(){
    return habilidad;
  }
  /*Metodo para atacar al jugador
  */
  public void atacar(jugador j){
    int vjugador=j.getVida();
    vjugador=vjugador-ataque;
    j.setVida(vjugador);
  }
  /*Metodo para usar habilidad
  */
  public void usarHabilidad(String habilidad, jugador j){
    int v;
    switch(habilidad){
      case "Aumentar vida":
      v=getVida();
      v=v+10;
      this.setVida(v);
      vista.VidaAumentada(v);
      break;
      case "Aumentar ataque":
      int a=getAtaque();
      a=a+10;
      this.setAtaque(a);
      vista.AtaqueAumentado(a);
      break;
      case "Regeneracion":
      v=getVida();
      v=v+5;
      this.setVida(v);
      vista.VidaRegenerada(v);
      break;
      case "Envenenamiento":
      v=j.getVida();
      v=v-10;
      j.setVida(v);
      if (v<=0) {
        j.setVida(0);
        vista.Envenenado(0);
      }else{
        vista.Envenenado(v);
      }
      break;
    }
  }

}
