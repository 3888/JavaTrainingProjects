package todo.TrainingProjects.bookCleanCode2010RobertMartin.chapter2;

public class GuestStatistics {
    public static void main(String[] args) {
        printGuessStatistics("Ben", 2);

        Guest guest = new Guest("Ben", 2);
        System.out.println(guest.getGuestMessage());

        GuessStatisticsMessage message = new GuessStatisticsMessage();
        System.out.println(message.make("Ben", 2));
    }

    private static void printGuessStatistics(String candidate, int count) {
        String number;
        String verb;
        String pluralModifier;
        if (count == 0) {
            number = "no";
            verb = "are";
            pluralModifier = "s";
        } else if (count == 1) {
            number = "1";
            verb = "is";
            pluralModifier = "";

        } else {
            number = Integer.toString(count);
            verb = "are";
            pluralModifier = "s";
        }

        String guessMessage = String.format("There %s %s %s%s", verb, number, candidate, pluralModifier);

        System.out.println(guessMessage);
    }

    static class Guest {
        String candidate;
        int count;
        String number;
        String verb;
        String pluralModifier;

        Guest(String candidate, int count) {
            this.candidate = candidate;
            this.count = count;
        }

        String getGuestMessage() {
            if (count == 0) {
                number = "no";
                verb = "are";
                pluralModifier = "s";
            } else if (count == 1) {
                number = "1";
                verb = "is";
                pluralModifier = "";
            } else {
                number = Integer.toString(count);
                verb = "are";
                pluralModifier = "s";
            }
            return String.format("There %s %s %s%s", verb, number, candidate, pluralModifier);
        }
    }

    static class GuessStatisticsMessage {
        private String number;
        private String verb;
        private String pluralModifier;

        String make(String candidate, int count) {
            createPluralDependentMessageParts(count);
            return String.format(
                    "There %s %s %s%s",
                    verb, number, candidate, pluralModifier);
        }

        private void createPluralDependentMessageParts(int count) {
            if (count == 0) {
                thereAreNoLetters();
            } else if (count == 1) {
                thereIsOneLetter();
            } else {
                thereAreManyLetters(count);
            }
        }

        private void thereAreManyLetters(int count) {
            number = Integer.toString(count);
            verb = "are";
            pluralModifier = "s";
        }

        private void thereIsOneLetter() {
            number = "1";
            verb = "is";
            pluralModifier = "";
        }

        private void thereAreNoLetters() {
            number = "no";
            verb = "are";
            pluralModifier = "s";
        }
    }

}