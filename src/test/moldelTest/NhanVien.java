package com.poly.yellowcat.model;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "NhanVien")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NhanVien {
    @Column(name = "id_NhanVien")
    private int id_NhanVien;

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

    @Column(name = "vaiTro")
    private String vaiTro;
}
