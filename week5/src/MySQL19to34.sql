#19
CREATE TABLE student(
                        SNO VARCHAR(20),
                        NAME VARCHAR(10),
                        Age INTEGER ,
                        College VARCHAR(30)
);

#20
CREATE TABLE Course(
                       CourseID VARCHAR(15),
                       CourseName VARCHAR(30),
                       CourseBeforeID VARCHAR(15)
);

#21
CREATE TABLE Choose(
                       SNO VARCHAR(20),
                       CourseID VARCHAR(30),
                       Score DECIMAL(5,2)
);

#22
INSERT INTO Student (SNO,NAME,age,college) VALUES('S00001','张三',20,'计算机学院');

INSERT INTO Student (SNO,NAME,age,college) VALUES('S00002','李四',19,'通信学院');

INSERT INTO Student (SNO,NAME,age,college) VALUES('S00003','王五',21,'计算机学院');


#23
INSERT INTO Course (CourseID,CourseName,CourseBeforeID) VALUES('C1','计算机导论',NULL);

INSERT INTO Course (CourseID,CourseName,CourseBeforeID) VALUES('C2','C语言','C1');

INSERT INTO Course (CourseID,CourseName,CourseBeforeID) VALUES('C3','数据结构','C2');

#24
INSERT INTO Choose (SNO,CourseID,Score) VALUES('S00001','C1',95);
INSERT INTO Choose (SNO,CourseID,Score) VALUES('S00001','C2',80);
INSERT INTO Choose (SNO,CourseID,Score) VALUES('S00001','C3',84);
INSERT INTO Choose (SNO,CourseID,Score) VALUES('S00002','C1',80);
INSERT INTO Choose (SNO,CourseID,Score) VALUES('S00002','C2',85);
INSERT INTO Choose (SNO,CourseID,Score) VALUES('S00003','C1',78);
INSERT INTO Choose (SNO,CourseID,Score) VALUES('S00003','C3',70);

#25
SELECT NAME,SNO FROM student WHERE college='计算机学院';

#26
SELECT * FROM student WHERE age BETWEEN 20 AND 23;

#27
SELECT COUNT(SNO) FROM student;

#28

SELECT MAX(score) FROM Choose WHERE courseid='c2';

SELECT MIN(score) FROM Choose WHERE courseid='c2';

SELECT SUM(score) FROM Choose WHERE courseid='c2';

SELECT AVG(score) FROM Choose WHERE courseid='c2';

#29
SELECT courseid,coursename FROM course WHERE coursebeforeid IS NULL;

#30 两个表必须同编码才能比较
ALTER TABLE choose CONVERT TO CHARACTER SET gbk COLLATE gbk_chinese_ci;

SELECT *FROM STUDENT, CHOOSE WHERE student.`SNO`=choose.`SNO`;

#31
SELECT *FROM student WHERE college =(SELECT college FROM student WHERE NAME='张三');

#32 这句好难啊,我的天
SELECT choose.`SNO`,choose.`Score` FROM choose WHERE choose.`CourseID`='c1'&&choose.score<(SELECT score FROM choose WHERE choose.`CourseID`='c1'&&choose.sno='S00001');

#33注意只有最后一行加;

SELECT sno FROM choose WHERE courseid='c1'
UNION
SELECT sno FROM choose WHERE courseid='c3';

#34
SELECT DISTINCT sno FROM choose WHERE courseid='c1'||courseid='c3';
