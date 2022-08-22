package com.sunflower.listener;

import com.sunflower.pojo.ProductType;
import com.sunflower.services.ProductTypeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.List;

// ServletContextListener 是一个全局的监听器，用于获取全部的商品列表，存入到当前的得全局的作用域中。
@WebListener  //注册当前的监听器
public class ProductTypeListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        //手工从spring容器中取出ProductTypeServiceImpl的对象
          //获取spring的容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_*.xml");
         //获取业务逻辑层的对象
        ProductTypeService productTypeService = (ProductTypeService) context.getBean("ProductTypeServiceImpl");
         //获取所有商品的类别
        List<ProductType> typeList = productTypeService.getAll();
         //再放入到全局应用作用域中，供新增页面、修改页面、前台的查询功能提供全部商品类别集合
        servletContextEvent.getServletContext().setAttribute("typeList",typeList);

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
