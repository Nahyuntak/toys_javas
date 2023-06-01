package poll;
public class PollStatistics {
    public void printAnswers(int[] answers) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < answers.length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(String.format("%d. (%d)", i + 1, answers[i]));
        }

        System.out.println(sb.toString());
    }
}