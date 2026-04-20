package Tuprak8;
public class Main {
    public static void main(String[] args) {

        Invoice[] invoicesAgiel = {
            new Invoice("Beras 5kg",    2, 75000),
            new Invoice("Minyak Goreng", 3, 20000),
            new Invoice("Gula Pasir",   1, 15000)
        };

        Employee emp1 = new Employee(1001, "Said Agiel",  5000000, invoicesAgiel);

        Payable[] payables = {emp1};

        for (Payable p : payables) {
            if (p instanceof Employee) {
                ((Employee) p).displayInfo(); // polimorfis
            }
        }
    }
}