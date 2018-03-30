/**
 * 创建型设计模式
 *
 * 共五种：静态工厂模式、抽象工厂模式、单例模式、建造者模式、原型模式。
 *
 *(1)静态工厂模式。建立一个工厂类，对实现了同一接口的一些类进行实例的创建。
 *   将多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。
 *   工厂模式的使用主要是为了使系统不依赖于实现得细节
 *
 *(2)抽象工厂模式。工厂方法模式有一个问题就是，类的创建依赖工厂类，也就是说，如果想要拓展程序，必须对工厂类进行修改，这违背了闭包原则
 *   抽象工厂模式，创建多个工厂类，这样一旦需要增加新的功能，直接增加新的工厂类就可以了，不需要修改之前的代码。
 *
 *(3)建造者模式。建造者模式将很多功能集成到一个类里，这个类可以创造出比较复杂的东西。
 *   所以与工程模式的区别就是：工厂模式关注的是创建单个产品，而建造者模式则关注创建符合对象，多个部分。
 *
 *(4)原型模式。浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
 *            浅复制，实现Cloneable接口，调用父类object的克隆方法：super.clone()
 *            深复制：将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。
 *            要实现深复制，需要采用流的形式读入当前对象的二进制输入，再写出二进制数据对应的对象。
 *
 *(5)单例模式。私有构造方法，使用内部类来维护单例的实现
 */
package com.jeiker.designpattern.create;