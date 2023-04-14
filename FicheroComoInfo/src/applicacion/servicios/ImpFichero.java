package applicacion.servicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ImpFichero implements IntFichero 
{

	@Override
	public void AbrirFichero(String file) 
	{
		
       
        File archivo = null;
	      FileReader fr = null;
	      
	      archivo = new File (file);
	     
	     
		//LEER FICHERO
	      LeerFichero(fr);
	 
		
	}
	
	@Override
	public void LeerFichero(FileReader fr) {

		try {
			BufferedReader br =  new BufferedReader(fr);

	         String linea;
	         while((linea=br.readLine())!=null)
	            System.out.println(linea);
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
			}
		
	}



	

	

}
