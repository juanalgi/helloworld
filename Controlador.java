
public class Controlador {
	
	public static void main(String[] argv) {
	
		InfectedHumanCreator zombieCreator = new InfectedHumanCreator();
		
		InfectedHuman zombie = zombieCreator.createHuman();
	
		zombie.scratch();
		
		System.out.println(zombie.getHealth());
	}
}
