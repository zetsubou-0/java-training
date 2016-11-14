package com.training.coolproject.justtraining;

import com.training.coolproject.justtraining.core.web.executor.RestExecutor;
import com.training.coolproject.justtraining.core.web.executor.ServerConfig;

import java.io.IOException;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        // run application
        try (RestExecutor restExecutor = new RestExecutor(new ServerConfig("google.by"))) {
            System.out.println(restExecutor.executeGet("/", Collections.emptyMap()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
