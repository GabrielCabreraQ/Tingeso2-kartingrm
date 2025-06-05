package com.kartingrm.Booking_service.Repository;

import com.kartingrm.Booking_service.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    Optional<Client> findByRut(String rut);

}