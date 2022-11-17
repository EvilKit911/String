public class Stroki {
    public static void main(String[] args) {

            // задание 1
    String firstName = "Ivan";//для хранения имени
    String middleName = "Ivanovich";//для хранения отчества
    String lastName = "Ivanov"; //для хранения фамилии;

    String fullName = lastName +" "+ firstName +" "+ middleName;

        System.out.println("ФИО сотрудника " + fullName);

        System.out.println("");

            //задание 2
        String fullNameUp = fullName.toUpperCase(); // метод меняющий все символы в верхний регистр
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUp);
    }
}
