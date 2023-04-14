package applicacion.entidad;

public class Usuarios {
	//----------------Atributos-----------------

			private String nombre="aaaaaaa";
			private String apellidos="aaaaaaa";
			private int edad = 0;
			
	//----------------Getters and Setters-----------------
			public String getNombre() {
				return nombre;
			}
			public void setNombre(String nombre) {
				this.nombre = nombre;
			}
			public String getApellidos() {
				return apellidos;
			}
			public void setApellidos(String apellidos) {
				this.apellidos = apellidos;
			}
			public int getEdad() {
				return edad;
			}
			public void setEdad(int edad) {
				this.edad = edad;
			}
			
			
			@Override
			public String toString() {
				return "Usuarios [Nombre=" + nombre + ", Apellidos=" + apellidos + ", Edad=" + edad + "]";
			}		
			
			
		
			
}
