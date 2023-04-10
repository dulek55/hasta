package com.dulver.hasta.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Setter
@Entity
@Table(name = "BadmintonTimeslots")
public class BadmintonTimeslot {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDateTime timestamp;
    private Long courtId;
    private LocalDate day;
    private LocalTime time;
    private boolean free;

    public BadmintonTimeslot() {
    }

    public BadmintonTimeslot(Long id, LocalDateTime timestamp, Long courtId, LocalDate day, LocalTime time, boolean free) {
        this.id = id;
        this.timestamp = timestamp;
        this.courtId = courtId;
        this.day = day;
        this.time = time;
        this.free = free;
    }
}
