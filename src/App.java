

public class App {
public static void main(String[] args) {
	
	Juego juego = new Juego();
	juego.setNombre("mario bro");

	
	CareTaker caretaker = new CareTaker();
	Originator originator = new Originator();
	
	juego = new Juego();
	juego.setNombre("tetris");
	
	originator.setEstado(juego);
	
	juego = new Juego();
	juego.setNombre("DonkeyKong");
	
	originator.setEstado(juego);
	
	caretaker.addMemento(originator.guardar()); // estado  pos 0
	
	juego = new Juego();
	juego.setNombre("GearOfWars");
	
	originator.setEstado(juego);
	
	caretaker.addMemento(originator.guardar()); // estado  pos 1
	
	juego = new Juego();
	juego.setNombre("Ping Pong");
	
	originator.setEstado(juego);
	
	originator.restaurar(caretaker.getMemento(0));
	juego =originator.getEstado();
	System.out.println(juego);
	
	
	
	
}
}
