package com.legalshield.partnersapi.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "service_request_fulfillments")
public class ServiceRequestFulfillment {
    @Id
    @Column(name = "id")
    public UUID id;

    @Column(name = "attorney_name")
    public String attorneyName;

    @Column(name = "created_at")
    public LocalDateTime createdAt;

    @Column(name = "updated_at")
    public LocalDateTime updatedAt;

    @Column(name = "submitted_at")
    public LocalDateTime submittedAt;

    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "service_request_id", nullable = false)
    public ServiceRequest serviceRequest;

    public ServiceRequestFulfillment() {}
}
