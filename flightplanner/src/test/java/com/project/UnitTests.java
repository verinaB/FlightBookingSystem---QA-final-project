import org.junit.Test;
import static org.junit.Assert.*;
public class UnitTests {

        @Test
        public void testCityNameGetterSetter() {
            City city = new City();
            city.setName("TestCity");
            assertEquals("TestCity", city.getName());
        }

        @Test
        public void testAirportCodeGetterSetter() {
            Airport airport = new Airport();
            airport.setCode("XYZ");
            assertEquals("XYZ", airport.getCode());
        }

        @Test
        public void testUserPasswordSetterGetter() {
            User user = new User();
            user.setPassword("password123");
            assertEquals("password123", user.getPassword());
        }

        @Test
        public void testFlightArrivalTimeGetter() {
            Flight flight = new Flight();
            flight.setDepartureTime("10:00");
            flight.setFlightDuration(2);
            assertEquals("12:00", flight.getArrivalTime());
        }

        @Test
        public void testFlightDurationCalculation() {
            Flight flight = new Flight();
            flight.setDepartureTime("22:00");
            flight.setFlightDuration(3);
            assertEquals("01:00", flight.getArrivalTime());
        }

        @Test
        public void testBookingAddFlight() {
            Booking booking = new Booking();
            Flight flight = new Flight();
            booking.addFlight(flight);
            assertEquals(1, booking.getFlights().size());
        }

        @Test
        public void testBookingUserTimeZone() {
            Booking booking = new Booking();
            TimeZone tz = new TimeZone();
            tz.setName("PST");
            booking.setUserTimeZone(tz);
            assertEquals("PST", booking.getUserTimeZone().getName());
        }

        @Test
        public void testTimeConverter() {
            TimeZone fromTZ = TimeZone.getTimeZone("GMT");
            TimeZone toTZ = TimeZone.getTimeZone("EST");
            String convertedTime = TimeConverter.convertTime("14:00", fromTZ, toTZ);
            assertEquals("09:00", convertedTime);
        }

        @Test
        public void testCountryNameAndCode() {
            Country country = new Country();
            country.setName("CountryName");
            country.setCode("CN");
            assertEquals("CountryName", country.getName());
            assertEquals("CN", country.getCode());
        }

        @Test
        public void testPreferencesIs24Hour() {
            Preferences prefs = new Preferences();
            prefs.set24Hour(true);
            assertTrue(prefs.is24Hour());
        }

        @Test
        public void testPassengerAgeSetterGetter() {
            Passenger passenger = new Passenger();
            passenger.setAge(25);
            assertEquals(25, passenger.getAge());
        }

        @Test
        public void testTimeZoneOffset() {
            TimeZone tz = new TimeZone();
            tz.setOffset(-5);
            assertEquals(-5, tz.getOffset());
        }
    }

}

