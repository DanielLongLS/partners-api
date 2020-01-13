package com.legalshield.partnersapi.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "service_requests")
public class ServiceRequest {
    @Id
    @Column(name = "id")
    public UUID id;

    @Column(name = "case_id")
    public String caseId;

    @Column(name = "created_at")
    public LocalDateTime createdAt;

    @Column(name = "updated_at")
    public LocalDateTime updatedAt;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "serviceRequest")
    public ServiceRequestFulfillment serviceRequestFulfillment;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "serviceRequest")
    public List<ServiceRequestEvent> serviceRequestEvents;

    public ServiceRequest() {}
}
