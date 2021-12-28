package com.sr.mapflatmap.domain;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

    public static void main(String[] args) {

        List<Customer> customers = DB.getAll();

        // list customer convert list string
        // get all address -------> one to one mapping (map)
        List<String> collect = customers.stream().map(customer -> customer.getAddress()).collect(Collectors.toList());
        System.out.println(collect);

        // get all name -------> one to one mapping (map)
        List<String> name = customers.stream().map(customer -> customer.getName()).collect(Collectors.toList());
        System.out.println(name);

        // get all phone number -------> one to many mapping  (map)
        List<List<String>> phoneNumber = customers.stream().map(customer -> customer.getPhoneNumber()).collect(Collectors.toList());
        System.out.println(phoneNumber);


        // get all phone number -------> one to many mapping  (flat map)
        List<String> phone = customers.stream().flatMap(customer -> customer.getPhoneNumber().stream()).collect(Collectors.toList());
        System.out.println(phone);
    }
}
