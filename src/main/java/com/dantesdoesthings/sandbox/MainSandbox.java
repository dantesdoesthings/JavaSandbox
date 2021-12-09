package com.dantesdoesthings.sandbox;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;

import javax.validation.Validation;
import javax.validation.Validator;

public class MainSandbox {

    private static Validator validator;

    public static void main(String[] args) {


        ObjectMapper objectMapper = JsonMapper.builder()
                .enable(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS)
                .build();
        validator = Validation.buildDefaultValidatorFactory().getValidator();

        try {

            SampleBean b1 = objectMapper.readValue(ClassLoader.getSystemClassLoader().getResource("bean1.json"), SampleBean.class);
            System.out.println("Bean 1 " + b1);
            System.out.println(validator.validate(b1, SampleBean.class));

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try {

            SampleBean b2 = objectMapper.readValue(ClassLoader.getSystemClassLoader().getResource("bean2.json"), SampleBean.class);
            System.out.println("Bean 2 " + b2);
            System.out.println(validator.validate(b2, SampleBean.class));

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try {

            SampleBean b3 = objectMapper.readValue(ClassLoader.getSystemClassLoader().getResource("bean3.json"), SampleBean.class);
            System.out.println("Bean 3 " + b3);
            System.out.println(validator.validate(b3, SampleBean.class));

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
