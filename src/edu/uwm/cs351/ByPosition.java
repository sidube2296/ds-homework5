package edu.uwm.cs351;

import java.util.Comparator;

/**
 * Sort by position, according to the order in the enumeration:
 * earlier is higher priority.
 * Players that can play any position are ranked highest priority (first).
 */
public class ByPosition implements Comparator<Player> {

	@Override // required
	public int compare(Player o1, Player o2) {
		// TODO:  Hint the "ordinal" method is useful here.
		// but remember that earlier is higher priority
		if (o1.getPosition() == null && o2.getPosition() == null) {
            return 0;  // Both are null, so they are considered equal in priority
        }
		
		 if (o2.getPosition() == null) {
	         return -1;   // o2 is nulL meaning it has higher priority

	        }
		 
		 if (o1.getPosition() == null) {
            return 1;  // o1 is null meaning it has higher priority
        }
       
        return Integer.compare(o2.getPosition().ordinal(), o1.getPosition().ordinal());
	
	}

	@Override //implementation
	public String toString() {
		return "ByPosition";
	}
	
	private static Comparator<Player> instance = new ByPosition();
	
	/**
	 * Gets a single instance of this comparator.
	 * @return a single instance of this comparator
	 */
	public static Comparator<Player> getInstance() { return instance; }

}
