SELECT deptno, ename, job, sal FROM hr.emp WHERE mgr = 7902;
SELECT ename, job, sal FROM hr.emp WHERE job = 'CLERK'; -- si aici se schimba cu jobul dorit
SELECT ename, job, sal * 12 FROM hr.emp WHERE deptno = 20; -- se schimba cu departamentul dorit
SELECT ename, job, (sal + coalesce(comm, 0)) FROM hr.emp WHERE sal > 2000;
SELECT empno, ename, job, hiredate FROM hr.emp WHERE hiredate >= '1982-01-01';
INSERT INTO hr.emp (empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES (505,'Ion', 'CLERK', 5565, '2020-04-09', 500, null, 20);
INSERT INTO hr.emp (empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES (506,'John', 'SALESMAN', 7562, '2020-02-09', 565, null, 20);
INSERT INTO hr.emp (empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES (507,'Sam', 'MANAGER', 2543, '2020-03-09', 543, null, 20);
INSERT INTO hr.emp (empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES (508,'George', 'CLERK', 2129, '2020-04-01', 1250, null, 20);
INSERT INTO hr.emp (empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES (509,'Ana', 'CLERK', 4578, '2019-08-09', 2045, null, 20);
INSERT INTO hr.emp (empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES (510,'Ioana', 'SALESMAN', 5454, '2018-07-09', 856, null, 20);
INSERT INTO hr.emp (empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES (511,'Alina', 'CLERK', 9783, '2020-03-09', 475, null, 20);
INSERT INTO hr.emp (empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES (512,'Carmen', 'CLERK', 5448, '2020-03-04', 2014, null, 20);
INSERT INTO hr.emp (empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES (513,'Maria', 'SALESMAN', 6896, '2020-02-26', 2407, null, 20);
INSERT INTO hr.emp (empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES (514,'Elena', 'MANAGER', 7873, '2020-01-05', 1024, null, 20);
SELECT (sal/100) * 15 FROM hr.emp WHERE deptno = 20;
SELECT deptno, dname FROM dept;
SELECT concat(empno, ename), job, hiredate FROM hr.emp ORDER BY emp.empno DESC;
SELECT concat(empno, ename), job, sal, '' AS signature FROM hr.emp ORDER BY deptno;
SELECT ename, job FROM hr.emp;
SELECT dname, deptno FROM dept ORDER BY dname;
SELECT * FROM hr.emp WHERE job = 'MANAGER' ORDER BY deptno;
SELECT * FROM hr.emp WHERE hiredate BETWEEN '1981-01-01' AND '1982-01-01';
SELECT empno, ename, job, sal FROM hr.emp WHERE empno = 7499 OR empno = 7902 OR empno = 7876;
SELECT * FROM hr.emp WHERE EXTRACT(year FROM hiredate) = 1980;
SELECT * FROM hr.emp WHERE ename LIKE 'F%' AND LENGTH(job) = 7;
SELECT * FROM hr.emp WHERE deptno = 20 AND comm IS NULL OR comm = 0;
SELECT * FROM hr.emp WHERE comm IS NOT NULL AND comm > 0 AND job = 'SALESMAN';
SELECT * FROM hr.emp WHERE (job = 'MANAGER' AND sal > 1500) OR job = 'ANALYST';
SELECT * FROM hr.emp WHERE EXTRACT(year FROM hiredate) < 1982 AND comm IS NULL OR comm = 0;
SELECT * FROM hr.emp WHERE sal > 3000 AND mgr IS NULL ORDER BY deptno;
SELECT ename, job, sal * 12 FROM hr.emp WHERE job != 'MANAGER' AND deptno = 20;
SELECT deptno, ename, hiredate, sal FROM hr.emp WHERE EXTRACT(year FROM hiredate) = 1981 AND (deptno = 10 OR deptno = 20);