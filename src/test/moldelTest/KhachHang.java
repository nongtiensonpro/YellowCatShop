package com.poly.yellowcat.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "KhachHang")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class KhachHang {
    @Id
    @Column(name = "id_KhachHang")
    private int id_KhachHang;

    @Column(name = "ten")
    private String ten;

    @Column(name = "tuoi")
    private int tuoi;

    @Column(name = "diaChi")
    private String diaChi;

    @Column(name = "soDienThoai")
    private String soDienThoai;

    @Column(name = "email")
    private String email;
}
