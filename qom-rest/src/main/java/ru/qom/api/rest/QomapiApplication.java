package ru.qom.api.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QomapiApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(QomapiApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(QomapiApplication.class, args);
    }

//    @Autowired
//    JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... strings) throws Exception {
        log.info("Creating tables");

//        jdbcTemplate.execute("DROP TABLE box IF EXISTS");
//        jdbcTemplate.execute("CREATE TABLE box(id SERIAL, username VARCHAR(255), title VARCHAR(255),body VARCHAR(255),boxtype VARCHAR(255))");

//        Arrays.asList("adam1,adam2,adam3,adam4,adam5".split(",")).forEach((u) -> {
//            int i = 0;
//
//            accountRepository.save(new Account(u + "@gmail.com", u, "password", "/mock-data/images" + (++i) + ".jpg"));
//            boxesRepository.save(new Box(u, "Title", "Body", "fgdfg"));
//        });

    }
}














