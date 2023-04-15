package applicacion.servicios;


import java.io.File;
import java.io.FileReader;
import java.util.List;

import applicacion.entidad.Usuarios;



public interface IntFichero {
	/**
	 * Método abrir un fichero
	 * @param db Arraylista actual,file para abrir el fichero
	 * @return nada 
	 */
	public void AbrirFichero( File archivo,List<Usuarios>bd);
	/**
	 * Método leer un fichero
	 * @param db Arraylista actual,fileReader para leer el fichero
	 * @return nada
	 */
	public void LeerFichero(FileReader fr,List<Usuarios>bd);
	/**
	 * Método cierrar un fichero
	 * @param file para cerrar el fichero
	 * @return 
	 */
	public void CerrarFichero(FileReader fr);
	
}
