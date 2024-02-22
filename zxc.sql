CREATE DATABASE  IF NOT EXISTS `bolnicya` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `bolnicya`;
-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: bolnicya
-- ------------------------------------------------------
-- Server version	8.0.34

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
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `dgf_idx` (`user_id`),
  CONSTRAINT `dgf` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (1,1);
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chetnie_dni`
--

DROP TABLE IF EXISTS `chetnie_dni`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chetnie_dni` (
  `id` int NOT NULL,
  `pattern_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `vbnvcbvcvbccvb_idx` (`pattern_id`),
  CONSTRAINT `vbnvcbvcvbccvb` FOREIGN KEY (`pattern_id`) REFERENCES `pattern` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chetnie_dni`
--

LOCK TABLES `chetnie_dni` WRITE;
/*!40000 ALTER TABLE `chetnie_dni` DISABLE KEYS */;
/*!40000 ALTER TABLE `chetnie_dni` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `direction`
--

DROP TABLE IF EXISTS `direction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `direction` (
  `id` int NOT NULL AUTO_INCREMENT,
  `event_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `bcnvn_idx` (`event_id`),
  CONSTRAINT `bcnvn` FOREIGN KEY (`event_id`) REFERENCES `event` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `direction`
--

LOCK TABLES `direction` WRITE;
/*!40000 ALTER TABLE `direction` DISABLE KEYS */;
/*!40000 ALTER TABLE `direction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `diseases`
--

DROP TABLE IF EXISTS `diseases`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `diseases` (
  `id` int NOT NULL AUTO_INCREMENT,
  `diseases` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diseases`
--

LOCK TABLES `diseases` WRITE;
/*!40000 ALTER TABLE `diseases` DISABLE KEYS */;
/*!40000 ALTER TABLE `diseases` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `doctor`
--

DROP TABLE IF EXISTS `doctor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `doctor` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_id` int NOT NULL,
  `specialization_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `vnbc_idx` (`user_id`),
  KEY `jhggfbncvcbvc_idx` (`specialization_id`),
  CONSTRAINT `jhggfbncvcbvc` FOREIGN KEY (`specialization_id`) REFERENCES `specialization` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `vnbc` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctor`
--

LOCK TABLES `doctor` WRITE;
/*!40000 ALTER TABLE `doctor` DISABLE KEYS */;
INSERT INTO `doctor` VALUES (1,2,1);
/*!40000 ALTER TABLE `doctor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `doctor_reception`
--

DROP TABLE IF EXISTS `doctor_reception`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `doctor_reception` (
  `id` int NOT NULL AUTO_INCREMENT,
  `doctor_id` int NOT NULL,
  `reception_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `jhghklkhjfg_idx` (`reception_id`),
  KEY `ghdfsdcxvvcxb_idx` (`doctor_id`),
  CONSTRAINT `ghdfsdcxvvcxb` FOREIGN KEY (`doctor_id`) REFERENCES `doctor` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `jhghklkhjfg` FOREIGN KEY (`reception_id`) REFERENCES `reception` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctor_reception`
--

LOCK TABLES `doctor_reception` WRITE;
/*!40000 ALTER TABLE `doctor_reception` DISABLE KEYS */;
/*!40000 ALTER TABLE `doctor_reception` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `event`
--

DROP TABLE IF EXISTS `event`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `event` (
  `id` int NOT NULL,
  `title` varchar(100) DEFAULT NULL,
  `doctor_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `m,jhfg_idx` (`doctor_id`),
  CONSTRAINT `m,jhfg` FOREIGN KEY (`doctor_id`) REFERENCES `doctor` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `event`
--

LOCK TABLES `event` WRITE;
/*!40000 ALTER TABLE `event` DISABLE KEYS */;
/*!40000 ALTER TABLE `event` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `extract`
--

DROP TABLE IF EXISTS `extract`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `extract` (
  `id` int NOT NULL AUTO_INCREMENT,
  `patient_id` int NOT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `ghdfg_idx` (`patient_id`),
  CONSTRAINT `ghdfg` FOREIGN KEY (`patient_id`) REFERENCES `patient` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `extract`
--

LOCK TABLES `extract` WRITE;
/*!40000 ALTER TABLE `extract` DISABLE KEYS */;
/*!40000 ALTER TABLE `extract` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medcard`
--

DROP TABLE IF EXISTS `medcard`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medcard` (
  `id` int NOT NULL AUTO_INCREMENT,
  `number` int DEFAULT NULL,
  `date_of_creation` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medcard`
--

LOCK TABLES `medcard` WRITE;
/*!40000 ALTER TABLE `medcard` DISABLE KEYS */;
/*!40000 ALTER TABLE `medcard` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medcard_direction`
--

DROP TABLE IF EXISTS `medcard_direction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medcard_direction` (
  `id` int NOT NULL AUTO_INCREMENT,
  `medcard_id` int NOT NULL,
  `direction_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `jgfdss_idx` (`medcard_id`),
  KEY `ghfgddssa_idx` (`direction_id`),
  CONSTRAINT `ghfgddssa` FOREIGN KEY (`direction_id`) REFERENCES `direction` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `jgfdss` FOREIGN KEY (`medcard_id`) REFERENCES `medcard` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medcard_direction`
--

LOCK TABLES `medcard_direction` WRITE;
/*!40000 ALTER TABLE `medcard_direction` DISABLE KEYS */;
/*!40000 ALTER TABLE `medcard_direction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medcard_diseases`
--

DROP TABLE IF EXISTS `medcard_diseases`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medcard_diseases` (
  `id` int NOT NULL AUTO_INCREMENT,
  `medcard_id` int NOT NULL,
  `diseases_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `bmnbvbbvnc_idx` (`medcard_id`),
  KEY `fghdfgd_idx` (`diseases_id`),
  CONSTRAINT `bmnbvbbvnc` FOREIGN KEY (`medcard_id`) REFERENCES `medcard` (`id`),
  CONSTRAINT `fghdfgd` FOREIGN KEY (`diseases_id`) REFERENCES `diseases` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medcard_diseases`
--

LOCK TABLES `medcard_diseases` WRITE;
/*!40000 ALTER TABLE `medcard_diseases` DISABLE KEYS */;
/*!40000 ALTER TABLE `medcard_diseases` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ne_chetnie_dni`
--

DROP TABLE IF EXISTS `ne_chetnie_dni`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ne_chetnie_dni` (
  `id` int NOT NULL AUTO_INCREMENT,
  `pattern_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ghjhkgghjgfhfghgf_idx` (`pattern_id`),
  CONSTRAINT `ghjhkgghjgfhfghgf` FOREIGN KEY (`pattern_id`) REFERENCES `pattern` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ne_chetnie_dni`
--

LOCK TABLES `ne_chetnie_dni` WRITE;
/*!40000 ALTER TABLE `ne_chetnie_dni` DISABLE KEYS */;
/*!40000 ALTER TABLE `ne_chetnie_dni` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patient` (
  `id` int NOT NULL AUTO_INCREMENT,
  `surname` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `patronymic` varchar(45) DEFAULT NULL,
  `date_of_birth` date DEFAULT NULL,
  `contact_number` varchar(45) DEFAULT NULL,
  `phone_number` varchar(45) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `pass_num` int DEFAULT NULL,
  `pass_ser` int DEFAULT NULL,
  `medcard_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `jhgmbn_idx` (`medcard_id`),
  CONSTRAINT `jhgmbn` FOREIGN KEY (`medcard_id`) REFERENCES `medcard` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient`
--

LOCK TABLES `patient` WRITE;
/*!40000 ALTER TABLE `patient` DISABLE KEYS */;
/*!40000 ALTER TABLE `patient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pattern`
--

DROP TABLE IF EXISTS `pattern`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pattern` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pattern`
--

LOCK TABLES `pattern` WRITE;
/*!40000 ALTER TABLE `pattern` DISABLE KEYS */;
/*!40000 ALTER TABLE `pattern` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pervii_den`
--

DROP TABLE IF EXISTS `pervii_den`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pervii_den` (
  `id` int NOT NULL AUTO_INCREMENT,
  `pattern_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `gjhghjfgfhfghgfh_idx` (`pattern_id`),
  CONSTRAINT `gjhghjfgfhfghgfh` FOREIGN KEY (`pattern_id`) REFERENCES `pattern` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pervii_den`
--

LOCK TABLES `pervii_den` WRITE;
/*!40000 ALTER TABLE `pervii_den` DISABLE KEYS */;
/*!40000 ALTER TABLE `pervii_den` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `poslednii_den`
--

DROP TABLE IF EXISTS `poslednii_den`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `poslednii_den` (
  `id` int NOT NULL AUTO_INCREMENT,
  `pattern_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `jhkjhkjkh_idx` (`pattern_id`),
  CONSTRAINT `jhkjhkjkh` FOREIGN KEY (`pattern_id`) REFERENCES `pattern` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `poslednii_den`
--

LOCK TABLES `poslednii_den` WRITE;
/*!40000 ALTER TABLE `poslednii_den` DISABLE KEYS */;
/*!40000 ALTER TABLE `poslednii_den` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reception`
--

DROP TABLE IF EXISTS `reception`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reception` (
  `id` int NOT NULL AUTO_INCREMENT,
  `patient_id` int NOT NULL,
  `receptioncol` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `dgfgdfdfdfgnbvc_idx` (`patient_id`),
  CONSTRAINT `dgfgdfdfdfgnbvc` FOREIGN KEY (`patient_id`) REFERENCES `patient` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reception`
--

LOCK TABLES `reception` WRITE;
/*!40000 ALTER TABLE `reception` DISABLE KEYS */;
/*!40000 ALTER TABLE `reception` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reference`
--

DROP TABLE IF EXISTS `reference`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reference` (
  `id` int NOT NULL AUTO_INCREMENT,
  `patient_id` int NOT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fhjfhgjfsdf_idx` (`patient_id`),
  CONSTRAINT `fhjfhgjfsdf` FOREIGN KEY (`patient_id`) REFERENCES `patient` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reference`
--

LOCK TABLES `reference` WRITE;
/*!40000 ALTER TABLE `reference` DISABLE KEYS */;
/*!40000 ALTER TABLE `reference` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registar`
--

DROP TABLE IF EXISTS `registar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `registar` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `xbcvbx_idx` (`user_id`),
  CONSTRAINT `xbcvbx` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registar`
--

LOCK TABLES `registar` WRITE;
/*!40000 ALTER TABLE `registar` DISABLE KEYS */;
INSERT INTO `registar` VALUES (1,3);
/*!40000 ALTER TABLE `registar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `schedule`
--

DROP TABLE IF EXISTS `schedule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `schedule` (
  `id` int NOT NULL AUTO_INCREMENT,
  `mounth` varchar(45) DEFAULT NULL,
  `year` int DEFAULT NULL,
  `time` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `schedule`
--

LOCK TABLES `schedule` WRITE;
/*!40000 ALTER TABLE `schedule` DISABLE KEYS */;
/*!40000 ALTER TABLE `schedule` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `schedule_pattern`
--

DROP TABLE IF EXISTS `schedule_pattern`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `schedule_pattern` (
  `id` int NOT NULL AUTO_INCREMENT,
  `schedule_id` int NOT NULL,
  `pattern_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `,kjhgmnbgcx_idx` (`schedule_id`),
  KEY `kljhkgfddssdsdss232_idx` (`pattern_id`),
  CONSTRAINT `,kjhgmnbgcx` FOREIGN KEY (`schedule_id`) REFERENCES `schedule` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `kljhkgfddssdsdss232` FOREIGN KEY (`pattern_id`) REFERENCES `pattern` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `schedule_pattern`
--

LOCK TABLES `schedule_pattern` WRITE;
/*!40000 ALTER TABLE `schedule_pattern` DISABLE KEYS */;
/*!40000 ALTER TABLE `schedule_pattern` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `schedule_reception`
--

DROP TABLE IF EXISTS `schedule_reception`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `schedule_reception` (
  `id` int NOT NULL AUTO_INCREMENT,
  `schedule_id` int NOT NULL,
  `reception_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `;lkjhgfdscxvbn_idx` (`schedule_id`),
  KEY `fghdfgsdfxcvcxvcv_idx` (`reception_id`),
  CONSTRAINT `;lkjhgfdscxvbn` FOREIGN KEY (`schedule_id`) REFERENCES `schedule` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fghdfgsdfxcvcxvcv` FOREIGN KEY (`reception_id`) REFERENCES `reception` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `schedule_reception`
--

LOCK TABLES `schedule_reception` WRITE;
/*!40000 ALTER TABLE `schedule_reception` DISABLE KEYS */;
/*!40000 ALTER TABLE `schedule_reception` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `specialization`
--

DROP TABLE IF EXISTS `specialization`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `specialization` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(55) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `specialization`
--

LOCK TABLES `specialization` WRITE;
/*!40000 ALTER TABLE `specialization` DISABLE KEYS */;
INSERT INTO `specialization` VALUES (1,'глав. врач');
/*!40000 ALTER TABLE `specialization` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `surname` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `patronymic` varchar(45) DEFAULT NULL,
  `date_of_birth` date DEFAULT NULL,
  `phone_number` varchar(45) DEFAULT NULL,
  `login` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'Сюкосев','Юрий','Вениаминович','1991-01-20','+7 (930) 676-51-65','kakin','kakiik'),(2,'Лисова','Василиса','Антоновна','1980-01-03','+7 (995) 921-95-28','zxc','qwe'),(3,'Староверов','Филипп','Ефимович','1978-12-20','+7 (924) 550-40-96','bbv','xssz');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-15 10:22:15
