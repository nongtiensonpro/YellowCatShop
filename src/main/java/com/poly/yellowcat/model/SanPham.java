/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.yellowcat.model;

import jakarta.persistence.*;

import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author nongt
 */
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
    private Long id_SanPham;

    @Column(name = "ma_SanPham")
    private Long ma_SanPham;

    @Column(name = "ten")
    private String ten;

    @Column(name = "gia")
    private Double gia;

    @Column(name = "soLuong")
    private Long soLuong;

    @Column(name = "hinhAnh1")
    private String hinhAnh1;

    @Column(name = "hinhAnh2")
    private String hinhAnh2;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "hang_id", referencedColumnName = "id")


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_Loai", referencedColumnName = "id_Loai")
    private Loai id_Loai;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_Hang", referencedColumnName = "id_Hang")
    private Hang id_Hang;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_Size", referencedColumnName = "id_Size")
    private Size id_Size;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_TrangThai", referencedColumnName = "id_TrangThai")
    private TrangThai id_TrangThai;

    @Column(name = "ngayNhap")
    private Date ngayNhap;
}
