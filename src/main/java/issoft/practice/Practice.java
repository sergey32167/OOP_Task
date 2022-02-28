package issoft.practice;

public class Practice {

    private String descriptionPractice;
    private String taskLink;
    private String solutionLink;

    public Practice(String descriptionPractice, String taskLink, String solutionLink) {
        this.descriptionPractice = descriptionPractice;
        this.taskLink = taskLink;
        this.solutionLink = solutionLink;
    }

    public String getDescription() {
        return descriptionPractice;
    }

    public void setDescription(String descriptionPractice) {
        this.descriptionPractice = descriptionPractice;
    }

    public String getTaskLink() {
        return taskLink;
    }

    public void setTaskLink(String taskLink) {
        this.taskLink = taskLink;
    }

    public String getSolutionLink() {
        return solutionLink;
    }

    public void setSolutionLink(String solutionLink) {
        this.solutionLink = solutionLink;
    }

    @Override
    public String toString() {
        return "Practice{" +
                "descriptionPractice='" + descriptionPractice + '\'' +
                ", taskLink='" + taskLink + '\'' +
                ", solutionLink='" + solutionLink + '\'' +
                '}';
    }
}