package model;

public class Reservation {

    private String slotId;
    private String name;
    private String plate;
    private String contact;
    private String type;
    private int fee;
    private String timeIn;

    public Reservation(String slotId, String name, String plate, String contact, String type, int fee, String timeIn) {
        this.slotId = slotId;
        this.name = name;
        this.plate = plate;
        this.contact = contact;
        this.type = type;
        this.fee = fee;
        this.timeIn = timeIn;
    }

    public String getSlotId() {
        return slotId;
    }

    public String getName() {
        return name;
    }

    public String getPlate() {
        return plate;
    }

    public String getContact() {
        return contact;
    }

    public String getType() {
        return type;
    }

    public int getFee() {
        return fee;
    }

    public String getTimeIn() {
        return timeIn;
    }
}
