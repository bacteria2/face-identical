/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50630
Source Host           : localhost:3306
Source Database       : multi_base

Target Server Type    : MYSQL
Target Server Version : 50630
File Encoding         : 65001

Date: 2018-06-11 20:05:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `fi_image_feature`
-- ----------------------------
DROP TABLE IF EXISTS `fi_image_feature`;
CREATE TABLE `fi_image_feature` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `image_id` varchar(255) NOT NULL,
  `feature` text NOT NULL,
  `charact` text NOT NULL,
  `pic_path` varchar(255) NOT NULL DEFAULT '',
  `lib_id` varchar(50) NOT NULL DEFAULT '' ,
  `vendor_id` bigint(20) NOT NULL,
  `position_id` bigint(20) NOT NULL,
  `creator` varchar(60) NOT NULL,
  `create_time` datetime NOT NULL,
  `updator` varchar(50) NOT NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fi_image_feature
-- ----------------------------

-- ----------------------------
-- Table structure for `fi_image_position`
-- ----------------------------
DROP TABLE IF EXISTS `fi_image_position`;
CREATE TABLE `fi_image_position` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `image_id` varchar(255) NOT NULL,
  `top_left_x` int(11) DEFAULT 0,
  `top_left_y` int(11) DEFAULT 0,
  `bottom_right_x` int(11) DEFAULT 0,
  `bottom_right_y` int(11) DEFAULT 0,
  `creator` varchar(50) NOT NULL,
  `create_time` datetime NOT NULL,
  `updator` varchar(50) NOT NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fi_image_position
-- ----------------------------

-- ----------------------------
-- Table structure for `fi_image_search_result`
-- ----------------------------
DROP TABLE IF EXISTS `fi_image_search_result`;
CREATE TABLE `fi_image_search_result` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `image_id` varchar(255) NOT NULL DEFAULT '' COMMENT '图片ID',
  `result` varchar(255) NOT NULL DEFAULT '' COMMENT '比对结果',
  `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '0:finished,1:running,2:initiating,3:waiting4:error',
  `vendor_id` bigint(20) NOT NULL,
  `position_id` bigint(20) NOT NULL,
  `creator` varchar(50) NOT NULL DEFAULT '' COMMENT '作者',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `updator` varchar(50) NOT NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fi_image_search_result
-- ----------------------------

-- ----------------------------
-- Table structure for `fi_vendor_info`
-- ----------------------------
DROP TABLE IF EXISTS `fi_vendor_info`;
CREATE TABLE `fi_vendor_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `vendor_name` varchar(100) NOT NULL COMMENT '厂商名称',
  `vendor_name_en` varchar(100) DEFAULT NULL,
  `version` varchar(60) NOT NULL,
  `creator` varchar(255) NOT NULL DEFAULT '',
  `create_time` datetime NOT NULL,
  `updator` varchar(20) NOT NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fi_vendor_info
-- ----------------------------
