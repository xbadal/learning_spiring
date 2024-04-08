package com.xbadal.spring.learningspring.util;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.xbadal.spring.learningspring.data.Guest;
import com.xbadal.spring.learningspring.data.GuestRepository;
import com.xbadal.spring.learningspring.data.Reservation;
import com.xbadal.spring.learningspring.data.ReservationRepository;
import com.xbadal.spring.learningspring.data.Room;
import com.xbadal.spring.learningspring.data.RoomRepository;

@Component
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent> {


    private final RoomRepository roomRepository;
    private final GuestRepository guestRepository;
    private final ReservationRepository reservationRepository;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        Iterable<Room> rooms = this.roomRepository.findAll();
        rooms.forEach(System.out::println);

        Iterable<Guest> guests = this.guestRepository.findAll();
        guests.forEach(System.out::println);

        Iterable<Reservation> reservations = this.reservationRepository.findAll();
        reservations.forEach(System.out:: println);

    }

    public AppStartupEvent(RoomRepository roomRepository,GuestRepository guestRepository,ReservationRepository reservationRepository){
        this.roomRepository = roomRepository;
        this.guestRepository = guestRepository;
        this.reservationRepository = reservationRepository;
    }

}
