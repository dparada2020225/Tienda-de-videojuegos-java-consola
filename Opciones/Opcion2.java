//2.Crear y eliminar un video juego.
package Opciones;
import java.util.ArrayList;
//
public class Opcion2{
	private String juegoagregado1;
	private String juegoagregado2;
	private String juego1="1. MORTAL KOMBAT";
	private String juego2="2. Minecraft";
	private String juego3="3. Mario Kart 64";
	
	//int juegoeliminado1=juegoeliminado-1,

	public Opcion2(){}

	public Opcion2(String juegoagregado1, String juegoagregado2){
		this.juegoagregado1=juegoagregado1;
		this.juegoagregado2=juegoagregado2;
		
	}

	public ArrayList getjuegos(){
	ArrayList <String> listajuegos = new ArrayList<String>(); 
	listajuegos.add("1 TETRIS");
	listajuegos.add("2. GALAGA");
	listajuegos.add("3. Snake ");
	listajuegos.add("  4. "+juegoagregado1);

	return listajuegos;
	}
	
	public 	String getjuegoagregado1(){
		return juegoagregado1;
	}
	public void setjuegoagregado1(String juegoagregado1){
		this.juegoagregado1=juegoagregado1;
	}
	public 	String getjuegoagregado2(){
		return juegoagregado2;
	}
		public void setjuegoagregado2(String juegoagregado2){
		this.juegoagregado2=juegoagregado2;
	}
	public String getjuego1(){
		return juego1;
	}
	public String getjuego2(){
		return juego2;
	}
	public String getjuego3(){
		return juego3;
	}


	
}