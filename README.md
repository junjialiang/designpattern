_**JDK**_
~~**创建型模式：**~~
**简单工厂：**
类名：java.util.Calendar
类名：java.sql.DriverManager
类名：org.slf4j.LoggerFactory

**工厂方法：**
类名：java.util.Collection
类名：java.net.URLStreamHandlerFactory
类名：org.slf4j.LoggerFactory

**抽象工厂：**
类名：java.sql.Connection
类名：java.sql.Statement
类名：org.apache.ibatis.session.SqlSessionFactory

**建造者模式：**
类名：java.lang.StringBuilder
类名：java.lang.StringBuffer
类名：com.google.common.collect.ImmutableSet
类名：com.google.common.cache.CacheBuilder
类名：org.springframework.beans.factory.support.BeanDefinitionBuilder
类名：org.apache.ibatis.session.SqlSessionFactoryBuilder
类名：org.apache.ibatis.builder.xml.XMLConfigBuilder

**单例模式：**
类名：java.lang.Runtime
类名：java.awt.Desktop
类名：org.springframework.beans.factory.config.AbstractFactoryBean
类名：org.apache.ibatis.executor.ErrorContext

**原型模式：**
类名：java.util.ArrayList
类名：java.util.HashMap
类名：org.apache.ibatis.cache.CacheKey

----------------------------------------------------------------------------

~~**结构型模式**~~
**外观模式/门面模式：**
类名：org.springframework.jdbc.support.JdbcUtils
类名：org.apache.ibatis.session.Configuration

**装饰者模式：**
类名：java.io.BufferedReader
类名：java.io.BufferedInputStream
类名：org.springframework.cache.transaction.TransactionAwareCacheDecorator
类名：org.springframework.session.web.http.SessionRepositoryRequestWrapper
类名：org.apache.ibatis.cache.Cache

**适配器模式：**
类名：javax.xml.bind.annotation.adapters.XmlAdapter
类名：org.springframework.aop.framework.adapter.AdvisorAdapter
类名：org.springframework.web.servlet.HandlerAdapter

**享元模式：**
类名：java.lang.Integer
类名：java.lang.Long
类名：org.apache.commons.pool2.impl.GenericKeyedObjectPool

**组合模式：**
类名：java.awt.Container
类名：java.util.HashMap
类名：java.util.ArrayList
类名：org.apache.ibatis.scripting.xmltags.SqlNode
类名：org.apache.ibatis.scripting.xmltags.MixedSqlNode

**桥接模式：**
类名：com.mysql.jdbc.Driver

**代理模式：**
类名：java.lang.reflect.Proxy
类名：org.springframework.aop.framework.ProxyFactoryBean
类名：org.springframework.aop.framework.JdkDynamicAopProxy
类名：org.springframework.aop.framework.CglibAopProxy
类型：org.apache.ibatis.binding.MapperProxyFactory

----------------------------------------------------------------------------

~~**行为型模式：**~~
**模板方法：**
类名：java.util.AbstractList
类名：java.util.ArrayList
类名：javax.servlet.http.HttpServlet
类名：org.apache.ibatis.executor.BaseExecutor

**迭代器模式：**
类名：java.util.Iterator
类名：java.util.ArrayList
类名：org.apache.ibatis.cursor.defaults.DefaultCursor

**策略模式：**
类名：java.util.Comparator
类名：java.util.Arrays
类名：java.util.TreeMap
类名：org.springframework.core.io.Resource
类名：org.springframework.beans.factory.support.InstantiationStrategy

**解释器模式：**
类名：java.util.regex.Pattern
类名：org.springframework.expression.ExpressionParser