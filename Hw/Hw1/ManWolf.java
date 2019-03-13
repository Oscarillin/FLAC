/**
 * file:P ManWolf.java
 * author: Oscar Reyes
 * course: CMPT 440
 * Assignment: Homework 1
 * due date: Wednesday March 12...
 * version 1.0
 *
 * A DFA that will show possible solutions to the "Man, Wolf, and Goat" problem.
 */
public class ManWolf {
    /**
     * variables to hold int value for states and alphabet
     * state variable to change states
     */
    public static final int w = 0;
      public static final int g = 1;
      public static final int c = 2;
      public static final int n = 3;
      private static final int q0 = 0;
      private static final int q1 = 1;
      private static final int q2 = 2;
      private static final int q3 = 3;
      private static final int q4 = 4;
      private static final int q5 = 5;
      private static final int q6 = 6;
      private static final int q7 = 7;
      private static final int q8 = 8;
      private static final int q9 = 9;
      private static final int q10 = 10;

      private static int state;

    /**
     *
     * @param in input that will be recieved
     * @return returns whether or not the input is a valid solution
     *
     * checks character recieved and changes the state based on the delta transition function
     */
      public static String process(String in) {
          for (int i = 0; i < in.length(); i++) {
              char c = in.charAt(i);
              try {
                  System.out.println(state);
                  state = delta[state][getInt(c)];
              } catch(ArrayIndexOutOfBoundsException ex) {
                  state = q10;
              }
          }
          if (state == q9){
              return "This is a solution";
          } else {
              return "This is not a solution;";
          }
      }

    /**
     *
     * @param c character that is currently being read in the string inputted
     * @return returns int value of that character or -1 if invalid character used
     */
      private static int getInt (char c){
          switch (c) {
              case 'w':
                  return 0;
              case 'g':
                  return 1;
              case 'c':
                  return 2;
              case 'n':
                  return 3;
              default:
                  return -1;
          }
      }

    /**
     * Delta transition table
      */
    private static int[][] delta =
              {{q10, q1, q10, q10}, {q10,q0,q10,q2}, {q3,q10,q5,q1}, {q2,q4,q10,q10}, {q10,q3,q7,q10},
                      {q10,q6,q2,q10}, {q7,q5,q10,q10}, {q6,q10,q4,q8}, {q10,q9,q10,q7}, {q10,q8,q10,q10},
                      {q10,q10,q10,q10}};

}
