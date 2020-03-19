import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom singleRoom;
    private Bedroom doubleRoom;
    private Guest guest1;
    private Guest guest2;

    @Before
    public void before(){
        singleRoom = new Bedroom(2, "single", 1);
        doubleRoom = new Bedroom(1, "double",12);
        guest1 = new Guest("Alan");
        guest2 = new Guest("Peter");
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals(2, singleRoom.getRoomNumber());
        assertEquals(1, doubleRoom.getRoomNumber());
    }

    @Test
    public void canGetRoomType(){
        assertEquals("single", singleRoom.getType());
        assertEquals("double", doubleRoom.getType());
    }

    @Test
    public void canGetRomCapacity(){
        assertEquals(1, singleRoom.getCapacity());
        assertEquals(12, doubleRoom.getCapacity());
    }

    @Test
    public void checkNumberOfGuest(){
//        Two guest are passed in but only one is actually added to the room, this is due to our funciton to check on room capacity before adding each guest.
        singleRoom.addGuest(guest1);
        singleRoom.addGuest(guest2);
        assertEquals(1,  singleRoom.totalGuests());
    }

    @Test
    public void sirYouAreCausingAScene(){
        singleRoom.addGuest(guest1);
        singleRoom.addGuest(guest2);
        singleRoom.removeGuest(guest1);
        assertEquals(0, singleRoom.totalGuests());
    }

    @Test
    public void YallAreCausingAScene(){
        doubleRoom.addGuest(guest1);
        doubleRoom.addGuest(guest2);
        doubleRoom.removeAllGuests();
        assertEquals(0, doubleRoom.totalGuests());
    }
}
