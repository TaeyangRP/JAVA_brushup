public class InstanceVariableEX {
    int c; // c가 인스턴스 변수다.

    public void addition() {
        int a = 10;
        int b = 20;
        c = a + b; // 위에서 정의한 것을
        System.out.println(a + "와 " + b + "의 합은 " + c + "이다.");
    }
    
    public void difference() {
        int x = 150;
        int y = 100;
        c = x - y; // 아래 메소드에서도 쓸 수 있다
        System.out.println(x + "와 " + y + "의 차는 " + c + "이다.");
    }

    public static void main(String[] args) {
        InstanceVariableEX ins = new InstanceVariableEX();
        ins.addition();
        ins.difference();
    }
}
