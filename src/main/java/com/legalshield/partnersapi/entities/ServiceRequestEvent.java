package com.legalshield.partnersapi.entities;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "service_request_events")
public class ServiceRequestEvent {
    @Id
    @Column(name = "id")
    public UUID id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "service_request_id", nullable = false)
    public ServiceRequest serviceRequest;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "event_payload_id")
    public ServiceRequestNote serviceRequestNote;

    public ServiceRequestEvent() {}
}
