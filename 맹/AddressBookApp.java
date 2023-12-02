import java.util.Scanner;

public class AddressBookApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook ab= new AddressBook();
        boolean run = true;

        while (run) {
            System.out.println("\n===== 주소록 관리 프로그램 =====");
            System.out.println("1. 사용자 추가");
            System.out.println("2. 사용자 삭제");
            System.out.println("3. 모든 사용자 조회");
            System.out.println("4. 특정 사용자 조회");
            System.out.println("5. 종료");
            System.out.print("선택 : ");

            int choice = sc.nextInt();


            switch (choice) {
                case 1:

                    System.out.println("이름 입력 : ");
                    sc.nextLine();
                    String name = sc.nextLine();

                    System.out.println("번호 입력 : ");
                    String phoneNumber = sc.nextLine();


                    System.out.println("이메일 입력 : ");
                    String email = sc.nextLine();


                    User newUser = new User(name, phoneNumber, email);
                    ab.add(newUser);
                    break;
                case 2:
                    System.out.print("삭제할 사용자 이름 입력: ");
                    String d = sc.nextLine();
                    ab.remove(d);
                    break;
                case 3:
                    ab.showUserAll();
                    break;
                case 4:
                    System.out.print("조회할 사용자 이름 입력: ");
                    String search = sc.next();
                    ab.showUser(search);
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    run = false;
                default:
                    System.out.println("잘못입력하셨습니다.");
            }
        }
    }

    }





