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
-- Database: `gbiblio`
--

-- --------------------------------------------------------

--
-- Table structure for table `adherant`
--

CREATE TABLE `adherant` (
  `CodeAdherant` int(11) NOT NULL,
  `NOM` char(20) NOT NULL,
  `PRENOM` char(20) NOT NULL,
  `ADRESSE` char(20) NOT NULL,
  `nbexemplaires` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `adherant`
--

INSERT INTO `adherant` (`CodeAdherant`, `NOM`, `PRENOM`, `ADRESSE`, `nbexemplaires`) VALUES
(1, 'dridi', 'hatem', 'ariana', 0),
(2, 'chercheri', 'riadh', 'nabeul', 3),
(3, 'Ouerchfani', 'Safa', 'marsa', 1),
(4, 'Jlassi', 'Maram', 'bizerte', 0),
(5, 'khlifi', 'rayen', 'hamam lif', 1),
(7, 'mohamed', 'ali', 'mahdia', 0);

-- --------------------------------------------------------

--
-- Table structure for table `auteur`
--

CREATE TABLE `auteur` (
  `CodeAuteur` int(11) NOT NULL,
  `NOM` char(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `auteur`
--

INSERT INTO `auteur` (`CodeAuteur`, `NOM`) VALUES
(113, 'Gustave Flaubert'),
(114, 'Marcel Pagnol'),
(115, 'Alain Fournier'),
(116, 'Margueterie Duras'),
(117, 'Vercors'),
(118, 'Jean Paul Sartre'),
(119, 'Molière'),
(120, 'Guy de Maupassant'),
(121, 'Henrie Barbusse'),
(122, 'Pierre Boule'),
(123, 'Rene Barjavel');

-- --------------------------------------------------------

--
-- Table structure for table `emprunter`
--

CREATE TABLE `emprunter` (
  `CODEEXEMPLAIRE` int(11) NOT NULL,
  `CodeAdherant` int(11) NOT NULL,
  `DATEEMPRUNTE` varchar(50) NOT NULL,
  `DATERETOUR` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `emprunter`
--

INSERT INTO `emprunter` (`CODEEXEMPLAIRE`, `CodeAdherant`, `DATEEMPRUNTE`, `DATERETOUR`) VALUES
(59, 2, 'Fri May 12 16:55:07 GMT 2023', 'Fri May 05 16:55:05 GMT 2023'),
(76, 3, 'Wed May 24 16:53:22 GMT 2023', 'Fri May 12 16:53:20 GMT 2023'),
(106, 5, 'Thu May 11 20:51:01 GMT 2023', 'Wed May 03 20:50:59 GMT 2023'),
(108, 2, 'Wed May 17 00:00:00 GMT 2023', 'Wed May 03 20:51:31 GMT 2023'),
(117, 2, 'Wed May 17 00:00:00 GMT 2023', 'Wed May 03 20:51:31 GMT 2023');

-- --------------------------------------------------------

--
-- Table structure for table `exemplaire`
--

CREATE TABLE `exemplaire` (
  `CodeExemplaire` int(11) NOT NULL,
  `ISBN` varchar(50) NOT NULL,
  `Etat` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `exemplaire`
--

INSERT INTO `exemplaire` (`CodeExemplaire`, `ISBN`, `Etat`) VALUES
(59, 'A', 1),
(60, 'B', 0),
(61, 'C', 0),
(62, 'D', 0),
(63, 'E', 0),
(64, 'F', 0),
(65, 'G', 0),
(66, 'H', 0),
(67, 'I', 0),
(68, 'J', 0),
(70, 'L', 0),
(71, 'A', 0),
(72, 'A', 0),
(73, 'A', 0),
(74, 'A', 0),
(75, 'A', 0),
(76, 'A', 1),
(77, 'A', 0),
(78, 'B ', 0),
(79, 'B ', 0),
(80, 'B ', 0),
(81, 'B ', 0),
(82, 'B ', 0),
(83, 'B ', 0),
(84, 'B ', 0),
(85, 'D', 0),
(86, 'D', 0),
(87, 'D', 0),
(88, 'D', 0),
(89, 'G', 0),
(90, 'G', 0),
(91, 'G', 0),
(92, 'G', 0),
(93, 'G', 0),
(94, 'G', 0),
(95, 'G', 0),
(96, 'G', 0),
(97, 'G', 0),
(98, 'G', 0),
(99, 'G', 0),
(100, 'G', 0),
(101, 'G', 0),
(102, 'G', 0),
(103, 'G', 0),
(104, 'E', 0),
(105, 'E', 0),
(106, 'E', 1),
(107, 'E', 0),
(108, 'E', 1),
(109, 'E', 0),
(110, 'E', 0),
(114, 'B ', 0),
(115, 'B ', 0),
(116, 'B ', 0),
(117, 'F', 1),
(118, 'H', 0),
(119, 'H', 0),
(120, 'H', 0),
(121, 'H', 0),
(122, 'H', 0),
(123, 'E', 0),
(124, 'E', 0),
(125, 'E', 0),
(126, 'E', 0);

-- --------------------------------------------------------

--
-- Table structure for table `livre`
--

CREATE TABLE `livre` (
  `ISBN` varchar(50) NOT NULL,
  `CodeAuteur` int(11) NOT NULL,
  `TITRE` char(20) NOT NULL,
  `EDITION` char(20) NOT NULL,
  `NBPAGES` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `livre`
--

INSERT INTO `livre` (`ISBN`, `CodeAuteur`, `TITRE`, `EDITION`, `NBPAGES`) VALUES
('A', 113, 'Madame Bovary', 'Portugal', 150),
('B', 114, 'La gloire de mon pèr', 'Espagne', 50),
('C', 115, 'Le Grand Meaulnes', 'Algérie', 900),
('D', 116, 'L\'amant', 'Croatie', 1000),
('E', 117, 'La silence de la mér', 'USA', 200),
('F', 118, 'La gloire de mon per', 'Argentine', 50),
('G', 119, 'Huis Clos', 'Algérie', 150),
('H', 120, 'L\'ecole des femmes', 'Croatie', 500),
('I', 121, 'Le horla', 'USA', 100),
('J', 122, 'La planète', 'Portugal', 140);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `adherant`
--
ALTER TABLE `adherant`
  ADD PRIMARY KEY (`CodeAdherant`);

--
-- Indexes for table `auteur`
--
ALTER TABLE `auteur`
  ADD PRIMARY KEY (`CodeAuteur`);

--
-- Indexes for table `emprunter`
--
ALTER TABLE `emprunter`
  ADD PRIMARY KEY (`CODEEXEMPLAIRE`,`CodeAdherant`);

--
-- Indexes for table `exemplaire`
--
ALTER TABLE `exemplaire`
  ADD PRIMARY KEY (`CodeExemplaire`);

--
-- Indexes for table `livre`
--
ALTER TABLE `livre`
  ADD PRIMARY KEY (`ISBN`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `adherant`
--
ALTER TABLE `adherant`
  MODIFY `CodeAdherant` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `auteur`
--
ALTER TABLE `auteur`
  MODIFY `CodeAuteur` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=124;

--
-- AUTO_INCREMENT for table `exemplaire`
--
ALTER TABLE `exemplaire`
  MODIFY `CodeExemplaire` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=127;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
