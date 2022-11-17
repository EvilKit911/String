public class Stroki {
    public static void main(String[] args) {

            // задание 1
    String firstName = "Семён";//для хранения имени
    String middleName = "Семёнович";//для хранения отчества
    String lastName = "Иванов"; //для хранения фамилии;

    String fullName = lastName +" "+ firstName +" "+ middleName;

        System.out.println("ФИО сотрудника " + fullName);

        System.out.println("");

            //задание 2
        String fullNameUp = fullName.toUpperCase(); // метод меняющий все символы в верхний регистр
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUp);

        System.out.println("");

        //задание 3

        fullName = fullName.replace("ё", "е");// метод replace(найти"условный знак или пробел",и заменить на "то что нам нужно")
        System.out.println("Данные ФИО сотрудника " + fullName);


    }
}
