package guestTest;

import guest.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Gregory");
    }

    @Test
    public void guestHasName(){
        assertEquals("Gregory", guest.getName());
    }


}
