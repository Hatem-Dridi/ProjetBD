-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 25, 2023 at 11:23 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `maisonedition`
--

-- --------------------------------------------------------

--
-- Table structure for table `maisonedition`
--

CREATE TABLE `maisonedition` (
  `isbn` varchar(20) NOT NULL,
  `titre` varchar(50) NOT NULL,
  `edition` varchar(50) NOT NULL,
  `nbpages` int(11) NOT NULL,
  `Auteur` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `maisonedition`
--

INSERT INTO `maisonedition` (`isbn`, `titre`, `edition`, `nbpages`, `Auteur`) VALUES
('A', 'Madame Bovary', 'Portugal', 150, 'Gustave Flaubert'),
('B ', 'la gloire de pere', 'Espagne', 50, 'Marcel Pagnol'),
('C', 'Le Grand Mealnes', 'Algérie', 900, 'Alain Fournier'),
('D', 'L\'amant', 'Croatie', 1000, 'Marguerite Duras'),
('E', 'Le silence de mère', 'USA', 200, 'Vercors'),
('F', 'La gloire de pere', 'Argentine', 50, 'Marcel Pagnol'),
('G', 'Huis Clos', 'Algérie', 150, 'Jeam Paul Sartre'),
('H', 'L\'ecole', 'Croatie', 1000, 'Moliére'),
('I', 'Le Horla', 'USA', 100, 'Guy de Maupassant'),
('', '', '', 0, ''),
('A', 'Madame Bovary', 'Portugal', 150, 'Gustave Flaubert'),
('B ', 'la gloire de pere', 'Espagne', 50, 'Marcel Pagnol'),
('C', 'Le Grand Mealnes', 'Algérie', 900, 'Alain Fournier'),
('D', 'L\'amant', 'Croatie', 1000, 'Marguerite Duras'),
('E', 'Le silence de mère', 'USA', 200, 'Vercors'),
('F', 'La gloire de pere', 'Argentine', 50, 'Marcel Pagnol'),
('G', 'Huis Clos', 'Algérie', 150, 'Jeam Paul Sartre'),
('H', 'L\'ecole', 'Croatie', 100, 'Moliére'),
('I', 'Le Horla', 'USA', 100, 'Guy de Maupassant'),
('', '', '', 0, ''),
('J', 'La planéte', 'Portugal', 100, 'Pierre Boule'),
('K', 'Le feu', 'Espagne', 100, 'Henrie Barbusse');

-- --------------------------------------------------------

--
-- Table structure for table `maisonedition2`
--

CREATE TABLE `maisonedition2` (
  `isbn` varchar(50) NOT NULL,
  `titre` varchar(50) NOT NULL,
  `edition` varchar(50) NOT NULL,
  `nbpages` int(11) NOT NULL,
  `Auteur` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
