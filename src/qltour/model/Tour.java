
package qltour.model;

import java.util.Date;

public class Tour {
    private String ID_Tour;
    private String name_Tour;
    private String note;
    private double price_Tour;
    private Date date_create;
    private String destination;

    public String getID_Tour() {
        return ID_Tour;
    }

    public void setID_Tour(String ID_Tour) {
        this.ID_Tour = ID_Tour;
    }

    public String getName_Tour() {
        return name_Tour;
    }

    public void setName_Tour(String name_Tour) {
        this.name_Tour = name_Tour;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public double getPrice_Tour() {
        return price_Tour;
    }

    public void setPrice_Tour(double price_Tour) {
        this.price_Tour = price_Tour;
    }

    public Date getDate_create() {
        return date_create;
    }

    public void setDate_create(Date date_create) {
        this.date_create = date_create;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    
}
