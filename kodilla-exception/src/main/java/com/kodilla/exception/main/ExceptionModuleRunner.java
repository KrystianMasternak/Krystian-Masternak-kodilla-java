package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;

import javax.security.auth.login.FailedLoginException;

public class ExceptionModuleRunner {

    public static void main(String[] args) {
       // FileReader fileReader = new FileReader();
       // try {
       //     fileReader.readFile();
       // } catch (FileReaderException e) {
       //     System.out.println("Problem while reading a file!");
       // }

        FileReader fileReader = new FileReader();
        try{
            fileReader.readFile();
        } catch (Exception e) {
            System.out.println("Problem while reading a file!");
        }
    }
}
