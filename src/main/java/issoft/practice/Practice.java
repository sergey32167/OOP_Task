package issoft.practice;

public class Practice implements Cloneable {

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
    public Practice clone() {
        try {
            Practice practice = (Practice) super.clone();
            return practice;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
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