package com.example.hibernate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

@Service
public class Runner implements ApplicationRunner {

    private static final Logger log = LoggerFactory.getLogger(Runner.class);

    private final PeopleRepository peopleRepository;

    public Runner(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("--- --- 1st call --- ---");
        callStartsWith();

        log.info("--- --- 2nd call --- ---");
        callStartsWith();
    }

    private void callStartsWith() {
        int i = 0;
        for (People people : peopleRepository.findByNameStartsWith("a")) {
            log.info("{}: {}", i++, people);
        }
    }
}
