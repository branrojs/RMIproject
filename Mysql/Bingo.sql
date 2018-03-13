-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: bingo
-- ------------------------------------------------------
-- Server version	5.7.14-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `carton_bingo`
--

DROP TABLE IF EXISTS `carton_bingo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `carton_bingo` (
  `idcarton_bingo` int(11) NOT NULL AUTO_INCREMENT,
  `id_jugador` int(11) NOT NULL,
  `carton` varchar(45) NOT NULL,
  PRIMARY KEY (`idcarton_bingo`,`id_jugador`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Bingo papers for nabsters';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carton_bingo`
--

LOCK TABLES `carton_bingo` WRITE;
/*!40000 ALTER TABLE `carton_bingo` DISABLE KEYS */;
/*!40000 ALTER TABLE `carton_bingo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `partidas`
--

DROP TABLE IF EXISTS `partidas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `partidas` (
  `idPartidas` int(11) NOT NULL AUTO_INCREMENT,
  `IdUsuario` int(11) NOT NULL,
  `idCarton` int(11) NOT NULL,
  `Tipo de Juego` varchar(45) NOT NULL,
  `estado` varchar(45) NOT NULL,
  PRIMARY KEY (`idPartidas`,`idCarton`,`IdUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `partidas`
--

LOCK TABLES `partidas` WRITE;
/*!40000 ALTER TABLE `partidas` DISABLE KEYS */;
/*!40000 ALTER TABLE `partidas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios_bingo`
--

DROP TABLE IF EXISTS `usuarios_bingo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuarios_bingo` (
  `idUsuario` int(11) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Apellidos` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Contraseña` longtext NOT NULL,
  PRIMARY KEY (`idUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios_bingo`
--

LOCK TABLES `usuarios_bingo` WRITE;
/*!40000 ALTER TABLE `usuarios_bingo` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuarios_bingo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'bingo'
--

--
-- Dumping routines for database 'bingo'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-04-26 16:17:04
