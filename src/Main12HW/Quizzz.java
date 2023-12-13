package Main12HW;

import java.util.Scanner;

public class Quizzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, welcome to the quiz game! I have some questions for you. if you ready, let's get started! ");
        System.out.println("Before starting, I want to mention this: We have 3 different types of questions...");
        System.out.println("We have 3 questions for each mode(easy, medium, hard).");
//        System.out.println("If you leave game with 5 points, you'll be WINNER!");
        System.out.println("Before your answer, let me remind you this: If you don't know the answer of question, then just wright 'skip'.");
        System.out.println("Or if you know, just write your answer. Now time to play!...");


        while (true) {
            System.out.println();
            System.out.print("Please select one of them: 'easy, medium, hard' - ");
            String userMode = scanner.next();

            userMode.toLowerCase();

            if (userMode.equals("easy")) {
                System.out.println();
                System.out.println("Good choice! Let's get started");
                System.out.println("Who wrote 'Hamlet'? ");
                String hamlet1 = scanner.nextLine();
                String hamlet = scanner.nextLine();
//                hamlet.toLowerCase();
                if (hamlet.equalsIgnoreCase("william shakespeare")) {
                    System.out.println("Correct! 'Hamlet' was written by William Shakespeare.");
                    System.out.println("\n" + "The next question is who composed 'The Four Seasons'?");
                    String randomly = scanner.nextLine();
                    String heSays = scanner.nextLine();
                    if (heSays.equals("antonio vivaldi")) {
                        System.out.println("Correct! 'The Four Seasons' was composed by 'Antonio Vivaldi'.");

                    } else {
                        System.out.println("No, 'The Four Seasons' wasn't composed by '" + heSays + "'. It was composed by 'Antonio Vivaldi'.");
                    }

                }
                if (hamlet.equalsIgnoreCase("skip")) {
                    System.out.println("Alright, before I ask the next question, do you want to learn previous one's answer? (yes/no)");
                    String yesNo = scanner.next();
                    if (yesNo.equals("yes")) {
                        System.out.println("The previous question's answer was 'William Shakespeare'.");
                        System.out.println("And now let me ask the next question:");
                        System.out.print("Who composed 'The Four Seasons'? - ");
                        String fourSeasons = scanner.nextLine();
                        String s = scanner.nextLine();
                        fourSeasons.toLowerCase();
                        if (s.equalsIgnoreCase("antonio vivaldi")) {
                            System.out.println("Correct! 'The Four Seasons' was composed by 'Antonio Vivaldi'.");
                        } else {
                            System.out.println("No, 'The Four Seasons' wasn't composed by '" + s + "'. It was composed by 'Antonio Vivaldi'.");
                        }


                    } else if (yesNo.equals("no")) {
                        System.out.println("Alright, then let me ask the next question!");
                        System.out.println("Who composed 'The Four Seasons'? ");
                        String fourSeasons2 = scanner.nextLine();
                        String fourseasons3 = scanner.nextLine();
                        if (fourseasons3.equals("antonio vivaldi")) {
                            System.out.println("Correct! 'The Four Seasons' was composed by 'Antonio Vivaldi'.");
                            System.out.println("And now let me ask you the last easy mode's question:");
                            System.out.println("Who was deaf, but one of the best composer ever?");
                            String whoKnowsss = scanner.nextLine();
                            String iKnowThat = scanner.nextLine();
                            if (iKnowThat.equals("beethoven")) {
                                System.out.println("Great! it's the correct answer. 'Ludwig van Beethoven' was deaf, but he was quite enough great.");
                            } else {
                                System.out.println("No, '" + iKnowThat + "' wasn't correct answer. The answer was 'Ludwig van Beethoven'.");
                            }
                        } else {
                            System.out.println("No, 'The Four Seasons' wasn't composed by '" + fourseasons3 + "'. It was composed by 'Antonio Vivaldi'.");
                            System.out.println("And now let me ask you the last easy mode's question:");
                            System.out.println("Who was deaf, but one of the best composer ever?");
//                            String whoKnowsthis = scanner.nextLine();
                            String iKnowThis = scanner.nextLine();
                            if (iKnowThis.equals("beethoven")) {
                                System.out.println("Great! it's the correct answer. 'Ludwig van Beethoven' was deaf, but he was quite enough great composer.");
                            } else {
                                System.out.println("No, '" + iKnowThis + "' wasn't correct answer. The answer was 'Ludwig van Beethoven'.");
                            }
                        }
                    }
                } else {
                    System.out.println("No, 'Hamlet' wasn't written by '" + hamlet + "'. It was written by 'William Shakespeare'.");
                    System.out.println("The next question is who composed 'The Four Seasons'?");
//                    String wrongNext = scanner.nextLine();
                    String wrongNext1 = scanner.nextLine();
                    if (wrongNext1.equals("antonio vivaldi")) {
                        System.out.println("Correct! 'The Four Seasons' was composed by 'Antonio Vivaldi'.");
                        System.out.println();
                        System.out.println("And now let me ask you the last easy mode's question:");
                        System.out.println("Who was deaf, but one of the best composer ever?");
                        String deafOne = scanner.nextLine();
                        String deafTwo = scanner.nextLine();
                        if (deafTwo.equals("beethoven")) {
                            System.out.println("Great! it's the correct answer. 'Ludwig van Beethoven' was deaf, but he was quite enough great composer.");
                        } else {
                            System.out.println("No, '" + deafTwo + "' wasn't correct answer. The answer was 'Ludwig van Beethoven'.");
//                            System.out.println("You finished the 'easy mode'. Do you want to continue? (yes/no)");
//                            String continueGame = scanner.nextLine();
//                            String continueGame2 = scanner.nextLine();
//                            if (continueGame2.equals("yes")) {
//
//                            } else if (continueGame2.equals("no")){
//                                break;
//                            } else {
//                                System.out.println("Please choose only yes or no.");
//                            }
                        }
                    } else {
                        System.out.println("No, 'The Four Seasons' wasn't composed by '" + wrongNext1 + "'. It was composed by 'Antonio Vivaldi'.");
                        System.out.println("And now let me ask you the last easy mode's question:");
                        System.out.println("Who was deaf, but one of the best composer ever?");
                        String whoKnows = scanner.nextLine();
                        String iKnow = scanner.nextLine();
                        if (iKnow.equals("beethoven")) {
                            System.out.println("Great! it's the correct answer. 'Ludwig van Beethoven' was deaf, but he was quite enough great composer.");
                        } else {
                            System.out.println("No, '" + iKnow + "' wasn't correct answer. The answer was 'Ludwig van Beethoven'.");
                        }
                    }
                }
            }
        }
    }
}
