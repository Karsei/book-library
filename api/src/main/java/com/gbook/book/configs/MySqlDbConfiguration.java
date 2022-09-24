package com.gbook.book.configs;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = {"com.gbook.book.entities"},
        entityManagerFactoryRef = "mySqlEntityManagerFactory",
        transactionManagerRef = "mySqlTransactionManager"
)
@Configuration
public class MySqlDbConfiguration {
    @Value("${spring.datasource.hikari.pool-name}")
    private String poolName;
    @Value("${spring.datasource.hikari.connection-timeout}")
    private Integer connectionTimeOut;
    @Value("${spring.datasource.hikari.max-lifetime}")
    private Integer maxLifeTime;
    @Value("${spring.datasource.hikari.maximum-pool-size}")
    private Integer maximumPoolSize;
    @Value("${spring.datasource.hikari.leak-detection-threshold}")
    private Integer leakDetectionThreshold;

    @Bean(name = "mySqlDataSource")
    @Qualifier("mySqlDataSource")
    @ConfigurationProperties("databases.main")
    public DataSource mySqlDataSource() {
        HikariDataSource hikariCp = new HikariDataSource();
        hikariCp.setPoolName(poolName);
        //hikariCp.setAutoCommit(false);
        hikariCp.setConnectionTimeout(connectionTimeOut);
        hikariCp.setMaxLifetime(maxLifeTime);
        hikariCp.setMaximumPoolSize(maximumPoolSize);
        hikariCp.setLeakDetectionThreshold(leakDetectionThreshold);
        return hikariCp;
    }

    @Bean(name = "mySqlEntityManagerFactory")
    public EntityManagerFactory mySqlEntityManagerFactory() {
        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setDataSource(mySqlDataSource());
        entityManagerFactoryBean.setPersistenceUnitName("mysqlEntity");
        entityManagerFactoryBean.setPackagesToScan("com.gbook.book.entities");
        entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        entityManagerFactoryBean.afterPropertiesSet();
        return entityManagerFactoryBean.getObject();
    }

    @Bean(name = "mySqlTransactionManager")
    public PlatformTransactionManager mySqlTransactionManager(@Qualifier("mySqlEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory);
        return transactionManager;
    }
}
