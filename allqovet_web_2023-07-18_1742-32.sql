-- MySQL dump 10.13  Distrib 5.7.23, for Win32 (AMD64)
--
-- Host: localhost    Database: allqvet
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.22-MariaDB

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
-- Table structure for table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `categoria` (
  `categoria_id` int(11) NOT NULL AUTO_INCREMENT,
  `categoria_categoriaid` int(11) DEFAULT NULL,
  `categoria_nombre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`categoria_id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria`
--

LOCK TABLES `categoria` WRITE;
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` VALUES (1,NULL,'Alfajorcitos Unid'),(2,NULL,'Alfajore En Copa'),(3,NULL,'Alfajores Caja Chica'),(4,NULL,'Alfajores Caja Del Mes'),(5,NULL,'Alfajores Caja Grande'),(6,NULL,'Alfajores Caja Loncherita'),(7,NULL,'Alfajores Coctel'),(8,NULL,'Alfajores Familiares'),(9,NULL,'Alfajores Personales'),(10,NULL,'Bebidas Calientes'),(11,NULL,'Bebidas Frías'),(12,NULL,'Berries del peru'),(13,NULL,'Bocaditos Postres'),(14,NULL,'Bocaditos Postres Coctel unida'),(15,NULL,'Bocaditos Salados'),(16,NULL,'Bolsas Reutilizables'),(17,NULL,'Combos'),(18,NULL,'Empanadas'),(19,NULL,'Manjar Blanco'),(20,NULL,'Para Armar en Casa - Alfa Pack'),(21,NULL,'Para Armar en Casa - Dulce Pac'),(22,NULL,'Postres Familiares'),(23,NULL,'Postres Personales'),(24,NULL,'Sándwiches Personales');
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `citas`
--

DROP TABLE IF EXISTS `citas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `citas` (
  `idcita` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) DEFAULT NULL,
  `correo` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `mensaje` varchar(200) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  PRIMARY KEY (`idcita`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `citas`
--

LOCK TABLES `citas` WRITE;
/*!40000 ALTER TABLE `citas` DISABLE KEYS */;
INSERT INTO `citas` VALUES (1,'Elias Alberto','rer','935185330','mensaje','2022-10-11'),(2,'Elias Alberto','wrew','935185330','mensaje','2022-10-11'),(3,'Elias Alberto','ertr','935185330','mensaje','2022-10-11'),(4,'estefano','egegege','45454545','khkjkhk','0000-00-00'),(5,'nathaly','nfsde@gmail.com','9656565','mensaje prueba','2022-05-11'),(6,'jeny','egegege','545454','prueba prueba','0000-00-00'),(7,'edy garcia','correo@mail.com','98989','mensaje','0000-00-00');
/*!40000 ALTER TABLE `citas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `idcliente` int(11) NOT NULL AUTO_INCREMENT,
  `dni` varchar(45) DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellidos` varchar(45) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `correo` varchar(45) DEFAULT NULL,
  `password` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`idcliente`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'2222222','estefano','seminario','piura','898989','correo@gmail.com','$2y$05$BrhT3awbi6hN.8Zi3nRdWuw9Fy0lhN4MAWEDhaY5mtAR/fUd9ewmO'),(3,'8888888','nataly','segura','tumbes','8787878','correo@gmail.com','$2y$05$BrhT3awbi6hN.8Zi3nRdWuw9Fy0lhN4MAWEDhaY5mtAR/fUd9ewmO'),(5,'11111111','elias','apellido prueba','fefe','8767887','correo@gmail.com','$2y$05$BrhT3awbi6hN.8Zi3nRdWuw9Fy0lhN4MAWEDhaY5mtAR/fUd9ewmO'),(6,'9999999','jose','reuyes','piura','45655','nfsde@gmail.com','$2y$05$KyVELVArRBDEqMb2OssrAeZwAfrlhs7fQf.C8eGUqqrI3dyezKcUy');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clientes` (
  `idcliente` int(11) NOT NULL AUTO_INCREMENT,
  `dni` varchar(45) DEFAULT NULL,
  `nombres` varchar(45) DEFAULT NULL,
  `Direccion` varchar(45) DEFAULT NULL,
  `correo` varchar(45) DEFAULT NULL,
  `passw` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idcliente`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES (1,'10653164','Garcia Zapata Carlos','Av. grau 565','garcias@gmail.com','123456');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `compra`
--

DROP TABLE IF EXISTS `compra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `compra` (
  `idcompra` int(11) NOT NULL AUTO_INCREMENT,
  `idcliente` int(11) DEFAULT NULL,
  `idpago` int(11) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `monto` decimal(10,2) DEFAULT NULL,
  `estado` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idcompra`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compra`
--

LOCK TABLES `compra` WRITE;
/*!40000 ALTER TABLE `compra` DISABLE KEYS */;
INSERT INTO `compra` VALUES (1,1,1,'2023-07-18',40.00,'pendiente'),(19,1,1,'2023-07-18',40.00,NULL),(20,1,1,'2023-07-18',85.00,NULL),(21,1,1,'2023-07-18',135.00,NULL),(22,1,1,'2023-07-18',135.00,NULL),(23,1,1,'2023-07-18',85.00,NULL),(24,1,1,'2023-07-18',135.00,NULL),(25,1,1,'2023-07-18',135.00,NULL),(26,1,1,'2023-07-18',135.00,NULL);
/*!40000 ALTER TABLE `compra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detallecompra`
--

DROP TABLE IF EXISTS `detallecompra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detallecompra` (
  `iddetallecompra` int(11) NOT NULL AUTO_INCREMENT,
  `idproducto` int(11) DEFAULT NULL,
  `idcompra` int(11) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `precio` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`iddetallecompra`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detallecompra`
--

LOCK TABLES `detallecompra` WRITE;
/*!40000 ALTER TABLE `detallecompra` DISABLE KEYS */;
INSERT INTO `detallecompra` VALUES (1,1,1,1,40.00),(2,2,1,1,45.00),(3,1,25,1,40.00),(4,2,25,1,45.00),(5,3,25,1,50.00),(6,1,26,1,40.00),(7,2,26,1,45.00),(8,3,26,1,50.00);
/*!40000 ALTER TABLE `detallecompra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pago`
--

DROP TABLE IF EXISTS `pago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pago` (
  `idpago` int(11) NOT NULL AUTO_INCREMENT,
  `monto` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`idpago`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pago`
--

LOCK TABLES `pago` WRITE;
/*!40000 ALTER TABLE `pago` DISABLE KEYS */;
INSERT INTO `pago` VALUES (1,175.00);
/*!40000 ALTER TABLE `pago` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedido`
--

DROP TABLE IF EXISTS `pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pedido` (
  `idpedido` int(11) NOT NULL AUTO_INCREMENT,
  `idproducto` int(11) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `precio` decimal(10,2) DEFAULT NULL,
  `fecha` datetime DEFAULT current_timestamp(),
  `idcliente` int(11) DEFAULT NULL,
  PRIMARY KEY (`idpedido`),
  KEY `idprod_idx` (`idproducto`),
  CONSTRAINT `idprod` FOREIGN KEY (`idproducto`) REFERENCES `productos` (`idproducto`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=70 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedido`
--

LOCK TABLES `pedido` WRITE;
/*!40000 ALTER TABLE `pedido` DISABLE KEYS */;
INSERT INTO `pedido` VALUES (42,1,1,40.00,'2022-12-12 11:36:27',1),(43,1,6,40.00,'2022-12-14 13:22:24',1),(44,2,2,45.00,'2022-12-14 13:22:24',3),(45,4,1,380.00,'2022-12-14 13:22:24',3),(46,3,1,50.00,'2022-12-14 13:22:24',3),(47,1,9,40.00,'2022-12-14 16:56:01',5),(48,2,3,45.00,'2022-12-14 16:56:01',5),(49,4,2,380.00,'2022-12-14 16:56:01',5),(56,1,9,40.00,'2022-12-14 18:15:40',5),(57,2,4,45.00,'2022-12-14 18:15:40',5),(58,4,2,380.00,'2022-12-14 18:15:40',5),(59,3,1,50.00,'2022-12-14 18:15:40',5),(60,1,9,40.00,'2022-12-14 18:16:23',5),(61,2,4,45.00,'2022-12-14 18:16:23',5),(62,4,2,380.00,'2022-12-14 18:16:23',5),(63,3,1,50.00,'2022-12-14 18:16:23',5),(64,5,1,45.00,'2022-12-14 18:49:29',5),(65,2,1,45.00,'2022-12-14 18:51:30',5),(66,1,1,40.00,'2022-12-14 18:52:30',5),(67,1,1,40.00,'2022-12-14 18:53:45',5),(68,1,1,40.00,'2022-12-14 19:01:28',5),(69,1,1,40.00,'2022-12-14 19:03:49',5);
/*!40000 ALTER TABLE `pedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `productos` (
  `idproducto` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) DEFAULT NULL,
  `precio` decimal(10,2) DEFAULT NULL,
  `descuento` decimal(10,2) DEFAULT NULL,
  `imagen` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`idproducto`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (1,'Ricocan adulto',40.00,8.00,'product-1.png'),(2,'Canbo cachorro',45.00,7.00,'product-2.png'),(3,'Canbo adulto',50.00,11.00,'product-3.png'),(4,'RicoCat adulto',380.00,20.00,'product-4.png'),(5,'Ricocan cachorro',45.00,9.00,'product-2.png'),(6,'Dog chow',111.00,8.00,'dogchow.jpg'),(7,'Pedigree adulto',42.00,9.00,'pedigree.jpg');
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) COLLATE latin1_spanish_ci NOT NULL,
  `password` varchar(100) CHARACTER SET latin1 NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (3,'jeny','$2y$05$02VfWyewcrRIHE/9zDjeIeiy2fJEoC7LLet41I.aB5dHzvfPUQG66'),(4,'estefano','$2y$05$rplEXUIbszBZFGcdfb3CPuP3zVbGtekFRqAP/G.bKB1/7d4Iq2B0C'),(5,'admin','12345');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'allqvet'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-18 17:42:33
