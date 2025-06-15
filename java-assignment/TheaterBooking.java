class Seat {
    private String seatNumber;

     Seat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void bookSeat() {
        System.out.println("Booking seat: " +getSeatNumber()); 
    }
}
class RegularSeat extends Seat {
     RegularSeat(String seatNumber) {
        super(seatNumber);
    }

    @Override
    public void bookSeat() {
        System.out.println("Regular Seat " + getSeatNumber() + " booked successfully. No extra charges.");
    }
}

class PremiumSeat extends Seat {
     PremiumSeat(String seatNumber) {
        super(seatNumber);
    }

    @Override
    public void bookSeat() {
        System.out.println("Premium Seat " + getSeatNumber() + " booked successfully.");
        System.out.println("Include snacks and luxury tax.");
    }
}

public class TheaterBooking {
    public static void main(String[] args) {
        Seat regular = new RegularSeat("R12");
        Seat premium = new PremiumSeat("P01");

        regular.bookSeat();
        System.out.println("-----------");//Using this to look attractive
        premium.bookSeat();
    }
}
