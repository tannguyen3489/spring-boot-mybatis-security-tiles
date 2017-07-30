--
--    Copyright 2015-2016 the original author or authors.
--
--    Licensed under the Apache License, Version 2.0 (the "License");
--    you may not use this file except in compliance with the License.
--    You may obtain a copy of the License at
--
--       http://www.apache.org/licenses/LICENSE-2.0
--
--    Unless required by applicable law or agreed to in writing, software
--    distributed under the License is distributed on an "AS IS" BASIS,
--    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
--    See the License for the specific language governing permissions and
--    limitations under the License.
--

drop table if exists users;
drop table if exists authorities;
drop table if exists role;
drop table if exists city;
drop table if exists hotel;


DROP SEQUENCE IF EXISTS  user_id_seq;
DROP SEQUENCE IF EXISTS  role_id_seq;
DROP SEQUENCE IF EXISTS  city_id_seq;

CREATE SEQUENCE user_id_seq;
CREATE SEQUENCE role_id_seq;
CREATE SEQUENCE city_id_seq;

create table users (
  userid int NOT NULL DEFAULT nextval('user_id_seq'),
  username varchar(256),
  email varchar(256),
  password varchar(256),
  enabled boolean
);

create table role (
  roleid int NOT NULL DEFAULT nextval('role_id_seq'),
  rolename varchar(256)
);

create table authorities (
  username varchar(256),
  role varchar(256)
);

create table city (id int not null DEFAULT nextval('city_id_seq'), name varchar, state varchar, country varchar);
insert into city (name, state, country) values ('San Francisco', 'CA', 'US');


-- insert into users (username, email, password, enabled) values ('San Francisco', 'CA', 'US');