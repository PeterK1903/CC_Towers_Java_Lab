import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private String type;
    private int capacity;
    private ArrayList<Guest> guests;

    public Bedroom(int roomNumber, String type, int capacity) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public int totalGuests(){
        return this.guests.size();
    }

    public void addGuest(Guest guest){
       if(checkSpaceAvailable()){
          this.guests.add(guest);
       }
    }

    public void removeGuest(Guest guest){
        this.guests.remove(guest);
    }

    public void removeAllGuests(){
        this.guests.clear();
    }

    public boolean checkSpaceAvailable(){
        return capacity > guests.size();
    }


    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }
}
