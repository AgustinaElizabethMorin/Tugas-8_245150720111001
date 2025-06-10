public class Main {
    public static void main(String[] args) {
        // Membuat beberapa invoice belanja
        Invoice[] invoices = {
            new Invoice("Buku Tulis", 5, 5000),
            new Invoice("Pensil", 10, 2000),
            new Invoice("Penghapus", 3, 1000)
        };

        // Membuat karyawan
        Employee employee = new Employee(12345, "John Doe", 5000000, invoices);

        // Menampilkan informasi karyawan dan belanjaan secara polimorfis
        displayPayableInfo(employee);
        
        // Menampilkan detail belanjaan secara polimorfis
        System.out.println("\nDetail Belanjaan:");
        for (Payable payable : invoices) {
            displayPayableInfo(payable);
        }
    }

    // Method polimorfis untuk menampilkan informasi payable
    public static void displayPayableInfo(Payable payable) {
        if (payable instanceof Employee) {
            System.out.println(payable);
        } else if (payable instanceof Invoice) {
            System.out.println(payable);
        }
    }
}
