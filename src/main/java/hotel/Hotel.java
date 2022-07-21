package hotel;

import rooms.Bedroom;
import rooms.Conference;

import java.util.ArrayList;

public class Hotel {

    private final ArrayList<Bedroom> bedrooms;
    private final ArrayList<Conference> conferences;

    public Hotel(){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferences = new ArrayList<Conference>();
    }

    public void addBedroom(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }

    public void addConference(Conference conference){
        this.conferences.add(conference);
    }

    public int getNumberOfBedrooms() {
        return this.bedrooms.size();
    }

    public int getNumberOfConferenceRooms() {
        return this.conferences.size();
    }

}
