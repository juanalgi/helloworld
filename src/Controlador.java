import modelo.*;

public class Controlador {
	
	public static void main(String[] argv) {
	
		modelo.InfectedHumanCreator zombieCreator = new modelo.InfectedHumanCreator();
		
		modelo.InfectedHuman zombie = zombieCreator.createHuman();
	
		zombie.scratch();
		
		System.out.println(zombie.getHealth());
	}
}
