/*
SQLyog Ultimate v11.25 (64 bit)
MySQL - 5.5.27 : Database - chaoogg
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`chaoogg` /*!40100 DEFAULT CHARACTER SET gb2312 */;

USE `chaoogg`;

/*Table structure for table `employee` */

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `emp_id` int(11) NOT NULL AUTO_INCREMENT,
  `emp_name` varchar(255) NOT NULL,
  `gender` char(1) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `d_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`emp_id`),
  KEY `fk_emp_dep` (`d_id`),
  CONSTRAINT `fk_emp_dep` FOREIGN KEY (`d_id`) REFERENCES `tbl_dept` (`dept_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3210 DEFAULT CHARSET=utf8;

/*Data for the table `employee` */

insert  into `employee`(`emp_id`,`emp_name`,`gender`,`email`,`d_id`) values (3135,'朱轮德','F','u2lp0hmc2s@163.com',1),(3136,'赵毅','M','11111v6u459kzgk@hotmail.com',3),(3137,'张行浩','M','m3xlg5g@yeah.net',1),(3138,'沈薇','F','scciys2rvl@163.net',2),(3139,'何林杰','M','8sdrfat@126.com',2),(3140,'曹卿','M','s07zln24j2@sina.com',1),(3141,'秦咏','M','yb1e8ya@sina.com',2),(3142,'张悦香','M','9so0bucmz@msn.com',1),(3143,'杨洁青','F','cyj08w12f8t@qq.com',1),(3144,'孙峰刚','F','t41kr35q@ask.com',3),(3145,'施文江','F','bjb1lad@163.net',3),(3146,'褚行','M','871syvj8k@263.net',1),(3147,'赵鸣松','F','zcfsg4x@qq.com',3),(3148,'李文','F','e8k6o0a9@0355.net',2),(3149,'金辉','F','54gd6t9bubl@126.com',3),(3150,'王锦','M','cbs9ylt9y4z@gmail.com',1),(3151,'郑谦','M','cfn3ekib@aol.com',2),(3152,'蒋翰','M','cg8h8l4@googlemail.com',1),(3153,'郑可梦','F','bfck59s@yeah.net',1),(3154,'杨先','M','5v0od6f9qk@163.com',4),(3155,'金雅姬','M','f7kskej@qq.com',2),(3156,'施悦红','M','w0mdg7d6ax@qq.com',3),(3157,'吕斌','M','c5e3xez@163.com',4),(3158,'孙 ','F','tptz9in9e3@live.com',3),(3159,'张军','F','3htkadw1@163.com',2),(3160,'魏菊','M','ccvn4cy6yz@sohu.com',1),(3161,'孙福','F','5rptf810@sohu.com',1),(3162,'周勇友','F','z3i730xo95p@ask.com',1),(3163,'尤悦','F','alrhhseh1n@sohu.com',2),(3164,'李荔','F','t6qst9j@msn.com',1),(3165,'周林','M','75fwck5@163.com',3),(3166,'许生达','F','xvjnd20o@163.net',1),(3167,'褚中','F','gc3gzx2rixj@sina.com',4),(3168,'钱纯园','F','z6aqb7j@msn.com',4),(3169,'魏厚','M','7woy67krmdd@msn.com',2),(3170,'郑雁','M','ie6mv8qdc6@aol.com',4),(3171,'郑瑶','M','qzx9d8k@0355.net',3),(3172,'孔功利','M','pwsc6l50@3721.net',4),(3173,'吕锦爱','M','ululaxav@aol.com',1),(3174,'褚海','F','sa0lrqm@qq.com',2),(3175,'姜启','F','y32u2mooig@yahoo.com.cn',4),(3176,'杨力','F','hcmba8b0@yahoo.com.cn',1),(3177,'吕冰','F','8lcygazt@3721.net',2),(3178,'许炎康','F','86tlekr2u44@263.net',1),(3179,'华和','F','76wmrcjze@qq.com',2),(3180,'王璐凤','M','ouwfhph5ut@live.com',3),(3181,'吴思腾','M','foetatrs3m4@hotmail.com',4),(3182,'魏广航','M','d0pikrjlp@live.com',1),(3183,'吕青','F','11th6ookq4g@3721.net',2),(3184,'褚彬','M','6tlmnk9fd8@hotmail.com',2),(3185,'韩琰华','M','rwgcyr127u@yahoo.com.cn',2),(3186,'孙聪亚','F','hyhx2dqgl@hotmail.com',4),(3187,'孙玉','F','66y0m0p@3721.net',4),(3188,'杨雁瑾','M','bxvtm4yg@yeah.net',1),(3189,'曹咏艳','M','2if4u8x0133@sina.com',2),(3190,'朱康邦','M','ivqw1rb@ask.com',4),(3191,'韩姬宁','M','ng2f788h9x5@126.com',4),(3192,'许才轮','F','5ai4ezqniq@sohu.com',3),(3193,'陶茗','M','af4idzcpf@sohu.com',3),(3194,'陈 柔','M','kyglzjrao7p@sohu.com',3),(3195,'陈荷','M','ipbpvfngez@yeah.net',4),(3196,'朱利才','F','7o8zpk41vc@yahoo.com',3),(3197,'张茜英','M','9ovsc1d@163.net',4),(3198,'赵峰飞','M','b7ibe8lk@msn.com',1),(3199,'郑康勇','F','qt5yfi4j7l1@qq.com',2),(3200,'吴珍','M','ovcqb850@yeah.net',4),(3201,'许云','F','uwnqzb6@sina.com',4),(3202,'周希妍','M','lvph539@yahoo.com.cn',2),(3203,'姜发固','M','lqcg1pzjb@3721.net',4),(3204,'蒋瑗','F','nvu8kxsi0r@ask.com',1),(3205,'朱环','F','ic18d3wc6hr@yahoo.com.cn',4),(3206,'严洁','M','zxhsnb7oix@126.com',2),(3207,'孙宜 ','M','81eipgf@yahoo.com',2),(3208,'沈元弘','F','vz4koqz@yeah.net',4),(3209,'王超','F','41f38vawz@qq.com',4);

/*Table structure for table `first_dept` */

DROP TABLE IF EXISTS `first_dept`;

CREATE TABLE `first_dept` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dept_name` varchar(30) DEFAULT NULL,
  `dept_nature` varchar(10) DEFAULT NULL,
  `dept_id` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `first_dept` */

insert  into `first_dept`(`id`,`dept_name`,`dept_nature`,`dept_id`) values (1,'中国人民超级银行','国有企业','1'),(2,'中国人大超市','民有企业','2'),(3,'快乐餐厅','个人企业','3'),(4,'快乐酒吧','个人企业','4'),(5,'超级人民学院','私有企业','5');

/*Table structure for table `first_emp` */

DROP TABLE IF EXISTS `first_emp`;

CREATE TABLE `first_emp` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(30) NOT NULL,
  `first_gender` varchar(10) DEFAULT NULL,
  `first_age` int(11) DEFAULT NULL,
  `first_email` varchar(100) DEFAULT NULL,
  `first_phone` varchar(11) DEFAULT NULL,
  `first_address` varchar(100) DEFAULT NULL,
  `first_salary` double(10,2) DEFAULT NULL,
  `d_id` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=202 DEFAULT CHARSET=utf8;

/*Data for the table `first_emp` */

insert  into `first_emp`(`id`,`first_name`,`first_gender`,`first_age`,`first_email`,`first_phone`,`first_address`,`first_salary`,`d_id`) values (1,'超级管理员','男',28,'sumperman@qq.com','13113131313','中国北京管理部',10000.00,'1'),(2,'赵媛婵','女',35,'nikc4zsmuy@126.com','15502372071','大港纬四街130号',8151.00,'2'),(3,'杨亨','男',24,'ivghiyaza0@googlemail.com','13900162808','长安南路50号',5833.00,'1'),(4,'严启','男',34,'aghhgc9z2q@yahoo.com','13300736724','南阳街39号',7905.00,'2'),(5,'何俊','男',20,'cvejnme5mj@sohu.com','15307888623','黄岛路146号',7661.00,'2'),(6,'卫嘉宜','女',25,'fin1j4vbb@sina.com','13400288920','山西广场112号',6893.00,'1'),(7,'严翔山','男',30,'gyro9730xt@0355.net','13504647845','滨县广场143号',5444.00,'1'),(8,'陶群','男',29,'1aagg1025r@yeah.net','13403655166','铁山广场82号',5294.00,'4'),(9,'吴东善','男',33,'c76x417cc3@msn.com','13703420704','北仲三路148号',6144.00,'3'),(10,'孔光','男',22,'0gwdef0ir@126.com','13303191149','明月峡大厦39号',9080.00,'1'),(11,'张生波','男',29,'udsjex4yk@263.net','15108754311','热河大厦134号',5683.00,'4'),(12,'严海','男',25,'zeok67mwa@ask.com','13602860336','洞庭湖广场128号',8255.00,'3'),(13,'沈哲','男',27,'jtm5w07bvm@163.com','13708414751','刘家峡路115号',8843.00,'2'),(14,'严栋全','男',33,'4hve4w7sh9@gmail.com','13500543080','清和街81号',7230.00,'5'),(15,'尤翔振','男',31,'bp819dzfl@hotmail.com','13003468753','重庆大厦119号',11670.00,'1'),(16,'孙民祥','男',31,'mhgckoj35f@qq.com','13108706886','顺兴街32号',6696.00,'2'),(17,'周芝','女',21,'sk4evdfx7t@163.com','13703946424','港环路47号',5152.00,'3'),(18,'陶菲丹','女',20,'g4p6pcs3k@yahoo.com.cn','15106396117','重庆大厦98号',5895.00,'5'),(19,'周蕊','女',20,'mv8zuaxi5@googlemail.com','13104101902','白沙河路18号',9453.00,'5'),(20,'严黛','女',31,'9roc93906@aol.com','15906576928','云溪广场85号',7559.00,'3'),(21,'李嘉欢','女',34,'7pkuwhtoec@3721.net','15307260692','高苑大厦71号',6294.00,'1'),(22,'韩致','男',31,'ji53xpccz@263.net','13307627130','泰州二路83号',11641.00,'2'),(23,'王瑶','女',31,'sinnnx759@live.com','13705717020','东五街60号',8405.00,'5'),(24,'郑荷','女',26,'w2jp32tmidx@sohu.com','15805144042','武定路78号',7780.00,'2'),(25,'蒋秀','女',31,'lp3hhwf6ev2@googlemail.com','15804357546','芝罘路21号',11403.00,'4'),(26,'郑岚','女',33,'h66jh7dalpj@0355.net','13000040591','京山广场58号',8891.00,'5'),(27,'尤莺','女',21,'akans1cad8@qq.com','15107967298','宁国一支广场37号',6407.00,'4'),(28,'蒋厚林','男',33,'vf5d3giwpr@yeah.net','15500024356','莘县路54号',9302.00,'1'),(29,'孔翰伦','男',33,'8220n7yka9@sohu.com','15002520551','浙江路117号',7668.00,'1'),(30,'赵菲晓','女',21,'b7w8cwmxl@sina.com','13406967585','桑梓路70号',7689.00,'1'),(31,'张友祥','男',32,'kkwsxql6gz@263.net','15104707244','龙岩街40号',6672.00,'5'),(32,'韩有','男',26,'k73mm2c1wg6@sohu.com','13705747284','乐清广场124号',7023.00,'4'),(33,'金锦','女',23,'3yzgmwsjd6i@aol.com','15501218578','河南广场45号',9452.00,'1'),(34,'冯韵莉','女',22,'ygd7p1ryb@yahoo.com','15502932897','吴县二大厦108号',6428.00,'5'),(35,'褚美','女',34,'28j9kgtts@sina.com','15208598185','逍遥一街11号',6725.00,'2'),(36,'钱星','男',21,'4c5ozvelhi@163.com','13104462318','江西街145号',5396.00,'3'),(37,'华蕊秋','女',29,'j1qc0lqhd@qq.com','13508583840','泰州三广场39号',11326.00,'1'),(38,'郑腾和','男',26,'z3bd869bu@sohu.com','15301003970','单县路140号',10552.00,'4'),(39,'郑萍琬','女',22,'9qalc5c7tp@yeah.net','13603667974','团岛一街16号',10862.00,'3'),(40,'冯寒玉','女',25,'7quzn7mqgm@163.net','13905166944','驼峰路20号',6944.00,'1'),(41,'钱丹','女',21,'4bbhvfxpj@yahoo.com.cn','15806735409','西陵峡一大厦100号',5373.00,'2'),(42,'金霭','女',34,'l99bpmk5iha@163.com','13202907619','湛山一街48号',6017.00,'1'),(43,'姜月育','女',22,'9aiml0fx4@0355.net','15102621850','大港二路54号',8619.00,'3'),(44,'周敬全','男',21,'1f7knv4qehs@aol.com','15803078112','澳门二路146号',6025.00,'4'),(45,'魏胜伯','男',32,'se1qipvet@0355.net','15307926406','宁国一支广场64号',10012.00,'5'),(46,'杨霭','女',28,'0bwsbmc5aut@sohu.com','15602476770','机场路79号',9599.00,'4'),(47,'郑诚星','男',22,'j8qa6zclf6@0355.net','13607181852','延安二广场142号',5922.00,'1'),(48,'严叶瑞','女',29,'0k0h4jopi@yahoo.com.cn','13504827673','泗水大厦91号',11234.00,'1'),(49,'张天','男',21,'fkbbj9cnvm6@yahoo.com','15004496395','庆祥街118号',8626.00,'3'),(50,'赵姣芝','女',22,'4t3f6xe3j7y@yeah.net','15106696378','吴兴三广场54号',5402.00,'1'),(51,'陶钧刚','男',33,'owxfhmj7xr@msn.com','13900717648','东光大厦31号',8285.00,'1'),(52,'曹泰克','男',26,'mrwurefamjh@yeah.net','15108814608','韶关路51号',10383.00,'1'),(53,'钱树','男',24,'yv9p5ifdq@3721.net','15207645239','平阴路56号',5540.00,'3'),(54,'王馥琬','女',23,'yl6dwota1@aol.com','15707091506','观海二广场59号',7505.00,'3'),(55,'王天哲','男',21,'flmidw35umu@gmail.com','13505661050','馆陶街131号',7889.00,'4'),(56,'赵媛真','女',21,'0ebnsbac65@3721.net','15202528434','福建广场42号',11388.00,'4'),(57,'陈晨振','男',29,'15bf3ytocek@263.net','13300296990','平度广场94号',10671.00,'4'),(58,'曹桂晓','女',31,'omzloyebgbk@msn.com','13301813983','台西纬一广场87号',8221.00,'2'),(59,'吕伯','男',21,'l4lj2x559@qq.com','15802486081','晓望支街100号',9331.00,'5'),(60,'冯强飞','男',32,'6jis10e1z7@googlemail.com','13505352000','即墨路149号',8885.00,'4'),(61,'王保承','男',33,'ocq8h4i3y@googlemail.com','15006621333','云门一街116号',9195.00,'3'),(62,'王盛','男',31,'57bas976g@yeah.net','13400474452','芝罘路63号',7772.00,'4'),(63,'秦有','男',23,'gxnvj940p@sohu.com','15506944076','日照街132号',6114.00,'4'),(64,'杨亚梦','女',33,'j4l67ebfr@msn.com','13004754748','牟平街43号',6506.00,'5'),(65,'何中生','男',27,'esuavu1dp@aol.com','15205220753','贮水山大厦127号',9382.00,'1'),(66,'郑霭','女',25,'lgmrpon65@3721.net','15504130475','华山路136号',5951.00,'5'),(67,'姜婕英','女',20,'0loed25ndlu@msn.com','15005250246','长安路115号',7665.00,'4'),(68,'韩莲竹','女',26,'hekhq67oco@msn.com','13808828450','港夏街138号',5805.00,'3'),(69,'张峰奇','男',28,'o6s3kamf3b@263.net','13806686787','云门一街142号',9737.00,'1'),(70,'赵月可','女',28,'0c5r4bpq4g@googlemail.com','13804975014','新竹路28号',11103.00,'5'),(71,'钱冰琳','女',20,'p3oz2ff1dr@msn.com','15206887686','明水路14号',7261.00,'5'),(72,'吴聪','女',26,'84hwud7ja33@sohu.com','15205691246','李村街130号',9395.00,'1'),(73,'施承广','男',34,'phqy2zdxnm@163.net','15905445252','延吉街45号',9765.00,'4'),(74,'王荷菁','女',20,'g82or0aabp@126.com','13505275490','上海路99号',8696.00,'5'),(75,'赵先','男',28,'15uuwoyzt7@msn.com','13800664253','秋阳路52号',6709.00,'1'),(76,'钱彩','女',33,'alv7u4v9ap6@live.com','15600055701','新湛支路24号',7382.00,'1'),(77,'严璐','女',27,'zxleumd7d8z@live.com','15707854779','王村路100号',11743.00,'5'),(78,'何诚','男',30,'5b0pgq48c@gmail.com','13505196319','泰安路150号',7648.00,'2'),(79,'何清胜','男',33,'w6mtwmmou@sohu.com','13603587071','沈阳街143号',5942.00,'1'),(80,'许晓毓','女',23,'uitn1g9an@126.com','13804490975','宁夏路97号',7605.00,'1'),(81,'李贞倩','女',25,'amyes6456@163.net','15002186186','普集支路122号',7119.00,'1'),(82,'曹琬冰','女',32,'nxhe7ccwh8n@gmail.com','13208367012','无棣三街138号',6911.00,'2'),(83,'严茗','女',22,'t60t4jitzx@ask.com','15007591058','台西二街28号',7015.00,'3'),(84,'姜翠','女',29,'h438jcpmud@hotmail.com','13808615760','芝泉路109号',5242.00,'5'),(85,'郑行','男',21,'ckr7fz1r7n@qq.com','15003132547','德县路25号',6115.00,'4'),(86,'沈韵婵','女',21,'0t4udox0qdq@yahoo.com.cn','13803381882','龙华街120号',6011.00,'2'),(87,'李新','男',28,'ad5k9hcut@aol.com','13503362625','荷泽二街59号',5144.00,'5'),(88,'李蕊','女',35,'jn3xx7ycd0z@gmail.com','13801494865','新昌街121号',7296.00,'5'),(89,'韩菊锦','女',21,'c62gj4ullt@ask.com','15703838898','棣纬二大厦113号',11776.00,'5'),(90,'赵琛飞','男',27,'ycjqgbu7lb0@yeah.net','13705348407','基隆广场64号',6843.00,'4'),(91,'金冰','女',26,'vnsodon4q3@163.net','13906760635','商河路86号',8195.00,'4'),(92,'施磊','男',33,'sdw1smsgi@msn.com','13202453088','大连支街127号',5390.00,'3'),(93,'褚毓薇','女',27,'6t5pr45odte@gmail.com','15004711519','龙山路83号',10114.00,'3'),(94,'沈瑗','女',28,'j81g0ngat@yeah.net','13701260573','青岛路142号',9953.00,'4'),(95,'卫菊卿','女',28,'60xfmfbzb7w@yahoo.com.cn','15803907317','锦州街70号',6006.00,'4'),(96,'施江','男',35,'qcutaipxzp1@gmail.com','15704318455','长春街148号',6361.00,'4'),(97,'吕莲','女',22,'bt51xrkirro@163.net','15708134271','红岛路21号',5136.00,'4'),(98,'孔生','男',22,'gggbtnp6xzd@sina.com','13503648916','浙江路12号',8220.00,'5'),(99,'何婕影','女',33,'fnai8s9wv@hotmail.com','13906071773','南口广场87号',5632.00,'2'),(100,'严松','男',22,'9eq3fbfnr@hotmail.com','15208744011','三门峡路148号',6701.00,'5'),(101,'许诚河','男',21,'t42usoqz2@live.com','15501284996','港通路67号',10171.00,'1'),(102,'魏绍','男',35,'t7ouzgqjelm@qq.com','15002748946','台西一大厦148号',5262.00,'4'),(103,'郑聪霄','女',31,'5b6rgi11yj@hotmail.com','13501573524','临朐路136号',10201.00,'3'),(104,'孙航彪','男',27,'x7s8hzpi73i@263.net','15907056259','吴淞路83号',9074.00,'1'),(105,'秦月羽','女',32,'jab1rag1x5@aol.com','15002342876','锦州街57号',5733.00,'4'),(106,'张昭','女',25,'wyl4667xyc@yahoo.com.cn','13005065109','礼阳路104号',7359.00,'5'),(107,'赵蕊','女',34,'4gjnjmrj967@126.com','13008767629','泰安路85号',7033.00,'2'),(108,'金和河','男',32,'nmctd9b4c@sina.com','15501600273','彰化大厦126号',5370.00,'4'),(109,'钱奇琛','男',32,'mrslrr7ih@googlemail.com','13501541943','掖县路16号',7772.00,'5'),(110,'赵环','女',29,'811xnlq3j@126.com','13207678242','泰州三广场135号',8474.00,'1'),(111,'赵凡','女',35,'vlaav53vd48@263.net','15004350249','平定路131号',5401.00,'3'),(112,'杨娣美','女',20,'22xga6d2z7h@ask.com','13407432255','十梅庵街36号',8865.00,'4'),(113,'蒋希','女',21,'f3td2x64ckg@163.net','15205303451','顺城路35号',6715.00,'5'),(114,'赵栋','男',28,'gaty8i4m5sz@163.com','15708516571','市场三街20号',11925.00,'4'),(115,'陶馥','女',34,'83lucrl7t9@yahoo.com','15703967866','芙蓉山村56号',8611.00,'4'),(116,'王琴','女',25,'pypbvw2e6@googlemail.com','15304353568','杭州支广场127号',5822.00,'2'),(117,'孙璧芝','女',21,'wndl6cuvb@3721.net','13801333769','漳州街二街18号',9894.00,'3'),(118,'赵裕','男',23,'zs14of4mh@sohu.com','15103455557','南平广场87号',8587.00,'5'),(119,'孙会冠','男',32,'bfbnooxdr@ask.com','15306196802','大沽街90号',9032.00,'1'),(120,'赵荔','女',35,'76hgh6kz09@msn.com','13807246891','山城广场108号',9722.00,'5'),(121,'杨荷娥','女',35,'mkhhn56gmm5@yeah.net','13406487112','港通路30号',8245.00,'4'),(122,'周坚进','男',31,'ezosqjx40@googlemail.com','13108240881','珠海支街77号',8821.00,'1'),(123,'王有祥','男',31,'p3ktdf3ao8c@163.net','15305067300','平定路45号',6280.00,'5'),(124,'孙淑','女',27,'xfk3u979ns8@0355.net','13701517384','十梅庵街33号',9336.00,'3'),(125,'王融欢','女',29,'cwkycmd8p9w@0355.net','13308261943','章丘路34号',9487.00,'3'),(126,'褚固','男',27,'hixbli1hgun@googlemail.com','13706030517','宁国一支广场149号',9816.00,'4'),(127,'钱菊','女',26,'ar4mlqub2@163.com','15000461098','德平广场22号',8859.00,'5'),(128,'周龙超','男',29,'xht7abnfkq@googlemail.com','15900443449','泰州一路72号',8395.00,'3'),(129,'赵霄','女',26,'gzh7yu2rfz@sohu.com','15307831896','台西五路123号',5527.00,'4'),(130,'许伦','男',34,'8ez1mg3qja@hotmail.com','13900572805','龙华街112号',9317.00,'5'),(131,'孔斌','男',31,'ukjhwzuolj@yahoo.com.cn','13102944268','闽江大厦45号',7289.00,'5'),(132,'郑广亨','男',26,'2s1uveb0i@263.net','15207388503','泰州五街97号',8246.00,'1'),(133,'陈咏','女',21,'ovl8mkz2vg@sina.com','13001800312','山西广场150号',5671.00,'5'),(134,'蒋山亨','男',20,'f8jue8sns11@live.com','15600793342','朝城路36号',6526.00,'4'),(135,'曹彪亨','男',21,'2tpfo8yxg@hotmail.com','15004916030','丰海路63号',6795.00,'4'),(136,'周慧莲','女',26,'6qq3xoa2n2@sohu.com','15002118130','鱼山支街75号',7189.00,'3'),(137,'赵信','男',32,'8hu347wsy@0355.net','15501882202','泗水大厦72号',5169.00,'1'),(138,'郑丽莎','女',29,'85jztpj5e9@yahoo.com','13205193110','南阳街137号',9597.00,'2'),(139,'钱信旭','男',20,'lh1k336te@sina.com','13501876356','十梅庵街104号',5107.00,'4'),(140,'孙广中','男',35,'zvsnscrw6d6@yeah.net','15708645061','平定路117号',9527.00,'2'),(141,'秦瑞','女',22,'snr0a80e9r@googlemail.com','15108368411','惠民南路39号',7244.00,'4'),(142,'严文邦','男',22,'udajsikb0l@163.net','15502957607','红岛支大厦90号',5063.00,'4'),(143,'朱毅','男',33,'bfrv6el326w@gmail.com','13306780974','巫峡大厦28号',5747.00,'3'),(144,'孙祥博','男',24,'030ebquk4c@3721.net','15904826458','古田路27号',9766.00,'1'),(145,'钱鸣子','男',30,'l9kr6tz6f@yeah.net','13205621937','台西纬二路144号',8281.00,'5'),(146,'吕瑾梅','女',30,'uy0llsmxc0p@ask.com','13104210747','长汀街17号',7143.00,'2'),(147,'孙学星','男',26,'1n2e2axxg@yahoo.com','13100331151','荷泽三大厦90号',7956.00,'2'),(148,'曹珠勤','女',22,'k88y6pcv91@yahoo.com','15703348701','阳信路33号',5272.00,'5'),(149,'杨伦信','男',26,'xj2jc2ey67y@3721.net','15505302563','团岛路75号',8959.00,'2'),(150,'曹友义','男',34,'j2at9kaspg@hotmail.com','15907168729','滋阳街95号',11450.00,'5'),(151,'李斌江','男',27,'x5e2t1eqs@0355.net','15907874361','珠海街25号',10998.00,'3'),(152,'赵梁壮','男',24,'g7vrskelt@googlemail.com','13705208349','澳门八街35号',6047.00,'1'),(153,'赵贵之','男',20,'sa8n55hxcv8@live.com','13707601163','东阿街74号',5676.00,'4'),(154,'何媛','女',22,'jc6x0wj7ht@yahoo.com','13501313045','中山街22号',6990.00,'3'),(155,'韩富','男',21,'3032gqiqmg@yahoo.com','13906975913','崇阳街102号',9877.00,'2'),(156,'华素巧','女',28,'wg4lrilbb@126.com','15007555403','营口路71号',6743.00,'1'),(157,'陈元','男',20,'fze3adyc0d@sohu.com','13302391318','临清路17号',9120.00,'2'),(158,'褚诚永','男',31,'5owc7jgm8fo@yahoo.com','13506843275','无棣一路139号',5181.00,'1'),(159,'钱绍坚','男',34,'qbwy8a3bu@yahoo.com.cn','13203663935','台西纬一广场46号',8082.00,'4'),(160,'孙梁晨','男',24,'cy95nrik79c@googlemail.com','13606280272','黄台广场16号',9858.00,'1'),(161,'施璧苑','女',22,'w2943tp7u@googlemail.com','13404618341','金湖大厦120号',9949.00,'2'),(162,'钱毓芝','女',21,'33ytvbt5b@qq.com','15207805443','仰口街20号',7482.00,'1'),(163,'冯亨亨','男',35,'bj89xvz8e@googlemail.com','15904753650','莆田街132号',9627.00,'2'),(164,'孙思克','男',23,'fo7revjc169@live.com','15201183564','保定街87号',7689.00,'3'),(165,'李言磊','男',29,'z7cxa0d7r@qq.com','15807700720','湛山三路132号',9004.00,'3'),(166,'金锦','女',29,'uh4yxt37ny@3721.net','15000738503','新湛三街54号',11646.00,'4'),(167,'吕星生','男',30,'5p66vwabqei@163.net','13703583562','小港沿106号',7353.00,'4'),(168,'孙玲珠','女',25,'uoipab3dm7q@sohu.com','13000522452','牟平街48号',5080.00,'5'),(169,'孙妍','女',22,'552tprwwapj@yahoo.com.cn','13308170139','莱州路56号',5169.00,'1'),(170,'秦爱','女',22,'7zxlgpop37v@0355.net','13501378282','李村支广场142号',5311.00,'1'),(171,'何炎明','男',27,'5xujct78g@3721.net','15000258505','济南街132号',6891.00,'2'),(172,'赵琳琦','女',21,'2035tmbd4b@yahoo.com','15701563697','澳门三路65号',5472.00,'5'),(173,'郑达成','男',21,'e39q6oo54a@0355.net','13007916051','福清广场66号',8986.00,'5'),(174,'王菊','女',33,'vdvg1ofpi@ask.com','13902972899','泉州街149号',11833.00,'4'),(175,'王秋馥','女',35,'0kj2i4m1s5o@yeah.net','15907906330','齐东路88号',6719.00,'4'),(176,'吴媛璧','女',24,'4dgp4wolyc@yahoo.com.cn','13805405740','利津路144号',6671.00,'4'),(177,'华宁竹','女',24,'q8nc3qm8l@sina.com','13707026872','市场三街64号',9362.00,'4'),(178,'韩绍松','男',35,'gxef1jz734r@hotmail.com','15603418263','荷泽二街50号',8430.00,'4'),(179,'施娅','女',30,'nwksj2vta6@ask.com','13603248717','湛山一街29号',6819.00,'4'),(180,'钱志','男',20,'uf0v2jd3s5@msn.com','15503052825','驼峰路40号',7194.00,'2'),(181,'周佳爱','女',25,'iamuu2q5c1@gmail.com','15605286262','棣纬二大厦87号',11108.00,'3'),(182,'赵震新','男',31,'r0ju79hkfy@263.net','13001700325','石村广场35号',8077.00,'1'),(183,'赵瑞爽','女',21,'qnxf291ti@sohu.com','15602041666','大港沿130号',9529.00,'2'),(184,'沈琛家','男',28,'2dzn680y5i@gmail.com','15606347571','莱州路20号',7947.00,'4'),(185,'余欣','女',30,'x8jdwsc9gi@sohu.com','13204277753','保定街57号',9982.00,'3'),(186,'秦娴','女',22,'c9rqx3a6aj@163.com','13802330479','流亭大厦140号',7507.00,'2'),(187,'赵树泽','男',20,'860lj4y229a@263.net','13604383008','费县路25号',8430.00,'5'),(188,'周姬珍','女',27,'cknze4rn04@163.com','15603942522','吴兴三广场23号',9764.00,'3'),(189,'姜鸣','男',22,'dov4jfxla@163.net','15608073952','郓城北广场143号',6915.00,'1'),(190,'王美','女',33,'0jod3wmwyk@yahoo.com','15903730263','昌乐街37号',11339.00,'2'),(191,'施园园','女',25,'f4biqk18us@msn.com','15208147178','礼阳路101号',8027.00,'1'),(192,'金梦','女',20,'m8hheeelc@live.com','13104301718','广西街91号',7923.00,'2'),(193,'姜青','女',29,'jvinpwx0sl@sina.com','13506741998','国城路131号',5299.00,'2'),(194,'吴发','男',33,'il6eyukd0@sohu.com','13106495098','大学广场75号',9085.00,'2'),(195,'钱寒姣','女',22,'k7gkwa60tl2@qq.com','13402385035','晓望支街67号',6779.00,'4'),(196,'赵茗纨','女',35,'ub2jtedvcle@googlemail.com','15506002492','汇泉广场90号',9524.00,'1'),(197,'曹辰','男',30,'6rcyegv3v@163.net','15003395686','吴县一街140号',5748.00,'3'),(198,'孔瑗宜','女',32,'hfx5sg77sfu@163.net','13306696194','吴兴一广场22号',6653.00,'1'),(199,'卫眉淑','女',34,'nvi7pcywt@263.net','15903147941','热河大厦37号',5438.00,'2'),(200,'陶强','男',31,'uqshto7w96@yahoo.com.cn','15504861731','中城路34号',5012.00,'1'),(201,'姜琳岚','女',22,'jto0ujwn0m@msn.com','13607620061','庆祥街146号',8059.00,'5');

/*Table structure for table `ireportdemo` */

DROP TABLE IF EXISTS `ireportdemo`;

CREATE TABLE `ireportdemo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) DEFAULT NULL,
  `gender` varchar(1) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `tail` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `ireportdemo` */

insert  into `ireportdemo`(`id`,`name`,`gender`,`address`,`email`,`tail`) values (1,'余文超','男','中国','yuwenchao.com','132456789'),(2,'abc','女','中国','abc.com','123456798');

/*Table structure for table `salary` */

DROP TABLE IF EXISTS `salary`;

CREATE TABLE `salary` (
  `DATA_M` varchar(6) NOT NULL,
  `income` decimal(10,0) DEFAULT NULL,
  `expenditure` decimal(10,0) DEFAULT NULL,
  `deposit` decimal(10,0) DEFAULT NULL,
  `other_income` decimal(10,0) DEFAULT NULL,
  `other_deposit` decimal(10,0) DEFAULT NULL,
  `money_management` decimal(10,0) DEFAULT NULL,
  `total_hous` decimal(10,0) DEFAULT NULL,
  `totol_other` decimal(10,0) DEFAULT NULL,
  `total_assets` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`DATA_M`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `salary` */

insert  into `salary`(`DATA_M`,`income`,`expenditure`,`deposit`,`other_income`,`other_deposit`,`money_management`,`total_hous`,`totol_other`,`total_assets`) values ('201905','7504','1299',NULL,NULL,NULL,NULL,NULL,NULL,NULL),('201906','7882','1111',NULL,NULL,NULL,NULL,NULL,NULL,NULL),('201907','7848','1528',NULL,NULL,NULL,NULL,NULL,NULL,NULL),('201908','8349','1107',NULL,NULL,NULL,NULL,NULL,NULL,NULL),('201909','8318','1316',NULL,NULL,NULL,NULL,NULL,NULL,NULL),('201910','8280','1556',NULL,NULL,NULL,NULL,NULL,NULL,NULL),('201911','8305','1252',NULL,NULL,NULL,NULL,NULL,NULL,NULL),('201912','8318','2532',NULL,'3783',NULL,NULL,NULL,NULL,NULL),('202001','8399','4401',NULL,NULL,NULL,NULL,NULL,NULL,NULL),('202002','8251','1895',NULL,NULL,NULL,NULL,NULL,NULL,NULL),('202003','8336','887',NULL,NULL,NULL,NULL,NULL,NULL,NULL),('202004','8375','2388',NULL,NULL,NULL,NULL,NULL,NULL,NULL),('202005','8363','1099',NULL,NULL,NULL,NULL,NULL,NULL,'113822'),('202006','8363','7288',NULL,NULL,NULL,NULL,'20488',NULL,NULL);

/*Table structure for table `t_permission` */

DROP TABLE IF EXISTS `t_permission`;

CREATE TABLE `t_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pid` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `icon` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=gb2312;

/*Data for the table `t_permission` */

insert  into `t_permission`(`id`,`pid`,`name`,`icon`,`url`) values (1,0,'系统权限菜单','glyphicon glyphicon-th-list',''),(2,1,'控制面板','glyphicon glyphicon-dashboard','main.htm'),(3,1,'权限管理','glyphicon glyphicon glyphicon-tasks',''),(4,3,'用户维护','glyphicon glyphicon-user','user/index.htm'),(5,3,'角色维护','glyphicon glyphicon-king','role/index.htm'),(6,3,'许可维护','glyphicon glyphicon-tint','permission/index.htm'),(7,1,'业务审核','glyphicon glyphicon-ok',NULL),(8,7,'实名认证审核','glyphicon glyphicon-check','auth_cert/index.htm'),(9,7,'广告审核','glyphicon glyphicon-check','auth_adv/index.htm'),(10,7,'项目审核','glyphicon glyphicon-check','auth_project/index.htm'),(11,1,'业务管理','glyphicon glyphicon-th-large',NULL),(12,11,'资质维护','glyphicon glyphicon-picture','cert/index.htm'),(13,11,'分类管理','glyphicon glyphicon-equalizer','certtype/index.htm'),(14,11,'流程管理','glyphicon glyphicon-random','process/index.htm'),(15,11,'广告管理','glyphicon glyphicon-hdd','advert/index.htm'),(16,11,'消息模板','glyphicon glyphicon-comment','message/index.htm'),(17,11,'项目分类','glyphicon glyphicon-list','projectType/index.htm'),(18,11,'项目标签','glyphicon glyphicon-tags','tag/index.htm'),(19,1,'参数管理','glyphicon glyphicon-LIST-alt','param/index.htm');

/*Table structure for table `tbl_dept` */

DROP TABLE IF EXISTS `tbl_dept`;

CREATE TABLE `tbl_dept` (
  `dept_id` int(11) NOT NULL AUTO_INCREMENT,
  `dept_name` varchar(255) NOT NULL,
  PRIMARY KEY (`dept_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `tbl_dept` */

insert  into `tbl_dept`(`dept_id`,`dept_name`) values (1,'销售部'),(2,'研发部'),(3,'生产部'),(4,'人事部');

/*Table structure for table `tbl_userinfo` */

DROP TABLE IF EXISTS `tbl_userinfo`;

CREATE TABLE `tbl_userinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `loginacct` varchar(255) NOT NULL,
  `userpswd` char(200) NOT NULL,
  `username` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `createtime` char(19) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

/*Data for the table `tbl_userinfo` */

insert  into `tbl_userinfo`(`id`,`loginacct`,`userpswd`,`username`,`email`,`createtime`) values (14,'admin','77e2edcc9b40441200e31dc57dbb8829','admin','admin@qq.com',NULL),(15,'yuwenchao','d0eb4987afb800e5599abd825ae5b931','yuwenchao','yuwenchao@qq.com',NULL),(16,'admin1','$2a$10$cXDqfrsGdQ1HA6Ya2p5/j.MKiL807hB7yf1RNSL3j9d8NKmfB2dXK','admin1','admin1@qq.com',NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
