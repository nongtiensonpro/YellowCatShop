package com.poly.yellowcat.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "HoaDon")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class HoaDon {
    @Id
    @Column(name = "id_HoaDon")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_HoaDon;

    @Column(name = "soHoaDon")
    private String soHoaDon;

    @Column(name = "ngayLap")
    private Date ngayLap;

    @Column(name = "khachHang")
    private String khachHang;

    @Column(name = "nhanVien")
    private String nhanVien;

    @Column(name = "tongGia")
    private BigDecimal tongGia;

    @Column(name = "phuongThucThanhToan")
    private String phuongThucThanhToan;

    @Column(name = "trangThaiHoaDon")
    private String trangThaiHoaDon;
}
