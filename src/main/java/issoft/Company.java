package issoft;

import issoft.training.Training;

public class Company {
    public static void main(String[] args) {
        Training training = new Training();
        training.setDescription("fffffffffffff");
        training.addLecture("math", "sin");
        training.addPractice("pract", "http", "https");
        training.isPractical();
        Training training1 = training.clone();
        training1.setDescription("dddddddddddddd");
        training1.addPractice("pract", "www", "www");
        System.out.println(training);
        System.out.println(training1);
    }
}