package com.imerizak.minicorebanking;

import org.springframework.boot.SpringApplication;

public class TestMiniCoreBankingApplication {

    public static void main(String[] args) {
        SpringApplication.from(MiniCoreBankingApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
