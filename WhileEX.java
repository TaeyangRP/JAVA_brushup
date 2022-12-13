public class WhileEX {

    public static void main(String[] args) {
       
        int x = 10;

        while(x < 20) {
            System.out.print("x의 값 : " + x);
            x++; // x가 19가(=20 미만의 정수가) 될 때까지 x의 값과 줄바꿈을 계속 출력
            System.out.print("\n");

        }

    }
}