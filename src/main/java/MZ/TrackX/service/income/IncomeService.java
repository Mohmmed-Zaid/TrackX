package MZ.TrackX.service.income;

import MZ.TrackX.dto.IncomeDto;
import MZ.TrackX.entities.Income;

import java.util.List;

public interface IncomeService {

    Income postIncome(IncomeDto incomeDto);

    List<IncomeDto> getAllIncome();

    Income updateIncome(Long id,IncomeDto incomeDto);

    IncomeDto getIncomeId(Long id);

    void deleteIncome(Long id);
}
