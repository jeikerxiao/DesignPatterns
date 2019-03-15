# 模板方法模式 

模板方法模式在一个方法中定义一个算法的骨架，而将一些步骤的实现延迟到子类中。

模板方法使得子类可以在不改变算法结构的情况下，重新定义算法中某些步骤的具体实现。


本质上来说，模板方法设计模式是一个比较容易而且很好理解的模式，在使用这种模式的时候我们要注意几点：

1. 保护抽象类中定义算法顺序的方法不被子类修改。
2. 分离可变及不可变部分，让子类自己决定可变部分的实现。
3. 让算法的具体实现对子类开放，对其他类关闭。

模板方法模式适用于哪些场景？

使用JDBC代码来操作数据库中数据的例子。

Spring中的一个现成的工具JdbcTemplate就是采用这种设计模式实现的。