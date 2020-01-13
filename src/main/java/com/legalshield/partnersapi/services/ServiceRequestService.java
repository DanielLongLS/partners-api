package com.legalshield.partnersapi.services;

import com.legalshield.partnersapi.repositories.ServiceRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class ServiceRequestService {
    private ServiceRequestRepository serviceRequestRepository;

    @Autowired
    public ServiceRequestService(
            ServiceRequestRepository serviceRequestRepository) {
        this.serviceRequestRepository = serviceRequestRepository;
    }

    public ModelAndView index() {
        Map<String, Object> params = new HashMap<String, Object>();

        params.put("service_requests", serviceRequestRepository.findAll());
        return new ModelAndView("service_requests/index", params);
    }

    public ModelAndView show(String id) {
        Map<String, Object> params = new HashMap<String, Object>();

        params.put("service_request", serviceRequestRepository.findById(UUID.fromString(id)).get());
        return new ModelAndView("service_requests/show", params);
    }
}
