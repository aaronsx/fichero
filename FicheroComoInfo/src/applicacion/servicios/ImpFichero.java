package applicacion.servicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.IOException;

import java.util.List;

import applicacion.entidad.Usuarios;

public class ImpFichero implements IntFichero 
{

	@Override
	public void AbrirFichero(File archivo,List<Usuarios>bd) 
	{
		//Creamos el fr para luego en el try controlar si se abre bien o no
		FileReader fr=null;
		try {
			fr = new FileReader (archivo);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//LEER FICHERO
	      LeerFichero(fr,bd);
	 
		
	}
	
	@Override
	public void LeerFichero(FileReader fr,List<Usuarios>bd) {
			
			//declaramos dentro del try el buffer ya que se utiliza para recorrer las lineas no hace falta sacarlo fuera
		try {
			BufferedReader br =  new BufferedReader(fr);

	         String linea;
	         while((linea=br.readLine())!=null){
	        	 guardar(linea,bd);
	        	 
	         }
	            
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         //Como si o si pasa por aqui con el finally pues llamo al metodo cerrar
	         try{                    
	        	 CerrarFichero(fr);
	                             
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
		
	}
	//Este metodo lo he puesto privado ya que quiero que solo esta clase pueda tener acceso 
	//Este metodo recibe un string de la linea y la lista para guardarlo 
	private void guardar(String linea,List<Usuarios>bd )
	{
		//dentro le haces un split para guadarlo en un vector separando por ;
		String [] divi=null;
		Usuarios nue =new Usuarios();
		
		divi=linea.split(";");
   	 	nue.setNombre(divi[0]);
   	 	nue.setApellidos(divi[1]);
   	 	nue.setEdad(Integer.parseInt(divi[2]));
   	 	bd.add(nue);
	}

	@Override
	public void CerrarFichero(FileReader fr) 
	{
		
		//en metodo cerrar con el try controlo si se cierra o no y con el if veo si fr se ha podido abrir
			try {
				if (null != fr)
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}



	

	

}
