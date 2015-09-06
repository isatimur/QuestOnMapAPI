
        DROP TABLE box IF EXISTS;
        CREATE TABLE box(id SERIAL, username VARCHAR(255), title VARCHAR(255),body VARCHAR(255),boxtype VARCHAR(255));


        DROP TABLE account IF EXISTS;
        CREATE TABLE account(id SERIAL, login VARCHAR(255), username VARCHAR(255), password VARCHAR(255),avaUrl VARCHAR(255));


        INSERT INTO account(login,username,password,avaUrl) VALUES ('timur@mail.ru','isatimur','admin','/1.jpg');
        INSERT INTO account(login,username,password,avaUrl) VALUES ('tema@mail.ru','tema','admin','/2.jpg');
        INSERT INTO box(username,title,body,boxtype) VALUES ('isatimur','Test1','Here will be blablabla','PHOTO');
        INSERT INTO box(username,title,body,boxtype) VALUES ('tema','Test2','Here will be blablabla','PHOTO');

