package EnumExercise.WorkContract.domain;

import java.util.Date;

public class HourContract {

    Date date;
    private Double valuePerHour;
    private Integer hour;

    public HourContract(Double valuePerHour, Integer hour, Date date) {
        this.valuePerHour = valuePerHour;
        this.hour = hour;
        this.date = date;

    }


    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Object setDate(String next) {
        return null;
    }
}
