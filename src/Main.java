public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " +  middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println("\nЗадача 2");
        System.out.println(fullName.toUpperCase());

        System.out.println("\nЗадача 3");
        String fullNameOne = "Иванов Семён Семёнович";
        String replacedName = fullNameOne.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника - " + replacedName);
    }
}