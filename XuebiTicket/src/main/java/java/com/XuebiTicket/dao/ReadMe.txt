DAO负责与数据库交互
请实现对数据库的增删查改
数据库使用sql语句
－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－
Tables

User(uid,username,password,phone,email)
Order(oid,uid,cid,date,price,state),uid、cid为外键
Ticket(tid,oid,price)，oid为外键
Cinema(cid,name,address)
Session(sid,movieName,cid,time,price),cid为外键