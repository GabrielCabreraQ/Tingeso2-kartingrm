package com.kartingrm.FrequencyDiscount_service.Controller;


import com.kartingrm.FrequencyDiscount_service.Entity.FrequencyDiscount;
import com.kartingrm.FrequencyDiscount_service.Model.FrequencyRequest;
import com.kartingrm.FrequencyDiscount_service.Service.FrequencyDiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/frequencydiscount")
@CrossOrigin("*")
public class FrequencyDiscountController {
    @Autowired
    FrequencyDiscountService frequencyDiscountService;

    @GetMapping("/")
    public ResponseEntity<FrequencyDiscount> getFrequencyDiscount() {
        return ResponseEntity.ok(frequencyDiscountService.getFrequencyDiscount());
    }

    @PostMapping("/calculate")
    public ResponseEntity<Double> calculateFrequencyDiscount(@RequestBody FrequencyRequest request) {
        double discount = frequencyDiscountService.calculateFrequencyDiscount(
                request.getParticipant(),
                request.getBookingDate()
        );
        return ResponseEntity.ok(discount);
    }

}



