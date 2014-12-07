import com.luxoft.training.lab2.employees.*;
import com.luxoft.training.utils.Date;


public class EmployeesDemo {

    public static void main(String[] args) {

        Worker[] workers = new Worker[4];

        BaseSalaryCommWorker w1 = new BaseSalaryCommWorker();
        w1.setFirstName("Maxim");
        w1.setLastName("Popkov");
        w1.setBirthday(new Date(10, 07, 1996));
        w1.setPosition("Developer");
        w1.setCommission(10);
        w1.setSalary(100);
        w1.setSales(11);
        workers[0] = w1;


        MonthlySalaryWorker w2 = new MonthlySalaryWorker();
        w2.setFirstName("Pasha");
        w2.setLastName("Prihodchenko");
        w2.setBirthday(new Date(09, 07, 1996));
        w2.setPosition("CEO");
        w2.setSalary(80000);
        workers[1] = w2;

        HourlyRateWorker w3 = new HourlyRateWorker();
        w3.setFirstName("Arthur");
        w3.setLastName("Belous");
        w3.setBirthday(new Date(19, 10, 1996));
        w3.setPosition("Manager");
        w3.setHours(100);
        w3.setRate(10);
        workers[2] = w3;

        CommissionWorker w4 = new CommissionWorker();
        w4.setFirstName("Vitaliy");
        w4.setLastName("Buga");
        w4.setBirthday(new Date(17, 07, 1995));
        w4.setPosition("Designer");
        w4.setSales(6);
        w4.setCommission(30);
        workers[3] = w4;

        for (Worker worker : workers) { worker.printInfo(); }



    }

}
