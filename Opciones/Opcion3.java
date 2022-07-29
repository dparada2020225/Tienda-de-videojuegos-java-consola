//3.	Eliminar una membresía.
package Opciones;


public class Opcion3 extends Opcion1{

	private String membresia1= "Juan Perez";
	private String membresia2= "Pablo Escobar";
	private String membresia3= "El CHapo Gusman";

	public Opcion3(){

	}
	public Opcion3(String nombre, String apellido, int edad,
				   String membresia1, String membresia2, String membresia3){
			super(nombre, apellido, edad);
			this.membresia1=membresia1;
			this.membresia2=membresia2;
			this.membresia3=membresia3;
	}

	public String getmembresia1(){
		return membresia1;
	}
	public void setmembresia1(String membresia1 ){
		this.membresia1=membresia1;
	}
	public String getmembresia2(){
		return membresia2;
	}
	public void setmembresia2(String membresia2 ){
		this.membresia2=membresia2;
	}
	public String getmembresia3(){
		return membresia3;
	}
	public void setmembresia3(String membresia3 ){
		this.membresia3=membresia3;
	}
	public String hija(){
		return super.padre();
	}
	



		
}