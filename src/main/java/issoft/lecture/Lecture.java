package issoft.lecture;

public class Lecture implements Cloneable {

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
    public Lecture clone() {
        try {
            Lecture lecture = (Lecture) super.clone();
            return lecture;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "descriptionLecture='" + descriptionLecture + '\'' +
                ", topicLecture='" + topicLecture + '\'' +
                '}';
    }
}