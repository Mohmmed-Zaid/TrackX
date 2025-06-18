package MZ.TrackX.dto;

import MZ.TrackX.entities.Expense;
import MZ.TrackX.entities.Income;
import lombok.Data; // Lombok annotation to generate getters, setters, equals, hashCode, and toString methods
import java.util.List;

/**
 * Data Transfer Object (DTO) for conveying graph data,
 * specifically lists of Income and Expense objects.
 */
@Data
public class GraphDto {
    private List<Income> incomeList;  // List to hold income records
    private List<Expense> expenseList; // List to hold expense records
}