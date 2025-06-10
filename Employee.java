public class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    @Override
    public double getPayableAmount() {
        double totalInvoices = 0;
        for (Invoice invoice : invoices) {
            totalInvoices += invoice.getPayableAmount();
        }
        return salaryPerMonth - totalInvoices;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public String getName() {
        return name;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public Invoice[] getInvoices() {
        return invoices;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Nama Karyawan: %s\n", name));
        sb.append(String.format("Nomor Registrasi: %d\n", registrationNumber));
        sb.append(String.format("Gaji per bulan: Rp.%d\n", salaryPerMonth));
        sb.append("\nDaftar Belanja:\n");
        
        for (Invoice invoice : invoices) {
            sb.append(invoice.toString()).append("\n");
        }
        
        sb.append(String.format("\nTotal gaji setelah potongan: Rp.%.2f", getPayableAmount()));
        
        return sb.toString();
    }
}
