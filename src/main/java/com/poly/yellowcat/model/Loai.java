package com.poly.yellowcat.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Loai")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Loai {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Loai")
    private Long id_Loai;

    @Column(name = "ten_Loai")
    private String ten_Loai;
}
