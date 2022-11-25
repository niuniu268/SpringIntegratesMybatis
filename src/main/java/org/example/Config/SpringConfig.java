package org.example.Config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration
@ComponentScan("org.example")
@PropertySource( "classpath:jdbc.properties" )
public class SpringConfig {
    @Value( "${jdbc.driver}" )
    String driver;
    @Value( "${jdbc.url}" )
    String url;
    @Value( "${jdbc.username}" )
    String username;
    @Value( "${jdbc.password}" )
    String password;

    @Bean
    public  DataSource dataSource(){
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName( driver );
        ds.setUrl( url );
        ds.setUsername( username );
        ds.setPassword( password );
        return ds;
    }

    @Bean
    public static SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//        bean.setTypeAliasesPackage( "org.example.Domain" );
        bean.setDataSource( dataSource );
        return bean.getObject();
    }
    @Bean
    public static MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer configurer = new MapperScannerConfigurer();
        configurer.setBasePackage( "org.example.Dao" );
        return configurer;
    }

}
