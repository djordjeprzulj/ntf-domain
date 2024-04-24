package edu.ftn.iis.soas.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ftn.iis.soas.domain.model.NotificationRequest;

public interface NotificationRequestRepository extends JpaRepository<NotificationRequest, Long> {

}
