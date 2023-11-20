package com.poly.yellowcat.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tai_khoanNhanVien")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TaiKhoanNhanVien {

    @Id
    @Column(name = "id_TaiKhoanNhanVien")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_TaiKhoanNhanVien;

    @Column(name = "ten")
    private String ten;

    @Column(name = "matKhau")
    private String matKhau;

    @Column(name = "vaiTro")
    private boolean vaiTro;
}