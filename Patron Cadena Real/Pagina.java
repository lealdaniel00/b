public class Pagina implements Manejador{
	private Manejador siguienteNivel;
	public void setManejador(Manejador siguiente){
		this.siguienteNivel=siguiente;
	}
	public void solPrestamo(int valor){
		if(valor>=0 && valor<= 5000000){
			System.out.println("El prestamo lo gestiona la página web de la entidad");
		}else{
			siguienteNivel.solPrestamo(valor);
		}
	}
	public Manejador getManejador(){
		return siguienteNivel;
	}
}