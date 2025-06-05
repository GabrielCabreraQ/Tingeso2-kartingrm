package com.kartingrm.GroupDiscount_service.Repository;

import com.kartingrm.GroupDiscount_service.Entity.GroupDiscount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupDiscountRepository extends JpaRepository<GroupDiscount, Long> {

    GroupDiscount findTopByOrderByIdDesc();

}
