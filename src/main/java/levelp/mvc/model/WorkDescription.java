package levelp.mvc.model;

import java.util.Calendar;

/**
 * Created by d.tyufanov on 08.11.2014.
 */
public class WorkDescription {
    String name;
    String city; //in future we make hardcoded cites of all world and countries
    String site;
    String description;
    private Month startMonth;
    private Month finishMonth;
    private int startYear, finishYear;

    public Month getStartMonth() {
        return startMonth;
    }

    public void setStartMonth(Month startMonth) {
        this.startMonth = startMonth;
    }

    public Month getFinishMonth() {
        return finishMonth;
    }

    public void setFinishMonth(Month finishMonth) {
        this.finishMonth = finishMonth;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        if (startYear > 1900 && startYear <= Calendar.getInstance().get(Calendar.YEAR)) {
            this.startYear = startYear;
        } else {
            System.out.println("Your input data is wrong. Check start year please. Will save current year.");
            this.startYear = Calendar.getInstance().get(Calendar.YEAR);
        }
    }

    public int getFinishYear() {
        return finishYear;
    }

    public void setFinishYear(int finishYear) {
        if (finishYear > 1900 && finishYear <= Calendar.getInstance().get(Calendar.YEAR)) {
            this.finishYear = finishYear;
        } else {
            System.out.println("Your input data is wrong. Check finish year please. Will save current year.");
            this.finishYear = Calendar.getInstance().get(Calendar.YEAR);
        }
    }
}
