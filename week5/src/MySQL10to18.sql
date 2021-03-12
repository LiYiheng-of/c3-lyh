#10
CREATE TABLE test(
                     NAME VARCHAR(20),
                     Age INTEGER ,
                     score NUMERIC(10,2),
                     Address VARCHAR(60)
);

#11
ALTER TABLE test CONVERT TO CHARACTER SET gbk COLLATE gbk_chinese_ci; #注意表格编码

INSERT INTO test (NAME,age,score,address) VALUES('赵一',20,580.00,'重邮宿舍12-3-5');

INSERT INTO test (NAME,age,score,address) VALUES('钱二',19,540.00,'南福苑5-2-9');

INSERT INTO test (NAME,age,score,address) VALUES('孙三',21,555.50,'学生新区21-5-15');

INSERT INTO test (NAME,age,score,address) VALUES('李四',22,505.00,'重邮宿舍8-6-22');

INSERT INTO test (NAME,age,score,address) VALUES('周五',20,495.50,'学生新区23-4-8');

INSERT INTO test (NAME,age,score,address) VALUES('吴六',19,435.00,'南福苑2-5-12');

#12
CREATE TABLE test_temp(
                          NAME VARCHAR(20),
                          Age INTEGER,
                          Score NUMERIC(10,2),
                          Address VARCHAR(60)
);

#13
ALTER TABLE test_temp CONVERT TO CHARACTER SET gbk COLLATE gbk_chinese_ci;
INSERT INTO test_temp (NAME,Age,Score,Address) VALUES('郑七',21,490.50,'重邮宿舍11-2-1');
INSERT INTO test_temp (NAME,Age,Score,Address) VALUES('张八',20,560.00,'南福苑3-3-3');
INSERT INTO test_temp (NAME,Age,Score,Address) VALUES('王九',10,515.00,'学生新区19-7-1');

#14
INSERT INTO test SELECT *FROM test_temp;

#15
UPDATE test SET score =score+5 WHERE age<=20

#16
UPDATE test SET age =age-1 WHERE address LIKE '南福苑%';

#17
DELETE FROM test  WHERE age>=21&&score>=500;

#18
DELETE FROM test  WHERE address LIKE '重邮宿舍%'&&score<=550;



