package com.kartingrm.FrequencyDiscount_service.Repository;

import com.kartingrm.FrequencyDiscount_service.Entity.FrequencyDiscount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrequencyDiscountRepository extends JpaRepository<FrequencyDiscount, Long> {

    FrequencyDiscount findTopByOrderByIdDesc();

}
