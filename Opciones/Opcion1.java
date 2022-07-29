//1.Ingreso de clientes para obtener membresía del club.
package Opciones;

public class Opcion1{
	private String nombre;
	private String apellido;
	private int edad;

	public Opcion1(){
	}
		public Opcion1(String nombre, String apellido, int edad){
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
	}
	public String getnombre(){
		return nombre;
	}
	public void setnombre(String nombre){
		this.nombre=nombre;
	}
	public String getapellido(){
		return apellido;
	}
	public void setapellido(String apellido){
		this.apellido=apellido;
	}
	public int getedad(){
		return edad;
	}
	public void setedad(int edad){
		this.edad=edad;
	}
	public String toString(){
		return "mucho gusto "+nombre+" "+apellido+" ya eres mienbro del club " ;
	}
	public String padre(){
		return nombre+" "+apellido ;
	}	
}
