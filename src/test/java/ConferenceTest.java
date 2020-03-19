import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceTest {

   private Conference conferenceOne;
   private Conference conferenceTwo;
   private Guest guest1;
   private Guest guest2;

    @Before
    public void before(){
        conferenceOne = new Conference(150, "Peter's Lounge");
        conferenceTwo = new Conference(250, "Alan's Lair");
        guest1 = new Guest("Alan");
        guest2 = new Guest("Peter");

    }

    @Test
    public void canGetCapacity(){
        assertEquals(150, conferenceOne.getCapacity());
        assertEquals(250, conferenceTwo.getCapacity());
    }

    @Test
    public void canGetName(){
        assertEquals("Peter's Lounge", conferenceOne.getName());
        assertEquals("Alan's Lair", conferenceTwo.getName());

    }

    @Test
    public void checkNumberOfGuest(){
        conferenceOne.addGuest(guest1);
        assertEquals(1,  conferenceOne.totalGuests());
    }

    @Test
    public void sirYouAreCausingAScene(){
        conferenceOne.addGuest(guest1);
        conferenceOne.addGuest(guest2);
        conferenceOne.removeGuest(guest1);
        conferenceOne.removeGuest(guest2);
        assertEquals(0, conferenceOne.totalGuests());
    }

    @Test
    public void YallAreCausingAScene(){
        conferenceTwo.addGuest(guest1);
        conferenceTwo.addGuest(guest2);
        conferenceTwo.removeAllGuests();
        assertEquals(0, conferenceTwo.totalGuests());
    }

}
