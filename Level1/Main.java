package Level1;
    public class Main {
    public static void main(String[] args) {
        

        System.out.println("--- Employee Details ---");
        Employee emp = new Employee("Alice", 101, 50000);
        emp.displayDetails();

        System.out.println("\n--- Circle Details ---");
        Circle circle = new Circle(7);
        circle.displayDetails();

        System.out.println("\n--- Item Details ---");
        Item item = new Item(1, "Laptop", 55000);
        item.displayDetails();
        System.out.println("Total Cost for 2 units: " + item.totalCost(2));

        System.out.println("\n--- Mobile Phone Details ---");
        MobilePhone phone = new MobilePhone("Samsung", "Galaxy S21", 69999);
        phone.displayDetails();

        System.out.println("\n--- Student Report ---");
        Student student = new Student("Bob", 23, 82);
        student.displayDetails();

        System.out.println("\n--- Bank Account Operations ---");
        BankAccount account = new BankAccount("Charlie", "123456789", 10000);
        account.displayBalance();
        account.deposit(5000);
        account.withdraw(3000);
        account.displayBalance();

        System.out.println("\n--- Palindrome Check ---");
        PalindromeCHecker checker = new PalindromeCHecker("Madam");
        checker.displayResult();

        System.out.println("\n--- Movie Ticket Booking ---");
        MovieTIcket ticket = new MovieTIcket("Avengers", "A10", 250);
        ticket.displayTicketDetails();

        System.out.println("\n--- Shopping Cart ---");
        CartItem cartItem = new CartItem("Book", 500, 3);
        cartItem.displayItem();
        cartItem.addQuantity(2);
        cartItem.displayItem();
        cartItem.removeQuantity(4);
        cartItem.displayItem();
        
    }

}
