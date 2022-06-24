package otlob;

public class DeliveryGuy extends Human {

    private String destination;
    private int rate;

    public DeliveryGuy(String destination, int rate) {
        this.destination = destination;
        this.rate = rate;
    }

    public DeliveryGuy(String destination, int rate, int id, String username, String fullname, String password, String phone, int age, char gender) {
        super(id, username, fullname, password, phone, age, gender);
        this.destination = destination;
        this.rate = rate;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
