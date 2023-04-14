package by.ruslan.radevich.homework.lessons7.accountingSystem.Contract;

import by.ruslan.radevich.homework.lessons7.accountingSystem.Program.Document;
import by.ruslan.radevich.homework.lessons7.accountingSystem.Program.Printable;

import java.util.Date;

public class FinancialInvoice extends Document implements Printable {
    @Override
    public void print() {
    }
    private int totalSumOfMounth;
    private int departmentCode;



    public FinancialInvoice(int documentNumber, Date documentDate, int totalSumOfMounth, int departmentCode) {
        super(documentNumber, documentDate);
        this.totalSumOfMounth = totalSumOfMounth;
        this.departmentCode = departmentCode;
    }
    private FinancialInvoice(){

    }

    public int getTotalSumOfMounth() {
        return totalSumOfMounth;
    }

    public void setTotalSumOfMounth(int totalSumOfMounth) {
        this.totalSumOfMounth = totalSumOfMounth;
    }

    public int getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(int departmentCode) {
        this.departmentCode = departmentCode;
    }

    @Override
    public String toString() {
        return "FinancialInvoice{" +
                "totalSumOfMounth=" + totalSumOfMounth +
                ", departmentCode=" + departmentCode +
                "} " + super.toString();
    }
}
