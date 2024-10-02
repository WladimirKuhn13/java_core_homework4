package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Object[][] info = {
//                {people[0], products[0], 1},
//                {people[1], products[1], -1},
//                {people[0], products[2], 150},
//                {people[1], new Product("Flower", 10), 1},
//                {new Buyer("Fedor", 40, "+3-444-555-66-77"), products[3], 1},
//        };
//        int capacity = 0;
//        int i = 0;
//        while (capacity != orders.length - 1 || i != info.length) {
//            try {
//                orders[capacity] = buy((Buyer) info[i][0], (Product) info[i][1], (int) info[i][2]);
//                capacity++;
//            } catch (ProductException e) {
//                e.printStackTrace();
//            } catch (AmountException e) {
//                orders[capacity++] = buy((Buyer) info[i][0], (Product) info[i][1], 1);
//            } catch (BuyerException e) {
//                throw new RuntimeException(e);
//            } finally {
//                System.out.println("Orders made: " + capacity);
//            }
//            i++;
//        }

        Employee[] employees = {
                new Employee("wladimir", 30, "+79999999999" , Buyer.Gender.MALE),
                new Employee("dmitry", 40, "+79998888888" , Buyer.Gender.MALE),
                new Employee("anna", 19, "+79997777777" , Buyer.Gender.FEMALE),
                new Employee("igor", 53, "+79996666666" , Buyer.Gender.MALE),
                new Employee("elena", 30, "+79995555555" , Buyer.Gender.FEMALE),
        };

        congratulateEmployees(employees);




    }

    public static void congratulateEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Поздравляем " + employees[i].getName() + " " + "c" + " " + Holidays.NEW_YEAR);
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getGender() == Buyer.Gender.FEMALE) {
                System.out.println(("Поздравляем " + employees[i].getName() + " " + "c" + " " + Holidays.EIGHTH_OF_MARCH));
            } else {
                System.out.println(("Поздравляем " + employees[i].getName() + " " + "c" + " " + Holidays.TWENTY_THIRD_OF_FEBRUARY));
            }
        }
    }

    public static enum Holidays {
        NEW_YEAR, EIGHTH_OF_MARCH, TWENTY_THIRD_OF_FEBRUARY
    }

//    private final static Buyer[] people = {
//            new Buyer("Ivan", 20, "+1-222-333-44-55"),
//            new Buyer("Petr", 30, "+2-333-444-55-66")
//    };
//
//    private final static Product[] products = {
//            new Product("Ball", 100),
//            new Product("Sandwich", 1000),
//            new Product("Table", 10000),
//            new Product("Car", 100000),
//            new Product("Rocket", 1000000),
//    };
//
//    private static Order[] orders = new Order[5];
//
//    private static boolean isInArray(Object[] arr, Object o) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].equals(o)) return true;
//        }
//        return false;
//    }
//
//    private static Order buy(Buyer who, Product what, int howMuch) {
//        if (!isInArray(people, who)) {
//            throw new BuyerException("Unknow buyer" + " " + who);
//        }
//        if (!isInArray(products, what)) {
//            throw new ProductException("Unknow product" + " " + what);
//        }
//        if (howMuch < 0 || howMuch > 100) {
//            throw new AmountException("Incorrect amount" + " " + howMuch);
//        }
//        return new Order(who, what, howMuch);
//    }
}