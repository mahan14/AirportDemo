package ridemo.airportmanagement;

import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDbFactory;
import ridemo.airportmanagement.db.GenericCascadeListener;

@org.springframework.boot.test.context.TestConfiguration
public class DatabaseTestConfiguration {
    @Bean
    GenericCascadeListener genericCascadeListener(MongoTemplate mongoTemplate){
        return new GenericCascadeListener(mongoTemplate);
    }

    @Bean
    public MongoDbFactory mongoDbFactory() throws Exception {
        return new SimpleMongoClientDbFactory("mongodb://admin:admin@ridemo.rltu0hu.mongodb.net/?retryWrites=true&w=majority");
    }

    @Bean
    MongoTemplate mongoTemplate(MongoDbFactory factory) {
        return new MongoTemplate(factory);
    }
}
