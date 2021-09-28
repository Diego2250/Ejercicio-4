public class enemigo{
  protected String habilidad;
  protected int vida;
  protected int ataque;
  vista vista = new vista();
//  jugador j = new jugador();
  public enemigo(int v, int a, String h){
    vida=v;
    ataque=a;
    habilidad=h;
  }

  public void setVida(int newVida){
    this.vida=newVida;
  }

  public void setAtaque(int newAtaque){
    this.ataque=newAtaque;
  }

  public int getVida(){
    return vida;
  }

  public int getAtaque(){
    return ataque;
  }

  public String getHabilidad(){
    return habilidad;
  }

  public void usarHabilidad(String habilidad){
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

      break;
    }
  }

}
