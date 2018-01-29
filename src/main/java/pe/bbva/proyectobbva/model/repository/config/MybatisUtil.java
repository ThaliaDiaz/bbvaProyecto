package pe.bbva.proyectobbva.model.repository.config;

import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
@MapperScan("pe.bbva.proyectobbva.model.repository")
public class MybatisUtil {
    
    @Autowired
    private ApplicationContext ctx;

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource)
        throws Exception {
        SqlSessionFactoryBean sessionFactory =
            new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setConfigLocation(
            ctx.getResource("classpath:config/mybatis-config.xml"));
        return sessionFactory.getObject();
    }

    @Bean
    public DataSourceTransactionManager transactionManager(DataSource dataSource) {
        DataSourceTransactionManager tm = new DataSourceTransactionManager();
        tm.setDataSource(dataSource);
        return tm;
    }
}
