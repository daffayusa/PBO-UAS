-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 13, 2023 at 03:31 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_hotel`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_admin`
--

CREATE TABLE `tb_admin` (
  `id_admin` varchar(15) NOT NULL,
  `nama_admin` varchar(30) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_admin`
--

INSERT INTO `tb_admin` (`id_admin`, `nama_admin`, `username`, `password`) VALUES
('001', 'Daffa Yusa', 'admin', 'admin'),
('002', 'Dwi Prakoso', 'admin2', 'admin2');

-- --------------------------------------------------------

--
-- Table structure for table `tb_history_tamu`
--

CREATE TABLE `tb_history_tamu` (
  `no_tamu` varchar(17) NOT NULL,
  `nama_tamu` varchar(30) NOT NULL,
  `jenis_kelamin` varchar(12) NOT NULL,
  `alamat` text NOT NULL,
  `no_tlp` varchar(15) NOT NULL,
  `kode_kamar` varchar(8) NOT NULL,
  `lantai` varchar(10) NOT NULL,
  `no_kamar` varchar(10) NOT NULL,
  `tipe_kamar` varchar(8) NOT NULL,
  `harga_permalam` int(15) NOT NULL,
  `cek_in` varchar(10) NOT NULL,
  `cek_out` varchar(10) NOT NULL,
  `lama_menginap` int(15) NOT NULL,
  `total_biaya` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tb_kamar`
--

CREATE TABLE `tb_kamar` (
  `kode_kamar` varchar(10) NOT NULL,
  `lantai` varchar(10) NOT NULL,
  `no_kamar` varchar(5) NOT NULL,
  `tipe_kamar` varchar(15) NOT NULL,
  `harga_permalam` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_kamar`
--

INSERT INTO `tb_kamar` (`kode_kamar`, `lantai`, `no_kamar`, `tipe_kamar`, `harga_permalam`) VALUES
('1001', 'Lantai 1', '001', 'Standart', 600000),
('2001', 'Lantai 2', '002', 'Superior', 850000),
('2002', 'Lantai 2', '002', 'Standart', 600000),
('2003', 'Lantai 2', '003', 'Deluxe', 1500000),
('3001', 'Lantai 3', '001', 'Family', 2000000);

-- --------------------------------------------------------

--
-- Table structure for table `tb_karyawan`
--

CREATE TABLE `tb_karyawan` (
  `id_karyawan` varchar(20) NOT NULL,
  `nama_karyawan` varchar(30) NOT NULL,
  `jenis_kelamin` varchar(15) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `no_tlp` varchar(15) NOT NULL,
  `password` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_karyawan`
--

INSERT INTO `tb_karyawan` (`id_karyawan`, `nama_karyawan`, `jenis_kelamin`, `alamat`, `no_tlp`, `password`) VALUES
('001', 'Maskuri', 'Laki-laki', 'Semarang', '0897456323', '12345'),
('002', 'Indah', 'Perempuan', 'Gorontalo', '089654327364', 'user2');

-- --------------------------------------------------------

--
-- Table structure for table `tb_tamu`
--

CREATE TABLE `tb_tamu` (
  `no_tamu` varchar(17) NOT NULL,
  `nama_tamu` varchar(30) NOT NULL,
  `jenis_kelamin` varchar(12) NOT NULL,
  `alamat` text NOT NULL,
  `no_tlp` varchar(15) NOT NULL,
  `kode_kamar` varchar(8) NOT NULL,
  `tgl_cek_in` varchar(10) NOT NULL,
  `jam_cek_in` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_admin`
--
ALTER TABLE `tb_admin`
  ADD PRIMARY KEY (`id_admin`);

--
-- Indexes for table `tb_history_tamu`
--
ALTER TABLE `tb_history_tamu`
  ADD KEY `no_tamu` (`no_tamu`),
  ADD KEY `kode_kamar` (`kode_kamar`);

--
-- Indexes for table `tb_kamar`
--
ALTER TABLE `tb_kamar`
  ADD PRIMARY KEY (`kode_kamar`);

--
-- Indexes for table `tb_karyawan`
--
ALTER TABLE `tb_karyawan`
  ADD PRIMARY KEY (`id_karyawan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
