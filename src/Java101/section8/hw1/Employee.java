package Java101.section8.hw1;

public class Employee {
    String name;
    double salary;
    int workHours;
    String hireYear;

    Employee(String name, double salary, int workHours, String hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        if(this.salary < 1000){
            return 0;
        }
        else{
            return this.salary * 0.03;
        }
    }

    double bonus(){
        if(this.workHours > 40){
            return (workHours-40) * 30;
        }else{
            return 0;
        }
    }
    double raiseSalary(int year){
        int employeeYear = year - Integer.parseInt(this.hireYear);
        if(employeeYear<10){
            return this.salary * 0.05;
        }
        else if(employeeYear>9 && employeeYear <20){
            return this.salary * 0.1;
        }
        else{
            return salary * 0.15;
        }
    }

    void showInfo() {
        System.out.println("Adı: "+this.name);
        System.out.println("Maaşı: "+this.salary);
        System.out.println("Çalışma Saati: "+this.workHours);
        System.out.println("Başlangıç Yılı: "+this.hireYear);
        System.out.println("Vergi: " +this.tax());
        System.out.println("Bonus: "+this.bonus());
        System.out.println("Maaş Artışı: "+this.raiseSalary(2021));
        System.out.println("Vergi ve bonuslar ile maaş: "+ (this.salary+this.bonus()-this.tax()));
        System.out.println("Toplam Maaş: "+ (this.salary + this.bonus() + this.raiseSalary(2021) - this.tax()));
    }
}
