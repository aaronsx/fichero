package applicacion.controladores;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import applicacion.servicios.ImpFichero;
import applicacion.servicios.ImpUtilMenu;
import applicacion.servicios.IntFichero;
import applicacion.servicios.intUtilMenu;
import applicacion.entidad.Usuarios;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String menu="";
		
		intUtilMenu ium = new ImpUtilMenu();
		IntFichero imf = new ImpFichero();

		Scanner entradaOpcion = new Scanner(System.in);		
		Boolean cerrarMenu = false;
		List<Usuarios> bd=new ArrayList<Usuarios>();
		int opcion;	

			while(!cerrarMenu) {	
				//Mostramos el menú
				ium.Menu();
				System.out.println("Introduza la opción deseada: ");
				opcion = entradaOpcion.nextInt();
				System.out.println("[INFO] - Has seleccionado la opcion " + opcion);
				switch (opcion) {			
					case 1: //Pide una ruta para leer un fichero
						 menu=entradaOpcion.next();				
						break;
					case 2: //Ruta por defecto(Cambia la  ruta a la que desees)
						 menu="C:\\Users\\aaron\\Documents\\fichero.txt";		
						break;
					case 3: //Cerrar menu
						cerrarMenu = true;
						break;
					
					default:

				}
				//If saber si lee el fichero o no
				if(opcion==1||opcion==2)
				{
					boolean error;
					do {
						error=false;
						//Menu para saber si el usuario quiere leer otro fichero o mostrar
						ium.MenuRepetir();
						System.out.println("Introduza la opción deseada: ");
						int repetir=entradaOpcion.nextInt();
						File archivo = new File (menu);
						imf.AbrirFichero(archivo, bd);
						 //Controla si le das al 1 o al dos 
						if(repetir==2)
						{
							System.out.println("------------------------Los usuarios son----------------");
							for(Usuarios cadaUsuario:bd)
							System.out.println(cadaUsuario.toString());
							System.out.println("-------------------------------------------------------");
						}
						else if(repetir!=2&&repetir!=1)
						{
							System.out.println("Error introduce 1 o 2");
							error=true;
						}
							
					}while(error);
					
					
					 
				}
				
			}	
					
					
					
					


				

				
			}
		}


