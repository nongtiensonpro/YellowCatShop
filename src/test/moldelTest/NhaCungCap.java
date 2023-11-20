package com.poly.yellowcat.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "NgayCungCap")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NhaCungCap {
    @Id
    @Column(name = "id_NhaCungCap")
    private int id_NhaCungCap;

    @Column(name = "ten")
    private String ten;

    @Column(name = "diaChi")
    private String diaChi;

    @Column(name = "soDienThoai")
    private String soDienThoai;

    @Column(name = "email")
    private String email;
}
