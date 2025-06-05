package com.kartingrm.SpecialDays_service.Repository;

import com.kartingrm.SpecialDays_service.Entity.SpecialDays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface SpecialDaysRepository extends JpaRepository<SpecialDays, Long> {

    Optional<SpecialDays> findByDate(LocalDate date);

}
