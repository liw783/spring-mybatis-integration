package com.liw;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import com.alibaba.druid.pool.DruidDataSource;
import com.liw.util.PropertyReader;

@Configuration
@MapperScan(basePackages = "com.liw.persistence")
public class DatabaseConfig {

	@Bean
	public DataSource dataSource() {
		DruidDataSource datasource = new DruidDataSource();
		String driver=PropertyReader.getValue("jdbc.driverClassName");
		String url=PropertyReader.getValue("jdbc.url");
		String username=PropertyReader.getValue("jdbc.username");
		String password=PropertyReader.getValue("jdbc.password");
		datasource.setDriverClassName(driver);
		datasource.setUrl(url);
		datasource.setUsername(username);
		datasource.setPassword(password);
		datasource.setMaxActive(20);
		datasource.setInitialSize(5);
		return datasource;
	}


	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		String url = "classpath*:com/liw/sqlmap/*.xml";
		Resource[] resources = resolver.getResources(url);
		sessionFactory.setMapperLocations(resources);
		return sessionFactory.getObject();
	}

}
