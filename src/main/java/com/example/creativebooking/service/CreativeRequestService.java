package com.example.creativebooking.service;

import com.example.creativebooking.entity.CreativeRequest;
import com.example.creativebooking.repository.CreativeRequestRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreativeRequestService {

    @Autowired
    private CreativeRequestRepository repository;

    public CreativeRequest saveRequest(CreativeRequest request) {
        request.setStatus("Pending");
        return repository.save(request);
    }
    public CreativeRequest updateStatus(Long id, String status) {
        CreativeRequest request = repository.findById(id).orElse(null);

        if (request != null) {
            request.setStatus(status);
            return repository.save(request);
        }

        return null;
    }

    public List<CreativeRequest> getAllRequests() {
        return repository.findAll();
    }
    
    public void deleteRequest(Long id) {
        repository.deleteById(id);
    }
    
    public List<CreativeRequest> getByStatus(String status) {
        return repository.findByStatus(status);
    }
}