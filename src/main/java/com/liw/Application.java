package com.liw;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.liw.model.AppFdRrUserWithBLOBs;
import com.liw.persistence.AppFdRrUserMapper;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private AppFdRrUserMapper mapper;
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }

    @Override
    public void run(String... strings) throws Exception {
    	AppFdRrUserWithBLOBs u = mapper.selectByPrimaryKey("1");
    	System.out.println(u.getcUsername());
    }
}