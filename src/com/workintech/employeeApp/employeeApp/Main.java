package com.workintech.employeeApp.employeeApp;


import com.workintech.employeeApp.Enums.Plan;
import com.workintech.employeeApp.Models.Company;
import com.workintech.employeeApp.Models.Employee;
import com.workintech.employeeApp.Models.Healthplan;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        Healthplan plan1 = new Healthplan(1, "Insurance X", Plan.ADVANCE);
        Healthplan plan2 = new Healthplan(2, "Insurance Y", Plan.MEDIUM);

        String[] healthplans = new String[3];
        healthplans[0] = plan1.getName();
        healthplans[1] = plan2.getName();

        Employee developer1 = new Employee(1, "Fatih Yılmaz", "fatihyilmaz@gmail.com", "1234", healthplans);
        Employee developer2 = new Employee(2, "Ali Veli", "aliveli@gmail.com", "1234", healthplans);
        developer1.addHealthplan(3, "Insurance X");
        System.out.println(developer1);

        System.out.println("********************************************");

        String[] developerNames = new String[5];
        developerNames[0] = developer1.getFullName();
        developerNames[1] = developer2.getFullName();

        com.workintech.employeeApp.Models.Company company1 = new Company(1, "Workintech",100000,developerNames);
        company1.addEmployee(3, "Fatih Yılmaz");
        System.out.println(company1);

        System.out.println("********************************************");

    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
