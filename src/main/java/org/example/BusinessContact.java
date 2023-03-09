package org.example;

import java.util.Objects;

public class BusinessContact extends Contact {

    private String companyName;

    public BusinessContact(String name, String companyName) {
        super(name);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusinessContact that = (BusinessContact) o;
        return super.equals(o) &&
                Objects.equals(getCompanyName(), that.getCompanyName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCompanyName(), getName());
    }

    @Override
    public String toString() {
        return "BusinessContact{" +
                "companyName='" + companyName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
