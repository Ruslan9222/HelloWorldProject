package by.ruslan.radevich.homework.lessons7.accountingSystem.Contract;

import by.ruslan.radevich.homework.lessons7.accountingSystem.Program.Document;
import by.ruslan.radevich.homework.lessons7.accountingSystem.Program.Printable;

import java.util.Date;

public class ContractWithAnEmployee extends Document implements Printable {
    @Override
    public void print() {
    }
    private String nameWorker;
    private int contractEndDate;

    public ContractWithAnEmployee(int documentNumber, Date documentDate, String nameWorker, int contractEndDate) {
        super(documentNumber, documentDate);
        this.nameWorker = nameWorker;
        this.contractEndDate = contractEndDate;
    }
    private ContractWithAnEmployee(){

    }

    public String getNameWorker() {
        return nameWorker;
    }

    public void setNameWorker(String nameWorker) {
        this.nameWorker = nameWorker;
    }

    public int getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(int contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    @Override
    public String toString() {
        return "ContractWithAnEmployee{" +
                "nameWorker='" + nameWorker + '\'' +
                ", contractEndDate=" + contractEndDate +
                "} " + super.toString();
    }
}
