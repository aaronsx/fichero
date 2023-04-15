package applicacion.servicios;

public class ImpUtilMenu implements intUtilMenu {
	@Override
	public void Menu() {
		System.out.println("1. Leer el fichero que tu digas(indicando la ruta)");
		System.out.println("2. Leer fichero por defecto");
		System.out.println("3. Salir");
	}

	@Override
	public void MenuRepetir() {
		// TODO Auto-generated method stub
		System.out.println("1. Leer otro fichero");
		System.out.println("2. Mostrar");
	}
}
