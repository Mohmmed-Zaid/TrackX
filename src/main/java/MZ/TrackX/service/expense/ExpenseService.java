package MZ.TrackX.service.expense;

import MZ.TrackX.dto.ExpenseDto;
import MZ.TrackX.entities.Expense;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ExpenseService {

    Expense postExpense(ExpenseDto expenseDto);

    List<Expense> getAllExpenses();

    Expense getExpenseById(Long id);

    Expense updateExpense(Long id,ExpenseDto expenseDto);

    void deleteExpense(Long id);
}
