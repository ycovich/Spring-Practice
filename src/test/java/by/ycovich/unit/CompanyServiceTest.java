package by.ycovich.unit;

import by.ycovich.dto.CompanyReadDTO;
import by.ycovich.entity.Company;
import by.ycovich.listener.EntityEvent;
import by.ycovich.repository.CompanyRepository;
import by.ycovich.service.CompanyService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.context.ApplicationEventPublisher;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class CompanyServiceTest {
    private static final Integer COMPANY_ID = 20;

    @Mock
    private CompanyRepository companyRepository;
    @Mock
    private ApplicationEventPublisher applicationEventPublisher;
    @InjectMocks
    private CompanyService companyService;


    @Test
    void getCompany(){
        Mockito.doReturn(Optional.of(new Company(COMPANY_ID)))
                .when(companyRepository.findById(COMPANY_ID));

        var actualResult = companyService.getCompany(COMPANY_ID);

        assertTrue(actualResult.isPresent());

        var expectedResult = new CompanyReadDTO(COMPANY_ID);

        actualResult.ifPresent(actual -> assertEquals(expectedResult, actual));

        verify(applicationEventPublisher).publishEvent(any(EntityEvent.class));
    }
}
