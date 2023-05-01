package org.gs;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {

        User user = new User("Alexander", "Hutsol");

        ObjectMapper objectMapper = new ObjectMapper();

        String output = objectMapper.writeValueAsString(user);
        System.out.println(output);
    }
}