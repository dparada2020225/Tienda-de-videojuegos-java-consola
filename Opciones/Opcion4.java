// 4.	Ingresar el alquiler de un juego a un miembro del club, colocando cuantos días lo alquilara, cada día de alquiler es de Q8.00 por video juego.
package Opciones;
import java.util.ArrayList;


public class Opcion4 extends Opcion3{
	
	private String quejuego1;
	private int tiempo1;
	private String fecha1;
	
	private String quejuego2;
	private int tiempo2;
	private String fecha2;
	
	private String quejuego3;
	private int tiempo3;
	private String fecha3;
	
	private String quejuego4;
	private int tiempo4;
	private String fecha4;
	

	private int devuelta1;
	private int devuelta2;
	private int devuelta3;
	private int devuelta4;


		
	public Opcion4(){

	}
	public Opcion4(String quejuego1, int tiempo1, String fecha1,
					String quejuego2, int tiempo2, String fecha2,
					String quejuego3, int tiempo3, String fecha3,
					String quejuego4, int tiempo4, String fecha4,
					int devuelta1, int devuelta2, int devuelta3, int devuelta4,
					String nombre, String apellido, int edad,
				  	 String membresia1, String membresia2, String membresia3){

					super(nombre, apellido, edad, membresia1, membresia2, membresia3);
					
					this.quejuego1=quejuego1;
					this.tiempo1=tiempo1;
					this.fecha1=fecha1;
										
					this.quejuego2=quejuego2;
					this.tiempo2=tiempo2;
					this.fecha2=fecha2;
					
					this.quejuego3=quejuego3;
					this.tiempo3=tiempo3;
					this.fecha3=fecha3;
					
					this.quejuego4=quejuego4;
					this.tiempo4=tiempo4;
					this.fecha4=fecha4;

					this.devuelta1=devuelta1;
					this.devuelta2=devuelta2;
					this.devuelta3=devuelta3;
					this.devuelta4=devuelta4;

					}
		

		public String getquejuego1(){
			return quejuego1;
		}
		public void setquejuego1(String quejuego1){
			this.quejuego1=quejuego1;
		}
		public int gettiempo1(){
			return tiempo1;
		}
		public void settiempo1(int tiempo1){
			this.tiempo1=tiempo1;
		}
		public String getfecha1(){
			return fecha1;
		}
		public void setfecha1(String fecha1){
			this.fecha1=fecha1;
		}
		
				public String getquejuego2(){
					return quejuego2;
				}
				public void setquejuego2(String quejuego2){
					this.quejuego2=quejuego2;
				}
				public int gettiempo2(){
					return tiempo2;
				}
				public void settiempo2(int tiempo2){
					this.tiempo2=tiempo2;
				}
				public String getfecha2(){
					return fecha2;
				}
				public void setfecha2(String fecha2){
					this.fecha2=fecha2;
				}
						public String getquejuego3(){
							return quejuego3;
						}
						public void setquejuego3(String quejuego3){
							this.quejuego3=quejuego3;
						}
						public int gettiempo3(){
							return tiempo3;
						}
						public void settiempo3(int tiempo3){
							this.tiempo3=tiempo3;
						}
						public String getfecha3(){
							return fecha3;
						}
						public void setfecha3(String fecha3){
							this.fecha3=fecha3;
						}
								public String getquejuego4(){
									return quejuego4;
								}
								public void setquejuego4(String quejuego4){
									this.quejuego4=quejuego4;
								}
								public int gettiempo4(){
									return tiempo4;
								}
								public void settiempo4(int tiempo4){
									this.tiempo4=tiempo4;
								}
								public String getfecha4(){
									return fecha4;
								}
								public void setfecha4(String fecha4){
									this.fecha4=fecha4;
								}

		public int getq1(){
			return tiempo1*8;
		}
		public int getq2(){
			return tiempo2*8;
		}
		public int getq3(){
			return tiempo3*8;
		}
		public int getq4(){
			return tiempo4*8;
		}

		


							public int getdevuelta1(){
								return devuelta1;
							}
							public int getdevuelta2(){
								return devuelta2;
							}
							public int getdevuelta3(){
								return devuelta3;
							}
							public int getdevuelta4(){
								return devuelta4;
							}

									public void setdevuelta1(int devuelta1){
										this.devuelta1=devuelta1;
									}
									public void setdevuelta2(int devuelta2){
										this.devuelta2=devuelta2;
									}
									public void setdevuelta3(int devuelta3){
										this.devuelta3=devuelta3;
									}
									public void setdevuelta4(int devuelta4){
										this.devuelta4=devuelta4;
									}
		
		
		public String juegoalquilado11(){
			return  "Juego: "+quejuego1 +", Dias: "+ tiempo1 +" dias, Fecha: "+ fecha1 ;
		}
		public String juegoalquilado22(){
			return  "Juego: "+quejuego2 +", Dias: "+ tiempo2 +" dias, Fecha: "+ fecha2;
		}
		public String juegoalquilado33(){
			return  "Juego: "+quejuego3 +", Dias: "+ tiempo3 +" dias, Fecha: "+ fecha3;
		}
		public String juegoalquilado44(){
			return  "Juego: "+quejuego4 +", Dias: "+ tiempo4 +" dias, Fecha: "+ fecha4;
		}

					public String juegoalquilado1111(){
						return  "Juego: DEVUELTO, Dias de uso: "+ devuelta1 +" dias, devolucion de: "+ (tiempo1*8-devuelta1*8) ;
					}
					public String juegoalquilado2222(){
						return  "Juego: DEVUELTO, Dias de uso: "+ devuelta2 +" dias, devolucion de: "+ (tiempo2*8-devuelta2*8);
					}
					public String juegoalquilado3333(){
						return  "Juego: DEVUELTO, Dias de uso: "+ devuelta3 +" dias, devolucion de: "+ (tiempo3*8-devuelta3*8);
					}
					public String juegoalquilado4444(){
						return  "Juego: DEVUELTO, Dias de uso: "+ devuelta4 +" dias, devolucion de: "+ (tiempo4*8-devuelta4*8);
					}




}