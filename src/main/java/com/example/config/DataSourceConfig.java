package com.example.config;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import io.shardingjdbc.core.api.config.ShardingRuleConfiguration;
import io.shardingjdbc.core.jdbc.core.datasource.ShardingDataSource;

@Configuration
@MapperScan(basePackages = "com.example.mapper", sqlSessionTemplateRef = "shardSqlSessionTemplate")
public class DataSourceConfig {

	@Value("${spring.datasource.ds.driver-class-name}")
	private String driverClassName;
	
	@Value("${spring.datasource.ds.url}")
	private String url;
	
	@Value("${spring.datasource.ds.username}")
	private String userName;
	
	@Value("${spring.datasource.ds.password}")
	private String password;

	@Autowired
	private TableRuleConfig tableRuleConfig;
    
	@Bean(name = "shardingDataSource")
	public DataSource ShardingDataSource() throws SQLException {
		ShardingRuleConfiguration shardingRuleConfig;
		shardingRuleConfig = new ShardingRuleConfiguration();
		shardingRuleConfig.getTableRuleConfigs().addAll(tableRuleConfig.getTableRuleConfig());
		return new ShardingDataSource(shardingRuleConfig.build(createDataSourceMap()));
	}

	private Map<String, DataSource> createDataSourceMap() {
		Map<String, DataSource> result = new HashMap<>();
		result.put("ds", createDataSource());
		return result;
	}

	private DataSource createDataSource() {
		BasicDataSource result = new BasicDataSource();
		result.setDriverClassName(driverClassName);
		result.setUrl(url);
		result.setUsername(userName);
		result.setPassword(password);
		return result;
	}

	@Bean
	public DataSourceTransactionManager transactitonManager(DataSource shardingDataSource) {
		return new DataSourceTransactionManager(shardingDataSource);
	}

	@Bean
	@Primary
	public SqlSessionFactory sqlSessionFactory(DataSource shardingDataSource) throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(shardingDataSource);
		bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));
		return bean.getObject();
	}

	@Bean
	@Primary
	public SqlSessionTemplate shardSqlSessionTemplate(SqlSessionFactory sqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory);
	}

}
