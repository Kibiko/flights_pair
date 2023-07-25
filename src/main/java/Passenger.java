public class Passenger {

//    properties
    private String name;
    private String teleNumber;
    private int id;

//    constructor

    public Passenger(String name, String teleNumber, int id){

        this.name = name;
        this.teleNumber = teleNumber;
        this.id = id;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeleNumber() {
        return teleNumber;
    }

    public void setTeleNumber(String teleNumber) {
        this.teleNumber = teleNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
