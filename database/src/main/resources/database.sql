
#mysql
DROP TABLE IF EXISTS `fi_image_feature`;
CREATE TABLE `fi_image_feature` (
  `image_id` varchar(255) NOT NULL primary key,
  `feature` text default '',
  `charact` text default '',
  `pic_path` varchar(255) DEFAULT '',
  `lib_id` varchar(50) NOT NULL DEFAULT '0' ,
  `top_left_x` int(11) DEFAULT 0,
  `top_left_y` int(11) DEFAULT 0,
  `bottom_right_x` int(11) DEFAULT 0,
  `bottom_right_y` int(11) DEFAULT 0,
  `creator` varchar(60) NOT NULL DEFAULT '创建者',
  `create_time` datetime NOT NULL default now(),
  `updator` varchar(50) NOT NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime NOT NULL  default now()
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#postgresql
DROP table  if exists fi_image_feature;
CREATE TABLE fi_image_feature (
  image_id varchar(255) NOT NULL primary key ,
  feature text NOT NULL default '',
  charact text NOT NULL default '',
  pic_path varchar(255) NOT NULL DEFAULT '',
  lib_id varchar(50) NOT NULL DEFAULT '' ,
  top_left_x int DEFAULT 0,
  top_left_y int DEFAULT 0,
  bottom_right_x int DEFAULT 0,
  bottom_right_y int DEFAULT 0,
  creator varchar(60) NOT NULL default 'user',
  create_time timestamp NOT NULL default now(),
  updator varchar(50) NOT NULL DEFAULT 'user' ,
  update_time timestamp NOT NULL default now()
);

comment on column fi_image_feature.image_id is '图片id，主键';
comment on column fi_image_feature.feature is '特征值';
comment on column fi_image_feature.charact is '保留字段';
comment on column fi_image_feature.lib_id is '专题库id';
comment on column fi_image_feature.top_left_x is '矩阵左下角X';
comment on column fi_image_feature.top_left_y is '矩阵左上角Y';
comment on column fi_image_feature.bottom_right_x is '矩阵右下角X';
comment on column fi_image_feature.bottom_right_y is '矩阵右下角Y';
comment on column fi_image_feature.creator is '更新者';
comment on column fi_image_feature.create_time is '创建时间';
comment on column fi_image_feature.updator is '更新者';
comment on column fi_image_feature.update_time is '更新时间';