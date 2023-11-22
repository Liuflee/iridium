-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-11-2023 a las 16:28:29
-- Versión del servidor: 8.2.0
-- Versión de PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `iridium`
--
CREATE DATABASE IF NOT EXISTS `iridium` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE `iridium`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `propiedades`
--

CREATE TABLE `propiedades` (
  `cod_propiedad` int NOT NULL,
  `nombre_propiedad` varchar(50) DEFAULT NULL,
  `tipo` varchar(30) NOT NULL,
  `nro_habitaciones` int DEFAULT NULL,
  `precio` int DEFAULT NULL,
  `metros_cuadrados` int DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `rut_vendedor` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `propiedades`
--

INSERT INTO `propiedades` (`cod_propiedad`, `nombre_propiedad`, `tipo`, `nro_habitaciones`, `precio`, `metros_cuadrados`, `direccion`, `rut_vendedor`) VALUES
(24, 'AAA', 'Departamento', 332, 233, 233, '232', 34242323),
(29, 'aaaaa', 'Departamento', 3, 213423, 3, '34343AQASF', 212725323),
(30, 'AAA', 'Casa', 232, 33232, 34, 'AAAA', 343434123),
(31, 'AAAAA', 'Departamento', 342342, 32423, 23, '334343', 34234),
(32, '1231123', 'Casa', 21313212, 123132132, 123312132, '123312123', 123132);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vendedor`
--

CREATE TABLE `vendedor` (
  `rut` int NOT NULL,
  `nombre_vendedor` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `vendedor`
--

INSERT INTO `vendedor` (`rut`, `nombre_vendedor`) VALUES
(2, 'a'),
(232, 'a'),
(2323, 'AAA'),
(23232, 'AAA'),
(34234, 'aaaaaa'),
(123123, 'DEES'),
(123132, 'aaa'),
(222232, 'AAAAAAAA'),
(232312, 'a'),
(232323, 'AAA'),
(2232323, 'AAAAAAA'),
(2332423, 'AAAAAAAAAA'),
(2424212, 'aaaa'),
(3333333, 'YO'),
(23232323, 'aaaa'),
(23234212, 'AAA'),
(33232323, 'a'),
(34242323, 'AAA'),
(212725323, 'Anette'),
(343434123, 'AAAA');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `propiedades`
--
ALTER TABLE `propiedades`
  ADD PRIMARY KEY (`cod_propiedad`),
  ADD KEY `rut_vendedor` (`rut_vendedor`);

--
-- Indices de la tabla `vendedor`
--
ALTER TABLE `vendedor`
  ADD PRIMARY KEY (`rut`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `propiedades`
--
ALTER TABLE `propiedades`
  MODIFY `cod_propiedad` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `propiedades`
--
ALTER TABLE `propiedades`
  ADD CONSTRAINT `propiedades_ibfk_1` FOREIGN KEY (`rut_vendedor`) REFERENCES `vendedor` (`rut`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
