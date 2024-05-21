-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th5 21, 2024 lúc 09:21 AM
-- Phiên bản máy phục vụ: 10.4.28-MariaDB
-- Phiên bản PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `employee`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `attendance_sheet`
--

CREATE TABLE `attendance_sheet` (
  `id` int(11) NOT NULL,
  `date` varchar(255) DEFAULT NULL,
  `manv` varchar(255) DEFAULT NULL,
  `timein` varchar(255) DEFAULT NULL,
  `timeout` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `attendance_sheet`
--

INSERT INTO `attendance_sheet` (`id`, `date`, `manv`, `timein`, `timeout`) VALUES
(1, '2024-05-01', 'NV001', '08:30', '17:30'),
(5, '2024-05-01', 'NV002', '08:30', '17:30'),
(6, '2024-05-01', 'NV003', '08:30', '17:30'),
(7, '2024-05-02', 'NV001', '08:30', '17:30'),
(8, '2024-05-02', 'NV002', '08:30', '17:30'),
(9, '2024-05-02', 'NV003', '08:30', '17:30'),
(10, '2024-05-03', 'NV001', '08:30', '17:30'),
(11, '2024-05-03', 'NV002', '08:30', '17:30'),
(12, '2024-05-03', 'NV003', '08:30', '17:30');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `attendance_sheet`
--
ALTER TABLE `attendance_sheet`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `attendance_sheet`
--
ALTER TABLE `attendance_sheet`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
