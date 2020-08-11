/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.7.22-log : Database - jdshopping
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`jdshopping` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `jdshopping`;

/*Table structure for table `jd_admin` */

DROP TABLE IF EXISTS `jd_admin`;

CREATE TABLE `jd_admin` (
  `a_id` int(10) NOT NULL AUTO_INCREMENT,
  `a_adminName` varchar(100) NOT NULL,
  `a_password` varchar(100) NOT NULL,
  `a_holder` varchar(100) DEFAULT NULL,
  `salt` varchar(100) NOT NULL,
  `a_headportrait` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`a_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `jd_admin` */

insert  into `jd_admin`(`a_id`,`a_adminName`,`a_password`,`a_holder`,`salt`,`a_headportrait`) values (1,'Qzs5458','669a5c6ff81334bfae77bc1a38478ff6','1','IAxBpl3krSUG85OBb41yZA==',NULL),(2,'Wj12306','669a5c6ff81334bfae77bc1a38478ff6','1','IAxBpl3krSUG85OBb41yZA==',NULL),(3,'Ly5458','a09831c47127e76de6fe1a2a51369ccf','1','8HStAo72akjk1PVQkPZC2g==',NULL),(4,'tfm','759ea492508ec3bc5f3aafe51466be07','1','qomGPH/dA1F53Jj6eY1iOA==',NULL),(5,'qzs','000000','1','0',NULL),(6,'ljm','a1e0f3e0d5e9900fc783ae9a1aa5b8e1','1','nDjmC3A5VwcK3WGHibD/DQ==',NULL);

/*Table structure for table `jd_admin_permission` */

DROP TABLE IF EXISTS `jd_admin_permission`;

CREATE TABLE `jd_admin_permission` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `desc_` varchar(100) DEFAULT NULL,
  `url` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8;

/*Data for the table `jd_admin_permission` */

insert  into `jd_admin_permission`(`id`,`name`,`desc_`,`url`) values (1,'productupdateCategory.do','修改类型','/adminCommotidy/productupdateCategory.do'),(2,'images.do','添加商品类型页','/images.do'),(3,'propertyValue_update.do','添加商品属性','/adminCommotidy/propertyValue_update.do'),(4,'isStateStart.do','改变商品状态','/adminCommotidy/isStateStart.do'),(5,'imagesMG.do','图片管理页','/imagesMG.do'),(6,'propertyValue_edit.do','属性设置','/adminCommodity/propertyValue_edit.do'),(7,'delProductsById.do','批量删除商品','/adminCommodity/delProductsById.do'),(8,'delProductById.do','删除商品','/adminCommodity/delProductById.do'),(9,'updateproduct.do','修改商品','/adminCommodity/updateproduct.do'),(10,'addproduct.do','添加商品','/adminCommodity/addproduct.do'),(11,'productupdate.do','修改商品页','/productupdate.do'),(12,'productdetail.do','查看商品页','/productdetail.do'),(13,'productadd.do','添加产品页','/productadd.do'),(14,'updateProductImg.do','商品图片上传','/adminCommodity/updateProductImg.do'),(15,'imagesupdate.do','编辑商品图片页','/imagesupdate.do'),(16,'categorytadd.do','添加类型页','/categorytadd.do'),(17,'addcategory.do','添加商品类型','/adminCommodity/addcategory.do'),(18,'delCategoryById.do','删除商品类型','/admincommodity/delCategoryById.do'),(19,'productupdateCategory.do','修改商品类型页','/productupdateCategory.do'),(20,'updateCategory.do','修改商品类型','/adminCommodity/updateCategory.do'),(21,'brandAdd.do','添加品牌页','/brandAdd.do'),(22,'updateBrandImg.do','品牌图片上传','/adminCommodity/updateBrandImg.do'),(23,'addbrand.do','添加品牌','/adminCommodity/addbrand.do'),(24,'isanditStatus.do','改变品牌状态','/adminCommodity/isanditStatus.do'),(25,'delBrandById.do','删除品牌','/adminCommodity/delBrandById.do'),(26,'brandupdate.do','修改品牌页','/brandupdate.do'),(27,'updateBrandById.do','修改品牌','/adminCommodity/updateBrandById.do'),(28,'showproperty.do','属性管理页','/showproperty.do'),(29,'addProperty.do','添加属性页','/addProperty.do'),(30,'addpropertyBycid.do','添加属性','/adminCommodity/addpropertyBycid.do'),(31,'delPropertyById.do','删除属性','/adminCommodity/delPropertyById.do'),(32,'propertyupdate.do','编辑属性页','/propertyupdate.do'),(33,'updatePropertyById.do','编辑商品','/adminCommodity/updatePropertyById.do'),(34,'categoryProduct.do','商品类型页','/categoryProduct.do'),(35,'brandProduct.do','商品品牌页','/brandProduct.do'),(36,'adminlist.do','管理员列表页','/adminlist.do'),(37,'adminrole.do','角色列表页','/adminrole.do'),(38,'adminrule.do','权限列表页','/adminrule.do'),(39,'brandlist.do','品牌管理页','/brandlist.do'),(40,'producttypelist.do','分类管理页','/producttypelist.do'),(41,'productlist.do','商品列表页','/productlist.do'),(42,'orderinfoList.do','订单列表页','/order/orderinfoList.do'),(43,'saveGoods.do','添加订单','/adminCommodity/saveGoods.do');

/*Table structure for table `jd_admin_role` */

DROP TABLE IF EXISTS `jd_admin_role`;

CREATE TABLE `jd_admin_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `desc_` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `jd_admin_role` */

insert  into `jd_admin_role`(`id`,`name`,`desc_`) values (1,'admin','超级管理员'),(2,'productManager','产品管理员'),(3,'orderManager','订单管理员');

/*Table structure for table `jd_admin_role_permission` */

DROP TABLE IF EXISTS `jd_admin_role_permission`;

CREATE TABLE `jd_admin_role_permission` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `rid` bigint(20) DEFAULT NULL,
  `pid` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=293 DEFAULT CHARSET=utf8;

/*Data for the table `jd_admin_role_permission` */

insert  into `jd_admin_role_permission`(`id`,`rid`,`pid`) values (230,1,43),(231,1,42),(232,1,41),(233,1,40),(234,1,39),(235,1,38),(236,1,37),(237,1,36),(238,1,35),(239,1,34),(240,1,33),(241,1,32),(242,1,31),(243,1,30),(244,1,29),(245,1,28),(246,1,27),(247,1,26),(248,1,25),(249,1,24),(250,1,23),(251,1,22),(252,1,21),(253,1,20),(254,1,19),(255,1,18),(256,1,17),(257,1,16),(258,1,15),(259,1,14),(260,1,13),(261,1,12),(262,1,11),(263,1,10),(264,1,9),(265,1,8),(266,1,7),(267,1,6),(268,1,5),(269,1,4),(270,1,3),(271,1,2),(272,1,1),(273,2,42),(274,2,41),(275,2,40),(276,2,39),(277,2,36),(285,3,43),(286,3,42),(287,3,41),(288,3,40),(289,3,39),(290,3,35),(291,3,34),(292,3,12);

/*Table structure for table `jd_admin_user_role` */

DROP TABLE IF EXISTS `jd_admin_user_role`;

CREATE TABLE `jd_admin_user_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `aid` int(11) DEFAULT NULL,
  `rid` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8;

/*Data for the table `jd_admin_user_role` */

insert  into `jd_admin_user_role`(`id`,`aid`,`rid`) values (45,1,1),(47,2,2),(48,4,1),(49,6,1);

/*Table structure for table `jd_brand` */

DROP TABLE IF EXISTS `jd_brand`;

CREATE TABLE `jd_brand` (
  `b_id` int(11) NOT NULL AUTO_INCREMENT,
  `b_name` varchar(50) NOT NULL,
  `b_img` varchar(50) DEFAULT NULL,
  `b_area` varchar(50) DEFAULT NULL,
  `b_describe` varchar(255) DEFAULT NULL,
  `b_joinData` date DEFAULT NULL,
  `b_anditStatus` int(11) NOT NULL,
  PRIMARY KEY (`b_id`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8;

/*Data for the table `jd_brand` */

insert  into `jd_brand`(`b_id`,`b_name`,`b_img`,`b_area`,`b_describe`,`b_joinData`,`b_anditStatus`) values (1,'华为','/img/logo/huawei.jpg','祖国','','2019-12-19',0),(2,'小米','/img/logo/mi.jpg','祖国','','2019-12-19',0),(3,'创维','/img/logo/chuangwei.jpg','','','2019-12-19',0),(4,'京觅','/img/logo/jingni.png','','','2019-12-19',0),(5,'海澜之家','/img/logo/hl.jpg','','','2019-12-19',0),(6,' 雅高',NULL,'','','2019-12-19',0),(7,'联想','/img/logo/lianxiang.jpg','','','2019-12-19',0),(8,'腾讯','/img/logo/tengxun.png','祖国','','2019-12-19',0),(9,'小米MI','/img/logo/logo_xiaomi.png','','','2019-12-19',0),(10,'舒悦',NULL,NULL,NULL,'2020-01-02',0),(11,'卡戈登',NULL,NULL,NULL,'2020-01-02',0),(12,'乔巴先生',NULL,NULL,NULL,'2020-01-02',0),(13,'慕滋',NULL,NULL,NULL,'2020-01-02',0),(14,'安德玛',NULL,NULL,NULL,'2020-01-02',0),(15,'幻优柏',NULL,NULL,NULL,'2020-01-02',0),(16,'古莱登',NULL,NULL,NULL,'2020-01-02',0),(17,'依波（EBOHR）',NULL,NULL,NULL,'2020-01-02',0),(18,'程健',NULL,NULL,NULL,'2020-01-02',0),(19,'飞跃（Feiyue）',NULL,NULL,NULL,'2020-01-02',0),(20,'卓明舒',NULL,NULL,NULL,'2020-01-02',0),(21,'雅鹿',NULL,NULL,NULL,'2020-01-02',0),(22,'创奇',NULL,NULL,NULL,'2020-01-02',0),(23,'笙冉（SHENGRAN）',NULL,NULL,NULL,'2020-01-02',0),(24,'凯乐石（KAILAS）',NULL,NULL,NULL,'2020-01-02',0),(25,'夕阳夏',NULL,NULL,NULL,'2020-01-02',0),(26,'361度',NULL,NULL,NULL,'2020-01-02',0),(27,'网将（wangjiang）',NULL,NULL,NULL,'2020-01-02',0),(28,'骆驼（CAMEL）',NULL,NULL,NULL,'2020-01-02',0),(29,'展缘',NULL,NULL,NULL,'2020-01-02',0),(30,'花花公子',NULL,NULL,NULL,'2020-01-02',0),(31,'SI GE TU',NULL,NULL,NULL,'2020-01-02',0),(32,'双汇',NULL,NULL,NULL,'2020-01-02',0),(33,'依拉贝拉',NULL,NULL,NULL,'2020-01-02',0),(34,'欧普电公司（上海）有限公司（OPUDG）',NULL,NULL,NULL,'2020-01-02',0),(35,'芙丽芳丝',NULL,NULL,NULL,'2020-01-02',0),(36,'稻草人',NULL,NULL,NULL,'2020-01-02',0),(37,'耐克（NIKE）',NULL,NULL,NULL,'2020-01-02',0),(38,'尔境',NULL,NULL,NULL,'2020-01-02',0),(39,'oppo','/img/upload/brandPhoto/1578560460358.jpg','中国','国产666 ！！！！','2020-01-09',0);

/*Table structure for table `jd_category` */

DROP TABLE IF EXISTS `jd_category`;

CREATE TABLE `jd_category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

/*Data for the table `jd_category` */

insert  into `jd_category`(`id`,`name`) values (1,'电视'),(2,'男装'),(3,'家居'),(4,'电脑'),(5,'办公'),(9,'手机'),(10,'女装'),(11,'水果'),(12,'鞋子'),(14,'食品'),(15,'健身器材'),(16,'汽车用品'),(17,'钟表'),(18,'运动户外'),(19,'厨具'),(20,'箱包皮具'),(21,'珠宝首饰'),(22,'服饰配件'),(23,'家装建材'),(24,'美妆护肤');

/*Table structure for table `jd_colour` */

DROP TABLE IF EXISTS `jd_colour`;

CREATE TABLE `jd_colour` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `commId` int(10) NOT NULL,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

/*Data for the table `jd_colour` */

insert  into `jd_colour`(`id`,`commId`,`name`) values (1,1,'碳纤黑'),(2,1,'冰川蓝'),(3,1,'火焰红'),(4,1,'夏之密语'),(5,6,'黑色'),(6,6,'赤红色'),(7,6,'冰魄白'),(8,4,'灰色'),(9,4,'蓝色'),(10,15,'紫色'),(11,16,'卡其色-四季款'),(12,16,'霸气米-四季款'),(13,16,'骑士黑-四季款'),(14,17,'黑色'),(16,17,'红色'),(17,55,'白蓝'),(18,55,'白黑'),(19,55,'白绿'),(20,56,'蝶羽白'),(21,57,'蝶羽白'),(22,58,'蝶羽白'),(23,58,'黑色');

/*Table structure for table `jd_commodity` */

DROP TABLE IF EXISTS `jd_commodity`;

CREATE TABLE `jd_commodity` (
  `c_id` int(6) NOT NULL AUTO_INCREMENT,
  `c_name` varchar(200) NOT NULL,
  `c_title` varchar(200) DEFAULT NULL,
  `c_price` double NOT NULL,
  `c_discountprice` double DEFAULT NULL,
  `c_Stock` int(200) DEFAULT NULL,
  `c_salesvolume` int(200) DEFAULT NULL,
  `c_data` datetime NOT NULL,
  `c_uri` varchar(50) DEFAULT NULL,
  `c_uriDa` varchar(50) DEFAULT NULL,
  `c_color` varchar(10) DEFAULT NULL,
  `c_edition` varchar(10) DEFAULT NULL,
  `c_categoryId` int(50) NOT NULL,
  `c_reduction` int(10) NOT NULL,
  `c_Seckill` int(10) NOT NULL,
  `c_state` int(10) NOT NULL,
  `c_brandId` int(10) NOT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8;

/*Data for the table `jd_commodity` */

insert  into `jd_commodity`(`c_id`,`c_name`,`c_title`,`c_price`,`c_discountprice`,`c_Stock`,`c_salesvolume`,`c_data`,`c_uri`,`c_uriDa`,`c_color`,`c_edition`,`c_categoryId`,`c_reduction`,`c_Seckill`,`c_state`,`c_brandId`) values (1,'Redmi K20Pro 骁龙855 索尼4800万超广角三摄 AMOLED弹出式全面屏 8GB+256GB 冰川蓝 游戏手机 小米 红米','Redmi K20Pro 骁龙855 索尼4800万超广角三摄 AMOLED弹出式全面屏 8GB+256GB 冰川蓝 游戏手机 小米 红米',1999,1999,100,0,'2019-12-14 09:24:16','/img/shouji/sj_z1_hei1.jpg','/img/shouji/sj_da1_hei1.jpg','选择颜色','选择版本',9,1,1,1,2),(2,'京东国际国内现货 京觅智利进口车厘子J级 1磅尝鲜装 果径约26-28mm 新鲜水果 自营现货',NULL,59.9,59.9,100,0,'2019-12-14 10:01:04','/img/Fruits/sg_z2_1.jpg','/img/Fruits/sg_da2_1.jpg',NULL,'选择种类',11,1,1,1,4),(3,'创维 65H5 65英寸4K超高清HDR 护眼全面屏 AI人工智能语音 蓝牙网络WIFI 液晶平板电视机',NULL,3399,3399,100,0,'2019-12-14 10:25:11','/img/dianshi/dianshi_z3_1.jpg','/img/dianshi/dianshi_da3_1.jpg',NULL,'选择尺寸',1,1,1,1,3),(4,'小米（MI）旅行箱拉杆箱20/24/28英寸万向轮登机箱密码箱轻巧便携出差旅行男女行李箱 蓝色 20英寸',NULL,266,266,100,0,'2019-12-16 00:00:00','/img/nanzhuang/nanz_z4_hong1.jpg','/img/nanzhuang/nanz_da4_hong1.jpg','选择颜色','选择尺寸',20,1,1,1,9),(5,'雅高 搓澡神器 长柄洗澡刷搓澡巾洗澡神器沐浴刷搓背神器',NULL,21.9,18.9,100,0,'2019-12-16 00:00:00','/img/jiaju/jiaju_z5_1.jpg','/img/jiaju/jiaju_da5_1.jpg',NULL,'选择类型',3,0,0,1,6),(6,'联想拯救者Y7000P 15.6英寸游戏本笔记本电脑2019款高色域全面屏第九代酷睿i7-9750H 冰魄白 16G 1TB固态 1660Ti-6G',NULL,9399,9399,100,0,'2019-12-16 00:00:00','/img/diannao/diann_z6_hei1.jpg','/img/diannao/diann_da6_hei1.jpg','选择颜色','选择版本',4,0,0,1,7),(7,'腾讯（Tencent）极光T1 投影机 投影仪 家用便携（支持1080P 自动对焦 内置电池 2G+16G大容量 蓝牙音箱',NULL,1699,1699,100,0,'2019-12-16 00:00:00','/img/bangong/bg_z7_1.jpg','/img/bangong/bg_da7_1.jpg',NULL,NULL,5,0,0,1,8),(15,'舒悦老人鞋休闲鞋加绒保暖爸爸鞋秋冬老年安全老年鞋妈妈鞋濮存昕代言 黑色（男款） 43',NULL,219,219,100,0,'2020-01-02 10:29:26','/img/shoes/shoes_z15_hei1.jpg','/img/shoes/shoes_da15_hei1.jpg','选择颜色','选择尺码',12,0,0,1,10),(16,'【年货盛典 狂欢1折秒】【严选品质丨已质检】【防寒保暖】单绒可选 手工定制限量高帮品质男鞋时尚棉靴 卡其色-四季款 44',NULL,99,99,100,0,'2020-01-02 10:55:29','/img/shoes/shoes_z16_01.jpg','/img/shoes/shoes_da16_01.jpg','选择颜色','选择尺码',12,0,0,1,11),(17,'乔巴先生 权志龙同款卫衣小雏菊衣服韩版宽松情侣装冬季男女学生反战圆领长袖打底衫加绒加厚外套班服定制 黑色MT1185',NULL,108,108,10,0,'2020-01-02 13:40:59','/img/cai/cai_z_01.jpg','/img/cai/cai_da_01.jpg','选择颜色','选择尺码',2,0,0,1,12),(18,'嗨吃家桶装酸辣粉  家庭110g*1桶实惠旅行装 110克*单桶（实惠旅行装）',NULL,14.55,14.55,50,0,'2020-01-02 14:41:55','/img/tuijian/tj_z18_01.jpg','/img/tuijian/tj_da18_01.jpg',NULL,NULL,14,0,0,1,13),(19,'Under Armour 安德玛官方 UA男子Micro G Pursuit跑步鞋-3000011 黑色102 43',NULL,599,599,100,0,'2020-01-02 14:54:45','/img/tuijian/tj_z20_01.jpg','/img/tuijian/tj_da18_02.jpg',NULL,NULL,12,0,0,1,14),(20,'深蹲器 蹲蹬腿练腿倒蹲机下蹲训练器勾腿机力量健身器材 红色',NULL,598,598,20,0,'2020-01-02 15:03:27','/img/tuijian/tj_z19_01.jpg','/img/tuijian/tj_da18_03.jpg',NULL,NULL,15,0,0,1,15),(21,'2019新品上新汽车脚垫单片脚垫单个主副正驾驶室脚垫司机座位前左右后排连体全包围汽车脚垫单片 单层主架黑色米线',NULL,173.8,173.8,50,0,'2020-01-02 15:08:48','/img/tuijian/tj_z21_01.jpg','/img/tuijian/tj_da18_04.jpg',NULL,NULL,16,0,0,1,16),(22,'依波(EBOHR)手表 都市经典系列精致大气钟表实心钢带防水机械情侣表男表36140114',NULL,999,999,20,0,'2020-01-02 15:13:08','/img/tuijian/tj_z22_01.jpg','/img/tuijian/tj_da18_05.jpg',NULL,NULL,17,0,0,1,17),(23,'【品质保证】雷锋帽女冬季冬天加厚保暖电动车棉帽子男东北户外骑车防风防寒帽 藏青色 均码(男女通用)',NULL,139,139,50,0,'2020-01-02 15:18:30','/img/tuijian/tj_z23_01.jpg','/img/tuijian/tj_da18_06.jpg',NULL,NULL,18,0,0,1,18),(24,'feiyue/飞跃复古日系休闲帆布鞋街拍潮鞋男女款情侣鞋 938米 37偏大一码',NULL,119,119,50,0,'2020-01-02 15:23:14','/img/tuijian/tj_z24_01.jpg','/img/tuijian/tj_da18_07.jpg',NULL,NULL,12,0,0,1,19),(25,'<品牌直营>实木加厚砧板圆形松木菜板家用案板厨房切菜板商用菜墩整木骨头砧板 38*8带钢圈',NULL,128,128,100,0,'2020-01-02 15:26:39','/img/tuijian/tj_z25_01.jpg','/img/tuijian/tj_da18_08.png',NULL,NULL,19,0,0,1,20),(26,'雅鹿两双面穿派克服羽绒服女中长款2019冬新大毛领过膝修身白鸭绒X 双面穿黑色+米白 XL',NULL,999,999,100,0,'2020-01-02 15:29:43','/img/tuijian/tj_z26_01.jpg','/img/tuijian/tj_da18_09.jpg',NULL,NULL,10,0,0,1,21),(27,'蹦床儿童 成人健身减脂室内蹦男女通用 蓝色《房级别》加强款 绿色(健身房级别)加强款',NULL,478,478,100,0,'2020-01-02 15:34:21','/img/tuijian/tj_z27_01.jpg','/img/tuijian/tj_da18_10.jpg',NULL,NULL,18,0,0,1,15),(28,'创奇【清仓】 床 实木床软包简易小户型现代简约1.5米学生床租房家具1.8米卧室大床出租房床1.2米 B款 实木床 裸床 1500*2000mm',NULL,346,346,100,0,'2020-01-02 15:38:08','/img/tuijian/tj_z28_01.jpg','/img/tuijian/tj_da18_11.jpg',NULL,NULL,3,0,0,1,22),(29,'<品牌直降>假发帽子一体女成人长发长卷发网红海军款帽秋冬款女孩时尚自然全头套抖音可拆卸潮流戴帽子的假 可拆卸款【棕黑色】',NULL,138,138,100,0,'2020-01-02 15:41:38','/img/tuijian/tj_z29_01.jpg','/img/tuijian/tj_da18_12.jpg',NULL,NULL,18,0,0,1,23),(30,'凯乐石（KAILAS）冲锋衣 男女款parka三合一羽绒内胆防风外套防水防潮牌寒户外旅行登山服 【女款】粉瓷 XXL',NULL,1429,1429,100,0,'2020-01-02 15:44:26','/img/tuijian/tj_z30_01.jpg','/img/tuijian/tj_da18_13.jpg',NULL,NULL,10,0,0,1,24),(31,'【特价来袭】男士背包韩版休闲双肩包男电脑包时尚潮流大学生书包旅行包包 暗灰色(升级款)',NULL,189,189,100,0,'2020-01-02 15:47:13','/img/tuijian/tj_z31_01.jpg','/img/tuijian/tj_da18_14.jpg',NULL,NULL,20,0,0,1,25),(32,'原创设计师款无耳洞女气质银针耳钉冷淡风感显脸瘦饰 S925银针耳钉一定要有耳洞哦!!',NULL,140,140,100,0,'2020-01-02 15:52:33','/img/tuijian/tj_z32_01.jpg','/img/tuijian/tj_da18_15.jpg',NULL,NULL,21,0,0,1,20),(33,'健身体操训练吊环家用引体向上脊椎牵引室内器材成人拉伸运动 手柄+3.5米悬挂带+膨胀挂钩 吊环手柄+0.5米悬挂带',NULL,58,58,100,0,'2020-01-02 15:56:05','/img/tuijian/tj_z33_01.jpg','/img/tuijian/tj_da18_16.jpg',NULL,NULL,18,0,0,1,15),(34,'欧美新潮个性耳环女 灵动立体双菱形满钻几何耳钩耳坠耳饰品个性潮 白色 925银',NULL,111.5,111.5,100,0,'2020-01-02 16:07:32','/img/tuijian/tj_z34_01.jpg','/img/tuijian/tj_da18_17.jpg',NULL,NULL,21,0,0,1,20),(35,'登机小型拉杆箱 铝框小型网红ins登机箱子皮旅行拉杆密码行李箱万向轮女18寸男20 墨绿色 20寸登机箱',NULL,758,758,100,0,'2020-01-02 16:09:00','/img/tuijian/tj_z35_01.jpg','/img/tuijian/tj_da18_18.jpg',NULL,NULL,20,0,0,1,20),(36,'千禧盛世 简约现代中式卧室家具实木衣柜整体衣橱组装3456门大衣柜特价 胡桃色不加顶 四门',NULL,3080,3080,100,0,'2020-01-02 16:25:22','/img/tuijian/tj_z36_01.jpg','/img/tuijian/tj_da18_19.jpg',NULL,NULL,3,0,0,1,22),(37,'弹跳器 跳跳杆儿童青少年成人健身双单杆蹦蹦跳娃娃跳蹦高器 加强款单杆绿白',NULL,78,78,100,0,'2020-01-02 16:26:49','/img/tuijian/tj_z37_01.jpg','/img/tuijian/tj_da18_20.jpg',NULL,NULL,18,0,0,1,15),(38,'361度 女鞋运动鞋女2019秋冬季新款潮流时尚韩版学生跑步鞋休闲气垫鞋子 玫瑰脏粉/太空灰（网面） 37',NULL,149,149,100,0,'2020-01-02 16:27:52','/img/tuijian/tj_z38_01.jpg','/img/tuijian/tj_da18_21.jpg',NULL,NULL,12,0,0,1,26),(39,'保暖内衣女加厚加绒学生初中生高中少女大童秋衣秋裤纯棉套装秋冬 88灰色猫咪 XL',NULL,218,218,100,0,'2020-01-02 16:29:56','/img/tuijian/tj_z39_01.jpg','/img/tuijian/tj_da18_22.jpg',NULL,NULL,10,0,0,1,27),(40,'骆驼（CAMEL）男鞋  新款商务系带休闲皮轻便办公国民男爸爸鞋 A832287200  暗棕 41',NULL,319,319,100,0,'2020-01-02 16:33:22','/img/tuijian/tj_z40_01.jpg','/img/tuijian/tj_da18_23.jpg',NULL,NULL,12,0,0,1,28),(41,'配近视眼镜镜框近视眼镜男女平光超轻全框黑舒适配眼睛镜框架成品有度数 砂黑配250度近视片',NULL,68,68,50,0,'2020-01-02 16:35:44','/img/tuijian/tj_z41_01.jpg','/img/tuijian/tj_da18_24.jpg',NULL,NULL,22,0,0,1,29),(42,'花花公子皮鞋男2019秋冬季新款男士商务休闲皮鞋韩版百搭潮流系带真皮鞋子男 9858黑色 41',NULL,199,199,100,0,'2020-01-02 16:39:22','/img/tuijian/tj_z42_01.jpg','/img/tuijian/tj_da18_25.jpg',NULL,NULL,12,0,0,1,30),(43,'增高鞋男 运动秋冬高帮鞋鞋百搭潮鞋子休闲日系季马丁靴ins超火内增高 170白色 38',NULL,318,318,100,0,'2020-01-02 16:50:50','/img/tuijian/tj_z43_01.jpg','/img/tuijian/tj_da18_26.jpg',NULL,NULL,12,0,0,1,31),(44,'骆驼（CAMEL）男鞋 百搭透气跑步潮流运动鞋套脚鞋子 A932252790 黑色 40',NULL,319,319,100,0,'2020-01-02 16:57:31','/img/tuijian/tj_z44_01.jpg','/img/tuijian/tj_da18_27.jpg',NULL,NULL,12,0,0,1,28),(45,'双汇 火腿肠 王中王火腿肠 60g*10支/600g装',NULL,28,28,100,0,'2020-01-02 16:58:48','/img/tuijian/tj_z45_01.jpg','/img/tuijian/tj_da18_28.jpg',NULL,NULL,14,0,0,1,32),(46,'韩版复古方框金属男女文艺眼镜架原宿风防蓝光平光镜可配 金画黑',NULL,219,219,100,0,'2020-01-02 17:00:16','/img/tuijian/tj_z46_01.jpg','/img/tuijian/tj_da18_29.jpg',NULL,NULL,22,0,0,1,33),(47,'圆形led灯板用灯芯led吸顶灯改造灯板led一体化光源模组透镜佛山·照明同款 模组方形36w21.0cm 其它 暖白',NULL,34.9,34.9,100,0,'2020-01-02 17:03:31','/img/tuijian/tj_z47_01.jpg','/img/tuijian/tj_da18_30.jpg',NULL,NULL,23,0,0,1,34),(48,'芙丽芳丝（freeplus）净润洗面霜100g（洗面奶洁面乳 男女适用 氨基酸系 日本 护肤品化妆品  温和不易紧绷）',NULL,160,160,20,0,'2020-01-02 17:07:19','/img/tuijian/tj_z48_01.jpg','/img/tuijian/tj_da18_31.jpg',NULL,NULL,24,0,0,1,35),(49,'<品牌直降>帽子假发一体女成人带头发的帽子假发女长发帽子夏天黑长直卷发网红时尚自然全头新式发套抖音同 米白色帽子长直发【棕黑色】',NULL,108,108,100,0,'2020-01-02 17:09:56','/img/tuijian/tj_z49_01.jpg','/img/tuijian/tj_da18_32.jpg',NULL,NULL,18,0,0,1,23),(50,'稻草人男鞋皮鞋新款男士休闲鞋真皮内增高系带正装秋冬季保暖加棉鞋商务休闲鞋子男 2306黑色 41',NULL,168,168,100,0,'2020-01-02 17:11:19','/img/tuijian/tj_z50_01.jpg','/img/tuijian/tj_da18_33.jpg',NULL,NULL,12,0,0,1,36),(51,'帽子男四季通用户外棒球帽钓鱼防晒遮阳帽新款男女情侣百搭长檐春秋鸭舌帽太阳帽 黑色',NULL,36,36,100,0,'2020-01-02 17:13:05','/img/tuijian/tj_z51_01.jpg','/img/tuijian/tj_da18_34.jpg',NULL,NULL,18,0,0,1,24),(52,'NIKE耐克男鞋跑步鞋2019秋季新款TanJun轻便运动鞋休闲训练缓震跑鞋812654-011 店长推荐812654-011 43',NULL,369,369,100,0,'2020-01-02 17:14:39','/img/tuijian/tj_z52_01.jpg','/img/tuijian/tj_da18_35.jpg',NULL,NULL,12,0,0,1,37),(55,'OnitsukaTiger 鬼冢虎 Mexico66 李宇春同款 经典烫金标男女运动休闲鞋经典烫金标男女运动休闲鞋子','鬼冢虎 Mexico66 李宇春同款OnitsukaTiger  经典烫金标男女运动休闲鞋经典烫金标男女运动休闲鞋',899,588,10,0,'2020-01-08 00:00:00','/img/tuijian/pd-003.jpg','/img/tuijian/pd-003.jpg','选择颜色','选择尺码',12,0,0,1,31),(58,'荣耀20S 李现同款 3200万人像超级夜景 4800万超广角AI三摄 麒麟810 全网通版6GB+128GB 蝶羽白','4800万超广角AI三摄 麒麟810 全网通版6GB+128GB 蝶羽白',1499,1500,100,0,'2020-01-09 15:47:53','/upload/productPhoto/huawei_z_01.jpg',NULL,'蝶羽白','8+126G',9,1,1,1,2);

/*Table structure for table `jd_commtypepricr` */

DROP TABLE IF EXISTS `jd_commtypepricr`;

CREATE TABLE `jd_commtypepricr` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `type` varchar(50) NOT NULL,
  `price` double DEFAULT NULL,
  `commId` int(5) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8;

/*Data for the table `jd_commtypepricr` */

insert  into `jd_commtypepricr`(`id`,`type`,`price`,`commId`) values (1,'6GB+64GB',1999,1),(2,'6GB+128GB',2299,1),(31,'8GB+128GB',2499,1),(32,'8GB+256GB',2699,1),(33,'【预售】JJJ级 5kg原箱',649,2),(34,'【预售】黄车JJ级2.2kg原箱',539,2),(35,'【预售】车厘子+蓝莓组合装',529,2),(36,'【预售】J级 5kg原箱',529,2),(37,'4K超大屏人工智能臻品-75A8',3399,3),(38,'全生态AI旗舰智慧屏新品-65H90',6799,3),(39,'全生态AI高端智慧屏新品-65A8',4789,3),(40,'4K人工智能物联网电视-65E33A',2799,3),(41,'20英寸',266,4),(42,'24英寸',359,4),(43,'28英寸',468,4),(45,'【软密毛刷 深度清洁】搓澡神器',21,5),(46,'16G 1TB固态 1660Ti-6G 标配',9299,6),(47,'32G 1TB固态 1660Ti-6G 定制',9899,6),(48,'32G 1T固态+2T机械 1660Ti-6G定制',10399,6),(49,'32G 2TB固态 1660Ti-6G 定制',10699,6),(50,'S(建议80斤以内体重)',108,17),(51,'M(建议80-100斤以内体重)',108,17),(52,'L(建议100-125斤以内体重)',108,17),(53,'XL(建议125-135斤以内体重)',108,17),(54,'39',588,55),(55,'40',588,55),(56,'41',588,55),(57,'42',588,55),(58,'43',588,55),(59,'44',580,55),(60,'45',588,55);

/*Table structure for table `jd_images` */

DROP TABLE IF EXISTS `jd_images`;

CREATE TABLE `jd_images` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `uriDa` varchar(50) NOT NULL,
  `uriZ` varchar(50) NOT NULL,
  `uriX` varchar(50) NOT NULL,
  `commId` int(5) NOT NULL,
  `colourId` int(5) DEFAULT NULL,
  `uriType` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=110 DEFAULT CHARSET=utf8;

/*Data for the table `jd_images` */

insert  into `jd_images`(`id`,`uriDa`,`uriZ`,`uriX`,`commId`,`colourId`,`uriType`) values (1,'/img/shouji/sj_da1_hei1.jpg','','',1,1,1),(2,'/img/shouji/sj_da1_hei1.jpg','/img/shouji/sj_z1_hei1.jpg','/img/shouji/sj_xiao1_hei1.jpg',1,1,2),(3,'/img/shouji/sj_da1_hei2.jpg','/img/shouji/sj_z1_hei2.jpg','/img/shouji/sj_xiao1_hei2.jpg',1,1,2),(4,'/img/shouji/sj_da1_hei3.jpg','/img/shouji/sj_z1_hei3.jpg','/img/shouji/sj_xiao1_hei3.jpg',1,1,2),(5,'/img/shouji/sj_da1_hei4.jpg','/img/shouji/sj_z1_hei4.jpg','/img/shouji/sj_xiao1_hei4.jpg',1,1,2),(6,'/img/shouji/sj_da1_hei5.jpg','/img/shouji/sj_z1_hei5.jpg','/img/shouji/sj_xiao1_hei5.jpg',1,1,2),(7,'/img/shouji/sj_da1_lan1.jpg','/img/shouji/sj_z1_lan1.jpg','/img/shouji/sj_xiao1_lan1.jpg',1,2,2),(8,'/img/shouji/sj_da1_lan2.jpg','/img/shouji/sj_z1_lan2.jpg','/img/shouji/sj_xiao1_lan2.jpg',1,2,2),(9,'/img/shouji/sj_da1_lan3.jpg','/img/shouji/sj_z1_lan3.jpg','/img/shouji/sj_xiao1_lan3.jpg',1,2,2),(10,'/img/shouji/sj_da1_lan4.jpg','/img/shouji/sj_z1_lan4.jpg','/img/shouji/sj_xiao1_lan4.jpg',1,2,2),(11,'/img/shouji/sj_da1_lan5.jpg','/img/shouji/sj_z1_lan5.jpg','/img/shouji/sj_xiao1_lan5.jpg',1,2,2),(13,'/img/Fruits/sg_da2_1.jpg','/img/Fruits/sg_z2_1.jpg','/img/Fruits/sg_xiao2_1.jpg',2,NULL,2),(14,'/img/Fruits/sg_da2_2.jpg','/img/Fruits/sg_z2_2.jpg','/img/Fruits/sg_xiao2_2.jpg',2,NULL,2),(15,'/img/Fruits/sg_da2_3.jpg','/img/Fruits/sg_z2_3.jpg','/img/Fruits/sg_xiao2_3.jpg',2,NULL,2),(16,'/img/Fruits/sg_da2_4.jpg','/img/Fruits/sg_z2_4.jpg','/img/Fruits/sg_xiao2_4.jpg',2,NULL,2),(17,'/img/Fruits/sg_da2_5.jpg','/img/Fruits/sg_z2_5.jpg','/img/Fruits/sg_xiao2_5.jpg',2,NULL,2),(18,'/img/dianshi/dianshi_da3_1.jpg','/img/dianshi/dianshi_z3_1.jpg','/img/dianshi/dianshi_xiao3_1.jpg',3,NULL,2),(19,'/img/dianshi/dianshi_da3_2.jpg','/img/dianshi/dianshi_z3_2.jpg','/img/dianshi/dianshi_xiao3_2.jpg',3,NULL,2),(20,'/img/dianshi/dianshi_da3_3.jpg','/img/dianshi/dianshi_z3_3.jpg','/img/dianshi/dianshi_xiao3_3.jpg',3,NULL,2),(21,'/img/dianshi/dianshi_da3_4.jpg','/img/dianshi/dianshi_z3_4.jpg','/img/dianshi/dianshi_xiao3_4.jpg',3,NULL,2),(22,'/img/dianshi/dianshi_da3_5.jpg','/img/dianshi/dianshi_z3_5.jpg','/img/dianshi/dianshi_xiao3_5.jpg',3,NULL,2),(23,'/img/nanzhuang/nanz_da4_hong1.jpg','/img/nanzhuang/nanz_z4_hong1.jpg','/img/nanzhuang/nanz_xiao4_hong1.jpg',4,8,2),(24,'/img/nanzhuang/nanz_da4_hong2.jpg','/img/nanzhuang/nanz_z4_hong2.jpg','/img/nanzhuang/nanz_xiao4_hong2.jpg',4,8,2),(25,'/img/nanzhuang/nanz_da4_hong3.jpg','/img/nanzhuang/nanz_z4_hong3.jpg','/img/nanzhuang/nanz_xiao4_hong3.jpg',4,8,2),(26,'/img/nanzhuang/nanz_da4_hong4.jpg','/img/nanzhuang/nanz_z4_hong4.jpg','/img/nanzhuang/nanz_xiao4_hong4.jpg',4,8,2),(27,'/img/nanzhuang/nanz_da4_hong5.jpg','/img/nanzhuang/nanz_z4_hong5.jpg','/img/nanzhuang/nanz_xiao4_hong5.jpg',4,8,2),(28,'/img/nanzhuang/nanz_da4_lan1.jpg','/img/nanzhuang/nanz_z4_lan1.jpg','/img/nanzhuang/nanz_xiao4_lan1.jpg',4,9,2),(29,'/img/nanzhuang/nanz_da4_lan2.jpg','/img/nanzhuang/nanz_z4_lan2.jpg','/img/nanzhuang/nanz_xiao4_lan2.jpg',4,9,2),(30,'/img/nanzhuang/nanz_da4_lan3.jpg','/img/nanzhuang/nanz_z4_lan3.jpg','/img/nanzhuang/nanz_xiao4_lan3.jpg',4,9,2),(31,'/img/nanzhuang/nanz_da4_lan4.jpg','/img/nanzhuang/nanz_z4_lan4.jpg','/img/nanzhuang/nanz_xiao4_lan4.jpg',4,9,2),(32,'/img/nanzhuang/nanz_da4_lan5.jpg','/img/nanzhuang/nanz_z4_lan5.jpg','/img/nanzhuang/nanz_xiao4_lan5.jpg',4,9,2),(33,'/img/jiaju/jiaju_da5_1.jpg','/img/jiaju/jiaju_z5_1.jpg','/img/jiaju/jiaju_xiao5_1.jpg',5,NULL,2),(34,'/img/jiaju/jiaju_da5_2.jpg','/img/jiaju/jiaju_z5_2.jpg','/img/jiaju/jiaju_xiao5_2.jpg',5,NULL,2),(35,'/img/jiaju/jiaju_da5_3.jpg','/img/jiaju/jiaju_z5_3.jpg','/img/jiaju/jiaju_xiao5_3.jpg',5,NULL,2),(36,'/img/jiaju/jiaju_da5_4.jpg','/img/jiaju/jiaju_z5_4.jpg','/img/jiaju/jiaju_xiao5_4.jpg',5,NULL,2),(37,'/img/jiaju/jiaju_da5_5.jpg','/img/jiaju/jiaju_z5_5.jpg','/img/jiaju/jiaju_xiao5_5.jpg',5,NULL,2),(38,'/img/diannao/diann_da6_hei1.jpg','/img/diannao/diann_z6_hei1.jpg','/img/diannao/diann_xiao6_hei1.jpg',6,5,2),(39,'/img/diannao/diann_da6_hei2.jpg','/img/diannao/diann_z6_hei2.jpg','/img/diannao/diann_xiao6_hei2.jpg',6,5,2),(40,'/img/diannao/diann_da6_hei3.jpg','/img/diannao/diann_z6_hei3.jpg','/img/diannao/diann_xiao6_hei3.jpg',6,5,2),(41,'/img/diannao/diann_da6_hei4.jpg','/img/diannao/diann_z6_hei4.jpg','/img/diannao/diann_xiao6_hei4.jpg',6,5,2),(42,'/img/diannao/diann_da6_hei5.jpg','/img/diannao/diann_z6_hei5.jpg','/img/diannao/diann_xiao6_hei5.jpg',6,5,2),(43,'/img/diannao/diann_da6_hong1.jpg','/img/diannao/diann_z6_hong1.jpg','/img/diannao/diann_xiao6_hong1.jpg',6,6,2),(44,'/img/diannao/diann_da6_hong2.jpg','/img/diannao/diann_z6_hong2.jpg','/img/diannao/diann_xiao6_hong2.jpg',6,6,2),(45,'/img/diannao/diann_da6_hong3.jpg','/img/diannao/diann_z6_hong3.jpg','/img/diannao/diann_xiao6_hong3.jpg',6,6,2),(46,'/img/diannao/diann_da6_hong4.jpg','/img/diannao/diann_z6_hong4.jpg','/img/diannao/diann_xiao6_hong4.jpg',6,6,2),(47,'/img/diannao/diann_da6_hong5.jpg','/img/diannao/diann_z6_hong5.jpg','/img/diannao/diann_xiao6_hong5.jpg',6,6,2),(48,'/img/bangong/bg_da7_1.jpg','/img/bangong/bg_z7_1.jpg','/img/bangong/bg_xiao7_1.jpg',7,NULL,2),(49,'/img/bangong/bg_da7_2.jpg','/img/bangong/bg_z7_2.jpg','/img/bangong/bg_xiao7_2.jpg',7,NULL,2),(50,'/img/bangong/bg_da7_3.jpg','/img/bangong/bg_z7_3.jpg','/img/bangong/bg_xiao7_3.jpg',7,NULL,2),(51,'/img/bangong/bg_da7_4.jpg','/img/bangong/bg_z7_4.jpg','/img/bangong/bg_xiao7_4.jpg',7,NULL,2),(52,'/img/bangong/bg_da7_5.jpg','/img/bangong/bg_z7_5.jpg','/img/bangong/bg_xiao7_5.jpg',7,NULL,2),(53,'/img/shoes/shoes_da15_hei1.jpg','/img/shoes/shoes_z15_hei1.jpg','/img/shoes/shoes_xiao15_hei1.jpg',15,5,2),(54,'/img/shoes/shoes_da15_hei2.jpg','/img/shoes/shoes_z15_hei2.jpg','/img/shoes/shoes_xiao15_hei2.jpg',15,5,2),(55,'/img/shoes/shoes_da15_hei3.jpg','/img/shoes/shoes_z15_hei3.jpg','/img/shoes/shoes_xiao15_hei3.jpg',15,5,2),(56,'/img/shoes/shoes_da15_hei4.jpg','/img/shoes/shoes_z15_hei4.jpg','/img/shoes/shoes_xiao15_hei4.jpg',15,5,2),(57,'/img/shoes/shoes_da15_hei5.jpg','/img/shoes/shoes_z15_hei5.jpg','/img/shoes/shoes_xiao15_hei5.jpg',15,5,2),(58,'/img/shoes/shoes_da15_hei6.jpg','/img/shoes/shoes_z15_hei6.jpg','/img/shoes/shoes_xiao15_hei6.jpg',15,5,2),(59,'/img/shoes/shoes_da15_hei7.jpg','/img/shoes/shoes_z15_hei7.jpg','/img/shoes/shoes_xiao15_hei7.jpg',15,5,2),(60,'/img/shoes/shoes_da15_hei8.jpg','/img/shoes/shoes_z15_hei8.jpg','/img/shoes/shoes_xiao15_hei8.jpg',15,5,2),(61,'/img/shoes/shoes_da15_hei9.jpg','/img/shoes/shoes_z15_hei9.jpg','/img/shoes/shoes_xiao15_hei9.jpg',15,5,2),(62,'/img/shoes/shoes_da15_hei10.jpg','/img/shoes/shoes_z15_hei10.jpg','/img/shoes/shoes_xiao15_hei10.jpg',15,5,2),(63,'/img/shoes/shoes_da16_01.jpg','/img/shoes/shoes_z16_01.jpg','/img/shoes/shoes_xiao16_01.jpg',16,11,2),(64,'/img/shoes/shoes_da16_02.jpg','/img/shoes/shoes_z16_02.jpg','/img/shoes/shoes_xiao16_02.jpg',16,11,2),(65,'/img/cai/cai_da_01.jpg','/img/cai/cai_z_01.jpg','/img/cai/cai_xiao01.jpg',17,14,2),(66,'/img/cai/cai_da_02.jpg','/img/cai/cai_z_02.jpg','/img/cai/cai_xiao02.jpg',17,14,2),(67,'/img/cai/cai_da_03.jpg','/img/cai/cai_z_03.jpg','/img/cai/cai_xiao03.jpg',17,14,2),(68,'/img/cai/cai_da_04.jpg','/img/cai/cai_z_04.jpg','/img/cai/cai_xiao04.jpg',17,14,2),(69,'/img/cai/cai_da_05.jpg','/img/cai/cai_z_05.jpg','/img/cai/cai_xiao05.jpg',17,14,2),(70,'/img/shoes/shoes_da16_03.jpg','/img/shoes/shoes_z16_03.jpg','/img/shoes/shoes_xiao16_03.jpg',16,11,2),(71,'/img/shoes/shoes_da16_04.jpg','/img/shoes/shoes_z16_04.jpg','/img/shoes/shoes_xiao16_02.jpg',16,11,2),(72,'/img/shoes/shoes_da16_05.jpg','/img/shoes/shoes_z16_05.jpg','/img/shoes/shoes_xiao16_05.jpg',16,11,2),(73,'/img/shoes/shoes_da16_06.jpg','/img/shoes/shoes_z16_07.jpg','/img/shoes/shoes_xiao16_06.jpg',16,11,2),(74,'/img/shoes/shoes_da16_07.jpg','/img/shoes/shoes_z16_07.jpg','/img/shoes/shoes_xiao16_07.jpg',16,11,2),(75,'/img/cai/caihong_da_01.jpg','/img/cai/caihong_z_01.jpg','/img/cai/caihong_xiao01.jpg',17,16,2),(76,'/img/cai/caihong_da_02.jpg','/img/cai/caihong_z_02.jpg','/img/cai/caihong_xiao02.jpg',17,16,2),(77,'/img/cai/caihong_da_03.jpg','/img/cai/caihong_z_03.jpg','/img/cai/caihong_xiao03.jpg',17,16,2),(78,'/img/cai/caihong_da_04.jpg','/img/cai/caihong_z_04.jpg','/img/cai/caihong_xiao04.jpg',17,16,2),(79,'/img/cai/caihong_da_05.jpg','/img/cai/caihong_z_05.jpg','/img/cai/caihong_xiao05.jpg',17,16,2),(81,'/img/upload/productPhoto/n-xiao_01.jpg','/img/upload/productPhoto/n-da_01.jpg','/img/upload/productPhoto/n-z_01.jpg',54,2,2),(82,'/img/upload/productPhoto/n-z_01.jpg','/img/upload/productPhoto/n-da_01.jpg','/img/upload/productPhoto/n-xiao_01.jpg',54,1,2),(84,'/img/tuijian/pd-001.jpg','/img/tuijian/page-006.png','/img/tuijian/pd-001.jpg',55,17,2),(85,'/img/tuijian/pd-002.jpg','/img/tuijian/page-007.png','img/tuijian/icon-page-001.png',55,18,2),(86,'/img/tuijian/pd-003.jpg','/img/tuijian/page-008.png','img/tuijian/icon-page-002.png',55,19,2),(87,'/img/tuijian/pd-004.jpg','/img/tuijian/page-009.png','img/tuijian/icon-page-003.png',55,19,2),(88,'/img/tuijian/pd-005.jpg','/img/tuijian/page-003.png','/img/tuijian/pd-002.jpg',55,19,2),(107,'/upload/productPhoto/huawei_d.jpg','/upload/productPhoto/huawei_d.jpg','/upload/productPhoto/huawei_d.jpg',56,20,2),(108,'/upload/productPhoto/huawei_da_01.jpg','/upload/productPhoto/huawei_da_01.jpg','/upload/productPhoto/huawei_da_01.jpg',57,21,2),(109,'/upload/productPhoto/huawei_da_01.jpg','/upload/productPhoto/huawei_da_01.jpg','/upload/productPhoto/huawei_da_01.jpg',58,22,2);

/*Table structure for table `jd_order` */

DROP TABLE IF EXISTS `jd_order`;

CREATE TABLE `jd_order` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `orderNumber` varchar(200) NOT NULL,
  `productName` varchar(200) NOT NULL,
  `consignee` varchar(200) NOT NULL,
  `money` varchar(200) NOT NULL,
  `amount` int(10) NOT NULL,
  `buyerId` int(200) NOT NULL,
  `orderStatus` int(10) NOT NULL,
  `payStatus` int(10) NOT NULL,
  `payMode` int(10) NOT NULL,
  `distrMode` int(10) NOT NULL,
  `orderTime` date NOT NULL,
  `shopAddress` varchar(200) NOT NULL,
  `phone` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=111 DEFAULT CHARSET=utf8;

/*Data for the table `jd_order` */

insert  into `jd_order`(`id`,`orderNumber`,`productName`,`consignee`,`money`,`amount`,`buyerId`,`orderStatus`,`payStatus`,`payMode`,`distrMode`,`orderTime`,`shopAddress`,`phone`) values (104,'202019142819689','京东自营旗舰店','韦劲','19990.00',1,6,0,0,1,6,'2020-01-09','广西桂林七星区施家园9组150号','18077693576'),(105,'202019153445769','京东自营旗舰店','zhangsan','10796.00',1,17,0,0,1,1,'2020-01-09','广西桂林七星区八桂大厦8楼','17807714497'),(106,'20201915444749','京东自营旗舰店','李显','1764.00',1,17,1,0,1,1,'2020-01-09','广西壮族自治区柳州市柳北区八桂大厦8楼','17807714497'),(107,'202019164430143','京东自营旗舰店','唐某','94.50',1,18,0,1,1,1,'2020-01-09','广西桂林七星区象山区666','17807714497'),(108,'202019171356458','京东自营旗舰店','韦劲','2299.00',1,6,0,1,1,1,'2020-01-09','广西桂林七星区施家园9组150号','18077693576'),(109,'20201917205872','京东自营旗舰店','韦劲','59.90',1,6,0,0,1,1,'2020-01-09','广西桂林七星区施家园9组150号','18077693576'),(110,'202011014534304','京东自营旗舰店','覃','3998.00',1,19,0,0,1,1,'2020-01-10','广西壮族自治区柳州市柳南区订单撒多','18815472501');

/*Table structure for table `jd_receivingaddress` */

DROP TABLE IF EXISTS `jd_receivingaddress`;

CREATE TABLE `jd_receivingaddress` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `province` varchar(50) NOT NULL,
  `city` varchar(50) NOT NULL,
  `county` varchar(50) NOT NULL,
  `detailedaddress` varchar(200) NOT NULL,
  `phone` varchar(50) NOT NULL,
  `postalcode` varchar(20) DEFAULT NULL,
  `uid` int(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

/*Data for the table `jd_receivingaddress` */

insert  into `jd_receivingaddress`(`id`,`name`,`province`,`city`,`county`,`detailedaddress`,`phone`,`postalcode`,`uid`) values (12,'韦劲','广西','桂林','七星区','施家园9组150号','18077693576','533000',6),(13,'谭富盟','广西','桂林','七星区','八桂大厦','18077693576','533000',6),(14,'富盟','广西壮族自治区','桂林市','象山区','八桂大厦8楼','13367838497',NULL,9),(15,'xiao','广西','桂林','七星区','桂林八桂大夏','18813364217','525254',12),(18,'左仕','广西壮族自治区','桂林市','秀峰区','','18077693576',NULL,15),(20,'司马韦劲','广西','桂林','七星区','北京富盟家','13211501519','5333310',16),(21,'李显','广西壮族自治区','柳州市','柳北区','八桂大厦8楼','17807714497',NULL,17),(22,'唐某','广西','桂林','七星区','象山区666','17807714497','530012',18),(23,'覃','广西壮族自治区','柳州市','柳南区','订单撒多','18815472501',NULL,19);

/*Table structure for table `jd_shoopc` */

DROP TABLE IF EXISTS `jd_shoopc`;

CREATE TABLE `jd_shoopc` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `price` double NOT NULL,
  `data` datetime NOT NULL,
  `uri` varchar(50) DEFAULT NULL,
  `colour` varchar(50) DEFAULT NULL,
  `edition` varchar(50) DEFAULT NULL,
  `amount` int(5) NOT NULL,
  `cid` int(5) NOT NULL,
  `uid` int(5) NOT NULL,
  `state` int(5) NOT NULL,
  `oid` int(5) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=157 DEFAULT CHARSET=utf8;

/*Data for the table `jd_shoopc` */

insert  into `jd_shoopc`(`id`,`name`,`price`,`data`,`uri`,`colour`,`edition`,`amount`,`cid`,`uid`,`state`,`oid`) values (146,'Redmi K20Pro 骁龙855 索尼4800万超广角三摄 AMOLED弹出式全面屏 8GB+256GB 冰川蓝 游戏手机 小米 红米',1999,'2020-01-09 14:25:37','/img/shouji/sj_xiao1_lan1.jpg','冰川蓝','6GB+64GB',10,1,6,1,104),(147,'Redmi K20Pro 骁龙855 索尼4800万超广角三摄 AMOLED弹出式全面屏 8GB+256GB 冰川蓝 游戏手机 小米 红米',2699,'2020-01-09 15:29:27','/img/shouji/sj_xiao1_hei1.jpg','碳纤黑','8GB+256GB',1,1,17,1,105),(148,'OnitsukaTiger 鬼冢虎 Mexico66 李宇春同款 经典烫金标男女运动休闲鞋经典烫金标男女运动休闲鞋子',588,'2020-01-09 15:37:23','/img/tuijian/pd-003.jpg','白蓝','39',1,55,17,1,106),(149,'OnitsukaTiger 鬼冢虎 Mexico66 李宇春同款 经典烫金标男女运动休闲鞋经典烫金标男女运动休闲鞋子',588,'2020-01-09 15:39:02','/img/tuijian/pd-001.jpg','白蓝','45',1,55,17,0,0),(150,'荣耀20S 李现同款 3200万人像超级夜景 4800万超广角AI三摄 麒麟810 全网通版6GB+128GB 蝶羽白',1500,'2020-01-09 15:56:39','/upload/productPhoto/huawei_z_01.jpg','蝶羽白',NULL,1,58,17,0,0),(151,'雅高 搓澡神器 长柄洗澡刷搓澡巾洗澡神器沐浴刷搓背神器',18.9,'2020-01-09 16:38:54','/img/jiaju/jiaju_xiao5_1.jpg',NULL,'【软密毛刷 深度清洁】搓澡神器',5,5,18,1,107),(152,'京东国际国内现货 京觅智利进口车厘子J级 1磅尝鲜装 果径约26-28mm 新鲜水果 自营现货',59.9,'2020-01-09 16:39:34','/img/Fruits/sg_xiao2_1.jpg',NULL,'【预售】JJJ级 5kg原箱',1,2,18,0,0),(153,'Redmi K20Pro 骁龙855 索尼4800万超广角三摄 AMOLED弹出式全面屏 8GB+256GB 冰川蓝 游戏手机 小米 红米',2299,'2020-01-09 17:07:56','/img/shouji/sj_xiao1_lan1.jpg','冰川蓝','6GB+128GB',1,1,6,1,108),(154,'京东国际国内现货 京觅智利进口车厘子J级 1磅尝鲜装 果径约26-28mm 新鲜水果 自营现货',59.9,'2020-01-09 17:17:25','/img/Fruits/sg_z2_1.jpg',NULL,'【预售】黄车JJ级2.2kg原箱',1,2,6,1,109),(155,'Redmi K20Pro 骁龙855 索尼4800万超广角三摄 AMOLED弹出式全面屏 8GB+256GB 冰川蓝 游戏手机 小米 红米',1999,'2020-01-10 14:04:13','/shouji/sj_xiao1_lan1.jpg','冰川蓝','6GB+128GB',2,1,19,1,110),(156,'Redmi K20Pro 骁龙855 索尼4800万超广角三摄 AMOLED弹出式全面屏 8GB+256GB 冰川蓝 游戏手机 小米 红米',1999,'2020-02-11 15:08:51','/shouji/sj_z1_hei1.jpg','碳纤黑','6GB+64GB',1,1,20,0,0);

/*Table structure for table `jd_user` */

DROP TABLE IF EXISTS `jd_user`;

CREATE TABLE `jd_user` (
  `u_id` int(50) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `u_user` varchar(50) NOT NULL COMMENT '用户账号',
  `u_pwd` varchar(50) NOT NULL COMMENT '用户密码',
  `u_name` varchar(20) DEFAULT NULL COMMENT '用户昵称',
  `u_addres` varchar(50) DEFAULT NULL COMMENT '用户地址',
  `u_type` int(11) NOT NULL COMMENT '用户类型',
  `u_phone` varchar(11) DEFAULT NULL COMMENT '用户手机号',
  `u_email` varchar(50) DEFAULT NULL COMMENT '用户邮箱',
  `u_photo` varchar(200) DEFAULT NULL COMMENT '用户头像',
  PRIMARY KEY (`u_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

/*Data for the table `jd_user` */

insert  into `jd_user`(`u_id`,`u_user`,`u_pwd`,`u_name`,`u_addres`,`u_type`,`u_phone`,`u_email`,`u_photo`) values (6,'jd_17611679813576','Wj123456','韦劲',NULL,0,'18077693576',NULL,'/img/shouji/sj_xiao1_lan1.jpg'),(15,'jd_18272547958497','Jd123456',NULL,NULL,0,'13367838497',NULL,NULL),(16,'jd_16645699151519','Qq710417','林哥哥i',NULL,0,'13211501519',NULL,NULL),(18,'jd_19330221724497','Jm123456','ljm123',NULL,0,'17807714497',NULL,NULL),(20,'jd_17147223652501','Jd12580',NULL,NULL,0,'18815472501',NULL,NULL);

/*Table structure for table `kuaidi100_delivery` */

DROP TABLE IF EXISTS `kuaidi100_delivery`;

CREATE TABLE `kuaidi100_delivery` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `delivery_name` varchar(255) NOT NULL,
  `delivery_code` varchar(255) NOT NULL,
  `delivery_sort` varchar(2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=147 DEFAULT CHARSET=utf8;

/*Data for the table `kuaidi100_delivery` */

insert  into `kuaidi100_delivery`(`id`,`delivery_name`,`delivery_code`,`delivery_sort`) values (1,'澳大利亚邮政','auspost','A'),(2,'AAE','aae','A'),(3,'安信达','anxindakuaixi','A'),(4,'百世汇通','huitongkuaidi','B'),(5,'BHT','bht','B'),(6,'包裹/平邮/挂号信','youzhengguonei','B'),(7,'邦送物流','bangsongwuliu','B'),(8,'希伊艾斯（CCES）','cces','C'),(9,'中国东方（COE）','coe','C'),(10,'传喜物流','chuanxiwuliu','C'),(11,'加拿大邮政Canada Post','canpost','C'),(12,'加拿大邮政Canada Post','canpostfr','C'),(13,'大田物流','datianwuliu','D'),(14,'德邦物流','debangwuliu','D'),(15,'DPEX','dpex','D'),(16,'DHL-中国件','dhl','D'),(17,'DHL-国际件','dhlen','D'),(18,'DHL-德国件','dhlde','D'),(19,'D速快递','dsukuaidi','D'),(20,'递四方','disifang','D'),(21,'EMS','ems','E'),(22,'E邮宝','ems','E'),(23,'EMS','emsen','E'),(24,'EMS-（中国-国际）件','emsguoji','E'),(25,'EMS','emsinten','E'),(26,'Fedex-国际件','fedex','F'),(27,'Fedex-国际件','fedexcn','F'),(28,'Fedex-美国件','fedexus','F'),(29,'飞康达物流','feikangda','F'),(30,'飞快达','feikuaida','F'),(31,'凡客如风达','rufengda','F'),(32,'风行天下','fengxingtianxia','F'),(33,'飞豹快递','feibaokuaidi','F'),(34,'港中能达','ganzhongnengda','G'),(35,'国通快递','guotongkuaidi','G'),(36,'广东邮政','guangdongyouzhengwuliu','G'),(37,'挂号信','youzhengguonei','G'),(38,'国内邮件','youzhengguonei','G'),(39,'国际邮件','youzhengguoji','G'),(40,'GLS','gls','G'),(41,'共速达','gongsuda','G'),(42,'汇通快运','huitongkuaidi','H'),(43,'汇强快递','huiqiangkuaidi','H'),(44,'华宇物流','tiandihuayu','H'),(45,'恒路物流','hengluwuliu','H'),(46,'华夏龙','huaxialongwuliu','H'),(47,'海航天天','tiantian','H'),(48,'海外环球','haiwaihuanqiu','H'),(49,'河北建华','hebeijianhua','H'),(50,'海盟速递','haimengsudi','H'),(51,'华企快运','huaqikuaiyun','H'),(52,'山东海红','haihongwangsong','H'),(53,'佳吉物流','jiajiwuliu','J'),(54,'佳怡物流','jiayiwuliu','J'),(55,'加运美','jiayunmeiwuliu','J'),(56,'京广速递','jinguangsudikuaijian','J'),(57,'急先达','jixianda','J'),(58,'晋越快递','jinyuekuaidi','J'),(59,'jinyuekuaidi','jietekuaidi','J'),(60,'金大物流','jindawuliu','J'),(61,'嘉里大通','jialidatong','J'),(62,'快捷速递','kuaijiesudi','K'),(63,'康力物流','kangliwuliu','K'),(64,'跨越物流','kuayue','K'),(65,'联昊通','lianhaowuliu','L'),(66,'龙邦物流','longbanwuliu','L'),(67,'蓝镖快递','lanbiaokuaidi','L'),(68,'乐捷递','lejiedi','L'),(69,'联邦快递','lianbangkuaidi','L'),(70,'联邦快递','lianbangkuaidien','L'),(71,'立即送','lijisong','L'),(72,'隆浪快递','longlangkuaidi','L'),(73,'门对门','menduimen','M'),(74,'美国快递','meiguokuaidi','M'),(75,'明亮物流','mingliangwuliu','M'),(76,'OCS','OCS','O'),(77,'onTrac','ontrac','O'),(78,'全晨快递','quanchenkuaidi','Q'),(79,'全际通','quanjitong','Q'),(80,'全日通','quanritongkuaidi','Q'),(81,'全一快递','quanyikuaidi','Q'),(82,'全峰快递','quanfengkuaidi','Q'),(83,'七天连锁','sevendays','Q'),(84,'如风达快递','rufengda','R'),(85,'伸通','shentong','S'),(86,'顺丰速递','shunfeng','S'),(87,'顺丰','shunfengen','S'),(88,'三态速递','santaisudi','S'),(89,'盛辉物流','shenghuiwuliu','S'),(90,'速尔物流','suer','S'),(91,'盛丰物流','shengfengwuliu','S'),(92,'上大物流','shangda','S'),(93,'三态速递','santaisudi','S'),(94,'山东海红','haihongwangsong','S'),(95,'赛澳递','saiaodi','S'),(96,'山东海红','haihongwangsong','S'),(97,'山西红马甲','sxhongmajia','S'),(98,'圣安物流','shenganwuliu','S'),(99,'穗佳物流','suijiawuliu','S'),(100,'天地华宇','tiandihuayu','T'),(101,'天天快递','tiantian','T'),(102,'TNT','TNT','T'),(103,'TNT','tnten','T'),(104,'通和天下','tonghetianxia','T'),(105,'UPS','ups','U'),(106,'UPS','UPS','U'),(107,'优速物流','youshuwuliu','U'),(108,'USPS','usps','U'),(109,'万家物流','wanjiawuliu','U'),(110,'万象物流','wanxiangwuliu','U'),(111,'微特派','weitepai','U'),(112,'新邦物流','xinbangwuliu','X'),(113,'信丰物流','xinbangwuliu','X'),(114,'星晨急便','xingchengjibian','X'),(115,'鑫飞鸿','xinhongyukuaidi','X'),(116,'希伊艾斯(CCES)','cces','X'),(117,'新邦物流','xinbangwuliu','X'),(118,'新蛋奥硕物流','neweggozzo','X'),(119,'香港邮政','hkpost','X'),(120,'圆通速递','yuantong','Y'),(121,'韵达快运','yunda','Y'),(122,'运通快递','yuntongkuaidi','Y'),(123,'邮政小包（国内），邮政包裹（国内）、邮政国内给据（国内）','youzhengguonei','Y'),(124,'邮政小包（国际），邮政包裹（国际）、邮政国内给据（国际','youzhengguoji','Y'),(125,'远成物流','yuanchengwuliu','Y'),(126,'亚风速递','yafengsudi','Y'),(127,'一邦速递','yibangwuliu','Y'),(128,'优速物流','youshuwuliu','Y'),(129,'源伟丰快递','yuanweifeng','Y'),(130,'元智捷诚','yuanzhijiecheng','Y'),(131,'越丰物流','yuefengwuliu','Y'),(132,'源安达','yuananda','Y'),(134,'原飞航','yuanfeihangwuliu','Y'),(135,'芝麻开门','zhimakaimen','Y'),(136,'银捷速递','yinjiesudi','Y'),(137,'一统飞鸿','yitongfeihong','Y'),(138,'中通速递','zhongtong','Z'),(139,'宅急送','zhaijisong','Z'),(140,'中邮物流','zhongyouwuliu','Z'),(141,'忠信达','zhongxinda','Z'),(142,'中速快件','zhongsukuaidi','Z'),(143,'芝麻开门','zhimakaimen','Z'),(144,'郑州建华','zhengzhoujianhua','Z'),(145,'中天万运','zhongtianwanyun','Z'),(146,'中通快运','zhongtongkuaiyun','Z');

/*Table structure for table `property` */

DROP TABLE IF EXISTS `property`;

CREATE TABLE `property` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cid` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_property_category` (`cid`),
  CONSTRAINT `fk_property_category` FOREIGN KEY (`cid`) REFERENCES `jd_category` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=159 DEFAULT CHARSET=utf8;

/*Data for the table `property` */

insert  into `property`(`id`,`cid`,`name`) values (12,9,'商品名称：'),(13,9,'CPU型号：'),(14,9,'摄像头数量：'),(15,9,'分辨率：'),(16,9,'充电器：'),(17,9,'商品编号：'),(18,9,'运行内存：'),(19,9,'后摄主摄像素：'),(20,9,'屏幕比例：'),(21,9,'商品毛重：'),(22,9,'机身存储：'),(23,9,'前摄主摄像素：'),(24,9,'屏幕前摄组合：'),(25,9,'系统：'),(26,9,'商品产地：'),(27,9,'存储卡：'),(28,9,'主屏幕尺寸（英寸）：'),(29,9,'电池容量（mAh）：'),(33,11,'商品名称：'),(34,11,'类别：'),(35,11,'商品编号：'),(36,11,'国产/进口：'),(37,11,'商品毛重：'),(38,11,'商品产地：'),(43,1,'商品名称：'),(44,1,'观看距离：'),(45,1,'选购指数：'),(46,1,'商品编号：'),(47,1,'电视类型：'),(48,1,'商品毛重：'),(49,1,'能效等级：'),(50,1,'商品产地：'),(51,1,'屏幕尺寸：'),(52,2,'商品名称：'),(53,2,'货号：'),(54,2,'流行元素：'),(55,2,'袖型：'),(56,2,'款式：'),(57,2,'商品编号：'),(58,2,'风格：'),(59,2,'适用场景：'),(60,2,'基础风格：'),(61,2,'适用人群：'),(62,2,'店铺：'),(63,2,'厚度：'),(64,2,'图案：'),(65,2,'版型：'),(66,2,'上市时间：'),(67,2,'商品毛重：'),(68,2,'领型：'),(69,2,'材质：'),(70,2,'适用季节：'),(71,3,'商品名称：'),(72,3,'材质：'),(73,3,'商品编号：'),(74,3,'功能：'),(75,3,'商品毛重：'),(76,3,'类别：'),(77,3,'商品产地：'),(78,20,'商品名称：'),(79,20,'拉杆种类：'),(80,20,'图案：'),(81,20,'颜色：'),(82,20,'适合人群：'),(83,20,'商品编号：'),(84,20,'适用场景：'),(85,20,'闭合方式：'),(86,20,'尺寸：'),(87,20,'轮子种类：'),(88,20,'店铺：'),(89,20,'箱包硬度：'),(90,20,'材质：'),(91,20,'类别：'),(99,5,'商品名称：'),(100,5,'显示比例：'),(101,5,'机身内存：'),(102,5,'商品编号：'),(103,5,'产品类别：'),(104,5,'个性：'),(105,5,'商品毛重：'),(106,5,'亮度：'),(107,5,'商品产地：'),(108,5,'3D功能：'),(111,12,'商品名称：'),(112,12,'商品产地：'),(113,12,'鞋品名称：'),(114,12,'适用冬季：'),(115,12,'鞋面材质：'),(116,12,'图案：'),(117,12,'适用人群：'),(118,12,'商品编号：'),(119,12,'货号：'),(120,12,'闭合方式：'),(121,12,'功能：'),(122,12,'流行元素：'),(123,12,'鞋头款式：'),(124,12,'上市时间：'),(125,12,'店铺：'),(126,12,'风格：'),(127,12,'制鞋工艺：'),(128,14,'商品名称：'),(129,14,'口味：'),(130,14,'商品编号：'),(131,14,'包装：'),(132,14,'店铺：'),(133,14,'商品毛重：'),(134,4,'商品名称：'),(135,4,'系统：'),(136,4,'待机时长：'),(137,4,'显卡型号：'),(138,4,'刷新率：'),(139,4,'处理器：'),(140,4,'商品编号：'),(141,4,'厚度：'),(142,4,'系列：'),(143,4,'色域：'),(144,4,'优选服务：'),(145,4,'店铺：'),(146,4,'硬盘容量：'),(147,4,'裸机重量：'),(148,4,'内存容量：'),(149,4,'显存容量：'),(150,4,'商品毛重：'),(151,4,'游戏性能：'),(152,4,'屏幕尺寸：'),(153,4,'特性：'),(154,4,'机身材质：'),(158,10,'cxbcvcxv');

/*Table structure for table `propertyvalue` */

DROP TABLE IF EXISTS `propertyvalue`;

CREATE TABLE `propertyvalue` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `commId` int(11) DEFAULT NULL,
  `ptId` int(11) DEFAULT NULL,
  `value` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_pvalue_pty` (`ptId`)
) ENGINE=InnoDB AUTO_INCREMENT=423 DEFAULT CHARSET=utf8;

/*Data for the table `propertyvalue` */

insert  into `propertyvalue`(`id`,`commId`,`ptId`,`value`) values (2,1,12,'小米Redmi Note8666'),(3,1,13,'骁龙665'),(4,1,14,'后置四摄'),(5,1,15,'全高清FHD+'),(6,1,16,'其他'),(7,1,17,'100007958750'),(8,1,18,'6GB'),(9,1,19,'4800万像素'),(10,1,20,'19.5:9'),(12,1,21,'440.00g'),(13,1,22,'128GB'),(14,1,23,'1300万像素'),(15,1,24,'水滴屏'),(16,1,25,'Android(安卓)'),(17,1,26,'中国大陆'),(18,1,27,'支持MicroSD(TF)'),(19,1,28,'6.3英寸'),(20,1,29,'4000mAh'),(22,2,33,'京觅智利原装进口车厘'),(23,2,34,'宾莹Bing'),(24,2,35,'100000904636'),(25,2,36,'进口'),(26,2,37,'5.96kg'),(27,2,38,'智利'),(28,3,43,'创维（Skyworth）'),(30,3,44,'3m-3.5m（56-65英寸）'),(31,3,45,'10.0-8.0'),(32,3,46,'100000384561'),(33,3,47,'全面屏，人工智能，大'),(34,3,48,'23.5kg'),(35,3,49,'三级能效'),(36,3,50,'中国大陆'),(37,3,51,'65英寸'),(39,4,78,'小米（MI）旅行箱拉杆箱...'),(40,4,79,'双杆'),(41,4,80,'纯色'),(42,4,81,'灰色'),(43,4,82,'青少年'),(44,4,83,'44763883226'),(45,4,84,'旅行'),(46,4,85,'拉链'),(47,4,86,'24英寸'),(48,4,87,'万向轮'),(49,4,88,'智联优选旗舰店'),(50,4,89,'硬箱'),(51,4,90,'PC'),(52,4,91,'登机箱'),(57,5,71,'雅高YG-W002'),(58,5,72,'塑料'),(59,5,73,'5029579'),(60,5,74,'其它'),(61,5,75,'120.00g'),(62,5,76,'沐浴工具'),(63,5,77,'中国大陆浙江省金华市'),(64,6,134,'联想拯救者Y7000P 15.6'),(65,6,135,'Windows 10'),(66,6,136,'5-7小时'),(67,6,137,'GTX1660Ti'),(68,6,138,'144HZ'),(69,6,139,'Intel i7标准电压版'),(70,6,140,'62268646777'),(71,6,141,'20.0mm—25.0mm'),(72,6,142,'联想 - 拯救者'),(73,6,143,'72%NTSC'),(74,6,144,'两年质保'),(75,6,145,' 联想西南授权专卖店'),(76,6,146,'混合硬盘'),(77,6,147,'2-2.5kg'),(78,6,148,'32G'),(79,6,149,'6G'),(80,6,150,'6.0kg'),(81,6,151,'吃鸡性能，发烧级，骨'),(82,6,152,'15.6英寸'),(83,6,153,'全面屏，背光键盘，双内存'),(84,6,154,'金属+复合材质'),(85,7,99,'腾讯TX_T1'),(86,7,100,'16:10/16:9'),(87,7,101,'16G'),(88,7,102,'100010496672'),(89,7,103,'迷你/便携'),(90,7,104,'内置电池，智能系统，无线'),(91,7,105,'0.94kg'),(92,7,106,'499ANSI流明以下'),(93,7,107,'中国大陆'),(94,7,108,'支持3D功能'),(143,17,43,'乔巴先生 权志龙同款卫...'),(144,17,50,'中国大陆'),(145,17,65,'宽松型'),(146,17,60,'青春流行'),(147,17,61,'青少年'),(148,17,56,'套头'),(149,17,57,'64300323736'),(150,17,53,'QB0020'),(151,17,63,'常规'),(153,17,58,'街头'),(154,17,66,'2019年冬季'),(155,17,62,'乔巴先生旗舰店'),(156,17,59,'日常'),(157,17,68,'圆领'),(158,17,69,'棉'),(159,17,70,'冬季'),(160,17,67,'1.0kg'),(161,17,64,'其它'),(163,17,55,'常规袖'),(166,15,111,'舒悦老人鞋休闲鞋加绒保...'),(167,15,112,'中国大陆'),(168,15,113,'高帮鞋'),(169,15,114,'冬季'),(170,15,115,'亮片布'),(171,15,116,'纯色'),(172,15,117,'青少年'),(173,15,118,'36717665942'),(174,15,119,'666-19'),(175,15,120,'魔术贴'),(176,15,121,'保暖'),(177,15,122,'车缝线'),(178,15,123,'圆头'),(179,15,124,'2019冬季'),(180,15,125,'舒悦旗舰店'),(181,15,126,'百搭'),(182,15,127,'胶粘鞋'),(184,16,111,'【年货盛典 狂欢1折秒...'),(185,16,119,'卡戈登2802'),(186,16,120,'系带'),(187,16,124,'2019冬季'),(188,16,118,'64004021979'),(189,16,125,'卡戈登旗舰店'),(190,16,117,'男士'),(191,16,121,'缓冲，减震'),(192,18,128,'嗨吃家桶装酸辣粉 家庭...'),(193,18,129,'酸辣味'),(194,18,130,'64564435383'),(195,18,131,'桶装'),(196,18,132,'润约食品专营店'),(197,18,133,'110.00g'),(198,19,111,'Under Armour 安德玛官方 UA男子Micro G Pursuit跑步鞋-3000011 黑色102 43'),(199,20,111,'深蹲器 蹲蹬腿练腿倒蹲机下蹲训练器勾腿机力量健身器材 红色'),(200,21,111,'2019新品上新汽车脚垫单片脚垫单个主副正驾驶室脚垫司机座位前左右后排连体全包围汽车脚垫单片 单层主架黑色米线'),(201,22,111,'依波(EBOHR)手表 都市经典系列精致大气钟表实心钢带防水机械情侣表男表36140114'),(202,23,111,'【品质保证】雷锋帽女冬季冬天加厚保暖电动车棉帽子男东北户外骑车防风防寒帽 藏青色 均码(男女通用)'),(203,24,111,'feiyue/飞跃复古日系休闲帆布鞋街拍潮鞋男女款情侣鞋 938米 37偏大一码'),(204,25,111,'<品牌直营>实木加厚砧板圆形松木菜板家用案板厨房切菜板商用菜墩整木骨头砧板 38*8带钢圈'),(205,26,111,'雅鹿两双面穿派克服羽绒服女中长款2019冬新大毛领过膝修身白鸭绒X 双面穿黑色+米白 XL'),(206,27,111,'蹦床儿童 成人健身减脂室内蹦男女通用 蓝色《房级别》加强款 绿色(健身房级别)加强款'),(207,28,111,'创奇【清仓】 床 实木床软包简易小户型现代简约1.5米学生床租房家具1.8米卧室大床出租房床1.2米 B款 实木床 裸床 1500*2000mm'),(208,29,111,'<品牌直降>假发帽子一体女成人长发长卷发网红海军款帽秋冬款女孩时尚自然全头套抖音可拆卸潮流戴帽子的假 可拆卸款【棕黑色】'),(209,30,111,'凯乐石（KAILAS）冲锋衣 男女款parka三合一羽绒内胆防风外套防水防潮牌寒户外旅行登山服 【女款】粉瓷 XXL'),(210,31,111,'【特价来袭】男士背包韩版休闲双肩包男电脑包时尚潮流大学生书包旅行包包 暗灰色(升级款)'),(211,32,111,'原创设计师款无耳洞女气质银针耳钉冷淡风感显脸瘦饰 S925银针耳钉一定要有耳洞哦!!'),(212,33,111,'健身体操训练吊环家用引体向上脊椎牵引室内器材成人拉伸运动 手柄+3.5米悬挂带+膨胀挂钩 吊环手柄+0.5米悬挂带'),(213,34,111,'欧美新潮个性耳环女 灵动立体双菱形满钻几何耳钩耳坠耳饰品个性潮 白色 925银'),(214,35,111,'登机小型拉杆箱 铝框小型网红ins登机箱子皮旅行拉杆密码行李箱万向轮女18寸男20 墨绿色 20寸登机箱'),(215,36,111,'千禧盛世 简约现代中式卧室家具实木衣柜整体衣橱组装3456门大衣柜特价 胡桃色不加顶 四门'),(216,37,111,'弹跳器 跳跳杆儿童青少年成人健身双单杆蹦蹦跳娃娃跳蹦高器 加强款单杆绿白'),(217,38,111,'361度 女鞋运动鞋女2019秋冬季新款潮流时尚韩版学生跑步鞋休闲气垫鞋子 玫瑰脏粉/太空灰（网面） 37'),(218,39,111,'保暖内衣女加厚加绒学生初中生高中少女大童秋衣秋裤纯棉套装秋冬 88灰色猫咪 XL'),(219,40,111,'骆驼（CAMEL）男鞋  新款商务系带休闲皮轻便办公国民男爸爸鞋 A832287200  暗棕 41'),(220,41,111,'配近视眼镜镜框近视眼镜男女平光超轻全框黑舒适配眼睛镜框架成品有度数 砂黑配250度近视片'),(221,42,111,'花花公子皮鞋男2019秋冬季新款男士商务休闲皮鞋韩版百搭潮流系带真皮鞋子男 9858黑色 41'),(222,43,111,'增高鞋男 运动秋冬高帮鞋鞋百搭潮鞋子休闲日系季马丁靴ins超火内增高 170白色 38'),(223,44,111,'骆驼（CAMEL）男鞋 百搭透气跑步潮流运动鞋套脚鞋子 A932252790 黑色 40'),(224,45,111,'双汇 火腿肠 王中王火腿肠 60g*10支/600g装'),(225,46,111,'韩版复古方框金属男女文艺眼镜架原宿风防蓝光平光镜可配 金画黑'),(226,47,111,'圆形led灯板用灯芯led吸顶灯改造灯板led一体化光源模组透镜佛山·照明同款 模组方形36w21.0cm 其它 暖白'),(227,48,111,'芙丽芳丝（freeplus）净润洗面霜100g（洗面奶洁面乳 男女适用 氨基酸系 日本 护肤品化妆品  温和不易紧绷）'),(228,49,111,'<品牌直降>帽子假发一体女成人带头发的帽子假发女长发帽子夏天黑长直卷发网红时尚自然全头新式发套抖音同 米白色帽子长直发【棕黑色】'),(229,50,111,'帽子男四季通用户外棒球帽钓鱼防晒遮阳帽新款男女情侣百搭长檐春秋鸭舌帽太阳帽 黑色'),(230,51,111,'帽子男四季通用户外棒球帽钓鱼防晒遮阳帽新款男女情侣百搭长檐春秋鸭舌帽太阳帽 黑色'),(231,52,111,'NIKE耐克男鞋跑步鞋2019秋季新款TanJun轻便运动鞋休闲训练缓震跑鞋812654-011 店长推荐812654-011 43'),(232,52,127,NULL),(233,52,126,NULL),(234,52,125,NULL),(235,52,124,NULL),(236,52,123,NULL),(237,52,122,NULL),(238,52,121,NULL),(239,52,120,NULL),(240,52,119,NULL),(241,52,118,NULL),(242,52,117,NULL),(243,52,116,NULL),(244,52,115,NULL),(245,52,114,NULL),(246,52,113,NULL),(247,52,112,NULL),(248,50,127,NULL),(249,50,126,NULL),(250,50,125,NULL),(251,50,124,NULL),(252,50,123,NULL),(253,50,122,NULL),(254,50,121,NULL),(255,50,120,NULL),(256,50,119,NULL),(257,50,118,NULL),(258,50,117,NULL),(259,50,116,NULL),(260,50,115,NULL),(261,50,114,NULL),(262,50,113,NULL),(263,50,112,NULL),(264,43,127,NULL),(265,43,126,NULL),(266,43,125,NULL),(267,43,124,NULL),(268,43,123,NULL),(269,43,122,NULL),(270,43,121,NULL),(271,43,120,NULL),(272,43,119,NULL),(273,43,118,NULL),(274,43,117,NULL),(275,43,116,NULL),(276,43,115,NULL),(277,43,114,NULL),(278,43,113,NULL),(279,43,112,NULL),(280,54,112,NULL),(281,54,133,NULL),(282,54,132,NULL),(283,54,131,NULL),(284,54,130,'666'),(285,54,129,NULL),(286,54,128,'牛奶'),(325,55,127,NULL),(326,55,126,NULL),(327,55,125,NULL),(328,55,124,NULL),(329,55,123,NULL),(330,55,122,NULL),(331,55,121,NULL),(332,55,120,NULL),(333,55,119,NULL),(334,55,118,NULL),(335,55,117,NULL),(336,55,116,NULL),(337,55,115,NULL),(338,55,114,NULL),(339,55,113,NULL),(340,55,112,NULL),(341,55,111,NULL),(351,19,127,NULL),(352,19,126,NULL),(353,19,125,NULL),(354,19,124,NULL),(355,19,123,NULL),(356,19,122,NULL),(357,19,121,NULL),(358,19,120,NULL),(359,19,119,NULL),(360,19,118,NULL),(361,19,117,NULL),(362,19,116,NULL),(363,19,115,NULL),(364,19,114,NULL),(365,19,113,NULL),(366,19,112,NULL),(367,17,54,NULL),(368,17,52,NULL),(380,56,18,'6GB'),(381,56,17,'100007926790'),(382,56,16,'闪充3.0'),(384,56,14,'3'),(386,56,12,'华为荣耀20s'),(387,57,29,NULL),(388,57,28,NULL),(389,57,27,NULL),(390,57,26,NULL),(391,57,25,NULL),(392,57,24,NULL),(393,57,23,NULL),(394,57,22,NULL),(395,57,21,NULL),(396,57,20,NULL),(397,57,19,NULL),(398,57,18,'6GB+128GB'),(399,57,17,NULL),(400,57,16,NULL),(401,57,15,NULL),(402,57,14,NULL),(403,57,13,NULL),(404,57,12,''),(405,58,29,NULL),(406,58,28,NULL),(407,58,27,NULL),(408,58,26,NULL),(409,58,25,NULL),(410,58,24,NULL),(411,58,23,NULL),(412,58,22,NULL),(413,58,21,NULL),(414,58,20,NULL),(415,58,19,NULL),(416,58,18,NULL),(417,58,17,NULL),(418,58,16,'闪充3.0'),(419,58,15,NULL),(420,58,14,'3'),(421,58,13,NULL),(422,58,12,'41000han');

/*Table structure for table `resources` */

DROP TABLE IF EXISTS `resources`;

CREATE TABLE `resources` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '资源名称',
  `resUrl` varchar(255) DEFAULT NULL COMMENT '资源url',
  `type` int(11) DEFAULT NULL COMMENT '资源类型   1:菜单    2：按钮',
  `parentId` int(11) DEFAULT NULL COMMENT '父资源',
  `sort` int(11) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

/*Data for the table `resources` */

insert  into `resources`(`id`,`name`,`resUrl`,`type`,`parentId`,`sort`) values (1,'系统设置','/system',0,0,1),(2,'用户管理','/usersPage',1,1,2),(3,'角色管理','/rolesPage',1,1,3),(4,'资源管理','/resourcesPage',1,1,4),(5,'添加用户','/users/add',2,2,5),(6,'删除用户','/users/delete',2,2,6),(7,'添加角色','/roles/add',2,3,7),(8,'删除角色','/roles/delete',2,3,8),(9,'添加资源','/resources/add',2,4,9),(10,'删除资源','/resources/delete',2,4,10),(11,'分配角色','/users/saveUserRoles',2,2,11),(13,'分配权限','/roles/saveRoleResources',2,3,12);

/*Table structure for table `system_log` */

DROP TABLE IF EXISTS `system_log`;

CREATE TABLE `system_log` (
  `id` varchar(36) NOT NULL COMMENT 'ID',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `log_level` int(11) DEFAULT NULL COMMENT '日志等级',
  `operation_unit` varchar(36) NOT NULL COMMENT '被操作的对象',
  `method` varchar(200) NOT NULL COMMENT '方法名',
  `args` varchar(100) NOT NULL COMMENT '参数',
  `user_id` varchar(20) NOT NULL COMMENT '操作人id',
  `user_name` varchar(50) NOT NULL COMMENT '操作人',
  `log_describe` varchar(200) NOT NULL COMMENT '日志描述',
  `operation_type` varchar(20) NOT NULL COMMENT '操作类型',
  `run_time` int(11) NOT NULL COMMENT '方法运行时间',
  `return_value` longtext NOT NULL COMMENT '方法返回值',
  `ip_address` varchar(50) NOT NULL COMMENT 'IP地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='日志';

/*Data for the table `system_log` */

/* Procedure structure for procedure `init_shiro_demo` */

/*!50003 DROP PROCEDURE IF EXISTS  `init_shiro_demo` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`%` PROCEDURE `init_shiro_demo`()
BEGIN	
/*
SQLyog 企业版 - MySQL GUI v7.14 
MySQL - 5.6.16-log : Database - 
*********************************************************************
*/
/*表结构插入*/
DROP TABLE IF EXISTS `u_permission`;
CREATE TABLE `u_permission` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `url` VARCHAR(256) DEFAULT NULL COMMENT 'url地址',
  `name` VARCHAR(64) DEFAULT NULL COMMENT 'url描述',
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
/*Table structure for table `u_role` */
DROP TABLE IF EXISTS `u_role`;
CREATE TABLE `u_role` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(32) DEFAULT NULL COMMENT '角色名称',
  `type` VARCHAR(10) DEFAULT NULL COMMENT '角色类型',
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*Table structure for table `u_role_permission` */
DROP TABLE IF EXISTS `u_role_permission`;
CREATE TABLE `u_role_permission` (
  `rid` BIGINT(20) DEFAULT NULL COMMENT '角色ID',
  `pid` BIGINT(20) DEFAULT NULL COMMENT '权限ID'
) ENGINE=INNODB DEFAULT CHARSET=utf8;
/*Table structure for table `u_user` */
DROP TABLE IF EXISTS `u_user`;
CREATE TABLE `u_user` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `nickname` VARCHAR(20) DEFAULT NULL COMMENT '用户昵称',
  `email` VARCHAR(128) DEFAULT NULL COMMENT '邮箱|登录帐号',
  `pswd` VARCHAR(32) DEFAULT NULL COMMENT '密码',
  `create_time` DATETIME DEFAULT NULL COMMENT '创建时间',
  `last_login_time` DATETIME DEFAULT NULL COMMENT '最后登录时间',
  `status` BIGINT(1) DEFAULT '1' COMMENT '1:有效，0:禁止登录',
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*Table structure for table `u_user_role` */
DROP TABLE IF EXISTS `u_user_role`;
CREATE TABLE `u_user_role` (
  `uid` BIGINT(20) DEFAULT NULL COMMENT '用户ID',
  `rid` BIGINT(20) DEFAULT NULL COMMENT '角色ID'
) ENGINE=INNODB DEFAULT CHARSET=utf8;
/*
SQLyog 企业版 - MySQL GUI v7.14 
MySQL - 5.6.16-log : Database - i_wenyiba_com
*********************************************************************
*/
/*所有的表数据插入*/
/*Data for the table `u_permission` */
INSERT  INTO `u_permission`(`id`,`url`,`name`) VALUES (4,'/permission/index.shtml','权限列表'),(6,'/permission/addPermission.shtml','权限添加'),(7,'/permission/deletePermissionById.shtml','权限删除'),(8,'/member/list.shtml','用户列表'),(9,'/member/online.shtml','在线用户'),(10,'/member/changeSessionStatus.shtml','用户Session踢出'),(11,'/member/forbidUserById.shtml','用户激活&禁止'),(12,'/member/deleteUserById.shtml','用户删除'),(13,'/permission/addPermission2Role.shtml','权限分配'),(14,'/role/clearRoleByUserIds.shtml','用户角色分配清空'),(15,'/role/addRole2User.shtml','角色分配保存'),(16,'/role/deleteRoleById.shtml','角色列表删除'),(17,'/role/addRole.shtml','角色列表添加'),(18,'/role/index.shtml','角色列表'),(19,'/permission/allocation.shtml','权限分配'),(20,'/role/allocation.shtml','角色分配');
/*Data for the table `u_role` */
INSERT  INTO `u_role`(`id`,`name`,`type`) VALUES (1,'系统管理员','888888'),(3,'权限角色','100003'),(4,'用户中心','100002');
/*Data for the table `u_role_permission` */
INSERT  INTO `u_role_permission`(`rid`,`pid`) VALUES (4,8),(4,9),(4,10),(4,11),(4,12),(3,4),(3,6),(3,7),(3,13),(3,14),(3,15),(3,16),(3,17),(3,18),(3,19),(3,20),(1,4),(1,6),(1,7),(1,8),(1,9),(1,10),(1,11),(1,12),(1,13),(1,14),(1,15),(1,16),(1,17),(1,18),(1,19),(1,20);
/*Data for the table `u_user` */
INSERT  INTO `u_user`(`id`,`nickname`,`email`,`pswd`,`create_time`,`last_login_time`,`status`) VALUES (1,'管理员','admin','9c3250081c7b1f5c6cbb8096e3e1cd04','2016-06-16 11:15:33','2016-06-16 11:24:10',1),(11,'soso','8446666@qq.com','d57ffbe486910dd5b26d0167d034f9ad','2016-05-26 20:50:54','2016-06-16 11:24:35',1),(12,'8446666','8446666','4afdc875a67a55528c224ce088be2ab8','2016-05-27 22:34:19','2016-06-15 17:03:16',1);
/*Data for the table `u_user_role` */
INSERT  INTO `u_user_role`(`uid`,`rid`) VALUES (12,4),(11,3),(11,4),(1,1);
   
    END */$$
DELIMITER ;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
