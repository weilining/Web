[TOC]
# AOP编程规范，面向切面编程
# 尽可能的不要有重复的代码
1.显得你特别low，重复的东西老是在写
2.修改替换特别麻烦
# log选择org.slf4j
private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

# 代码优化千万别到后面做，发现代码重复立马优化

# ResultUtil完成返回数据的封装,格式的统一
注：把所有逻辑放在service

在service处理逻辑，如果验证不通过，就直接往外抛异常，然后controller直接调用service方法，就不需要对service的返回进行判断了，反正是抛异常，然后controller也往外抛，抛出来之后，最后由ExceptionHandle来处理这些异常，这样子逻辑就直接在一个地方。
# 统一异常处理
多个标记，统一异常处理
RuntimeException继承的是Exception，spring框架只对你抛出的异常是RuntimeException才会进行事务回滚，如果是Exception不会进行回滚的，注意一下

# 枚举
code和message统一管理
枚举里不用写setter方法，写getter方法就好了,因为枚举是用构造方法来创建
# 写代码统一维护是必不可少的
错误码，提示信息，用枚举。
Result对象三个字段的固定格式，为了解决逻辑在一个地方处理，另外一个地方不需要接收返回的信息，所以引入的异常，采用异常来处理，默认的exception他只接受message字段，但我们这还用code，所以我们自己定义异常Girlexception，有异常，你得捕获他，所以写了捕获异常的类，最后，我们把code和message进行统一管理，用了枚举。