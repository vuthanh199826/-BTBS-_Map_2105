import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manage manage = new Manage();
        int choice;
        while (true) {
            displayMenu();
            System.out.println("Nhap lua chon vao day ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Nhap ma sinh vien vao day");
                    String MSV = sc.nextLine();
                    if (manage.checkKey(MSV)) {
                        System.out.println("MSV nay da ton tai, thu lai");
                    } else {
                        System.out.println("Nhap ten sinh vien vao day");
                        String name = sc.nextLine();
                        System.out.println("Nhap tuoi");
                        int age = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Nhap dia chi");
                        String address = sc.nextLine();
                        System.out.println("Chon gioi tinh (Nam: True, Nu: False");
                        boolean gender = sc.nextBoolean();
                        sc.nextLine();
                        Student student = new Student(MSV, name, age, address, gender);
                        manage.add(MSV, student);
                    }
                    break;
                case 2:
                    System.out.println("Nhap MSV muon sua vao day");
                    MSV = sc.nextLine();
                    if(manage.checkKey(MSV)){
                        System.out.println("Nhap ten moi ");
                        String name = sc.nextLine();
                        System.out.println("Nhap tuoi ");
                        int age = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Nhap dia chi moi");
                        String address = sc.nextLine();
                        System.out.println("Xac nhan gioi tinh (Nam: true, Nu: False");
                        boolean gender = sc.nextBoolean();
                        sc.nextLine();
                        Student student = new Student(MSV,name,age,address,gender);
                        manage.edit(MSV,student);
                    }else {
                        System.out.println("Invalid");
                    }
                    break;
                case 3:
                    System.out.println("Nhap Ma sinh vien muon xoa vao day");
                    MSV = sc.nextLine();
                    manage.delete(MSV);
                    break;
                case 4:
                    System.out.println("Nhap Ma sinh vien muon tim vao day ");
                    MSV = sc.nextLine();
                    manage.search(MSV);
                    break;
                case 5:
                    System.out.println("Danh sach sinh vien ");
                    manage.display();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Nhap lai");
            }
        }
    }
    public static void displayMenu(){
        System.out.println("===============MENU===============");
        System.out.println("1. Add");
        System.out.println("2. Edit");
        System.out.println("3. Delete");
        System.out.println("4. Search");
        System.out.println("5. Display");
        System.out.println("0. Exit");
        System.out.println("----------------------------------");
    }
}

