package com.kodilla.hibernate.manytomany;

import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@NamedNativeQueries({
        @NamedNativeQuery(
                name = "Company.retrieveCompaniesWithThreeFirstLetters",
                query = "SELECT * FROM COMPANIES WHERE COMPANY_NAME LIKE CONCAT(:PIECE_OF_NAME, %) ORDER BY COMPANY_NAME",
                resultClass = Company.class
        ),
        @NamedNativeQuery(
                name = "Company.retrieveCompaniesWithPartOfName",
                query = "SELECT * FROM COMPANIES WHERE COMPANY_NAME LIKE CONCAT(%, :BEGINSWITH, %) ORDER BY COMPANY_NAME",
                resultClass = Company.class
        )
})
@Entity
@Table(name = "COMPANIES")
public class Company {
    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Company)) return false;
        Company company = (Company) o;
        return getId() == company.getId() &&
                Objects.equals(getName(), company.getName()) &&
                Objects.equals(getEmployees(), company.getEmployees());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getEmployees());
    }
}
