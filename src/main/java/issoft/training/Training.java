package issoft.training;

import issoft.lecture.Lecture;
import issoft.practice.Practice;

import java.util.ArrayList;
import java.util.List;

public class Training implements Cloneable {

    private String descriptionTraining;
    private final List<Lecture> kitLecture;
    private final List<Practice> kitPractice;

    public Training() {
        this.kitLecture = new ArrayList<>();
        this.kitPractice = new ArrayList<>();
    }

    public String getDescription() {
        return descriptionTraining;
    }

    public void setDescription(String descriptionTraining) {
        this.descriptionTraining = descriptionTraining;
    }

    public List<Lecture> addLecture(String descriptionLecture, String topicLecture) {
        kitLecture.add(new Lecture(descriptionLecture, topicLecture));
        return kitLecture;
    }

    public List<Practice> addPractice(String descriptionPractice, String taskLink, String solutionLink) {
        kitPractice.add(new Practice(descriptionPractice, taskLink, solutionLink));
        return kitPractice;
    }

    public boolean isPractical() {
        return kitLecture.size() == 0 && kitPractice.size() != 0;
    }

    @Override
    public Training clone() {
        try {
            Training training = (Training) super.clone();
            return training;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Training{" +
                "descriptionTraining='" + descriptionTraining + '\'' +
                ", kitLecture=" + kitLecture +
                ", kitPractice=" + kitPractice +
                '}';
    }
}