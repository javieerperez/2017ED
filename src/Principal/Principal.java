package Principal;

public class Principal {

	public static void main(String[] args) {
		Persona pepe = new Persona ();
		pepe.setPeso(45);
		pepe.setNombre("Pepe");
		pepe.setEdad((byte)1);
		for (int centinela = 1; centinela < 129; centinela++){
			pepe.setEdad((byte) (pepe.getEdad()+1));
		}
		
	}

}
