public class Employee {
    String nameSurname;
    int salary;
    int workHours;
    int hireYear;
    double taxAmount = 0.0;// vergi miktarı
    double bonusAmount = 0.0; // bonus miktarı
    double salaryInc = 0.0; // maaş artışı
    double totalSalary = 0.0; // toplam maaş
    Employee(String nameSurname,int salary,int workHours,int hireYear){
        this.nameSurname = nameSurname;
        this.salary = salary; // maaş
        this.workHours = workHours; // çalışma saati
        this.hireYear = hireYear; // işe başlangış yılı
    }
    void tax(){
        if(this.salary < 1000){
            this.taxAmount = 0;
            System.out.println("vergi miktarı: " + this.taxAmount);
        }else{
            this.taxAmount = this.salary * 0.03;
            System.out.println("vergi miktarı: " + this.taxAmount);
        }
    }

    void bonus(){
        double hourly = 0.0; // saat fazlalıgı
        if(this.workHours < 40){
            this.bonusAmount = 0;
            System.out.println("Bonus: " + this.bonusAmount);
        }else{
            hourly = this.workHours - 40;
            this.bonusAmount = hourly * 30;
            System.out.println("Bonus: " + this.bonusAmount);
        }
    }
    void raiseSalary(){
        int yearDiff = 0;
        yearDiff = 2021 - this.hireYear;
        if (yearDiff > 0){
            if(yearDiff >= 0 && yearDiff <= 20){
                if(yearDiff < 9){
                    this.salaryInc = this.salary * 0.05;
                }else if(yearDiff <=10 && yearDiff >= 9){
                    this.salaryInc = this.salary * 0.15;
                }else if(yearDiff >= 10 && yearDiff < 19){
                    this.salaryInc = this.salary * 0.10;
                } else if (yearDiff >= 19 && yearDiff <=20) {
                    this.salaryInc = this.salary * 0.25;
                }
            }else{
                this.salaryInc = this.salary * 0.15;
            }
        }else{
            System.out.println("Bulunduğun tarihten sonra işe giremezsin!!");
        }
        System.out.println("maaş artışı: " + this.salaryInc);

    }

    void toStringg(){
        this.totalSalary = this.salary + this.bonusAmount + this.salaryInc - this.taxAmount;
        System.out.println("Adı : " + this.nameSurname);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + this.taxAmount);
        System.out.println("Bonus : " + this.bonusAmount);
        System.out.println("Maaş Artışı : " + this.salaryInc);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary + this.bonusAmount - taxAmount));
        System.out.println("Toplam Maaş : " + this.totalSalary);
    }

}
