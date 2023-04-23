package com.example;

// import org.springframework.beans.factory.BeanFactory;
// import org.springframework.core.io.ClassPathResource;
// import org.springframework.core.io.Resource;
// import org.springframework.beans.factory.xml.XmlBeanFactory;

/**
 * Cannot resolve symbol 'XmlBeanFactory' 错误通常是由于缺少 Spring Framework 的依赖所致。
 * XmlBeanFactory 是 Spring Framework 3.x 版本中的一个类，从 Spring Framework 4.3 版本开始，
 * 官方已经不推荐使用 XmlBeanFactory 类，推荐使用 ApplicationContext 接口的实现类代替，
 * 如 ClassPathXmlApplicationContext、FileSystemXmlApplicationContext 等。
 * 如果您的项目中使用的是 Spring Framework 4.3 或更高版本，建议使用 ApplicationContext 接口的实现类来
 * 代替 XmlBeanFactory
 */
public class AppForBeanFactory {
  // public static void main(String[] args) {
  //   Resource resource = new ClassPathResource("applicationContext.xml");
  //
  //   BeanFactory beanFactory = new XmlBeanFactory(resources);
  //   BookDao bookDao = beanFactory.getBean(BookDao.class);
  //   bookDao.save();
  // }
}
