package section2_control_flow_statements;

public class LabeledBreakContinue {
    public static void main(String[] args) {

        outerLoop:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 1) {
                    System.out.println("This is j value: " + j);
                    break outerLoop;
                }
                System.out.println("This is i value: " + i);
            }
        }

    }
}
