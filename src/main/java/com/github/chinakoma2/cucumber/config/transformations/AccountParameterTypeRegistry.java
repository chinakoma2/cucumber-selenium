package com.github.chinakoma2.cucumber.config.transformations;

import io.cucumber.java.ParameterType;

public class AccountParameterTypeRegistry {

    @ParameterType(".*")
    public String credentialsName(String value){
        return value.toLowerCase().replace(" ",".");
    }
}