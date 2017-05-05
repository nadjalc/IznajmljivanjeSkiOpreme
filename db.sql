/*
SQLyog Community v12.4.1 (64 bit)
MySQL - 5.7.14 : Database - iznajmljivanjeskiopreme
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`iznajmljivanjeskiopreme` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `iznajmljivanjeskiopreme`;

/*Table structure for table `parskija` */

DROP TABLE IF EXISTS `parskija`;

CREATE TABLE `parskija` (
  `ParSkijaID` int(10) NOT NULL AUTO_INCREMENT,
  `Duzina` int(20) DEFAULT NULL,
  `Radijus` double DEFAULT NULL,
  `Vezovi` varchar(20) CHARACTER SET latin1 DEFAULT NULL,
  `TipSkijaID` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  PRIMARY KEY (`ParSkijaID`),
  KEY `TipSkijaID` (`TipSkijaID`),
  CONSTRAINT `parskija_ibfk_1` FOREIGN KEY (`TipSkijaID`) REFERENCES `tipskija` (`TipSkijaID`) ON DELETE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=126 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `parskija` */

insert  into `parskija`(`ParSkijaID`,`Duzina`,`Radijus`,`Vezovi`,`TipSkijaID`) values 
(124,4,54,'sbgd','2'),
(125,43,54,'dgsf','1');

/*Table structure for table `tipskija` */

DROP TABLE IF EXISTS `tipskija`;

CREATE TABLE `tipskija` (
  `TipSkijaID` varchar(10) CHARACTER SET latin1 NOT NULL,
  `NazivTipa` varchar(20) CHARACTER SET latin1 NOT NULL,
  PRIMARY KEY (`TipSkijaID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `tipskija` */

insert  into `tipskija`(`TipSkijaID`,`NazivTipa`) values 
('1','Karving'),
('2','Slalom');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
