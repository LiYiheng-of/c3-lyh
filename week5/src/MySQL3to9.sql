#3  创建表
CREATE TABLE ChooseBb(
                         Bb1 VARCHAR(30),
                         Bb2 INTEGER ,
                         Bb3 DECIMAL(6)
);

#4  添加缺省值
ALTER TABLE ChooseBb ADD Bb4 VARCHAR(20);
ALTER TABLE ChooseBb ALTER COLUMN Bb4 SET DEFAULT '系统测试值';

#5  添加列以及主键
ALTER TABLE ChooseBb ADD Bb5 VARCHAR(10);
ALTER TABLE ChooseBb MODIFY Bb5 VARCHAR(10) PRIMARY KEY;

#6  创建视图
CREATE VIEW View_Choosebb AS SELECT Bb1,Bb4,Bb5 from ChooseBb;

#7  删除视图
drop view View_Choosebb;

#8  添加某个索引
create index index_bb2 on Choosebb (bb2);
create index index_bb4 on Choosebb(bb4 DESC);

#9 删除某个索引
drop index index_bb2 on ChooseBb;

