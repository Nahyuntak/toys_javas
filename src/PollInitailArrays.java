public class PollInitailArrays {
    public String[] initialArrays() {
        String[] questions = {
            "1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?",
            "2. 강의의 내용은 체계적이고 성의있게 구성되었는가?",
            "3. 교수는 강의 내용에 대해 전문적 지식이 있었는가?",
            "4. 강의 진행 속도는 적절하였는가?"};
        return questions;
    }

    public static void main(String[] args) {
        PollInitailArrays poll = new PollInitailArrays();
        String[] questions = poll.initialArrays();

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println("(1) 전혀 아니다. (2) 아니다. (3) 그렇다. (4) 매우 그렇다.");
            System.out.println();
        }
      
    }
}