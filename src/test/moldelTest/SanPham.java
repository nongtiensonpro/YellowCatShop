package com.poly.yellowcat.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Table(name = "SanPham")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SanPham {
    @Id
    @Column(name = "id_SanPham")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_SanPham;

    @Column(name = "ten")
    private String ten;

    @Column(name = "moTa")
    private String moTa;
    @Column(name = "gia")
    private double gia;

    @Column(name = "danhMuc")
    private int danhMuc;

    @Column(name = "chatLieu")
    private String chatLieu;

    @Column(name = "mauSac")
    private String mauSac;

    @Column(name = "kichThuoc")
    private String kichThuoc;

    @Column(name = "kieuDang")
    private String kieuDang;

    @Column(name = "soLuong")
    private int soLuong;

    @Column(name = "hinhAnh")
    private String hinhAnh;

    @Column(name = "ngayNhap")
    private Date ngayNhap;
}
