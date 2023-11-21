package com.poly.yellowcat.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Size")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Size {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Size")
    private Long id_Size;

    @Column(name = "ten_Size")
    private String ten_Size;
}
