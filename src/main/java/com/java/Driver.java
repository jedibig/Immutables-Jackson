package com.java;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Driver {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        AbstractSomeClass someClass = mapper.readValue("{\"foo\": 1, \"bar\": \"Hello\", \"buz\": [1,2,3]}", SomeClass.class);
        System.out.println(someClass);
    }
}
