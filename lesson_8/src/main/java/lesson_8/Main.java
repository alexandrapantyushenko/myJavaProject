package lesson_8;

public class Main {
    public static void main(String[] args) {

        Employee[] employeesArray = new Employee[5];

        employeesArray[0] = new Employee("Ivanova Anna", "Engineer", "annaivanova@mailbox.com", "892312312", 30000, 45);
        employeesArray[1] = new Employee("Petrova Maria", "Manager", "mariapetrova@mailbox.com", "892312313", 50000, 35);
        employeesArray[2] = new Employee("Sidorova Elena", "Designer", "elenasidorova@mailbox.com", "892312314", 35000, 55);
        employeesArray[3] = new Employee("Mikhailova Olga", "Developer", "olgamikhailova@mailbox.com", "892312315", 60000, 40);
        employeesArray[4] = new Employee("Alexeeva Natalia", "QA Specialist", "nataliaalexeeva@mailbox.com", "892312316", 45000, 32);

        for (Employee emp : employeesArray) {
            if (emp.getAge() > 40) {
                emp.printInfo();
                System.out.println();
            }
        }
    }
}
