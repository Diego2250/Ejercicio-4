public class jefe extends enemigo{
  private string habilidad1, habilidad2;
  public jefe(int v, int a, String h1, String h2){
    habilidad1=h1;
    habilidad2=h2;
  }

  public String getHabilidad1(){
    return habilidad1;
  }

  public String getHabilidad2(){
    return habilidad2; 
  }
}
