package by.ruslan.radevich.homework.lessons7.accountingSystem.Program;

import by.ruslan.radevich.homework.lessons7.accountingSystem.Contract.ContractWithAnEmployee;
import by.ruslan.radevich.homework.lessons7.accountingSystem.Contract.DeliveryOfGoods;
import by.ruslan.radevich.homework.lessons7.accountingSystem.Contract.FinancialInvoice;
import by.ruslan.radevich.homework.lessons7.accountingSystem.Program.Printable;

import java.util.Date;

public class Register {
    public static void main(String[] args) {
        DeliveryOfGoods deliveryofgoods = new DeliveryOfGoods(123, new Date(), "A2", 112);
        ContractWithAnEmployee contractWithAnEmployee = new ContractWithAnEmployee(111, new Date(), "Ivan", 2025);
        FinancialInvoice financialInvoice = new FinancialInvoice(332, new Date(), 10000, 666);
        Printable[] register = new Printable[10];
        register[0] = new FinancialInvoice(333, new Date(), 10000, 666);
        register[1] = new ContractWithAnEmployee(111, new Date(), "Ivan", 2025);
        register[2] = new DeliveryOfGoods(123, new Date(), "A2", 112);
        register[3] = new FinancialInvoice(333, new Date(), 10000, 666);
        register[4] = new ContractWithAnEmployee(111, new Date(), "Ivan", 2025);
        register[5] = new DeliveryOfGoods(123, new Date(), "A2", 112);
        register[6] = new FinancialInvoice(333, new Date(), 10000, 666);
        register[7] = new ContractWithAnEmployee(111, new Date(), "Ivan", 2025);
        register[8] = new DeliveryOfGoods(123, new Date(), "A2", 112);
        register[9] = new ContractWithAnEmployee(111, new Date(), "Ivan", 2025);
        for (Printable s: register){
            System.out.println(s);
        }




    }
}
