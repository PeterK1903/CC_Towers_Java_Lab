import java.lang.reflect.Array;
import java.util.ArrayList;

public class Conference {

    private int capacity;
    private String name;
    private ArrayList<Guest> guests;

    public Conference(int capacity, String name) {
        this.capacity = capacity;
        this.name = name;
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }


}
