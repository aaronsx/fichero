package applicacion.servicios;


import java.io.File;
import java.io.FileReader;
import java.util.List;

import applicacion.entidad.Usuarios;



public interface IntFichero {
	/**
	 * Método abrir un fichero
	 * @param db Arraylista actual
	 * @return Arraylista actualizada 
	 */
	public void AbrirFichero( File archivo,List<Usuarios>bd);
	/**
	 * Método leer un fichero
	 * @param 
	 * @return 
	 */
	public void LeerFichero(FileReader fr,List<Usuarios>bd);
	/**
	 * Método cierrar un fichero
	 * @param 
	 * @return 
	 */
	public void CerrarFichero(FileReader fr);
	
}
