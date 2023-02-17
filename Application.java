
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wizard w = new Wizard();
		
		//testing name 
		w.setName("Jaleah");
		System.out.println("Testing name:" + w.getName());
		//testing health
		w.setHealth(48);
		//testing key
		w.setKey(90);
		System.out.println("Testing Key:" +w.getKey());
		
		//testing locked
		System.out.println("Locking the System");
		w.lock(5);
		
		System.out.println("Printing Health:");
		System.out.println(w.getHealth());
		
		System.out.println("Calling TakeDamage");
		w.takeDamage(6);
		
		System.out.println("Printing health:");
		System.out.println(w.getHealth());
		
		System.out.println("System was locked because health will not change");
		
		//testing unlock
		System.out.println("Unlocking the System");
		w.unlock(6);
		
		System.out.println("Printing Health:");
		System.out.println(w.getHealth());
		
		System.out.println("Calling TakeDamage");
		w.takeDamage(7);
		
		System.out.println("Printing health:");
		System.out.println(w.getHealth());
		
		System.out.println("Health went down because system was unlocked");
		
		//testing toString
		System.out.println(w.toString()); 
	}

}
