package EnumExercise.WorkContract.WorkTest;

import EnumExercise.WorkContract.Service.WorkService;

import java.text.ParseException;

public class WorkTest {
    public static void main(String[] args) throws ParseException {
        WorkService workService = new WorkService();
        workService.collectingData();

    }
}
