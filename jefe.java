/******************************************************************
jefe.java
Autor: Diego Morales
Última modificación: 28/09/2021

Modelo de hefe para uso del Controlador.
******************************************************************/
public class jefe extends enemigo{
  private String habilidad1, habilidad2;
  /*Costructor de clase*/
  public jefe(int v, int a, String h, String h1, String h2){
    super(v, a, "");
    habilidad1=h1;
    habilidad2=h2;
  }
  /*Metodo para devolver el valor de habilidad1
    @return valor de habilidad1
    */
  public String getHabilidad1(){
    return habilidad1;
  }
  /*Metodo para devolver el valor de habilidad1
    @return valor de habilidad1
    */
  public String getHabilidad2(){
    return habilidad2;
  }
}
