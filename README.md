# SQL injectionの実装と対策用

## 1. 概要
SQL injectionを実装をし、対策を講じる。

## 2. 目的
* SQL injectionという用語だけを知識として知っていても、
  全く意味を成さない。
* 実装を自分で行うことにより、より現実味を味わう。
* 対策を講じることにより、セキュリティに対する認識を高める。

## 3. 詳細設計
* 使用する言語は、「Java」とする。
* 使用するDBは、MySQLとする。

### Class Diagram
![](img/RPBHQXD158RlzodENIqQehrp4IanK4kB5dibrejjTXA7ZZjXPhPOn8kT0QsKGYk2s8gWI6YLja9Gh4O4N-KGcyVmp2GR3JeNox1y_t_-C-VCQfCeazyNaU56i1Zj2Rf3jAVz_MvKdOAcb8Ofk2RR6ugtxXduUGWp5ozTXjlv6gyiyBLy8u6fQgGRYM0m4qKDaMWDDP.png)

### Sequence Diagram
![](img/TL9DImCn4BtFhmXUseAbsfk28ktHUX1F7fDkR8FhPiccQe_TnOzBiOWeIBKzI551y1k5jO8_nUYs_WkpkzOl58OXl7dlpKoIAKTY8IjB9aWcJOgKTwRSS-KUAU_gTQFJQwn39e4ME9TKe3otguALoX8zdQ3ioEWOcgyiilGqMwnKCKfam2bYxP45A3E3HYh2Lm5mKNA1SeAlED.png)

## 4. DB設計
### 認証アカウント
|ID|PASSEORD|
|---|---|
|root|root|

### 作成DB & Table
作成DB    : sampledb
作成Table : userinfo{uid,pass}

### 作成SQL
```SQL
use sampledb;

create table USERINFO (
	uid varchar(40),
	pass varchar(40) ,
	PRIMARY KEY (uid)
);

INSERT INTO USERINFO VALUES ("idok", "passok");
```
