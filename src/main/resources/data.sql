INSERT INTO users (id, email, firstname, lastname, password)
VALUES (1, 'uinan@miu.edu', 'umur', 'inan', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123
INSERT INTO users (id, email, firstname, lastname, password)
VALUES (2, 'john@miu.edu', 'john', 'doe', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123
INSERT INTO users (id, email, firstname, lastname, password)
VALUES (3, 'dean@miu.edu', 'Dean', 'Altarawneh', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

INSERT INTO role (id, role)
VALUES (1, 'ADMIN');
INSERT INTO role (id, role)
VALUES (2, 'CLIENT');


INSERT INTO users_roles (user_id, roles_id)
VALUES (1, 1);
INSERT INTO users_roles (user_id, roles_id)
VALUES (2, 2);
INSERT INTO users_roles (user_id, roles_id)
VALUES (3, 2);

-- INSERT INTO users (id, name) VALUES (111, 'inan');
-- INSERT INTO users (id, name) VALUES (112, 'Gebreegziabher');
-- INSERT INTO users (id, name) VALUES (113, 'Abdurahman');
--
-- INSERT INTO post (id,title,content,user_id) VALUES (111, 'title1', 'content1', 111);
-- INSERT INTO post (id,title,content,user_id) VALUES (112, 'title2', 'content2', 111);
-- INSERT INTO post (id,title,content,user_id) VALUES (113, 'title3', 'content3', 112);
-- INSERT INTO post (id,title,content,user_id) VALUES (114, 'title4', 'content4', 113);
--
-- INSERT INTO comment (id,name,post_id) VALUES (1, 'comment1', 111);
-- INSERT INTO comment (id,name,post_id)
-- VALUES (2, 'comment2', 111);