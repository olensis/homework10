public class Main {
    public static void main(String[] args) {

        // Задание 1
    String firstName ="Ivan";
    String middleName = "Ivanovich";
    String lastName = "Ivanov";
    String fullName = firstName + " "+  middleName + " " + lastName;
        System.out.println("Фио Сотрудника " + fullName);

        // Задание 2

        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета —" + fullNameUpper);

        // Задание 3
        String fullName1 = "Иванов Семён Семёнович";
        fullName1 = fullName1.replace("ё", "е");
        System.out.println(" Данные ФИО сотрудника — " + fullName1 );
}


}