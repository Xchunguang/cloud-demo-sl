/*
MySQL Data Transfer
Source Host: localhost
Source Database: sl
Target Host: localhost
Target Database: sl
Date: 2018/1/18 20:45:31
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for geocoordmap
-- ----------------------------
CREATE TABLE geocoordmap (
  geoid int(11)  AUTO_INCREMENT,
  name varchar(40) ,
  jing varchar(30) ,
  wei varchar(30) ,
  PRIMARY KEY (geoid)
) ;

-- ----------------------------
-- Table structure for guoludata
-- ----------------------------
CREATE TABLE guoludata (
  guoluid int(11)  AUTO_INCREMENT,
  name varchar(100) ,
  value varchar(100) ,
  PRIMARY KEY (guoluid)
) ;

-- ----------------------------
-- Table structure for kongtiaodata
-- ----------------------------
CREATE TABLE kongtiaodata (
  kongtiaoid int(11)  AUTO_INCREMENT,
  name varchar(100) ,
  value varchar(100) ,
  PRIMARY KEY (kongtiaoid)
) ;

-- ----------------------------
-- Table structure for resultentryone
-- ----------------------------
CREATE TABLE resultentryone (
  resultentry1id int(11)  AUTO_INCREMENT,
  bxjzrq varchar(100) ,
  dsysrq varchar(100) ,
  dz varchar(100) ,
  fgsb varchar(100) ,
  fgsbbh varchar(100) ,
  fhrq varchar(100) ,
  glsl varchar(100) ,
  kdsl varchar(100) ,
  sbbh varchar(100) ,
  sblb varchar(100) ,
  sbqq varchar(100) ,
  sbxh varchar(100) ,
  wblx varchar(100) ,
  yh varchar(100) ,
  zxhtbh varchar(100) ,
  zxqdhtny varchar(100) ,
  zxqdhtrq varchar(100) ,
  zxqdhtrq0 varchar(100) ,
  zzgc varchar(100) ,
  PRIMARY KEY (resultentry1id)
) ;

-- ----------------------------
-- Table structure for resultentrythree
-- ----------------------------
CREATE TABLE resultentrythree (
  resultentry3id int(11)  AUTO_INCREMENT,
  code varchar(100) ,
  dqyh varchar(100) ,
  dz varchar(100) ,
  fgsb varchar(100) ,
  fgsbid varchar(100) ,
  fhrq varchar(100) ,
  htkh varchar(100) ,
  name varchar(100) ,
  sbbh varchar(100) ,
  sbxh varchar(100) ,
  sbzt varchar(100) ,
  wz varchar(100) ,
  yh varchar(100) ,
  jb varchar(100) ,
  sbsl varchar(100),
  sbzt0 varchar(100),
  sbzt1 varchar(100) ,
  wd varchar(100) ,
  PRIMARY KEY (resultentry3id)
) ;

-- ----------------------------
-- Table structure for resultentrytwo
-- ----------------------------
CREATE TABLE resultentrytwo (
  resultentry2id int(11)  AUTO_INCREMENT,
  fgsb varchar(100) ,
  djh varchar(100) ,
  hfbz varchar(100) ,
  hfr varchar(100) ,
  hfrq varchar(100) ,
  hfsl varchar(100) ,
  jd varchar(100) ,
  jylx varchar(100) ,
  nd varchar(100) ,
  sbbm varchar(100) ,
  sbdz varchar(100) ,
  sblb varchar(100) ,
  sblx varchar(100) ,
  sbn varchar(100) ,
  sbw varchar(100) ,
  sbxh varchar(100) ,
  sbyh varchar(100) ,
  sbztbm varchar(100) ,
  sbztmc varchar(100) ,
  wd varchar(100) ,
  zzgc varchar(100) ,
  PRIMARY KEY (resultentry2id)
) ;



CREATE TABLE allmechine (
  allmechineid int(11)  AUTO_INCREMENT,
  name varchar(100) ,
  jing varchar(100) ,
  wei varchar(100) ,
  mtype varchar(100) ,
  mvalue varchar(100) ,
  PRIMARY KEY (allmechineid)
) ;
