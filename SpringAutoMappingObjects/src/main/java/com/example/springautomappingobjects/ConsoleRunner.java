package com.example.springautomappingobjects;

import com.example.springautomappingobjects.Services.ExecutorService;
import com.example.springautomappingobjects.exceptions.UserNotLoggedInException;
import com.example.springautomappingobjects.exceptions.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleRunner implements CommandLineRunner {

    private final ExecutorService executorService;

    @Autowired
    public ConsoleRunner(ExecutorService executorService) {
        this.executorService = executorService;
    }

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        String result;
        try {
            result = executorService.execute(command);
        } catch (ValidationException | UserNotLoggedInException | javax.xml.bind.ValidationException ex) {
            result = ex.getMessage();
        }

        System.out.println(result);
    }
}
