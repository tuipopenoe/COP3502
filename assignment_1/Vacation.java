public class Vacation{
    private int length;
    private int startDate;
    private int endDate;

    private String destination;
    private String airline;
    private String hotel;

    public Vacation(){
        this.length = 0;
        this.startDate = 0;
        this.endDate = 1;
        this.destination = "";
        this.airline = "";
        this.hotel = "";
    }

    public Vacation(int length, int startDate, int endDate, String destination,
        String airline, String hotel){
        this.length = length;
        this.startDate = startDate;
        this.endDate = endDate;

        this.destination = destination;
        this.airline = airline;
        this.hotel = hotel;
    }

    public int getLength(){
        return this.length;
    }

    public void setLength(int length){
        this.length = length;
    }

    public int getStartDate(){
        return this.startDate;
    }

    public void setStartDate(int startDate){
        this.startDate = startDate;
    }

    public int getEndDate(){
        return this.endDate;
    }

    public void setEndDate(){
        this.endDate = endDate;
    }

    public String getDestination(){
        return this.destination;
    }

    public void setDestination(String destination){
        this.destination = destination;
    }

    public String getAirline(){
        return this.airline;
    }

    public void setAirline(String airline){
        this.airline = airline;
    }

    public String getHotel(){
        return this.hotel;
    }

    public void setHotel(String hotel){
        this.hotel = hotel;
    }

    public String toString(){
        return  "Length: " + Integer.toString(this.length)+"\n" +
                "Start Date: " + Integer.toString(this.startDate) +"\n" +
                "End Date: " + Integer.toString(this.endDate) + "\n" +
                "Destination: " + this.destination + "\n" +
                "Airline: " + this.airline + "\n" +
                "Hotel: " + this.hotel + "\n";
    }
}