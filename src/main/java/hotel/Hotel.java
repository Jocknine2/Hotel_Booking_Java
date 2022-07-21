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

    public void setHotel(hotel.Hotel hotel) {
        this.hotel = hotel;
    }

    public Hotel shouldBeAbleToCheckIn(){

    }
    public Hotel shouldBeAbleToCheckOut(){

    }

    public int getNumberOfBedrooms() {
    }

    public int getNumberOfConferenceRooms() {
    }
}
