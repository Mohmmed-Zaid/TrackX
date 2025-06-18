package MZ.TrackX.service.income;

import MZ.TrackX.dto.IncomeDto;
import MZ.TrackX.entities.Income;
import MZ.TrackX.repository.IncomeRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class IncomeServiceImpl implements IncomeService{

    private final IncomeRepository incomeRepository;

    public Income postIncome(IncomeDto incomeDto){
        return saveOrUploadIncome(new Income(),incomeDto);
    }

    private Income saveOrUploadIncome(Income income, IncomeDto incomeDto){
        income.setTitle(incomeDto.getTitle());
        income.setDate(incomeDto.getDate());
        income.setAmount(incomeDto.getAmount());
        income.setCategory(incomeDto.getCategory());
        income.setDecription(incomeDto.getDescription());

    return incomeRepository.save(income);
    }

    public Income updateIncome(Long id,IncomeDto incomeDto){
        Optional<Income> optionalIncome = incomeRepository.findById(id);
        if (optionalIncome.isPresent()){
            return saveOrUploadIncome(optionalIncome.get(),incomeDto);
        }
        else {
            throw new EntityNotFoundException("Income is present with id " +id);
        }
    }

    public List<IncomeDto> getAllIncome(){
        return incomeRepository.findAll().stream()
                .sorted(Comparator.comparing(Income::getDate).reversed())
                .map(Income::getIncomeDto)
                .collect(Collectors.toList());

    }

    public IncomeDto getIncomeId(Long id){
        Optional <Income> optionalIncome = incomeRepository.findById(id);
        if (optionalIncome.isPresent()){
            return optionalIncome.get().getIncomeDto();
        }
        else {
            throw new EntityNotFoundException("Income is not present with id : "+id);
        }
    }

    public void deleteIncome(Long id){
        Optional<Income> optionalIncome = incomeRepository.findById(id);
        if (optionalIncome.isPresent()){
            incomeRepository.deleteById(id);
        }
        else {
            throw new EntityNotFoundException("Expense is not persent with id " + id);
        }
    }
}
