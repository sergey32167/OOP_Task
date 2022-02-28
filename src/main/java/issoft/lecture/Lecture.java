package issoft.lecture;

public class Lecture {

    private String descriptionLecture;
    private String topicLecture;

    public Lecture(String descriptionLecture, String topicLecture) {
        this.descriptionLecture = descriptionLecture;
        this.topicLecture = topicLecture;
    }

    public String getDescription() {
        return descriptionLecture;
    }

    public void setDescription(String descriptionLecture) {
        this.descriptionLecture = descriptionLecture;
    }

    public String getTopicLecture() {
        return topicLecture;
    }

    public void setTopicLecture(String topicLecture) {
        this.topicLecture = topicLecture;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "descriptionLecture='" + descriptionLecture + '\'' +
                ", topicLecture='" + topicLecture + '\'' +
                '}';
    }
}