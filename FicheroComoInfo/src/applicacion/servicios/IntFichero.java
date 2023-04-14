package applicacion.servicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import applicacion.entidad.Usuarios;



public interface IntFichero {
	/**
	 * Método abrir un fichero
	 * @param db Arraylista actual
	 * @return Arraylista actualizada 
	 */
	public void AbrirFichero(String fichero);
	/**
	 * Método leer un fichero
	 * @param 
	 * @return 
	 */
	public void LeerFichero(FileReader fr);
	/**
	 * Método cierrar un fichero
	 * @param 
	 * @return 
	 */
	public void CerrarFichero(FileReader fr);
	
}
