package pe.bbva.proyectobbva.model.repository.config;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.io.IOException;
import java.util.Properties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceFactory {

    private static final Logger LOG = LoggerFactory.getLogger(DataSourceFactory.class);

    private DataSource getDataSource(String configurationProperties) {
        Properties conf = new Properties();
        try {
            conf.load(DataSourceFactory.class.getClassLoader().getResourceAsStream(configurationProperties));
        } catch (IOException e) {
            LOG.error("Can't locate database configuration", e);
        }
        HikariConfig config = new HikariConfig(conf);
        HikariDataSource dataSource = new HikariDataSource(config);
        return dataSource;
    }

    @Bean
    public DataSource mySQLDataSource() {
        LOG.debug("Creating data source for MySQL");
        return getDataSource("mysql-connection.properties");
    }
}
