package applicacion.controladores;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import applicacion.servicios.ImpFichero;
import applicacion.servicios.ImpMenu;
import applicacion.servicios.IntFichero;
import applicacion.servicios.intMenu;
import applicacion.entidad.Usuarios;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String menu="";
		
		intMenu ium = new ImpMenu();
		IntFichero iap = new ImpFichero();

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
			
			 if(opcion==1)
				 menu=entradaOpcion.next(); 
			 else if(opcion==2)
				 menu="C:\\Users\\csi22-amunada\\eclipse-workspace\\ED\\Fichero\\bin\\fichero.txt";
			 
			 File archivo = new File (menu);
			 iap.AbrirFichero(archivo,bd);
		    if(opcion==3)
			for(Usuarios cadaUsuario:bd)
				 cadaUsuario.toString();
				
					
					
					
					cerrarMenu = true;


				

				
			}
		}
	}


