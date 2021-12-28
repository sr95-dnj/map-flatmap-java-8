package com.sr.mapflatmap.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DB {

    public static List<Customer> getAll(){
        return Stream.of(
                new Customer(1, "Siddiquer", "Dinajpur", Arrays.asList("01784988095", "01521393053")),
                new Customer(2, "Rakibul", "Manikgang", Arrays.asList("01xxxxxxxxx", "015xxxxxxxxx")),
                new Customer(2, "Milton", "Sathkhira", Arrays.asList("017000000000", "015000000000"))
        ).collect(Collectors.toList());
    }
}
