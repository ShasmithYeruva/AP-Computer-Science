
public class S04Battleship {
	private String name;  // type of ship
	private int power;   // power of attack in range [1 - 10]
	private int health; // health of the ship

	// Constructor
	public S04Battleship(String shipType, int attackPower)
	{
		name = shipType;
		power = attackPower;
		health = 100;
	}

	// Modifies the health of the battleship
	public void updateDamage(int attackPower)
	{
		if (attackPower < 5) {
			health -= 2;
			System.out.println("The ship inflicts 2 damage");
		}
		else if (attackPower > 5 && attackPower <= 10) {
			health -= 7;
			System.out.println("The ship inflicts 7 damage");
		}
		else {
			health -= 10;
			System.out.println("The ship inflicts 10 damage");
		}
	}
	public boolean stillFloating()
	{
		// Modify the return statement
		if (health > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	// Returns the power of the ship
	public int getPower()
	{
		return power;
	}

	// Returns string representation in the form
	// Battleship name
	public String toString()
	{
		return name + "(" + health + ")";    
	}


}
