package com.example.creativebooking.controller;

import com.example.creativebooking.entity.CreativeRequest;
import com.example.creativebooking.service.CreativeRequestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
public class CreativeRequestController {

    @Autowired
    private CreativeRequestService service;

    // ✅ TEST
    @GetMapping("/test")
    public String test() {
        return "Controller Working";
    }

    // ✅ CREATE REQUEST (USER)
    @PostMapping("/requests")
    public CreativeRequest createRequest(@RequestBody CreativeRequest request) {
        return service.saveRequest(request);
    }

    // ✅ GET ALL REQUESTS (ADMIN)
    @GetMapping("/requests")
    public List<CreativeRequest> getAllRequests() {
        return service.getAllRequests();
    }
    
    @PutMapping("/requests/{id}/status")
    public CreativeRequest updateStatus(@PathVariable Long id,
                                        @RequestParam String status) {
        return service.updateStatus(id, status);
    }
    
    @DeleteMapping("/requests/{id}")
    public String deleteRequest(@PathVariable Long id) {
        service.deleteRequest(id);
        return "Deleted Successfully";
    }
    
    @GetMapping("/requests/status/{status}")
    public List<CreativeRequest> getByStatus(@PathVariable String status) {
        return service.getByStatus(status);
    }
    
}