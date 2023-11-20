package com.poly.yellowcat.repository;

import com.poly.yellowcat.model.TaiKhoanNhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TaiKhoanNhanVienRepository extends JpaRepository<TaiKhoanNhanVien, Long> {

    @Query(value = "SELECT id_TaiKhoanNhanVien,ten,matKhau,vaiTro FROM TaiKhoanNhanVien WHERE ten = :ten", nativeQuery = true)
    TaiKhoanNhanVien findByMa(@Param("ten") String ten);
}
