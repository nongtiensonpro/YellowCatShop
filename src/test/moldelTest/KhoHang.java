package com.poly.yellowcat.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "KhoHang")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class KhoHang {
    @Id
    @Column(name = "id_KhoHang")
    private int id_KhoHang;

    @Column(name = "ten_KH")
    private String ten_KH;

    @Column(name = "diaChi_KH")
    private String diaChi_KH;

    @Column(name = "soDienThoai")
    private String soDienThoai;

    @Column(name = "sanPham")
    private String sanPham;

    @Column(name = "soLuong")
    private int soLuong;
}
