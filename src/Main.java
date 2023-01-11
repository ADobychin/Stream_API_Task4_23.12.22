import java.util.*;

public class Main {
    public static void main(String[] args) {



/*
ДОМАШНЕЕ ЗАДАНИЕ
Создайте, класс Телевизор. Он должен хранить информацию о названии модели, год выпуска, цена, диагональ, производитель.
Нужно создать набор телевизоров
и выполнить следующие задачи:
Показать все телевизоры;
1. Показать телевизоры с заданной диагональю;
2. Показать все телевизоры одного производителя;
3. Показать все телевизоры текущего года;
4. Показать все телевизоры дороже заданной цены;
5. Показать все телевизоры, отсортированные по цене
по возрастанию;
6. Показать все телевизоры, отсортированные по цене
по убыванию.
Практические задания
2
 Показать, все телевизоры, отсортированные по диагонали по возрастанию;
 Показать все телевизоры, отсортированные по диагонали по убыванию.
 */




                Scanner scanner = new Scanner(System.in);
                ArrayList<Television> televisions = new ArrayList<>(List.of(
                        new Television("DEXP2021-32",2021,7999,32,"DEXP"),
                        new Television("Panasonic2020-79",2020,6200,79,"Panasonic"),
                        new Television("iFFALCON2022-32",2022,9999,32,"iFFALCON"),
                        new Television("Hisense-43",2022,27999,943,"Hisense"),
                        new Television("Sony2022-90",2022,8400,90,"Sony"),
                        new Television("Candy2022-43",2022,20599,43,"Candy"),
                        new Television("Philips2021-51",2021,5999,51,"Philips"),
                        new Television("Xiaomi2022-43",2022,25999,43,"Xiaomi"),
                        new Television("Sharp2020-34",2020,5700,34,"Sharp"),
                        new Television("Sharp2022-120",2022,9900,120,"Sharp"),
                        new Television("LG2019-34",2019,5900,34,"LG"),
                        new Television("Sharp2023-61",2023,7900,61,"Sharp"),
                        new Television("Philips2022-90",2022,7900,90,"Philips"),
                        new Television("Philips2021-61",2021,6500,61,"Philips"),
                        new Television("TCL 55C835-55",2022,71999,55,"TCL"),
                        new Television("Sony2020-90",2020,6100,76,"Sony"),
                        new Television("Haier2019-50",2019,47999,50,"Haier")
 
                ));

                System.out.println("Все телевизоры: ");
        televisions.forEach(System.out::println);

                System.out.println("\nВведите размер телевизора для поиска: ");
                double diagonalSize = scanner.nextDouble();
        televisions.stream()
                        .filter(tv -> tv.getSize()==diagonalSize)
                        .forEach(System.out::println);

                System.out.println("\nВведите производителя телевизора : ");
                String factory = scanner.next();
        televisions.stream()
                        .filter(tv -> tv.getManufacturs().equals(factory))
                        .forEach(System.out::println);

                System.out.println("\nТелевизоры произведенные в этом году: ");
                Calendar cal = Calendar.getInstance();
        televisions.stream()
                        .filter(tv -> tv.getYear()==(cal.get(Calendar.YEAR)))
                        .forEach(System.out::println);


                System.out.println("\nТелевизоры дороже заданной цены:");
                double priceSearch = scanner.nextDouble();
        televisions.stream()
                        .filter(tv -> tv.getPrice()>=priceSearch)
                        .forEach(System.out::println);


                System.out.println("\nТелевизоры отсортированы по возрастанию: ");
        televisions.stream()
                        .sorted(Comparator.comparingDouble(Television::getPrice))
                        .forEach(System.out::println);


                System.out.println("\nТелевизоры по убыванию: ");
        televisions.stream()
                        .sorted(Comparator.comparingDouble(Television::getPrice).reversed())
                        .forEach(System.out::println);



    }
}