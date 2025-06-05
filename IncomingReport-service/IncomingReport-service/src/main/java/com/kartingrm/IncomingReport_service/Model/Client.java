package com.kartingrm.IncomingReport_service.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    private Long id;
    private String rut;
    private String name;
    private LocalDate birthDate;
    private String email;

}

