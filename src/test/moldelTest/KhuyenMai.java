package com.poly.yellowcat.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "KhuyenMai")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class KhuyenMai {
    @Id
    @Column(name = "id_khuyenMai")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_KhuyenMai;

    @Column(name = "ten")
    private String ten;

    @Column(name = "mieuTa")
    private String mieuTa;

    @Column(name = "batDau")
    private Date batDau;

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
