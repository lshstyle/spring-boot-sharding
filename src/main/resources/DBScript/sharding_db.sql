/*
Navicat MySQL Data Transfer

Source Server         : 172.18.4.143
Source Server Version : 50722
Source Host           : 172.18.4.143:3306
Source Database       : sharding_db

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2019-04-01 18:16:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_log_0`
-- ----------------------------
DROP TABLE IF EXISTS `t_log_0`;
CREATE TABLE `t_log_0` (
  `f_log_id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `f_log_content` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`f_log_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_log_0
-- ----------------------------
INSERT INTO `t_log_0` VALUES ('1', '登录');

-- ----------------------------
-- Table structure for `t_log_1`
-- ----------------------------
DROP TABLE IF EXISTS `t_log_1`;
CREATE TABLE `t_log_1` (
  `f_log_id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `f_log_content` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`f_log_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_log_1
-- ----------------------------
INSERT INTO `t_log_1` VALUES ('2', '查询');

-- ----------------------------
-- Table structure for `t_log_2`
-- ----------------------------
DROP TABLE IF EXISTS `t_log_2`;
CREATE TABLE `t_log_2` (
  `f_log_id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `f_log_content` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`f_log_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_log_2
-- ----------------------------
INSERT INTO `t_log_2` VALUES ('3', '删除');

-- ----------------------------
-- Table structure for `t_user_0`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_0`;
CREATE TABLE `t_user_0` (
  `f_user_id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `f_user_name` varchar(20) DEFAULT NULL,
  `f_age` int(2) DEFAULT NULL,
  `f_sex` varchar(1) DEFAULT NULL,
  `f_password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`f_user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user_0
-- ----------------------------
INSERT INTO `t_user_0` VALUES ('1', '用户1', '10', '1', 'abcd123456');

-- ----------------------------
-- Table structure for `t_user_1`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_1`;
CREATE TABLE `t_user_1` (
  `f_user_id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `f_user_name` varchar(20) DEFAULT NULL,
  `f_age` int(2) DEFAULT NULL,
  `f_sex` varchar(1) DEFAULT NULL,
  `f_password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`f_user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user_1
-- ----------------------------
INSERT INTO `t_user_1` VALUES ('2', '用户2', '10', '1', 'abcd123456');
INSERT INTO `t_user_1` VALUES ('3', '新添加', '12', null, null);

-- ----------------------------
-- Table structure for `t_user_2`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_2`;
CREATE TABLE `t_user_2` (
  `f_user_id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `f_user_name` varchar(20) DEFAULT NULL,
  `f_age` int(2) DEFAULT NULL,
  `f_sex` varchar(1) DEFAULT NULL,
  `f_password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`f_user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user_2
-- ----------------------------
INSERT INTO `t_user_2` VALUES ('3', '用户3', '10', '1', 'abcd123456');
INSERT INTO `t_user_2` VALUES ('4', '新添加', '12', null, null);

-- ----------------------------
-- Table structure for `t_user_3`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_3`;
CREATE TABLE `t_user_3` (
  `f_user_id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `f_user_name` varchar(20) DEFAULT NULL,
  `f_age` int(2) DEFAULT NULL,
  `f_sex` varchar(1) DEFAULT NULL,
  `f_password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`f_user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user_3
-- ----------------------------
INSERT INTO `t_user_3` VALUES ('4', '用户4', '10', '1', 'abcd123456');

-- ----------------------------
-- Table structure for `t_user_4`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_4`;
CREATE TABLE `t_user_4` (
  `f_user_id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `f_user_name` varchar(20) DEFAULT NULL,
  `f_age` int(2) DEFAULT NULL,
  `f_sex` varchar(1) DEFAULT NULL,
  `f_password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`f_user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user_4
-- ----------------------------
INSERT INTO `t_user_4` VALUES ('5', '用户5', '10', '1', 'abcd123456');

-- ----------------------------
-- Table structure for `t_user_5`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_5`;
CREATE TABLE `t_user_5` (
  `f_user_id` tinyint(4) NOT NULL AUTO_INCREMENT,
  `f_user_name` varchar(20) DEFAULT NULL,
  `f_age` int(2) DEFAULT NULL,
  `f_sex` varchar(1) DEFAULT NULL,
  `f_password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`f_user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user_5
-- ----------------------------
INSERT INTO `t_user_5` VALUES ('6', '用户6', '10', '1', 'abcd123456');
