package com.xbadal.spring.learningspring.util;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.xbadal.spring.learningspring.data.Room;
import com.xbadal.spring.learningspring.data.RoomRepository;

@Component
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent> {


    private final RoomRepository roomRepository;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        Iterable<Room> rooms = this.roomRepository.findAll();
        rooms.forEach(System.out::println);

    }

    public AppStartupEvent(RoomRepository roomRepository){
        this.roomRepository = roomRepository;
    }

}
