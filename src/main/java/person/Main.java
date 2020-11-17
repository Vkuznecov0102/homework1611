package person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person anna = new Person("Анна", 38, false);
        Person ippolit = new Person("Ипполит", 118, true);
        Person ulian = new Person("Юлиан", 17, true);
        Person lavrentiy = new Person("Лаврентий", 18, true);
        Person marat = new Person("Марат", 49, true);
        Person izabella = new Person("Изабелла", 62, false);
        Person jozefina = new Person("Жозефина", 66, false);
        Person nikolay = new Person("Николай", 26, true);
        Person dina = new Person("Дина", 55, false);
        Person praskovia = new Person("Прасковья", 12, false);
        Person nazariy = new Person("Назарий", 24, true);
        Person uriy = new Person("Юрий", 21, true);
        Person elena = new Person("Елена", 27, false);
        Person olesya = new Person("Олеся", 5, false);
        Person gavriil = new Person("Гавриил", 34, true);

        List<Person> persons = new ArrayList<>(Arrays.asList(anna, ippolit, ulian, lavrentiy, marat, izabella, jozefina, nikolay, dina, praskovia, nazariy, uriy, elena, olesya, gavriil));

        System.out.println("Мужчины призывного возраста");
        for (Person men : persons) {
            if (men.getAge() >= 18 && (men.getAge() < 27) && (men.getName().contains("Н"))) {
                System.out.print(men + " ");
            }
        }
        System.out.println();

        System.out.println("Средний возраст всех женщин");
        List<Person> womenList = new ArrayList<>();

        for (Person p : persons) {
            if (!(p.isMale())) {
                womenList.add(p);
            }
        }
        int sumAge = 0;
        double average = 0;
        for (Person women : womenList) {
            sumAge = sumAge + women.getAge();
            average = sumAge / womenList.size();
        }
        System.out.println(average);
        System.out.println();
    }
}
