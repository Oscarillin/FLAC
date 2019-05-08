import java.util.Scanner;

public class DatingSim {

    public static void main(String[] args){
        findGirl();
    }

    private static void findGirl(){
        int state = 0;
        System.out.println(getString(0));
        while(state < 11){
            Scanner sc = new Scanner(System.in);
            String scannerText = sc.nextLine();
            state = DatingSimDFA.getNextState(state, scannerText);
            System.out.println(getString(state));

        }

    }

    private static String getString(int State){
        switch (State) {
            case 0:
                return "You enter a new school and see her. She's beautiful. "+
                        "Do you a: give her a compliment, b: just say hi, "+
                        "or c: shy away";
            case 1:
                return "It turns out she's the class president and was told "+
                        "to show you around. Do you a: Politely accept, b: "+
                        "politely decline or c: Yell at her for offering to help";
            case 2:
                return "She grabs your hand and shows you around the school. She "+
                        "asked about your life. Do you a: Tell her and ask" +
                        "about herself, b: Just tell her, or c: Keep your secrets ";
            case 3:
                return "You end up roaming the school by yourself. You think back at "+
                        "the girl you met. Do you a: Find her and apologize, b: Find "+
                        "her and act like nothing happened, or c: Forget her";
            case 4:
                return "She slaps you for yelling and calls you scum. Do you a: Cool off "+
                        "and apologize, b: Immediately apologize, or c:Say up yours and leave.";
            case 5:
                return "a, b, or c?";
            case 6:
                return "a, b, or c?";
            case 7:
                return "a, b, or c?";
            case 8:
                return "a, b, or c?";
            case 9:
                return "a, b, or c?";
            case 10:
                return "Congrats you got best ending!!!!";
            case 11:
                return "You got good ending!";
            case 12:
                return "You're friends at least?";
            case 13:
                return "You single forever loser";
            default:
                return "This wasn't supposed to happen.";


        }
    }
}
