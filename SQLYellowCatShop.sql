
CREATE DATABASE YELLOW_CAT_SHOP

GO

USE YELLOW_CAT_SHOP

GO

CREATE TABLE TaiKhoanNhanVien (
  id_TaiKhoanNhanVien INT PRIMARY KEY  IDENTITY(1,1),
  ten VARCHAR(20) NOT NULL,
  matKhau VARCHAR(20) NOT NULL,
  vaiTro bit NOT NULL
);

INSERT INTO TaiKhoanNhanVien (ten, matKhau, vaiTro) VALUES 
('nhanvien1', 'matkhau1', 1),
('nhanvien2', 'matkhau2', 0),
('nhanvien3', 'matkhau3', 1),
('nhanvien4', 'matkhau4', 0);

SELECT id_TaiKhoanNhanVien,ten,matKhau,vaiTro FROM TaiKhoanNhanVien


CREATE TABLE [SanPham] (
  [id_SanPham] INT PRIMARY KEY  IDENTITY(1,1),
  [ten] NVARCHAR(100),
  [moTa] NVARCHAR(MAX),
  [gia] DECIMAL(18, 2),
  [danhMuc] INT,
  [chatLieu] NVARCHAR(100),
  [mauSac] NVARCHAR(100),
  [kinhThuoc] NVARCHAR(100),
  [kieuDang] NVARCHAR(100),
  [soLuong] INT,
  [hinhAnh] NVARCHAR(MAX),
  [ngayNhap] DATE DEFAULT GETDATE()
);

CREATE TABLE [DanhMuc] (
  [id_DanhMuc] INT PRIMARY KEY IDENTITY(1,1),
  [ten_DanhMuc] NVARCHAR(100)
);

ALTER TABLE [DanhMuc] ADD FOREIGN KEY ([id_DanhMuc]) REFERENCES [SanPham] ([id_SanPham])
GO