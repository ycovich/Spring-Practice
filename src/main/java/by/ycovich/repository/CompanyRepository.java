package by.ycovich.repository;

import by.ycovich.entity.Company;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class CompanyRepository  {
    public Optional<Company> findById(int id){
        System.out.println("companyRepository findById method");
        return Optional.of(new Company(id));
    }

}
