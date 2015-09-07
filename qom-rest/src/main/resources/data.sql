INSERT INTO TESTDB.PUBLIC.ACCOUNT (login, username, password, ava_Url)
VALUES ('timur@mail.ru', 'isatimur', 'admin', '/1.jpg');
INSERT INTO TESTDB.PUBLIC.ACCOUNT (login, username, password, ava_Url)
VALUES ('tema@mail.ru', 'tema', 'admin', '/2.jpg');

INSERT INTO TESTDB.PUBLIC.ACCOUNT_DETAILS (account_id, DATA_TYPE, NAME, "VALUE")
VALUES (1, 'STRING', 'social_link', 'FB');
INSERT INTO TESTDB.PUBLIC.ACCOUNT_DETAILS (account_id, DATA_TYPE, NAME, "VALUE")
VALUES (1, 'STRING', 'client', 'android');

INSERT INTO TESTDB.PUBLIC.ACCOUNT_DETAILS (account_id, DATA_TYPE, NAME, "VALUE")
VALUES (2, 'STRING', 'social_link', 'VK');
INSERT INTO TESTDB.PUBLIC.ACCOUNT_DETAILS (account_id, DATA_TYPE, NAME, "VALUE")
VALUES (2, 'STRING', 'client', 'iphone');


INSERT INTO TESTDB.PUBLIC.BOX (username, title, body, boxtype)
VALUES ('isatimur', 'Test1', 'Here will be blablabla', 'PHOTO');
INSERT INTO TESTDB.PUBLIC.BOX (username, title, body, boxtype)
VALUES ('tema', 'Test2', 'Here will be blablabla', 'PHOTO');

