package hotelTest;

import guest.Guest;
import hotel.Hotel;
import hotel.RoomType;
import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;

import static org.junit.Assert.assertEquals;


public class HotelTest {


    Hotel hotel;
    Bedroom bedroom;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Conference conference;


    @Before
    public void before() {
        hotel = new Hotel();
        bedroom = new Bedroom(RoomType.SINGLE, 1);
        bedroom1 = new Bedroom(RoomType.DOUBLE, 2);
        bedroom2 = new Bedroom(RoomType.TRIPLE, 3);
        conference = new Conference(RoomType.LARGE_CONFERENCE, "Omega");
    }

    @Test
    public void hotelStartsWith0Bedrooms(){
        assertEquals(0, hotel.getNumberOfBedrooms());
    }

    @Test
    public void canAddBedrooms(){
        hotel.addBedroom(bedroom1);
        assertEquals(1, hotel.getNumberOfBedrooms());
    }

    @Test
    public void hotelStartsWith0ConferenceRooms(){
        assertEquals(0, hotel.getNumberOfConferenceRooms());
    }

    @Test
    public void canAddConferenceRooms() {
        hotel.addConference(conference);
        assertEquals(1, hotel.getNumberOfConferenceRooms());
    }
}
