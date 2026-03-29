package com.example.creativebooking.repository;

import com.example.creativebooking.entity.CreativeRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CreativeRequestRepository extends JpaRepository<CreativeRequest, Long> {
	List<CreativeRequest> findByStatus(String status);
}
