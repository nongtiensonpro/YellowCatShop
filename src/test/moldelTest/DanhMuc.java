package com.poly.yellowcat.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "DanhMuc")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DanhMuc {
    @Id
    @Column(name = "id_DanhMuc")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_DanhMuc;

    @Column(name = "ten_DanhMuc")
    private String ten_DanhMuc;

    @Column(name = "trang_Thai")
    private boolean trang_Thai;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "danhMuc", referencedColumnName = "id_DanhMuc")
    private SanPham sanPham;
}
