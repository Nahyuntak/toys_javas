import polls_us.PollInitialArrays;
import polls_us.PollScanners;
import polls_us.PollStatics;

// PollsWithMethod_us //
public class PollsWithMethod_us {
    public static void main(String[] args) { // main은 하나여야 한다.
        try {
            String[] answers;
            String[][] polls;
            PollInitialArrays pollInitialArrays = new PollInitialArrays();
            polls = pollInitialArrays.init(); // 설문 내용 초기화
            PollScanners pollScanners= new PollScanners();
            answers = pollScanners.pollWithAnswers(polls);
            PollStatics pollstatics = new PollStatics();
            pollstatics.printAnswer(answers);
        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
    }
}
