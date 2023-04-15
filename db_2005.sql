/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50740
Source Host           : localhost:3306
Source Database       : db_2005

Target Server Type    : MYSQL
Target Server Version : 50740
File Encoding         : 65001

Date: 2023-04-14 14:32:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_course
-- ----------------------------
DROP TABLE IF EXISTS `tb_course`;
CREATE TABLE `tb_course` (
  `course_id` int(11) NOT NULL AUTO_INCREMENT,
  `course_name` varchar(50) NOT NULL,
  `course_score` float NOT NULL,
  `course_xs` int(11) NOT NULL,
  `course_cap` int(11) NOT NULL,
  `course_desc` varchar(200) DEFAULT NULL,
  `course_tid` char(5) NOT NULL,
  PRIMARY KEY (`course_id`),
  KEY `FK1` (`course_tid`),
  CONSTRAINT `FK1` FOREIGN KEY (`course_tid`) REFERENCES `tb_teacher` (`teacher_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_grade
-- ----------------------------
DROP TABLE IF EXISTS `tb_grade`;
CREATE TABLE `tb_grade` (
  `snum` char(10) NOT NULL,
  `cid` int(11) NOT NULL,
  `grade` float NOT NULL,
  PRIMARY KEY (`snum`,`cid`),
  KEY `FK3` (`cid`),
  CONSTRAINT `FK2` FOREIGN KEY (`snum`) REFERENCES `tb_student` (`stu_num`),
  CONSTRAINT `FK3` FOREIGN KEY (`cid`) REFERENCES `tb_course` (`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_manager
-- ----------------------------
DROP TABLE IF EXISTS `tb_manager`;
CREATE TABLE `tb_manager` (
  `manager_id` char(4) NOT NULL,
  `manager_login_pwd` varchar(32) NOT NULL,
  `manager_name` varchar(20) NOT NULL,
  `manager_gender` char(2) NOT NULL,
  `manager_tel` char(11) NOT NULL,
  `manager_desc` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`manager_id`),
  UNIQUE KEY `manager_tel` (`manager_tel`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_student
-- ----------------------------
DROP TABLE IF EXISTS `tb_student`;
CREATE TABLE `tb_student` (
  `stu_num` char(10) NOT NULL,
  `stu_login_pwd` varchar(32) NOT NULL,
  `stu_name` varchar(20) NOT NULL,
  `stu_gender` char(2) NOT NULL,
  `stu_age` int(11) NOT NULL,
  `stu_tel` char(11) NOT NULL,
  `stu_addr` varchar(100) NOT NULL,
  PRIMARY KEY (`stu_num`),
  UNIQUE KEY `stu_tel` (`stu_tel`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_teacher
-- ----------------------------
DROP TABLE IF EXISTS `tb_teacher`;
CREATE TABLE `tb_teacher` (
  `teacher_id` char(5) NOT NULL,
  `teacher_login_pwd` varchar(32) NOT NULL,
  `teacher_name` varchar(20) NOT NULL,
  `teacher_gender` char(2) NOT NULL,
  `teacher_tel` char(11) NOT NULL,
  `teacher_level` varchar(10) NOT NULL,
  `teacher_remark` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`teacher_id`),
  UNIQUE KEY `teacher_tel` (`teacher_tel`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
