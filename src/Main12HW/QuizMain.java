package Main12HW;

public class QuizMain {
    public static void main(String[] args) {


        Question q1 = new Question("What is profession of A.Einsten", new String[]{"Chemist", "Physician", "Driver", "Tailor"}, 1);
        Question q2 = new Question("What is profession of A.Einsten", new String[]{"Chemist", "Physician", "Driver", "Tailor"}, 1);
        Question q3 = new Question("What is profession of A.Einsten", new String[]{"Chemist", "Physician", "Driver", "Tailor"}, 1);
        Question q4 = new Question("What is profession of A.Einsten", new String[]{"Chemist", "Physician", "Driver", "Tailor"}, 1);
        Question q5 = new Question("What is profession of A.Einsten", new String[]{"Chemist", "Physician", "Driver", "Tailor"}, 1);

        Question[] questions = new Question[5];
        questions[0] = q1;
        questions[1] = q2;
        questions[2] = q3;
        questions[3] = q4;
        questions[4] = q5;

        for (Question q: questions) {
            System.out.println(q.text + " ?");
            for (String answer : q.answers) {
                System.out.println(answer);
                int indexOfCorrectAnswer = q.indexOfCorrectAnswer;
            }

        }



    }
}
