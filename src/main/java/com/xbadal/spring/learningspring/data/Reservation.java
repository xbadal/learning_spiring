package com.xbadal.spring.learningspring.data;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "RESERVATION")
public class Reservation {

    @Id
    @Column(name = "RESERVATION_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "ROOM_ID")
    private String roomId;
    @Column(name = "GUEST_ID")
    private String guestId;
    @Column(name = "RES_DATE")
    private Date reservationDate;


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getRoomId() {
        return roomId;
    }
    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }
    public String getGuestId() {
        return guestId;
    }
    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }
    public Date getDate() {
        return reservationDate;
    }
    public void setDate(Date date) {
        this.reservationDate = date;
    }
    @Override
    public String toString() {
        return "Reservation [id=" + id + ", roomId=" + roomId + ", guestId=" + guestId + ", date=" + reservationDate + "]";
    }

    


}
