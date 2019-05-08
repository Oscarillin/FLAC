public class DatingSimDFA {
    /**
     * variables to hold int value for states and alphabet
     * state variable to change states
     */
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int q1 = 0;
    private static final int q2 = 1;
    private static final int q3 = 2;
    private static final int q4 = 3;
    private static final int q5 = 4;
    private static final int q6 = 5;
    private static final int q7 = 6;
    private static final int q8 = 7;
    private static final int q9 = 8;
    private static final int q10 = 9;
    private static final int q11 = 10;
    private static final int q12 = 11;
    private static final int q13 = 12;
    private static final int q14 = 13;

    public static int getNextState(int current, String in){
        char choice = 'z';
        if(in.length() > 1 || in.length() <1 ){
            return q14;
        } else {
            choice = in.charAt(0);
        }
        int nextState = 0;
        try {
            nextState = delta[current][getInt(choice)];
        } catch(ArrayIndexOutOfBoundsException ex){
            nextState = q14;
        }
        return nextState;
    }

    /**
     *
     * @param c character that is currently being read in the string inputted
     * @return returns int value of that character or -1 if invalid character used
     */
    private static int getInt (char c){
        switch (c) {
            case 'a':
                return 0;
            case 'b':
                return 1;
            case 'c':
                return 2;
            default:
                return -1;
        }
    }

    /**
     * Delta transition table
     */
    private static int[][] delta =
            {{q2, q2, q2}, {q3, q4, q5}, {q6, q7, q5}, {q8, q9, q5}, {q9, q9, q10},
                    {q11, q12, q10}, {q12, q12, q10}, {q12, q13, q10}, {q13, q13, q10},
                    {q13, q13, q14}, {q11, q11, q11}, {q12, q12, q12}, {q13, q13, q13}};


}
