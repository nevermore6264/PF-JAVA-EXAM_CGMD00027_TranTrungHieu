import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GameRatAndCat {

    public static void main(String[] args) {

        //Create a cat
        Cat cat = new Cat("Tom", 10);

        //Create a mouse
        Rat rat = new Rat("Jerry", 13, 10);

        //Check catching and eating
        if (cat.catchRat(rat)) {
            cat.eat(rat);
        } else {
            System.out.println("Rat runs fast, Cat does not catch :(");
        }

        System.out.println("-------------------------------------------");

        //Create 2 list
        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat("Doremon", 20));
        catList.add(new Cat("Tommy", 15));
        catList.add(new Cat("Baby", 3));
        List<Rat> ratList = new ArrayList<>();
        ratList.add(new Rat("Doremon", 20, 10));
        ratList.add(new Rat("Teeme", 15, 12));
        ratList.add(new Rat("Monster", 3, 8));
        ratList.add(new Rat("Ore", 20, 10));

        //find rat list
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name's rat:");
        String name = scanner.nextLine();

        String resultRatFind = "";
        for (int i = 0; i < ratList.size(); i++) {
            if (name.equalsIgnoreCase(ratList.get(i).getName())) {
                resultRatFind += ratList.get(i).toString() + "\n";
            }
        }
        System.out.println(resultRatFind);

        //shows rat list
        System.out.println("-------------------------------------------");
        Collections.sort(ratList, new RatImps());
        for (Rat element : ratList) {
            System.out.println(element);
        }

        //shows cat list
        System.out.println("-------------------------------------------");
        Collections.sort(catList, new CatImps());
        for (Cat element : catList) {
            System.out.println(element);
        }

        //Cat eats all rats
        System.out.println("-------------------------------------------");
        String catResult = "";
        for (int i = 0; i < ratList.size(); i++) {
            cat.eat(ratList.get(i));
            catResult += cat.toString() + "\n";
        }

        //read and write file
        try {
            //Tạo đối tượng luồng và liên kết nguồn dữ liệu
            FileOutputStream fos = new FileOutputStream("result_catch_rat.txt");
            DataOutputStream dos = new DataOutputStream(fos);

            //Ghi dữ liệu
            dos.writeUTF(catResult);

            //Đóng luồng
            fos.close();
            dos.close();
            System.out.println("Done!");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try {
            //Tạo đối tượng luồng và liên kết nguồn dữ liệu
            FileInputStream fis = new FileInputStream("result_catch_rat.txt");
            DataInputStream dis = new DataInputStream(fis);

            //Đọc dữ liệu
            String resultFileWriter = dis.readUTF();

            //Đóng luồng
            fis.close();
            dis.close();

            //Hiển thị nội dung đọc từ file
            System.out.println(resultFileWriter);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

