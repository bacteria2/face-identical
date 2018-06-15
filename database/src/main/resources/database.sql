DROP TABLE IF EXISTS `fi_image_feature`;
CREATE TABLE `fi_image_feature` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `image_id` varchar(255) NOT NULL,
  `feature` text NOT NULL,
  `charact` text NOT NULL,
  `pic_path` varchar(255) NOT NULL DEFAULT '',
  `lib_id` varchar(50) NOT NULL DEFAULT '' ,
  `top_left_x` int(11) DEFAULT 0,
  `top_left_y` int(11) DEFAULT 0,
  `bottom_right_x` int(11) DEFAULT 0,
  `bottom_right_y` int(11) DEFAULT 0,
  `creator` varchar(60) NOT NULL,
  `create_time` datetime NOT NULL,
  `updator` varchar(50) NOT NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

