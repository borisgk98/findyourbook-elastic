package space.borisgk.findyourbookelastic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories("space.borisgk.findyourbookelastic.repo")
public class FindyourbookElasticApplication {

	public static void main(String[] args) {
		SpringApplication.run(FindyourbookElasticApplication.class, args);
	}

}
