package secondday;

public class ForTest2 {
    public static void main(String[] args) {
        // 60점 이상인 사람에게만 합격문자를 보내준다.
        int[] marks = {90, 25, 67, 45, 80};
        for(int i=0; i<marks.length; i++) {
            if (marks[i] < 60) {
                continue;
            }
            System.out.println((i+1)+"번 학생 축하합니다. 합격입니다.");
        }
    }
}