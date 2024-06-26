-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 25, 2024 at 06:22 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sampledbs`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_transaction`
--

CREATE TABLE `tbl_transaction` (
  `t_id` int(11) NOT NULL,
  `u_id` int(11) NOT NULL,
  `t_type` varchar(50) NOT NULL,
  `t_amount` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_transaction`
--

INSERT INTO `tbl_transaction` (`t_id`, `u_id`, `t_type`, `t_amount`) VALUES
(1, 1005, 'Deposit', '1.0'),
(2, 1005, 'Deposit', '1.0'),
(3, 1005, 'Deposit', '2.0'),
(4, 1005, 'Deposit', '3.0'),
(5, 1005, 'Deposit', '1.0'),
(6, 1005, 'Deposit', '2.0'),
(7, 1005, 'Deposit', '1.0'),
(8, 1005, 'Deposit', '1.0'),
(9, 1005, 'Deposit', '2.0'),
(10, 1005, 'Deposit', '1.0'),
(11, 1005, 'Deposit', '1.0'),
(12, 1005, 'Deposit', '1.0'),
(13, 1005, 'Deposit', '2.0'),
(14, 1005, 'Deposit', '1.0'),
(15, 1005, 'Deposit', '1.0'),
(16, 1005, 'Deposit', '1.0'),
(17, 1005, 'Deposit', '2.0'),
(18, 1005, 'Deposit', '1.0'),
(19, 1005, 'Deposit', '1.0'),
(20, 1005, 'Deposit', '2.0'),
(21, 1005, 'Deposit', '1.0'),
(22, 1005, 'Deposit', '1.0'),
(23, 1005, 'Deposit', '1.0'),
(24, 1005, 'Deposit', '2.0'),
(25, 1005, 'Deposit', '3.0'),
(26, 1005, 'Deposit', '1.0'),
(27, 1005, 'Deposit', '1.0'),
(28, 1005, 'Deposit', '1.0'),
(29, 1005, 'Deposit', '1.0'),
(30, 1005, 'Deposit', '1.0'),
(31, 1005, 'Deposit', '2.0'),
(32, 1005, 'Deposit', '3.0'),
(33, 1005, 'Deposit', '4.0'),
(34, 1005, 'Withdraw', '1.0'),
(35, 1005, 'Withdraw', '5.0'),
(36, 1005, 'Withdraw', '4.0'),
(37, 1005, 'Deposit', '10.0');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `user_id` int(20) NOT NULL,
  `user_fname` varchar(50) NOT NULL,
  `user_lname` varchar(50) NOT NULL,
  `user_email` varchar(50) NOT NULL,
  `user_username` varchar(50) NOT NULL,
  `user_password` varchar(50) NOT NULL,
  `user_type` varchar(50) NOT NULL,
  `user_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`user_id`, `user_fname`, `user_lname`, `user_email`, `user_username`, `user_password`, `user_type`, `user_status`) VALUES
(1001, 'Bart', 'Juarez', 'bartoloms122@gmail.com', 'bartjay', 'gwapoko10', 'Admin', 'active'),
(1002, 'john', 'pacure', 'pacure@gmail.com', 'agaw122', '12345', 'admin', 'active'),
(1003, 'gwapo', 'sir', 'ashgda@gmail.com', 'gwapoko10', 'gwapo69', 'ADMIN', 'Pending'),
(1005, '1', '1', '1', '1', '73l8gRjwLftklgfdXT+MdiMEjJwGPVMsyVxe16iYpk8=', 'User', 'Active');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_transaction`
--
ALTER TABLE `tbl_transaction`
  ADD PRIMARY KEY (`t_id`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_transaction`
--
ALTER TABLE `tbl_transaction`
  MODIFY `t_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `user_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1006;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
