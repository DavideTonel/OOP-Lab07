/**
 * 
 */
package it.unibo.oop.lab.enum2;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {

    /*
     * TODO
     * 
     * Declare the following sports:
     * 
     * - basket
     * 
     * - volley
     * 
     * - tennis
     * 
     * - bike
     * 
     * - F1
     * 
     * - motogp
     * 
     * - soccer
     * 
     */
	BASKET(Place.INDOOR, 5, "Basketball"),
	VOLLEY(Place.INDOOR, 6, "Volleyball"),
    TENNIS(Place.OUTDOOR, 1, "Tennis"), 
    BIKE(Place.OUTDOOR, 1, "Road biking"), 
    F1(Place.OUTDOOR, 1, "Formula 1"), 
    MOTOGP(Place.OUTDOOR, 1, "MotoGP"), 
    SOCCER(Place.OUTDOOR, 11, "Football");

    /*
     * TODO
     * 
     * [FIELDS]
     * 
     * Declare required fields
     */
	private final int nTeamMembers;
	private final String sportName;
	private final Place place;

    /*
     * TODO
     * 
     * [CONSTRUCTOR]
     * 
     * Define a constructor like this:
     * 
     * - Sport(final Place place, final int noTeamMembers, final String actualName)
     */
	Sport(final Place place, final int nTeamMembers, final String actualName) {
		this.place = place;
		this.nTeamMembers = nTeamMembers;
		this.sportName = actualName;
	}

    /*
     * TODO
     * 
     * [METHODS] To be defined
     * 
     * 
     * 1) public boolean isIndividualSport()
     * 
     * Must return true only if called on individual sports
     * 
     * 
     * 2) public boolean isIndoorSport()
     * 
     * Must return true in case the sport is practices indoor
     * 
     * 
     * 3) public Place getPlace()
     * 
     * Must return the place where this sport is practiced
     * 
     * 
     * 4) public String toString()
     * 
     * Returns the string representation of a sport
     */
	
	/**
	 * Must return true only on individual sports.
	 * 
	 * @return true if the sport is individual, false otherwise
	 */
	public boolean isIndividualSport() {
		return this.nTeamMembers == 1;
	}
	
	/**
	 * Must return true only on indoor sports.
	 * 
	 * @return true if the sport is practices indoor, false otherwise
	 */
	public boolean isIndoor() {
		return this.place == Place.INDOOR;
	}
	
	/**
	 * Must return the place where this sport is practiced
	 * 
	 * @return where the sport is practiced
	 */
	public Place getPlace() {
		return this.place;
	}
	
	/**
	 * Returns the representation of a sport
	 * 
	 *  @return the representation of the sport
	 */
	public String toString() {
		return "Sport[ name= "+ this.sportName + ", place= " + this.place
				+ ", number of members: " + this.nTeamMembers + "]";
	}
}
