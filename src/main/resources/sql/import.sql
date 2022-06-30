DROP TABLE IF EXISTS _department;

CREATE TABLE _department (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(75) NOT NULL,
    telno VARCHAR(20) NOT NULL,
    createdAt TIMESTAMP NOT NULL,
    lastModifiedAt TIMESTAMP
);

INSERT INTO _department (name, telno, createdAt) VALUES ('영업부', '0212341111', CURRENT_TIMESTAMP());
INSERT INTO _department (name, telno, createdAt) VALUES ('경영부', '0212342222', CURRENT_TIMESTAMP());
INSERT INTO _department (name, telno, createdAt) VALUES ('개발부', '0212343333', CURRENT_TIMESTAMP());
INSERT INTO _department (name, telno, createdAt) VALUES ('마케팅부', '0212344444', CURRENT_TIMESTAMP());
INSERT INTO _department (name, telno, createdAt) VALUES ('회계부', '0212345555', CURRENT_TIMESTAMP());

/**
 * IF EXISTS 는 일부 존재하지 않는 DB Engine 도 있을 수 있다. 참조할 것. (오라클 계열은 대부분 지원하는 듯? 하다.)
 */
DROP TABLE IF EXISTS _employee;

/**
 * ON DELETE CASCADE, ON DELETE SET NULL 의 차이를 알아둘 것.
 */
CREATE TABLE _employee (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(75) NOT NULL,
    age INT NOT NULL,
    career INT NOT NULL,
    intro VARCHAR(255) NOT NULL,
    departmentId BIGINT NOT NULL,
    createdAt TIMESTAMP NOT NULL,
    lastModifiedAt TIMESTAMP,
    FOREIGN KEY (departmentId) REFERENCES _department(id) ON DELETE CASCADE
);

INSERT INTO _employee (name, age, career, intro, departmentId, createdAt) VALUES ('사원1', 20, 1, '안녕하세요', 1, CURRENT_TIMESTAMP());
INSERT INTO _employee (name, age, career, intro, departmentId, createdAt) VALUES ('사원2', 21, 2, '안녕하세요', 1, CURRENT_TIMESTAMP());
INSERT INTO _employee (name, age, career, intro, departmentId, createdAt) VALUES ('사원3', 22, 1, '안녕하세요', 2, CURRENT_TIMESTAMP());
INSERT INTO _employee (name, age, career, intro, departmentId, createdAt) VALUES ('사원4', 23, 2, '안녕하세요', 2, CURRENT_TIMESTAMP());
INSERT INTO _employee (name, age, career, intro, departmentId, createdAt) VALUES ('사원5', 24, 3, '안녕하세요', 3, CURRENT_TIMESTAMP());
INSERT INTO _employee (name, age, career, intro, departmentId, createdAt) VALUES ('사원6', 25, 4, '안녕하세요', 3, CURRENT_TIMESTAMP());
INSERT INTO _employee (name, age, career, intro, departmentId, createdAt) VALUES ('사원7', 26, 3, '안녕하세요', 4, CURRENT_TIMESTAMP());
INSERT INTO _employee (name, age, career, intro, departmentId, createdAt) VALUES ('사원8', 27, 4, '안녕하세요', 4, CURRENT_TIMESTAMP());
INSERT INTO _employee (name, age, career, intro, departmentId, createdAt) VALUES ('사원9', 28, 5, '안녕하세요', 5, CURRENT_TIMESTAMP());
INSERT INTO _employee (name, age, career, intro, departmentId, createdAt) VALUES ('사원10', 29, 6, '안녕하세요', 5, CURRENT_TIMESTAMP());