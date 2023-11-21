package com.poly.yellowcat.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Hang")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Hang {

    @Id
    @Column(name = "id_Hang")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Hang;

    @Column(name = "ten_Hang")
    private String ten_Hang;
}
