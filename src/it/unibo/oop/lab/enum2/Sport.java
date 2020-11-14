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
	
	BASKET(Place.INDOOR , 5 , "Basket"),
	SOCCER(Place.OUTDOOR , 11 , "Calcio"),
	TENNIS(Place.OUTDOOR , 1 , "Tennis"),
	BIKE(Place.OUTDOOR , 1 , "Ciclismo"),
	F1(Place.OUTDOOR , 1 , "F1"),
	MOTOGP(Place.OUTDOOR , 1 , "MotoGp"),
	VOLLEY (Place.INDOOR , 6 , "Pallavolo");
	
	
    /*
     * TODO
     * 
     * [FIELDS]
     * 
     * Declare required fields
     */
	private Place place;
	private int nMembers;
	private String nome;
	
    /*
     * TODO
     * 
     * [CONSTRUCTOR]
     * 
     * Define a constructor like this:
     * 
     * - Sport(final Place place, final int noTeamMembers, final String actualName)
//     */
	
	Sport(final Place p, final int nMembers, final String nomeSport){
		this.place = p;
		this.nMembers = nMembers;
		this.nome = nomeSport;
		
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
     */
	public boolean isIndividualSport() {
		return this.nMembers == 1;
	}
     /* 
     * 2) public boolean isIndoorSport()
     * 
     * Must return true in case the sport is practices indoor
     * 
     */
	public boolean isIndoorSport() {
		return this.place == Place.INDOOR;
	}
     /* 3) public Place getPlace()
     * 
     * Must return the place where this sport is practiced
     * 
     */
	public Place getPlace() {
		return this.place;
	}
     /* 4) public String toString()
     * 
     * Returns the string representation of a sport
     */
	public String toString() {
		return this.nome;
	}
}
