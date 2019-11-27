package TrainingProjects.android.study;

public class CheckBoxEmulator {
    public static void main(String[] args) {

        int[] checkBoxState = new int[4];

        checkBoxState[0] = 0;
        checkBoxState[1] = 0;
        checkBoxState[2] = 0;
        checkBoxState[3] = 0;

        int skipCount = 0;

        boolean skipVisibility = true;
        boolean inviteVisibility = false;

        for (int anArray : checkBoxState) {
            skipCount += anArray;
        }

        skipVisibility = skipCount == 0;
        inviteVisibility = skipCount != 0;

        System.out.println("skipVisibility " + skipVisibility);
        System.out.println("inviteVisibility " + inviteVisibility);
    }
}
