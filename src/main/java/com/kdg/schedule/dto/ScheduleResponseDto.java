package com.kdg.schedule.dto;


import com.kdg.schedule.entity.Schedule;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ScheduleResponseDto {
    private Long id;
    private String name;
    private Long pw;
    private String contents;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    public ScheduleResponseDto(Schedule schedule) {
        this.id = schedule.getId();
        this.name = schedule.getName();
        this.pw = schedule.getPw();
        this.contents = schedule.getContents();
        this.createdAt = schedule.getCreatedAt();
        this.updatedAt = schedule.getUpdatedAt();
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getPw() {
        return pw;
    }

    public String getContents() {
        return contents;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}
