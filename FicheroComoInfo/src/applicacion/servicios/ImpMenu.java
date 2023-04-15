package applicacion.servicios;

public class ImpMenu implements intMenu {
	@Override
	public void Menu() {
		System.out.print("1. Leer el fichero que tu digas(indicando la ruta)");
		System.out.print("2. Leer fichero por defecto");
		System.out.print("3. Mostrar el contenido del fichero");
		System.out.print("4. Salir");
	}
}
