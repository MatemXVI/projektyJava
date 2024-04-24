package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Quiz {
    File quizJson;
    public Quiz(String fileName){
        String file = Objects.requireNonNull(this.getClass().getClassLoader().getResource(fileName)).getFile();
       File quizJson =  new File(file);
    }

    public void displayQuestions() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Question> questions = mapper.readValue(quizJson, new TypeReference<List<Question>>() {
        });
        questions.stream()
                .map(Question::getPytanie)
                .forEach(System.out::println);
    }

    public void play() throws IOException {
        Scanner scanner = new Scanner(System.in);
        ObjectMapper mapper = new ObjectMapper();
        List<Question> questions = mapper.readValue(quizJson, new TypeReference<List<Question>>() {
        });

        for (Question question : questions){
            System.out.println(question.getPytanie());
            System.out.println("a " + question.getA());
            System.out.println("b " + question.getB());
            System.out.println("c " + question.getC());
            System.out.println("d " + question.getD());

            String answer = scanner.nextLine();

            if(question.getPrawidlowaOdpowiedz().equals(answer)){
                System.out.println("To praidłowa odpowiedź");
            }else{
                System.out.println("Niestety to błędna odpowiedź. Prawidłowa odpowiedź to " +
                        question.getPrawidlowaOdpowiedz());
            }
        }

    }
}
