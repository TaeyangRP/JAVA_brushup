import java.util.Scanner;

public class SwitchEX {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요 : ");
        String grade = sc.nextLine();

        switch(grade) {
            case "A" :
            System.out.println("A 학점입니다.");
            break;
            case "B" :
            System.out.println("B 학점입니다.");
            break;
            case "C" :
            System.out.println("C 학점입니다.");
            break;
            case "D" :
            System.out.println("D 학점입니다.");
            break;
            case "F" :
            System.out.println("F 학점입니다.");
            break;
        }

    }
    
}
