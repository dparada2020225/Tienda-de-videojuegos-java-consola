//clase principal
import java.util.Scanner;

import Opciones.*;

public class clasePrincipalProyecto {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		boolean salir = false;
		

		Opcion1 opcion1 = new Opcion1();
		Opcion2 opcion2 = new Opcion2();
		Opcion3 opcion3 = new Opcion3();
		Opcion4 opcion4 = new Opcion4();
		
		

		
		System.out.println("");
		System.out.println("");
		System.out.println("**********BIENVENIDO GRAN INAUGURACION**********   ");
		System.out.println("**********videojuegos los clasicos**************");
		System.out.println("**********QUE DESEA HACER***********************");
		do{
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("1.Ingreso de clientes para obtener membresia del club.");
			System.out.println("2.Crear O eliminar un video juego");
			System.out.println("3. ver historial de membresias y/o Eliminar una membresia.");
			System.out.println("4.Ingresar el alquiler de un juego,cuantos dias lo alquilara");
			System.out.println("5.ver el historia de que miembro tiene cada juego y Ingresar la devolucion de un video juego alquilado ");
			System.out.println("6.Mostrar los video juegos que se pueden alquilar.");
			System.out.println("7.Mostrar  de los juegos alquilados ");
			System.out.println("8. SALIR");
			System.out.println("");
			System.out.println("");
			int opcion = datos.nextInt();

		switch(opcion){
			
		case 1:
					System.out.println("ingrese un nombre: ");
					String nombre = datos.next();
					System.out.println("ingrese un apellido: ");
					String apellido = datos.next();
					System.out.println("ingrese su edad: ");
					int edad = datos.nextInt();
					opcion1.setnombre(nombre);
					opcion1.setapellido(apellido);
					opcion1.setedad(edad);

					
					System.out.println(opcion1.toString());
					break;
		case 2: 
					System.out.println("Elige una opcion acorde a lo que desea hacer");
					System.out.println("1 ver un historial de juegos");
					System.out.println("2 anadir un juego");
					System.out.println("3 eliminar un juego del historial");
					int opcioncaso2 = datos.nextInt();
									switch(opcioncaso2){
										case 1:

										System.out.println("los juegos son: " +opcion2.getjuegos());
										break;
										case 2:
										System.out.println("ingrese el juego ");
										String juegoagregado=datos.next();
										opcion2.setjuegoagregado1(juegoagregado);
										System.out.println("juego agregado");
										System.out.println("");
										System.out.println("el historia de los juegos son: " +opcion2.getjuegos());
										break;
										case 3:
										System.out.println("que numero de juego desea eliminar: ");
										System.out.println(opcion2.getjuegos());
										
										int juegoeliminado = datos.nextInt();
										if(juegoeliminado==1){
											System.out.println("se elimino el juego #1");
											System.out.println("juego eliminado");
											System.out.println(opcion2.getjuego2());
											System.out.println(opcion2.getjuego3());
											System.out.println("4. "+opcion2.getjuegoagregado1());
										}
										else if (juegoeliminado==2) {
											System.out.println("se elimino el juego #2");
											System.out.println(opcion2.getjuego1());
											System.out.println("juego eliminado");
											System.out.println(opcion2.getjuego3());
											System.out.println("4. "+opcion2.getjuegoagregado1());
										}
										else if (juegoeliminado==3) {
											System.out.println("se elimino el juego #3");
											System.out.println(opcion2.getjuego1());
											System.out.println(opcion2.getjuego2());
											System.out.println("juego eliminado");
											System.out.println("4. "+opcion2.getjuegoagregado1());
										}
										else if (juegoeliminado==4){
											System.out.println("se elimino el juego #4");
											System.out.println(opcion2.getjuego1());
											System.out.println(opcion2.getjuego2());
											System.out.println(opcion2.getjuego3());
											System.out.println("juego eliminado");
										} 
										else {
											System.out.println("juego no existente en la base de datos");
										}
										break;
										default:
										System.out.println("esta opcion no esta habilitada");
										}
										break;


					
		case 3: 

				System.out.println("que desea hacer");
				System.out.println("1. ver historial de membresias");
				System.out.println("2 eliminar una membresia");
				int caso3= datos.nextInt();



				switch(caso3){
					case 1: 
					System.out.println("*****HISTORIAL DE MEMBRESIAS*****");
					System.out.println("1. " + opcion3.getmembresia1());
					System.out.println("2. " + opcion3.getmembresia2());
					System.out.println("3. " + opcion3.getmembresia3());
					System.out.println("4. " + opcion1.padre());
				
					break;

				case 2:
				System.out.println("que membresia decea eliminar");
				System.out.println("1. " + opcion3.getmembresia1());
				System.out.println("2. " + opcion3.getmembresia2());
				System.out.println("3. " + opcion3.getmembresia3());
				System.out.println("4. " + opcion1.padre());
				System.out.println("");
				System.out.println("");

				int membresiaeliminada=datos.nextInt();
				if(membresiaeliminada==1){
					System.out.println("");
					System.out.println("membresia eliminada");
					System.out.println("2. " + opcion3.getmembresia2());
					System.out.println("3. " + opcion3.getmembresia3());
					System.out.println("4. " + opcion1.padre());	
					
				}
				else if(membresiaeliminada==2){
					System.out.println("1. " + opcion3.getmembresia1());
					System.out.println("membresia eliminada" );
					System.out.println("3. " + opcion3.getmembresia3());
					System.out.println("4. " + opcion1.padre());	
					
				}
				else if(membresiaeliminada==3){
					System.out.println("1. " + opcion3.getmembresia1());
					System.out.println("2. " + opcion3.getmembresia2());
					System.out.println("membresia eliminada");
					System.out.println("4. " + opcion1.padre());	
				
				}
				else if(membresiaeliminada==4){
					System.out.println("1. " + opcion3.getmembresia1());
					System.out.println("2. " + opcion3.getmembresia2());                                         
					System.out.println("3. " + opcion3.getmembresia3());
					System.out.println("membresia eliminada");	
				
				}
				else {
					System.out.println("ya no hay mas membresias que se puedad eliminar");
				}
				break;

				default:
					System.out.println("**********ERROR**********");


				 } break;
					
		case 4:
					System.out.println("como se llama el miembro del club");
					System.out.println("");
					System.out.println("1. " + opcion3.getmembresia1());
					System.out.println("2. " + opcion3.getmembresia2());
					System.out.println("3. " + opcion3.getmembresia3());
					System.out.println("4. " + opcion1.padre());
					int miembroopcion4=datos.nextInt();
					switch(miembroopcion4){
						
						
						case 1:
							System.out.println("que juego decea: ");
							System.out.println("***NOTA: escribir el nombre no el nombre***");
							System.out.println(opcion2.getjuegos());
							String juegoquedesea1 = datos.next();
							opcion4.setquejuego1(juegoquedesea1);
														
							System.out.println("cuantos dias: ");
							int cuantosdias1= datos.nextInt();
							opcion4.settiempo1(cuantosdias1);
							
							System.out.println("intrudusca la fecha de hoy: ");
							System.out.println("EJ: 00/mes/0000");
							String fecha1 = datos.next();
							opcion4.setfecha1(fecha1);

							System.out.println("");
							System.out.println("");

							System.out.println(" El miembro " +opcion3.getmembresia1()+ " alquilo el juego,  "+opcion4.getquejuego1()+" el dia: "+ 
								opcion4.getfecha1() + ", por "+ opcion4.gettiempo1()+" dias, debe cancelar la cantidad de " + opcion4.getq1()+" Quetzales");
							
							break;
						
						

						case 2:
							System.out.println("que juego decea: ");
							System.out.println("***NOTA: escribir el nombre no el nombre***");
							System.out.println(opcion2.getjuegos());
							String juegoquedesea2 = datos.next();
							opcion4.setquejuego2(juegoquedesea2);
							
							System.out.println("cuantos dias: ");
							int cuantosdias2= datos.nextInt();
							opcion4.settiempo2(cuantosdias2);
							
							System.out.println("intrudusca la fecha de hoy: ");
							System.out.println("EJ: 00/mes/0000");
							String fecha2 = datos.next();
							opcion4.setfecha2(fecha2);

							System.out.println("");
							System.out.println("");

							System.out.println(" El miembro " +opcion3.getmembresia2()+ " alquilo el juego ,"+ opcion4.getquejuego2() + ", el dia: "+
								opcion4.getfecha2() + ", por "+ opcion4.gettiempo2()+" dias, debe cancelar la cantidad de " + opcion4.getq2()+" Quetzales");
							break;
						
						

											

						case 3:
							System.out.println("que juego decea: ");
							System.out.println("***NOTA: escribir el nombre no el nombre***");
							System.out.println(opcion2.getjuegos());
							String juegoquedesea3 = datos.next();
							opcion4.setquejuego3(juegoquedesea3);
								
							System.out.println("cuantos dias: ");
							int cuantosdias3= datos.nextInt();
							opcion4.settiempo3(cuantosdias3);
							
							System.out.println("intrudusca la fecha de hoy: ");
							System.out.println("EJ: 00/mes/0000");
							String fecha3 = datos.next();
							opcion4.setfecha3(fecha3);

							System.out.println("");
							System.out.println("");

							System.out.println(" El miembro " +opcion3.getmembresia3()+ " alquilo el juego  "+opcion4.getquejuego3() + ", el dia: "+
								opcion4.getfecha3() + ", por "+ opcion4.gettiempo3()+" dias, debe cancelar la cantidad de " + opcion4.getq3()+" Quetzales");
							break;
						
						

						case 4:
							System.out.println("que juego decea: ");
							System.out.println("***NOTA: escribir el nombre no el nombre***");
							System.out.println(opcion2.getjuegos());
							String juegoquedesea4 = datos.next();
							opcion4.setquejuego4(juegoquedesea4);
							
							System.out.println("cuantos dias: ");
							int cuantosdias4= datos.nextInt();
							opcion4.settiempo4(cuantosdias4);
							
							System.out.println("intrudusca la fecha de hoy: ");
							System.out.println("EJ: 00/mes/0000");
							String fecha4 = datos.next();
							opcion4.setfecha4(fecha4);

							System.out.println("");
							System.out.println("");

							System.out.println(" El miembro " +opcion1.padre()+ " alquilo el juego " +opcion4.getquejuego4()+", el dia: "+
								opcion4.getfecha4() + ", por "+ opcion4.gettiempo4()+" dias, debe cancelar la cantidad de " + opcion4.getq4()+" Quetzales");
							break;
						
						

						default:
						System.out.println("ya no hay membresias");
							break;
					}	
					
					break;
		case 5:
					System.out.println("que nesesita ");
					System.out.println("1 ver historial de juegos alquilados");
					System.out.println("2 devolucion de un juego.");
					int caso5 = datos.nextInt();
					if(caso5==1){
							System.out.println("");
							System.out.println(opcion3.getmembresia1());
							System.out.println(opcion4.juegoalquilado11());
							System.out.println("");
							System.out.println("");
							System.out.println(opcion3.getmembresia2());
							System.out.println(opcion4.juegoalquilado22());
							System.out.println("");
							System.out.println("");
							System.out.println(opcion3.getmembresia3());
							System.out.println(opcion4.juegoalquilado33());
							System.out.println("");
							System.out.println("");
							System.out.println(opcion1.padre());
							System.out.println(opcion4.juegoalquilado44());
							System.out.println("");
							System.out.println("");
					} 
					  else if(caso5==2){
							System.out.println("a quien pocee el juego a devolver: ");
							System.out.println("");
							System.out.println("");
							System.out.println("");
							System.out.println("1. "+opcion3.getmembresia1());
							System.out.println(opcion4.juegoalquilado11());
							System.out.println("");
							System.out.println("");
							System.out.println("2. "+opcion3.getmembresia2());
							System.out.println(opcion4.juegoalquilado22());
							System.out.println("");
							System.out.println("");
							System.out.println("3. "+opcion3.getmembresia3());
							System.out.println(opcion4.juegoalquilado33());
							System.out.println("");
							System.out.println("");
							System.out.println("4. "+opcion1.padre());
							System.out.println(opcion4.juegoalquilado44());
							System.out.println("");
							System.out.println("");
							int devolucion = datos.nextInt();
							switch(devolucion){
								case 1:
								System.out.println(opcion3.getmembresia1());
								System.out.println(opcion4.juegoalquilado11());
								System.out.println("");
								System.out.println("");
								System.out.println("cuantos dias lo uso");
								int diasuso1= datos.nextInt();
								opcion4.setdevuelta1(diasuso1);
								System.out.println(opcion4.juegoalquilado1111());

								break;

								case 2:
								System.out.println(opcion3.getmembresia2());
								System.out.println(opcion4.juegoalquilado22());
								System.out.println("");
								System.out.println("");
								System.out.println("cuantos dias lo uso");
								int diasuso2= datos.nextInt();
								opcion4.setdevuelta2(diasuso2);
								System.out.println(opcion4.juegoalquilado2222());
								break;

								case 3:
								System.out.println(opcion3.getmembresia3());
								System.out.println(opcion4.juegoalquilado33());
								System.out.println("");
								System.out.println("");
								System.out.println("cuantos dias lo uso");
								int diasuso3= datos.nextInt();
								opcion4.setdevuelta3(diasuso3);
								System.out.println(opcion4.juegoalquilado3333());
								break;

								case 4:
								
								System.out.println(opcion1.padre());
								System.out.println(opcion4.juegoalquilado44());
								System.out.println("");
								System.out.println("");
								System.out.println("cuantos dias lo uso");
								int diasuso4= datos.nextInt();
								opcion4.setdevuelta4(diasuso4);
								System.out.println(opcion4.juegoalquilado4444());
								break;
									
								default:
									System.out.println("**********  solo hay 4  **********");
							}
					}
					
					
					break;
		case 6:
					System.out.println("***** LOS JUEGOS SON ILIMITADOS YA QUE SON RETANDOS A TRAVEZ DE LA WEB");
					System.out.println(opcion2.getjuegos());
					
					break;
		case 7:

					System.out.println("El historia es: ");
					System.out.println(opcion3.getmembresia1());
					System.out.println(opcion4.juegoalquilado11());
					System.out.println("");


					System.out.println(opcion3.getmembresia2());
					System.out.println(opcion4.juegoalquilado22());
					System.out.println("");
					
					
					System.out.println(opcion3.getmembresia3());
					System.out.println(opcion4.juegoalquilado33());
					System.out.println("");
					

					System.out.println(opcion1.padre());
					System.out.println(opcion4.juegoalquilado44());
					System.out.println("");

					
					
					break;

		case 8:
					System.out.println("ha salido del programa");
					salir=true;
					break;
		default:

					System.out.println("esta opcion esta en proceso preguntar a el tecnico informatico encargado.");


		} 
	 }while(!salir);
	}
}