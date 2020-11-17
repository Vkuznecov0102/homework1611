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

        //второй день

        Book javaFirst=new Book("Java. Библиотека профессионала","Хорстманн",404);
        Book javaSecond=new Book("Test Driven: TDD and Acceptance TDD for Java Developers","Lasse Koskela",455);
        Book javaThird=new Book("Изучаем Java","Берт Бейтс",381);
        Book javaFourth=new Book("Алгоритмы на Java","Седжвик",479);

       anotherList.add(3,javaFirst);
       anotherList.add(6,javaSecond);
       anotherList.add(21,javaThird);
       anotherList.add(4,javaFourth);

       System.out.println("Индекс делится на три");
       for(int i=0;i<anotherList.size();i++){
           if(i%3==0){
               System.out.println(anotherList.get(i));
           }
       }
       System.out.println();

       System.out.println("Элементы которые равны Java");
        for(Book elemBook:anotherList){
            if(elemBook.getName().contains("Java")) {
                System.out.print(elemBook+" ");
            }
        }
        System.out.println();

        System.out.println("Пропустить первые три книги в списке");
        for(int i=3;i<anotherList.size();i++){
            System.out.print(anotherList.get(i));
        }
        System.out.println();

        System.out.println("пропустить первые две книги Java");
        int count=0;
        for(int i=0;i<anotherList.size();i++){
            if(anotherList.get(i).getName().contains("Java") && count<2){
                count++;
            }
            else{
                System.out.print(anotherList.get(i));
            }

        }
        System.out.println();

        System.out.println("Возвращаем первую книгу, длина автора которого делится на 3");
        for(Book bookElem:anotherList){
            if(bookElem.getAuthor().length()%3==0){
                System.out.print(bookElem+" ");
                break;
            }
        }
        System.out.println();

        System.out.println("Возвращаем все книги, длина автора которых делится на 3");
        for(Book bookElem:anotherList){
            if(bookElem.getAuthor().length()%3==0){
                System.out.print(bookElem+" ");
            }
        }
        System.out.println();
    }
}