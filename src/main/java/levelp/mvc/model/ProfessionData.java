package levelp.mvc.model;

/**
 * Created by d.tyufanov on 08.11.2014.
 */
public class ProfessionData {
    private String title;
    private int salary;
    private String level;
    private SheduleWork sheduleWork;
    private Employment employment;

    public String getTitle() {
        if (title != null) {
            return title;
        } else {
            return "";
        }
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getLevel() {
        if (level != null) {
            return level;
        } else {
            return "";
        }
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public SheduleWork getSheduleWork() {
        return sheduleWork;
    }

    public void setSheduleWork(SheduleWork sheduleWork) {
        this.sheduleWork = sheduleWork;
    }

    public Employment getEmployment() {
        return employment;
    }

    public void setEmployment(Employment employment) {
        this.employment = employment;
    }
}
