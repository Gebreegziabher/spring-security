package edu.ggg.waarestfullab5.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Log")
public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
    private String principle;
    private String operation;
    private String exception;

    public Log(LocalDate date, LocalTime startTime, LocalTime endTime, String principle, String operation, String exception){
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.principle = principle;
        this.operation = operation;
        this.exception = exception;
    }
}
