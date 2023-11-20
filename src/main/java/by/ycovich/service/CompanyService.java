package by.ycovich.service;

import by.ycovich.dto.CompanyReadDTO;
import by.ycovich.listener.AccessType;
import by.ycovich.listener.EntityEvent;
import by.ycovich.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyService {
    private final CompanyRepository companyRepository;
    private final ApplicationEventPublisher applicationEventPublisher;

    @Autowired
    public CompanyService(CompanyRepository companyRepository, ApplicationEventPublisher applicationEventPublisher) {
        this.companyRepository = companyRepository;
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public Optional<CompanyReadDTO> getCompany(Integer id){
        return companyRepository.findById(id).map(entity -> {
            applicationEventPublisher.publishEvent(new EntityEvent(entity, AccessType.READ));
            return new CompanyReadDTO(entity.id());
        });
    }
}
