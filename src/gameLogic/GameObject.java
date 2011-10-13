package gameLogic;

/**
 * This class represents an object that exists on the game board. Each GameObject
 * has a GameObjectType describing which kind of object it is (e.g. Fruit, Wall etc).
 * 
 * @see 	GameObjectType
 */

public class GameObject
{	
	GameObjectType type;
	
	GameObject(GameObjectType type)
	{
		this.type = type;
	}
	
	/**
	 * Gets the GameObjectType of this object.
	 * 
	 * @return	This object's GameObjectType.
	 */
	public GameObjectType getType()
	{
		return type;
	}
}