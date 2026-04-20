package Tuprak8;

public class Employee implements Payable {
    
    private Integer registrationNumber;
    private String name;
    private Integer salaryPerMonth;
    private Invoice[] invoices;

    // Constructor
    public Employee(Integer registrationNumber, String name, 
                    Integer salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name               = name;
        this.salaryPerMonth     = salaryPerMonth;
        this.invoices           = invoices;
    }

    public Integer getRegistrationNumber() { return registrationNumber; }
    public String getName()                { return name; }
    public Integer getSalaryPerMonth()     { return salaryPerMonth; }
    public Invoice[] getInvoices()         { return invoices; }

    public int getTotalInvoice() {
        int total = 0;
        for (Invoice inv : invoices) {
            total += inv.getPayableAmount();
        }
        return total;
    }

    // Implementasi interface Payable
    @Override
    public int getPayableAmount() {
        return salaryPerMonth - getTotalInvoice();
    }

    public void displayInfo() {
        System.out.println("========================================");
        System.out.println("Data Karyawan");
        System.out.println("========================================");
        System.out.println("No. Registrasi : " + registrationNumber);
        System.out.println("Nama           : " + name);
        System.out.println("Gaji Per Bulan : Rp " + salaryPerMonth);
        System.out.println();
        System.out.println("Detail Belanja di Koperasi:");
        System.out.println("  ----------------------------");


        for (Payable p : invoices) {
            if (p instanceof Invoice) {
                ((Invoice) p).displayInfo(); 
            }
        }

        System.out.println("Total Belanja  : Rp " + getTotalInvoice());
        System.out.println("Gaji Bersih    : Rp " + getPayableAmount());
        System.out.println("========================================");
    }
}