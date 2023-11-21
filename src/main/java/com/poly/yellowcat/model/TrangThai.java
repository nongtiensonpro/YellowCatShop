package com.poly.yellowcat.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "TrangThai")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TrangThai {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_TrangThai")
    private Long id_TrangThai;

    @Column(name = "ten_TrangThai")
    private String ten_TrangThai;
}
