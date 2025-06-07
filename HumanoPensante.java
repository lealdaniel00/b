public class HumanoPensante extends SerVivo implements Trabajar{
	private char sexo;
	private int energia;
	HumanoPensante(int edad, String nombre, char sexo, int energia){
		super(edad,nombre,"Animal","Homo Sapiens Sapiens");
		this.sexo=sexo;
		this.energia=energia;
	}
	public void entrarATrabajar(){
		System.out.println(getNombre()+" Esta triste por entrar a trabajar");
	}
	public void cobrarSalario(){
		System.out.println(getNombre()+" Esta feliz por cobrar su salario");
	}
	public void vacaciones(){
		System.out.println(getNombre()+" ¡Estas si son vacaciones!");
	}
	public void comunicar(){
		System.out.println("La persona esta hablando. Saluda");
	}
	public void perderEnergia(){
		energia=energia-1;
	}
	public void envejecer(){
		cumplirAnios();
	}
	public void comer(){
		energia=energia+10;
		System.out.println("Estoy en el metodo comer normal");
	}
	public void comer(int cantidadNueva){
		energia=energia+cantidadNueva;
		System.out.println("Estoy en el metodo comer sobrecargado");
	} 
	public void comer(boolean comidaChatarra){
		if(comidaChatarra==false){
			energia=energia+20;
		}else{
			energia=energia+5;
		}
		System.out.println("Estoy en el método booleano");
	}
}