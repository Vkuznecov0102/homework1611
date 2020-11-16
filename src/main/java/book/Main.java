package book;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> listOfBooks = new ArrayList<>();
        System.out.println("listOfBooks.isEmpty() = " + listOfBooks.isEmpty());
        Book kovy = new Book("7 навыков высокоэффективных людей", "Кови", 387);
        Book bloh = new Book("Java. Эффективное программирование", "Блох", 219);
        Book abnett = new Book("Сожжение Просперо", "Абнетт", 437);
        Book gagloev = new Book("Зерцалия", "Гаглоев", 222);
        Book flober = new Book("Мадам Бовари", "Флобер", 444);
        Book krus = new Book("Тим Талер, или Проданный смех", "Крюс", 435);
        Book gugo = new Book("Последний день приговорённого к смерти", "Гюго", 494);
        Book kuprin = new Book("Юнкера", "Куприн", 234);
        Book lukyanenko = new Book("Проводник отсюда", "Лукьяненко", 293);
        Book kook = new Book("Сладкозвучный серебряный блюз", "Кук", 331);
        Book nabokov = new Book("Облако, озеро, башня", "Набоков", 404);
        Book king = new Book("Чувство, которое словами можно выразить только по-французски", "Кинг", 289);
        Book rouling = new Book("Фантастические твари и где они обитают", "Роулинг", 415);
        Book dashkova = new Book("Источник счастья", "Дашкова", 392);
        Book tven = new Book("Банковский билет в 1000000 фунтов стерлингов", "Твен", 400);
        Book volskih = new Book("Мила Рудик и кристалл Фобоса", "Вольских", 347);
        Book gluhovskiy = new Book("Метро 2033", "Глуховский", 247);
        Book goodkind = new Book("Третье царство", "Гудкайнд", 487);
        Book adamov = new Book("Тайна двух океанов", "Адамов", 404);
        Book bussi = new Book("Пока ты не спишь", "Бюсси", 473);

        listOfBooks.add(kovy);
        listOfBooks.add(bloh);
        listOfBooks.add(abnett);
        listOfBooks.add(gagloev);
        listOfBooks.add(flober);
        listOfBooks.add(krus);
        listOfBooks.add(gugo);
        listOfBooks.add(kuprin);
        listOfBooks.add(lukyanenko);
        listOfBooks.add(kook);
        listOfBooks.add(nabokov);
        listOfBooks.add(king);
        listOfBooks.add(rouling);
        listOfBooks.add(dashkova);
        listOfBooks.add(tven);
        listOfBooks.add(volskih);
        listOfBooks.add(gluhovskiy);
        listOfBooks.add(goodkind);
        listOfBooks.add(adamov);
        listOfBooks.add(bussi);

        System.out.println("Сколько элементов в списке? " + listOfBooks.size());

        System.out.println("listOfBooks.get(0) = " + listOfBooks.get(0));
        System.out.println("listOfBooks.get(19) = " + listOfBooks.get(19));

        listOfBooks.add(new Book("Коробка в форме сердца", "Хилл", 380));
        listOfBooks.add(new Book("Двухсотлетний человек", "Азимов", 314));
        listOfBooks.add(new Book("Нерв", "Райан", 361));
        listOfBooks.add(new Book("Глория Скотт", "Конан Дойл", 415));
        listOfBooks.add(new Book("Золотая чаша", "Стейнбек", 381));

        listOfBooks.add(3, krus);
        listOfBooks.add(1, gugo);

        List<Book> anotherList = new ArrayList<>();
        anotherList.addAll(listOfBooks);

        anotherList.remove(flober);
        anotherList.remove(19);

        System.out.println("anotherList.contains(flober) = " + anotherList.contains(flober));
        System.out.println("anotherList.contains(abnett) = " + anotherList.contains(abnett));

        System.out.println(anotherList);
    }
}
