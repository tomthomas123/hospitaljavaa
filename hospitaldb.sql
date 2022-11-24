-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 24, 2022 at 12:12 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospitaldb`
--

-- --------------------------------------------------------

--
-- Table structure for table `patients`
--

CREATE TABLE `patients` (
  `field_id` int(11) NOT NULL,
  `patient_id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `pincode` int(11) NOT NULL,
  `phone` bigint(20) NOT NULL,
  `symptoms` varchar(100) NOT NULL,
  `doc_name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patients`
--

INSERT INTO `patients` (`field_id`, `patient_id`, `name`, `address`, `pincode`, `phone`, `symptoms`, `doc_name`) VALUES
(1, 101, 'boni', 'idukki ', 655562, 1956231248, 'Chest pain or discomfort.', 'satheesh'),
(2, 102, 'roni', 'kochi', 685587, 5478913260, 'Pain or discomfort in the jaw, neck, or back.', 'ratheesh'),
(3, 103, 'joni', 'alappuzha', 688885, 4590875678, 'Pain or discomfort in one or both arms or shoulders.\r\nShortness of breath.', 'satheesh'),
(4, 104, 'unni', 'alappuzha', 685587, 8754646643, 'fever', 'jimson'),
(5, 105, 'hari', 'thodupuzha', 685581, 9865748941, 'teeth civic pain ', 'ratheesh'),
(6, 106, 'jacob', 'kollam', 554486, 8796451278, 'head ache', 'satheesh'),
(7, 107, 'luke', 'brazil', 224875, 9856410123, 'not well', 'fernandas'),
(8, 108, 'simba', 'argentina', 220114, 412578965, 'pain', 'fernandas'),
(9, 109, 'biju', 'thodupuzha', 685581, 8754216556, 'fever cold', 'fernandas'),
(10, 110, 'siju', 'idakkadttupuriyil', 542365, 5465489465, 'not well and food poison', 'satheesh'),
(11, 111, 'jinu', 'kochi', 456321, 8856974589, 'health problem', 'jacob'),
(12, 112, 'nnn', 'asd', 4444, 44444, 'asasas', 'sdfd');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `patients`
--
ALTER TABLE `patients`
  ADD PRIMARY KEY (`field_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `patients`
--
ALTER TABLE `patients`
  MODIFY `field_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
