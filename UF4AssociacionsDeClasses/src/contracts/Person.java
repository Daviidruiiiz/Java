package contracts;

import java.util.HashSet;

public class Person {
    private int dni;
    private String name;
    private HashSet<Contract> contracts;

    public Person() {
        contracts = new HashSet<>();
    }

    public Person(int dni) {
        this.dni = dni;
        contracts = new HashSet<>();
    }

    public Person(int dni, String name) {
        this.dni = dni;
        this.name = name;
        contracts = new HashSet<>();
    }

    public int workedTime() {
        int totalTime = 0;
        for (Contract contract : contracts) {
            totalTime += contract.duration();
        }
        return totalTime;
    }

    public int nCompanies() {
        HashSet<Company> companyNames = new HashSet<>();
        for (Contract contract : contracts) {
            companyNames.add(company.getName());
        }
        return companyNames.size();
    }

    public boolean signContract(Contract contract) {
        if (contract == null || contracts.contains(contract)) {
            return false;
        }
        contracts.add(contract);
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + dni;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (dni != other.dni)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
}
