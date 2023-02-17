
/**
 * This class represents a wizard for
 * a D&D type game.
 * @author rkelley
 * @version 1.0
 * Lab 2
 * CS131ON
 *
 */
public class Wizard implements Lockable{
	
	private String name;
	private int health;
	private int key;
	boolean locked;
	
	/**
	 * End constructor to put object into consistent state
	 */
	public Wizard() {
	
	}//end constructor
	
	/**
	 * This method sets key 
	 * to the passed in key
	 * if the key is greater then 0 
	 * then key is equaled to key
	 * (e.g. weapons, lightening, etc.)
	 * @param key
	 */
	public void setKey(int key) {
		if(key>0 && this.key==0) {
			this.key=key;
		}
	}
	/**
	 * This method sets the key 
	 * if the key is the right 
	 * key it locks
	 * (e.g. weapons, lightening, etc.)
	 * @param key
	 */
	public void lock(int key) {
		if(this.key==key) {
			locked=true;
		}
	}
	/**
	 * This method sets the key 
	 * if the key is not the right 
	 * key it unlocks
	 * (e.g. weapons, lightening, etc.)
	 * @param key
	 */
	public void unlock(int key) {
		if(this.key==key) {
			locked=false;
		}
	}
	/**
	 * @return whether it is locked or not
	 */
	public boolean isLocked() {
		return locked;
		
	}
	/**
	 * Constructor to create object with common
	 * usage. This is the preferred constructor.
	 * @param name
	 */
	public Wizard(String name) {
		this.name = name;
	}//end constructor
	
	/**
	 * This method processes the 
	 * damage to the object when 
	 * it is hit by other objects
	 * (e.g. weapons, lightening, etc.)
	 * @param power
	 */
	public void takeDamage(int power) {
		if(!isLocked()) {
			health = health - power;
			
		}
	}//end takeDamage
	
	/**
	 * Getter for name
	 * @return
	 */
	public String getName() {
		return name;
	
	}//end getName
	
	/**
	 * Setter for name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}//end setName
	
	/**
	 * Getter for health
	 * @return
	 */
	public int getHealth() {
		return health;
	}//end getHealth
	
	/**
	 * Setter for health
	 * @param health
	 */
	public void setHealth(int health) {
		this.health = health;
	}//end setHealth
	
	/**
	 * Getter for the key
	 * @return
	 */
	public int getKey() {
		return key;
	}//end getKey
	/**
	 * Setter for key
	 * @param key
	 */
	public void setKey() {
		this.key = 0;
	}//end setKey
	/**
	 * Getter for the locked
	 * @return
	 */
	public boolean getLocked() {
		return locked;
	}//end getLocked
	/**
	 * Setter for locked
	 * @param key
	 */
	public void setLocked() {
		this.locked = false;
	}
	@Override
	public String toString() {
		return "Wizard [name=" + name + ", health=" + health + ", key=" + key + ", locked=" + locked + "]";
	}//end toString
	
}//end class
