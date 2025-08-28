class OnlineQuizTimer {
    private int[] timeSlots;
    private int currentIndex;

    public OnlineQuizTimer(int numQuestions, int timePerQuestion) {
        timeSlots = new int[numQuestions];
        for (int i = 0; i < numQuestions; i++) {
            timeSlots[i] = timePerQuestion;
        }
        currentIndex = 0;
    }

    public void nextQuestion() {
        if (currentIndex < timeSlots.length) {
            System.out.println("Question " + (currentIndex + 1) + " time: " + timeSlots[currentIndex] + " seconds.");
            if (timeSlots[currentIndex] <= 5) {
                System.out.println("Warning: Time is about to run out!");
            }
            currentIndex = (currentIndex + 1) % timeSlots.length;
        }
    }

    public static void main(String[] args) {
        OnlineQuizTimer timer = new OnlineQuizTimer(5, 10);
        for (int i = 0; i < 7; i++) {
            timer.nextQuestion();
        }
    }
}