package it.unibo.oop.lab.enum1;

import it.unibo.oop.lab.socialnetwork.User;

/**
 * This is going to act as a test for
 * {@link it.unibo.oop.lab.enum1.SportSocialNetworkUserImpl}
 * 
 * 1) Realize the same test as the previous exercise, this time using
 * enumeration Sport
 * 
 * 2) Run it: every test must return true.
 * 
 */
public final class TestSportByEnumeration {

    private TestSportByEnumeration() { }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String... args) {
        /*
         * [TEST DEFINITION]
         * 
         * By now, you know how to do it
         */
        // TODO
    	final SportSocialNetworkUserImpl<User> falonso = new SportSocialNetworkUserImpl<User>("Fernando", "Alonso", "falonso", 34);
        
    	falonso.addSport(Sport.SOCCER);
        falonso.addSport(Sport.F1);
        falonso.addSport(Sport.BIKE);
        System.out.println("Alonso practices F1: " + falonso.hasSport(Sport.F1));
        System.out.println("Alonso does not like volley: " + !falonso.hasSport(Sport.VOLLEY));
    }
}
