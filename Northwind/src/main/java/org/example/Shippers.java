package org.example;

public class Shippers {
    private int shipperID;
    private String shipperName;
    private int phone;

    public Shippers(int shipperID, String shipperName, int phone) {
        this.shipperID = shipperID;
        this.shipperName = shipperName;
        this.phone = phone;
    }

    public int getShipperID() {
        return shipperID;
    }

    public void setShipperID(int shipperID) {
        this.shipperID = shipperID;
    }

    public String getShipperName() {
        return shipperName;
    }

    public void setShipperName(String shipperName) {
        this.shipperName = shipperName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
