import java.io.*;
// 3 errores personalizados.
// 3 errores predefinidos de java.

// Paciente -> Historia clinica.
// Medico -> Abre o complenta historia clinica
// Administrativo -> DA medicina

// IA, paciente -> Historia clinica, recomendaciones.
// Dos repositorios, una para el back, otro front.
// Tinen que manejar diferentes ramas.
// Tienen que establecer el proyecto tipo scrum, 
// Flujo de aprobación.
// Patrones de desarrollo de software.

// Backend Springboot.
// Postman.

public class HolaMundo {
	public static void main(String args[]) {
		try {
			entradaABar(18);
		} catch (MiErrorPersonalizado e) {
			System.out.println("Se rompio: " + e.getMessage());
		}
	}

	public static void entradaABar(int edad) throws MiErrorPersonalizado {
		if (edad < 18) {
			throw new MiErrorPersonalizado("Usted es un pollito");
		} else {
			System.out.println("Bienvenido al Bar Feroz");
		}
	}
}