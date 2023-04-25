package q3_assignment;

/**
 *
 * @author Le Truong Thinh
 */
public class Flight {
    private String route;
    private int fare;

    public Flight() {
    }

    public Flight(String route, int fare) {
        this.route = route;
        this.fare = fare;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }
    public String getDeparture() {
        String[] e = route.split("-");
        return e[0];
    }

    @Override
    public String toString() {
        return route + "  " + fare;
    }
    
    
}
