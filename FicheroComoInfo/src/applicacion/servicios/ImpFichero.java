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
			String [] divi=null;
			Usuarios nue =new Usuarios();
		try {
			BufferedReader br =  new BufferedReader(fr);

	         String linea;
	         while((linea=br.readLine())!=null){
	        	 divi=linea.split(";");
	        	 nue.setNombre(divi[0]);
	        	 nue.setApellidos(divi[1]);
	        	 nue.setEdad(Integer.parseInt(divi[3]));
	        	 bd.add(nue);
	        	 
	         }
	            
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         
	         try{                    
	        	 CerrarFichero(fr);
	                             
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
		
	}
	

	@Override
	public void CerrarFichero(FileReader fr) 
	{
		
		
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
