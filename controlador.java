/***************************************************
Controlador.java
Autor: Diego Morales
Fecha: 17/09/2021

Driver program. Instancia la vista y el modelo,
y los comunica de acuerdo con las elecciones del
usuario.
***************************************************/
public class controlador{
	public static void main(String[] args){
    int opcion=0; 
    vista v = new vista();
    v.bienvenida();
    while (opcion != 5){
      opcion = v.menuOpciones();
      switch(opcion){
        case 1:
        break;
        case 2:
        break;
        case 3:
        break;
        case 4:
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
