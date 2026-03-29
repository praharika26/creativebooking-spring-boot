package com.example.creativebooking.entity;

import jakarta.persistence.*;

@Entity
public class CreativeRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String clubName;
    private String requestType;
    private String description;
    private String deadline;
    private String status;

    public CreativeRequest() {}

    public Long getId() { return id; }
    public String getClubName() { return clubName; }
    public String getRequestType() { return requestType; }
    public String getDescription() { return description; }
    public String getDeadline() { return deadline; }
    public String getStatus() { return status; }

    public void setId(Long id) { this.id = id; }
    public void setClubName(String clubName) { this.clubName = clubName; }
    public void setRequestType(String requestType) { this.requestType = requestType; }
    public void setDescription(String description) { this.description = description; }
    public void setDeadline(String deadline) { this.deadline = deadline; }
    public void setStatus(String status) { this.status = status; }
}