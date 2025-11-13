import java.util.Arrays;

public class Theatre {
    public static void main(String[] args) {
        System.out.println("### Создание актеров и режиссеров ###\n");

        // три актера
        Actor actor1 = new Actor("Влад", "Трудолюб", "М", 170);
        Actor actor2 = new Actor("Нина", "Мозякина", "Ж", 160);
        Actor actor3 = new Actor("Михаил", "Пингвинов","М", 180);

        System.out.println("Созданы актеры:");
        System.out.println("- " + actor1);
        System.out.println("- " + actor2);
        System.out.println("- " + actor3);

        // два режиссера
        Director director1 = new Director("Федор", "Бондарчук", "М",
                5);
        Director director2 = new Director("Ольга", "Кожебякина", "Ж",
                3);
        System.out.println("\nСозданы режиссеры:");
        System.out.println("- " + director1);
        System.out.println("- " + director2);

        // авторы музыки и хореограф
        String musicAuthor = "Фридерик Шопен";
        String choreographer = "Марта Грэм";

        System.out.println("\nАвтор музыки: " + musicAuthor);
        System.out.println("Хореограф: " + choreographer);

        System.out.println("\n### Создание Спектаклей ###\n");

        Show regularShow = new Show("Ганди молчал по субботам", 120, director1,
                Arrays.asList(actor1));
        Opera opera = new Opera("Волшебная флейта", 140, director2,
                musicAuthor, "Либретто оперы 'Волшебная флейта' по Моцарту", 10);
        Ballet ballet = new Ballet("Лебединое озеро", 150, director2, musicAuthor,
                "Либретто балета 'Лебединое озеро' о заколдованной принцессе", choreographer);
        System.out.println("Созданы спектакли:");
        System.out.println("- Обычный: " + regularShow.getTitle());
        System.out.println("- Опера: " + opera.getTitle());
        System.out.println("- Балет: " + ballet.getTitle());

        System.out.println("\n### Распределение актеров по спектаклям ###\n");
        //обычный
        regularShow.addActor(actor1);
        regularShow.addActor(actor2);

        //опера
        regularShow.addActor(actor3);
        regularShow.addActor(actor2);

        //балет
        regularShow.addActor(actor2);
        regularShow.addActor(actor1);

        System.out.println("\nПопытка добавить дублирующего актера:");
        ballet.addActor(actor3);

        System.out.println("\n### Списки актеров по спектаклям ###\n");

        System.out.println("Обычный спектакль '" + regularShow.getTitle() + "':'");
        regularShow.printAllActors();

        System.out.println("Опера '" + opera.getTitle() + "':'");
        opera.printAllActors();

        System.out.println("Балет '" + ballet.getTitle() + "':'");
        ballet.printAllActors();

        System.out.println("### Замена актера в спектакле ###\n");

        System.out.println("Замена актера в опере (Трудолюб на Пингвинов):");
        System.out.println("До замены:");
        opera.printAllActors();

        opera.replaceActor("Трудолюб", actor3);

        System.out.println("После замены:");
        opera.printAllActors();
        System.out.println("### Попытка заменить несуществующего актера ###\n");


        System.out.println("Попытка заменить несуществующего актера в балете:");
        ballet.replaceActor("Несуществующий", actor1);

        System.out.println("\n### Вывод текстов либретто ###\n");


        System.out.println("Либретто оперы:");
        opera.printLibretto();

        System.out.println("Либретто балета:");
        ballet.printLibretto();

        System.out.println("### Информация о режиссерах ###\n");


        regularShow.printDirectorInfo();
        opera.printDirectorInfo();
        ballet.printDirectorInfo();

        System.out.println("### Полная информация о спектаклях ###\n");


        System.out.println("Обычный спектакль:");
        System.out.println(regularShow);

        System.out.println("\nОпера:");
        System.out.println(opera);

        System.out.println("\nБалет:");
        System.out.println(ballet);
    }
}

