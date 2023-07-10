package org.example.HW_O_1;
import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            List<Category> categoryPr = fullCategory();
            List<Product> allPr = fullArray();
            List<Product> buyPr = new ArrayList<>();
            Basket basket = new Basket();
            menu(scanner, allPr, buyPr,basket);
            User user1 = new User(basket.getBuyPr(),"123412","1234@gmail.com");
            User user2 = new User(basket.getBuyPr(),"423523","2345@gmail.com");

        }

        private static List<Category> fullCategory() {
            List<Category> categoryPr = new ArrayList<>();
            String[] cPr1 = {"Деревянный шар", "Дерево"};
            String[] cPr2 = {"Металический шар", "Металл"};
            Category category1 = new Category("Дерево", cPr1);
            Category category2 = new Category("Металл", cPr2);
            categoryPr.add(category1);
            categoryPr.add(category2);
            return categoryPr;
        }

        private static void menu(Scanner scanner, List<Product> allPr, List<Product> buyPr,Basket basket) {
            String text = "Что хотите сделать: \n" +
                    "1 Вывести список всех продуктов \n" +
                    "2 Вывести список покупок \n" +
                    "3 Выбрать  продукты\n" +
                    "4 Закончить покупки\n";
            System.out.print(text);
            int a = scanner.nextInt();
            while (a != 4) {
                if (a == 1) {
                    showPr(allPr);
                    System.out.print(text);
                    a = scanner.nextInt();
                }
                if (a == 2) {
                    showTake(buyPr);
                    System.out.print(text);
                    a = scanner.nextInt();
                }
                if (a == 3) {
                    buyPr = take(allPr, scanner,basket);
                    System.out.print(text);
                    a = scanner.nextInt();
                }
            }
        }

        private static List<Product> take(List<Product> allPr, Scanner scanner,Basket basket) {
            List<Product> buyPr = new ArrayList<>();
            String[] strBasket = new String[allPr.size()];
            for (int i = 0; i < allPr.size(); i++) {
                System.out.print("Товар " + (i + 1) + " Наименование " +
                        allPr.get(i).getNamePr() +
                        " цена " + allPr.get(i).getPricePr() +
                        " рейтинг " + allPr.get(i).getRatingPr() + "\n");
                System.out.println();
                System.out.print("Нажмите 1 если хотите добваить в свой список покупок");
                System.out.println();
                if (scanner.nextInt() == 1) {
                    buyPr.add(allPr.get(i));
                    strBasket[i] = allPr.get(i).getNamePr();
                    allPr.remove(i);
                    i = i - 1;
                }
            }
            basket.setBuyPr(strBasket);
            return buyPr;
        }

        public static void showPr(List<Product> allPr){
            for (int i = 0; i < allPr.size(); i++) {
                System.out.println();
                System.out.print("Товар " + (i + 1) + " Наименование " +
                        allPr.get(i).getNamePr() +
                        " цена " + allPr.get(i).getPricePr() +
                        " рейтинг " + allPr.get(i).getRatingPr() + "\n");
                System.out.println();
            }
        }

        private static List<Product> fullArray() {
            List<Product> allPr = new ArrayList<>();
            Product pr1 = new Product("Шарик", 54.99, 7.0);
            Product pr2 = new Product("Носок один", 254.89, 3.0);
            Product pr3 = new Product("Носок два", 1567.99, 10.0);
            allPr.add(pr1);
            allPr.add(pr2);
            allPr.add(pr3);
            return allPr;
        }

        public static void showTake(List<Product> buyPr) {
            for (int i = 0; i < buyPr.size(); i++) {
                System.out.print("Товар " + (i + 1) + " Наименование " +
                        buyPr.get(i).getNamePr() +
                        " цена " + buyPr.get(i).getPricePr() +
                        " рейтинг " + buyPr.get(i).getRatingPr() + "\n");

            }
        }
    }

