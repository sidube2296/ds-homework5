package edu.uwm.cs351;

import java.util.Comparator;

/**
 * The Class Player.
 */
public class Player {

	/** The name of this player. */
	final private String name;

	/** How many points this player has scored*/
	private int score;

	/** This player's position*/
	private final Position position;

	/** The links to the previous and next players. */
	private Player prev, next;

	/**
	 * Instantiates a new Player.
	 * @param name the name of the player, must not be null
	 * @param score how many points this player has scored 
	 * @param position the position of the player, where null means can play ANY position
	 */
	public Player(String name, int score, Position position) {
		if (name == null) throw new NullPointerException("name cannot be null");
		this.name = name;
		this.position = position;
		checkParameter("score",score);
		this.score = score;
	}

	private static void checkParameter(String name, int p) {
		if (p < 0) throw new IllegalArgumentException(name + " must be positive value");}

	/** Gets the name.
	 * @return the name */
	public String getName() {return name;}
	
	/** Gets this player's score.
	 * @return the score */
	public int getScore() {return score;}

	/** Sets the score.
	 * @param the score */
	public void setScore(int score) {this.score = score;}
	
	/** Gets this player's position.
	 * @return the position */
	public Position getPosition() {return position;}

	/** Gets the previous player.
	 * @return the previous player */
	public Player getPrevious() {return prev;}

	/** Gets the next player.
	 * @return the next player */
	public Player getNext() {return next;}

	/**
	 * Add another player into this player's team by priority order.
	 * <ul>
	 * <li> If the other player has higher priority, place it somewhere before this player.
	 * <li> If the other player has equal priority, it should be placed immediately after this player.
	 * <li> If the other player has lower priority, place it somewhere after this player.
	 * </ul> 
	 * It may be necessary to move multiple times forward or multiple times backward (but not both!)
	 * <p>
	 * Also, the code must use recursion to traverse the list - no loops are allowed!
	 * @param p the player to add to our list, must not be null
	 * @param priority comparator of players in the list, must not be null
	 */
	public void addInPriority(Player p, Comparator<Player> priority) {
		// TODO: Implement this method.  No loops, only recursion.
		//
		// NB: While Team happens to call this method only on the head of the list,
		//	   we can't assume all classes that utilize Player will do so. That is why
		//	   we must consider all scenarios, including those where this method is
		//	   called on a player in the middle or end of the list.

	}

	/**
	 * Assuming all the players before this one are sorted correctly
	 * according to the priority and come before this one,
	 * ensure that the ones coming after are also sorted correctly.
	 * @param c comparator to use, must not be null
	 */
	public void sortByPriority(Comparator<Player> c) {
		// TODO: Implement this method.  Use a loop here and then recursion
		// when everything OK up to the next one.
	}

	/**
	 * Remove this item from its list.
	 * This player will be completely disconnected from any other players.
	 */
	public void remove() {
		// TODO: Implement this method.  No loops or recursion required.
	}


	/*
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "(" + name + ", " + position + ", " +score + "pts)";}

	
}
