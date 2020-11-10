/**
 * 
 */
package it.unibo.oop.lab.nesting1;

import java.util.HashSet;
import java.util.Set;

import it.unibo.oop.lab.socialnetwork.SocialNetworkUserImpl;
import it.unibo.oop.lab.socialnetwork.User;

/**
 * 
 * Represents a social network user along with the sports he/she likes to do or
 * to follow.
 * 
 * 1) Complete the definition of the nested static class Sport, featuring just a
 * field representing the sport name.
 * 
 * 2) Add the unimplemented methods.
 * 
 * @param <U>
 *            specific {@link User} type
 */
public class SportSocialNetworkUserImpl<U extends User> extends SocialNetworkUserImpl<U> {

    /**
     * Static {@link Sport} constant.
     */
    public static final Sport SOCCER;
    /**
     * Static {@link Sport} constant.
     */
    public static final Sport F1;
    /**
     * Static {@link Sport} constant.
     */
    public static final Sport MOTOGP;
    /**
     * Static {@link Sport} constant.
     */
    public static final Sport VOLLEY;
    /**
     * Static {@link Sport} constant.
     */
    public static final Sport BASKET;
    /**
     * Static {@link Sport} constant.
     */
    public static final Sport BIKE;

    /*
     * TODO: initialize properly these sports
     */
    static {
        SOCCER = new Sport();
        F1 = new Sport();
        MOTOGP = new Sport();
        VOLLEY = new Sport();
        BASKET = new Sport();
        BIKE = new Sport();
    }

    /**
     * Field meant to keep track of the set of sports followed/done by a user.
     */
    private final Set<Sport> sports;

    /**
     * Builds a new {@link SportSocialNetworkUserImpl}.
     * 
     * @param name
     *            the user firstname
     * @param surname
     *            the user lastname
     * @param user
     *            alias of the user, i.e. the way a user is identified on an
     *            application
     */
    public SportSocialNetworkUserImpl(final String name, final String surname, final String user) {
        this(name, surname, user, -1);
    }

    /**
     * Builds a new {@link SportSocialNetworkUserImpl}.
     * 
     * @param name
     *            the user firstname
     * @param surname
     *            the user lastname
     * @param userAge
     *            user's age
     * @param user
     *            alias of the user, i.e. the way a user is identified on an
     *            application
     */
    public SportSocialNetworkUserImpl(final String name, final String surname, final String user, final int userAge) {
        super(name, surname, user, userAge);
        this.sports = new HashSet<>();
    }

    /*
     * [METHODS]
     * 
     * Implements all the methods below
     */

    /**
     * Add a new sport followed by this user: if the user already likes or does
     * the sport, nothing happens.
     * 
     * @param sport
     *            a sport followed/done by the user
     */
    // TODO
    public void addSport(final Sport sport) {
    	if(!this.sports.contains(sport)) {
    		this.sports.add(sport);
    	}
    }

    /**
     * Returns true if a user likes/does a given sport.
     * 
     * @param s
     *            sport to use as an input
     * @return true if a user likes sport s
     */
    // TODO
    public boolean hasSport(final Sport s) {
    	return this.sports.contains(s);
    }

    /*
     * TODO
     * 
     * Complete the definition of this static inner class defining a Sport along
     * with its bare name.
     * 
     * 
     */
    
    private static final class Sport{
    	
    	public Sport Soccer = SportSocialNetworkUserImpl.SOCCER;
    	public Sport F1 = SportSocialNetworkUserImpl.F1;
    	public Sport MotoGp = SportSocialNetworkUserImpl.MOTOGP;
    	public Sport Volley = SportSocialNetworkUserImpl.VOLLEY;
    	public Sport Basket = SportSocialNetworkUserImpl.BASKET;
    	public Sport Bike = SportSocialNetworkUserImpl.BIKE;
    	
        public Sport() {
        }
		
        public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((Basket == null) ? 0 : Basket.hashCode());
			result = prime * result + ((Bike == null) ? 0 : Bike.hashCode());
			result = prime * result + ((F1 == null) ? 0 : F1.hashCode());
			result = prime * result + ((MotoGp == null) ? 0 : MotoGp.hashCode());
			result = prime * result + ((Soccer == null) ? 0 : Soccer.hashCode());
			result = prime * result + ((Volley == null) ? 0 : Volley.hashCode());
			return result;
		}
		
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Sport other = (Sport) obj;
			if (Basket == null) {
				if (other.Basket != null)
					return false;
			} else if (!Basket.equals(other.Basket))
				return false;
			if (Bike == null) {
				if (other.Bike != null)
					return false;
			} else if (!Bike.equals(other.Bike))
				return false;
			if (F1 == null) {
				if (other.F1 != null)
					return false;
			} else if (!F1.equals(other.F1))
				return false;
			if (MotoGp == null) {
				if (other.MotoGp != null)
					return false;
			} else if (!MotoGp.equals(other.MotoGp))
				return false;
			if (Soccer == null) {
				if (other.Soccer != null)
					return false;
			} else if (!Soccer.equals(other.Soccer))
				return false;
			if (Volley == null) {
				if (other.Volley != null)
					return false;
			} else if (!Volley.equals(other.Volley))
				return false;
			return true;
		}
    }
}
