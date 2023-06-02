package polls_us;

public class PollStatics {
    public int printAnswer(String[] answers) {
        try {
            for (int first = 0; first < answers.length; first = first + 1) {
                System.out.print(answers[first] + ", ");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return 1;
    }
}
