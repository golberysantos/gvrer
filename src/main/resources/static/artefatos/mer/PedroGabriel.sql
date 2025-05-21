-- MySQL dump 10.13  Distrib 9.2.0, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: gvrer
-- ------------------------------------------------------
-- Server version	9.2.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `categoriaitemrestaurante`
--

DROP TABLE IF EXISTS `categoriaitemrestaurante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categoriaitemrestaurante` (
  `categoriaitemid` int NOT NULL AUTO_INCREMENT,
  `nomecategoriaitem` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`categoriaitemid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COMMENT='representa:  sobremesa, bebidas... ';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `itemrestaurante`
--

DROP TABLE IF EXISTS `itemrestaurante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `itemrestaurante` (
  `itemrestauranteid` int NOT NULL AUTO_INCREMENT,
  `nomeitem` varchar(80) NOT NULL,
  `ingredientes` varchar(200) DEFAULT NULL,
  `descricao` varchar(200) DEFAULT NULL,
  `valor` float DEFAULT NULL,
  `imagemitem` varchar(200) DEFAULT NULL,
  `origemitemrestaurante_origemrestauranteid` int NOT NULL,
  `especialidadedoitem_nomeespecialidadedoitem` int NOT NULL,
  `categoriaitemrestaurante_categoriaitemid` int NOT NULL,
  PRIMARY KEY (`itemrestauranteid`),
  KEY `fk_itemrestaurante_origemitemrestaurante1_idx` (`origemitemrestaurante_origemrestauranteid`),
  KEY `fk_itemrestaurante_especialidadedoitem1_idx` (`especialidadedoitem_nomeespecialidadedoitem`),
  KEY `fk_itemrestaurante_categoriaitemrestaurante1_idx` (`categoriaitemrestaurante_categoriaitemid`),
  CONSTRAINT `fk_itemrestaurante_categoriaitemrestaurante1` FOREIGN KEY (`categoriaitemrestaurante_categoriaitemid`) REFERENCES `categoriaitemrestaurante` (`categoriaitemid`),
  CONSTRAINT `fk_itemrestaurante_especialidadedoitem1` FOREIGN KEY (`especialidadedoitem_nomeespecialidadedoitem`) REFERENCES `especialidadedoitem` (`nomeespecialidadedoitem`),
  CONSTRAINT `fk_itemrestaurante_origemitemrestaurante1` FOREIGN KEY (`origemitemrestaurante_origemrestauranteid`) REFERENCES `origemitemrestaurante` (`origemrestauranteid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `reserva`
--

DROP TABLE IF EXISTS `reserva`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reserva` (
  `reservaid` int NOT NULL AUTO_INCREMENT,
  `datareserva` timestamp NULL DEFAULT NULL,
  `horarioreserva` time DEFAULT NULL,
  `mesa_mesaid` int NOT NULL,
  `horariodisponivel_horarioid` int NOT NULL,
  `usuario_usuarioid` int NOT NULL,
  PRIMARY KEY (`reservaid`),
  KEY `fk_reserva_mesa_idx` (`mesa_mesaid`),
  KEY `fk_reserva_horariodisponivel1_idx` (`horariodisponivel_horarioid`),
  KEY `fk_reserva_usuario1_idx` (`usuario_usuarioid`),
  CONSTRAINT `fk_reserva_horariodisponivel1` FOREIGN KEY (`horariodisponivel_horarioid`) REFERENCES `horariodisponivel` (`horarioid`),
  CONSTRAINT `fk_reserva_mesa` FOREIGN KEY (`mesa_mesaid`) REFERENCES `mesa` (`mesaid`),
  CONSTRAINT `fk_reserva_usuario1` FOREIGN KEY (`usuario_usuarioid`) REFERENCES `usuario` (`usuarioid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `reservaitem`
--

DROP TABLE IF EXISTS `reservaitem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reservaitem` (
  `reservaitemid` int NOT NULL AUTO_INCREMENT,
  `qntditemid` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `quantidade` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `observacoes` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `status` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `reserva_reservaid` int NOT NULL,
  `itemrestaurante_itemrestauranteid` int NOT NULL,
  PRIMARY KEY (`reservaitemid`),
  KEY `fk_reservaitem_reserva1_idx` (`reserva_reservaid`),
  KEY `fk_reservaitem_itemrestaurante1_idx` (`itemrestaurante_itemrestauranteid`),
  CONSTRAINT `fk_reservaitem_itemrestaurante1` FOREIGN KEY (`itemrestaurante_itemrestauranteid`) REFERENCES `itemrestaurante` (`itemrestauranteid`),
  CONSTRAINT `fk_reservaitem_reserva1` FOREIGN KEY (`reserva_reservaid`) REFERENCES `reserva` (`reservaid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `usuarioid` int NOT NULL AUTO_INCREMENT,
  `nickname` varchar(100) DEFAULT NULL,
  `senha` varchar(60) DEFAULT NULL,
  `pessoa_pessoaid` int NOT NULL,
  `statususuario_statususuarioid` int NOT NULL,
  PRIMARY KEY (`usuarioid`),
  KEY `fk_usuario_pessoa1_idx` (`pessoa_pessoaid`),
  KEY `fk_usuario_statususuario1_idx` (`statususuario_statususuarioid`),
  CONSTRAINT `fk_usuario_pessoa1` FOREIGN KEY (`pessoa_pessoaid`) REFERENCES `pessoa` (`pessoaid`),
  CONSTRAINT `fk_usuario_statususuario1` FOREIGN KEY (`statususuario_statususuarioid`) REFERENCES `statususuario` (`statususuarioid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-05-20 21:11:14
