class Ticket {
    private String ticketNumber;
    private double price;


    Ticket(String ticketNumber,double price){
        this.ticketNumber=ticketNumber;
        this.price=price;

    }

    public String getTicketNum(){
        return ticketNumber;
    }

    public double getPrice(){
        return price;
    }

    public void generateTicket(){
        System.out.println("Ticket Number:"+getTicketNum());
        System.out.println("Price: $"+getPrice());
    }

}

class BusTicket extends Ticket {
    private String seatNumber;//Generally seatNumber contains both number and alphabet i.e A5 etc so im using String here

    BusTicket(String ticketNumber,double price,String seatNumber){
        super(ticketNumber,price);
        this.seatNumber=seatNumber;

    }

    public String getseatNumber(){
        return seatNumber;
    }

    @Override 
    public void generateTicket(){
        System.out.println("<====>Bus-Ticket<====>");
        super.generateTicket();
        System.out.println("Seat Number:"+getseatNumber());
    }
}
class TrainTicket extends Ticket {
    String coachType;

    TrainTicket(String ticketNumber,double price,String coachType){
        super(ticketNumber,price);
        this.coachType=coachType;
    }

    public String getcoachType(){
        return coachType;
    }
    @Override 
    public void generateTicket(){
        System.out.println("<====>Train-Ticket<====>");
        super.generateTicket();
        System.out.println("Coach Type:"+getcoachType());
    }

} 
class FlightTicket extends Ticket {
    private String boardingGate;

    FlightTicket(String ticketNumber,double price, String boardingGate){
        super(ticketNumber,price);
        this.boardingGate=boardingGate;
    }

    public String getboardingGate(){
        return boardingGate;
    }

    @Override
    public void generateTicket(){
        System.out.println("<====>Plane-Ticket<===>");
        super.generateTicket();
        System.out.println("Boarding Gate:"+getboardingGate());
    }



}
public class TicketSystem {
    public static void main(String[] args){
        Ticket[] tk=new Ticket[]{
            new Ticket("04S-343-4H5",40),
            new BusTicket("349-4F3-33G",50,"A9"),
            new TrainTicket("34H-30F-212",80,"Night"),
            new FlightTicket("1F073",200,"Gate 11")
        };
        for(int i=0; i<tk.length;i++){
            tk[i].generateTicket();
            System.out.println("<------------------->");
        }
    }
}
