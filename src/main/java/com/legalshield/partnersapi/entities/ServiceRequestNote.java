package com.legalshield.partnersapi.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "service_request_notes")
public class ServiceRequestNote {
    @Id
    @Column(name = "id")
    public UUID id;

    @Column(name = "body")
    public String body;

    @Column(name = "created_at")
    public LocalDateTime createdAt;

    @Column(name = "updated_at")
    public LocalDateTime updatedAt;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "serviceRequestNote", optional = false)
    public ServiceRequestEvent serviceRequestEvent;

    public ServiceRequestNote() {}
}
