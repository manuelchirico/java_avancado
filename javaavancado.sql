-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 17, 2023 at 10:59 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `javaavancado`
--

-- --------------------------------------------------------

--
-- Table structure for table `entregalivro`
--

CREATE TABLE `entregalivro` (
  `id_livro` varchar(11) NOT NULL,
  `id_estudante` varchar(22) NOT NULL,
  `dataentrega` varchar(50) NOT NULL,
  `datadevolucao` varchar(14) NOT NULL,
  `livrodevolvido` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `entregalivro`
--

INSERT INTO `entregalivro` (`id_livro`, `id_estudante`, `dataentrega`, `datadevolucao`, `livrodevolvido`) VALUES
('00.0000', '04.0713.2021', '76-03-2023', '83-03-2023', 'Nao'),
('00.0001', '04.0713.2021', '18-29-2023', '25-29-2023', 'sim'),
('00.0001', '04.0713.2021', '18-03-2023', '21-03-2023', 'sim'),
('11.1111', '04.0713.2021', '22-03-2023', '24-03-2023', 'sim');

-- --------------------------------------------------------

--
-- Table structure for table `estudante`
--

CREATE TABLE `estudante` (
  `id_estudante` varchar(13) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `apelido` varchar(50) NOT NULL,
  `bi` varchar(14) NOT NULL,
  `faculdade` varchar(60) NOT NULL,
  `curso` varchar(60) NOT NULL,
  `ano` int(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `estudante`
--

INSERT INTO `estudante` (`id_estudante`, `nome`, `apelido`, `bi`, `faculdade`, `curso`, `ano`) VALUES
('01.0000.0000', 'edson', 'sique', '776667776f', 'FCS', 'lic. Ensino de Filosofia', 2),
('01.0001.0001', 'hemidio', 'chirico', '99888988f', 'FCT', 'Lic. Geologia', 2),
('01.0101.0011', 'heldel', 'chirico', '08889988f', 'F Ec.Ge', 'lic. GE. Empresas', 2),
('04.0713.2021', 'Manuel', 'chirico', '070220002f', 'FCT', 'Lic. Informática', 3),
('93.8484.8488', 'chirico', 'manuel', '988773dfh', 'FCT', 'Lic. Eng. de Construção Civil', 2),
('gnggg', 'hbghm', 'bmbmb', 'ggngn', 'FCT', 'Lic. Geologia', 2);

-- --------------------------------------------------------

--
-- Table structure for table `livro`
--

CREATE TABLE `livro` (
  `id_livro` varchar(11) NOT NULL,
  `Titulo` varchar(50) NOT NULL,
  `Autor` varchar(50) NOT NULL,
  `Ano` int(6) NOT NULL,
  `Editora` varchar(20) NOT NULL,
  `volume` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `livro`
--

INSERT INTO `livro` (`id_livro`, `Titulo`, `Autor`, `Ano`, `Editora`, `volume`) VALUES
('00.0000', 'aprende a ler', 'chirico', 2023, 'ENM', 1),
('00.0001', 'saude mental', 'hemidio', 2022, 'Fundzane', 1),
('02.2023', 'logica de programacao', 'chirico', 2001, 'Longman', 1),
('11.1111', 'java', 'hemidio', 2021, 'Longman', 2);

-- --------------------------------------------------------

--
-- Table structure for table `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `senha` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `usuario`
--

INSERT INTO `usuario` (`id`, `nome`, `senha`) VALUES
(1, 'chirico', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `estudante`
--
ALTER TABLE `estudante`
  ADD PRIMARY KEY (`id_estudante`);

--
-- Indexes for table `livro`
--
ALTER TABLE `livro`
  ADD PRIMARY KEY (`id_livro`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
