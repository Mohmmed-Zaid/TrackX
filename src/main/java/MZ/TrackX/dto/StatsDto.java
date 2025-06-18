package MZ.TrackX.dto;

import MZ.TrackX.entities.Expense;
import MZ.TrackX.entities.Income;
import lombok.Data;

@Data
public class StatsDto {

    private Double income;
    private Double expense;

    private Income latestIncome;
    private Expense latestExpense;

    private Double balance;
    private Double minIncome;
    private Double maxIncome;

    private Double maxExpense;
    private Double minExpense;



}
