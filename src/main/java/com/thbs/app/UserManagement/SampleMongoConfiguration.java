package com.thbs.app.UserManagement;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.convert.MongoTypeMapper;

import com.mongodb.Mongo;

@Configuration
class SampleMongoConfiguration extends AbstractMongoConfiguration {

  @Override
  protected String getDatabaseName() {
    return "database";
  }

  @SuppressWarnings("deprecation")
@Override
  public Mongo mongo() throws Exception {

		return new Mongo();
  }
 
  @Bean
  @Override
  public MappingMongoConverter mappingMongoConverter() throws Exception {
    MappingMongoConverter mmc = super.mappingMongoConverter();
    mmc.setTypeMapper(new DefaultMongoTypeMapper(null));
    return mmc;
  }

  @Bean
  public MongoTypeMapper customTypeMapper() {
    return new CustomMongoTypeMapper();
  }
}