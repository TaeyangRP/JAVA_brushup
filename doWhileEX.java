public class doWhileEX {

    public static void main(String[] args) {
        int x = 10;

        do{
            System.out.print("x의 값 : " + x); //do 괄호 안의
            x++; // 코드 블럭을
            System.out.print("\n"); // 반복. 처음 지정한 10부터 시작해 20 미만의 정수를 출력함 (2)
        
        } while (x < 20); //while이 20보다 작을 동안 (1)
    }
    
}
