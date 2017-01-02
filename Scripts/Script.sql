-- 학생
DROP TABLE IF EXISTS student_grade.student RESTRICT;

-- 성적
DROP TABLE IF EXISTS student_grade.grade RESTRICT;

-- 학생성적
DROP SCHEMA IF EXISTS student_grade;

-- 학생성적
CREATE SCHEMA student_grade;

-- 학생
CREATE TABLE student_grade.student (
	studNo   INTEGER     NOT NULL COMMENT '학번', -- 학번
	studName VARCHAR(20) NOT NULL COMMENT '성명' -- 성명
)
COMMENT '학생';

-- 학생
ALTER TABLE student_grade.student
	ADD CONSTRAINT PK_student -- 학생 기본키
		PRIMARY KEY (
			studNo -- 학번
		);

-- 성적
CREATE TABLE student_grade.grade (
	studNo   INTEGER NOT NULL COMMENT '학번', -- 학번
	studKor  INTEGER NOT NULL COMMENT '국어점수', -- 국어점수
	studEng  INTEGER NOT NULL COMMENT '영어점수', -- 영어점수
	studMath INTEGER NOT NULL COMMENT '수학점수' -- 수학점수
)
COMMENT '성적';

-- 성적
ALTER TABLE student_grade.grade
	ADD CONSTRAINT PK_grade -- 성적 기본키
		PRIMARY KEY (
			studNo -- 학번
		);

-- 성적
ALTER TABLE student_grade.grade
	ADD CONSTRAINT FK_student_TO_grade -- 학생 -> 성적
		FOREIGN KEY (
			studNo -- 학번
		)
		REFERENCES student_grade.student ( -- 학생
			studNo -- 학번
		);

select * from student;

select * from grade;

insert into student values(100, '이순신');
insert into student values(200, '김유신');
insert into student values(300, '권율');
insert into student values(400, '연개소문');
insert into student values(500, '주몽');
insert into student values(600, '최영');
insert into student values(700, '곽재우');
insert into student values(800, '임경업');

select studNo, studName from student;

select studNo, studKor, studEng, studMath from grade;

insert into grade values(100, 85, 30, 100);
insert into grade values(200, 75, 70, 90);

delete from grade;

insert into grade(studNo, studKor, studEng, studMath) values(300, 65, 99, 100);