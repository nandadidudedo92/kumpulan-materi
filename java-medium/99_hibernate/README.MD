 1. Create New Maven Project **BelajarJavaMysqlMvn**

 2. Update POM.xml
~~~xml
<dependencies>
		<dependency>
			<groupId>org.hibernate</groupId>
			<artifactId>hibernate-core</artifactId>
			<version>4.3.10.Final</version>
		</dependency>

		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>5.1.36</version>
		</dependency>
	</dependencies>
~~~

3. Create Hibernate.cfg.xml under folder resources.

~~~xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE hibernate-configuration PUBLIC
      "-//Hibernate/Hibernate Configuration DTD 3.0//EN"
      "http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd" >
<hibernate-configuration>
	<session-factory>
		<property name="hibernate.dialect">org.hibernate.dialect.MySQLDialect</property>
		<property name="hibernate.connection.driver_class">com.mysql.jdbc.Driver</property>

		<property name="hibernate.connection.url">jdbc:mysql://localhost:3306/pascal</property>
		<property name="hibernate.connection.username">root</property>
		<!-- <property name = "hibernate.connection.password">P@ssw0rd</property> -->

		<mapping resource="Pascal.hbm.xml"></mapping>
	</session-factory>

</hibernate-configuration>
~~~

4. Create Hibernate mapping under folder resources Product.hbm.xml.

~~~