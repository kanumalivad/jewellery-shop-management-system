-- MySQL dump 10.13  Distrib 5.7.26, for Linux (x86_64)
--
-- Host: localhost    Database: dj
-- ------------------------------------------------------
-- Server version	5.7.26-0ubuntu0.18.04.1

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
-- Table structure for table `BalanceSheet`
--

DROP TABLE IF EXISTS `BalanceSheet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `BalanceSheet` (
  `Date` varchar(20) DEFAULT NULL,
  `Status` varchar(10) DEFAULT NULL,
  `Description` varchar(100) DEFAULT NULL,
  `RS` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `BalanceSheet`
--

LOCK TABLES `BalanceSheet` WRITE;
/*!40000 ALTER TABLE `BalanceSheet` DISABLE KEYS */;
/*!40000 ALTER TABLE `BalanceSheet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Customer_Account`
--

DROP TABLE IF EXISTS `Customer_Account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Customer_Account` (
  `Customer_id` varchar(10) DEFAULT NULL,
  `Label` varchar(20) DEFAULT NULL,
  `dt` varchar(20) DEFAULT NULL,
  `Total` double DEFAULT NULL,
  `Rate` double DEFAULT NULL,
  `Labour` double DEFAULT NULL,
  `Tax` double DEFAULT NULL,
  `Grand_total` double DEFAULT NULL,
  `Credit` double DEFAULT NULL,
  `Kasar` double DEFAULT NULL,
  `Receivable` double DEFAULT NULL,
  `Bill_no` double DEFAULT NULL,
  `n` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Customer_Account`
--

LOCK TABLES `Customer_Account` WRITE;
/*!40000 ALTER TABLE `Customer_Account` DISABLE KEYS */;
INSERT INTO `Customer_Account` VALUES ('CST001','CHN001','03/10/2016',25000,30000,320,500,30000,10,20,20,1,'this is note'),('CST001','CHN001','25/05/2019',0,0,0,0,0,10,10,-20,3,'dsds'),('CST001','CHN001','25/05/2019',0,0,0,0,0,10,10,-20,3,'dsds'),('CST003','CHN001','25/05/2019',0,0,0,0,0,40,50,-90,3,'40'),('CST003','CHN001','25/05/2019',0,0,0,0,0,500,500,-1000,3,'500'),('CST003','CHN001','25/05/2019',0,0,0,0,0,50,50,-100,3,'55');
/*!40000 ALTER TABLE `Customer_Account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Customers_Details`
--

DROP TABLE IF EXISTS `Customers_Details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Customers_Details` (
  `Customer_id` varchar(20) DEFAULT NULL,
  `Name` varchar(30) DEFAULT NULL,
  `City` varchar(20) DEFAULT NULL,
  `dt` varchar(20) DEFAULT NULL,
  `Mobile_no` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Customers_Details`
--

LOCK TABLES `Customers_Details` WRITE;
/*!40000 ALTER TABLE `Customers_Details` DISABLE KEYS */;
INSERT INTO `Customers_Details` VALUES ('CST001','Kanu Malivad','Junagadh','18/09/2016','9638277892'),('CST002','Jemish ','Junagadh','25/05/2019','123'),('CST003','Ankit','Surat','25/05/2019','123456789');
/*!40000 ALTER TABLE `Customers_Details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Orders`
--

DROP TABLE IF EXISTS `Orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Orders` (
  `Order_id` varchar(20) DEFAULT NULL,
  `Item_name` varchar(30) DEFAULT NULL,
  `Price` double DEFAULT NULL,
  `Customer_name` varchar(30) DEFAULT NULL,
  `Issue_date` varchar(20) DEFAULT NULL,
  `Delievery_date` varchar(20) DEFAULT NULL,
  `Status` varchar(20) DEFAULT NULL,
  `Expected_weight` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Orders`
--

LOCK TABLES `Orders` WRITE;
/*!40000 ALTER TABLE `Orders` DISABLE KEYS */;
INSERT INTO `Orders` VALUES ('ORD002','Gold Ring',3200,'Kanu Malivad','25/10/2019','24/09/2016','Complete',3.2);
/*!40000 ALTER TABLE `Orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Password`
--

DROP TABLE IF EXISTS `Password`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Password` (
  `password` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Password`
--

LOCK TABLES `Password` WRITE;
/*!40000 ALTER TABLE `Password` DISABLE KEYS */;
INSERT INTO `Password` VALUES ('kanu');
/*!40000 ALTER TABLE `Password` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Product_List`
--

DROP TABLE IF EXISTS `Product_List`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Product_List` (
  `Label` varchar(10) DEFAULT NULL,
  `Item_name` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Product_List`
--

LOCK TABLES `Product_List` WRITE;
/*!40000 ALTER TABLE `Product_List` DISABLE KEYS */;
INSERT INTO `Product_List` VALUES ('CHN','Gold Ladies Chain');
/*!40000 ALTER TABLE `Product_List` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Products`
--

DROP TABLE IF EXISTS `Products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Products` (
  `No` int(11) NOT NULL,
  `Label` varchar(20) DEFAULT NULL,
  `Type` varchar(20) DEFAULT NULL,
  `Pieces` int(11) DEFAULT NULL,
  `Size` double DEFAULT NULL,
  `Gr_weight` double DEFAULT NULL,
  `Difference` double DEFAULT NULL,
  `Net_weight` double DEFAULT NULL,
  `Description` varchar(100) DEFAULT NULL,
  `dt` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`No`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Products`
--

LOCK TABLES `Products` WRITE;
/*!40000 ALTER TABLE `Products` DISABLE KEYS */;
INSERT INTO `Products` VALUES (1,'CHN001','Gold Ladies Chain',1,15,3.4,3.4,NULL,'designer','18/09/2016');
/*!40000 ALTER TABLE `Products` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-26  1:02:01
