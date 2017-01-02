-- �л�
DROP TABLE IF EXISTS student_grade.student RESTRICT;

-- ����
DROP TABLE IF EXISTS student_grade.grade RESTRICT;

-- �л�����
DROP SCHEMA IF EXISTS student_grade;

-- �л�����
CREATE SCHEMA student_grade;

-- �л�
CREATE TABLE student_grade.student (
	studNo   INTEGER     NOT NULL COMMENT '�й�', -- �й�
	studName VARCHAR(20) NOT NULL COMMENT '����' -- ����
)
COMMENT '�л�';

-- �л�
ALTER TABLE student_grade.student
	ADD CONSTRAINT PK_student -- �л� �⺻Ű
		PRIMARY KEY (
			studNo -- �й�
		);

-- ����
CREATE TABLE student_grade.grade (
	studNo   INTEGER NOT NULL COMMENT '�й�', -- �й�
	studKor  INTEGER NOT NULL COMMENT '��������', -- ��������
	studEng  INTEGER NOT NULL COMMENT '��������', -- ��������
	studMath INTEGER NOT NULL COMMENT '��������' -- ��������
)
COMMENT '����';

-- ����
ALTER TABLE student_grade.grade
	ADD CONSTRAINT PK_grade -- ���� �⺻Ű
		PRIMARY KEY (
			studNo -- �й�
		);

-- ����
ALTER TABLE student_grade.grade
	ADD CONSTRAINT FK_student_TO_grade -- �л� -> ����
		FOREIGN KEY (
			studNo -- �й�
		)
		REFERENCES student_grade.student ( -- �л�
			studNo -- �й�
		);

select * from student;

select * from grade;

insert into student values(100, '�̼���');
insert into student values(200, '������');
insert into student values(300, '����');
insert into student values(400, '�����ҹ�');
insert into student values(500, '�ָ�');
insert into student values(600, '�ֿ�');
insert into student values(700, '�����');
insert into student values(800, '�Ӱ��');

select studNo, studName from student;

select studNo, studKor, studEng, studMath from grade;

insert into grade values(100, 85, 30, 100);
insert into grade values(200, 75, 70, 90);

delete from grade;

insert into grade(studNo, studKor, studEng, studMath) values(300, 65, 99, 100);