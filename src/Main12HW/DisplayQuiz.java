package Main12HW;

import java.util.Scanner;

public class DisplayQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, welcome to the quiz game! I have some questions for you. if you ready, let's get started! ");
        System.out.println("Before starting, I want to mention this: We have 3 different types of questions...");
        System.out.println("We have 3 questions for each mode (easy, medium, hard).");
//        System.out.println("We have 3 questions for each mode. Each mode has own score (easy - 1, medium - 2, hard - 3).");
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
                if (hamlet.equals("william shakespeare")) {
                    System.out.println("Correct! 'Hamlet' was written by William Shakespeare.");
                    System.out.println("\n" + "The next question is who composed 'The Four Seasons'?");
                    String heSays = scanner.nextLine();
                    if (heSays.equals("antonio vivaldi")) {
                        System.out.println("Correct! 'The Four Seasons' was composed by 'Antonio Vivaldi'.");
                    } else {
                        System.out.println("No, 'The Four Seasons' wasn't composed by '" + heSays + "'. It was composed by 'Antonio Vivaldi'.");
                    }

                }
                if (hamlet.equals("skip")) {
                    System.out.println("Alright, before I ask the next question, do you want to learn previous one's answer? (yes/no)");
                    String yesNo = scanner.next();
                    if (yesNo.equals("yes")) {
                        System.out.println("The previous question's answer was 'William Shakespeare'.");
                        System.out.println("And now let me ask the next question:");
                        System.out.print("Who composed 'The Four Seasons'? - ");
                        String fourSeasons = scanner.nextLine();
                        String s = scanner.nextLine();
                        fourSeasons.toLowerCase();
                        if (s.equals("antonio vivaldi")) {
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
                            System.out.println();
                            System.out.println("And now let me ask you the last easy mode's question:");
                            System.out.println("Who was deaf, but one of the best composer ever?");
                            String deafOne12 = scanner.nextLine();
                            String deafTwo234 = scanner.nextLine();
                            if (deafTwo234.equals("beethoven")) {
                                System.out.println("Great! it's the correct answer. 'Ludwig van Beethoven' was deaf, but he was quite enough great.");
                                System.out.println("You finished the 'easy mode'. Do you want to continue? (yes/no)");
                                String continueGame56 = scanner.nextLine();
                                String continueGame279 = scanner.nextLine();
                                if (continueGame279.equals("yes")) {
                                    return;
                                } else if (continueGame279.equals("no")) {
                                    break;
                                } else {
                                    System.out.println("Please choose only yes or no.");
                                }
                                if (deafTwo234.equals("skip")) {
                                    System.out.println("Alright, before I ask the next question, do you want to learn previous one's answer? (yes/no)");
                                    String yesNo1 = scanner.next();
                                    if (yesNo1.equals("yes")) {
                                        System.out.println("The previous question's answer was 'Ludwig van Beethoven'.");
                                        System.out.println("You finished the 'easy mode'. Do you want to continue? (yes/no)");
                                        String continueGame349 = scanner.nextLine();
                                        String continueGame2455 = scanner.nextLine();
                                        if (continueGame2455.equals("yes")) {
                                            return;
                                        } else if (continueGame2455.equals("no")) {
                                            break;
                                        } else {
                                            System.out.println("Please choose only yes or no.");
                                        }
                                        if (yesNo1.equals("no")) {
                                            System.out.println("No, '" + deafTwo234 + "' wasn't correct answer. The answer was 'Ludwig van Beethoven'.");
                                            System.out.println("You finished the 'easy mode'. Do you want to continue? (yes/no)");
                                            String continueGame = scanner.nextLine();
                                            String continueGame2891 = scanner.nextLine();
                                            if (continueGame2891.equals("yes")) {
                                                return;
                                            } else if (continueGame2891.equals("no")) {
                                                break;
                                            } else {
                                                System.out.println("Please choose only yes or no.");
                                            }
                                        } else {
                                            System.out.println("No, 'Hamlet' wasn't written by '" + hamlet1 + "'. It was written by 'William Shakespeare'.");
                                        }
//                            System.out.println("You finished the 'easy mode'. Do you want to continue? (yes/no)");
//                            String continueGame34 = scanner.nextLine();
//                            String continueGame2400 = scanner.nextLine();
//                            if (continueGame2400.equals("yes")) {
//                                return;
//                            } else if (continueGame2400.equals("no")){
//                                break;
//                            } else {
//                                System.out.println("Please choose only yes or no.");
//                            }
                                    } else {
                                        System.out.println("No, 'The Four Seasons' wasn't composed by '" + fourseasons3 + "'. It was composed by 'Antonio Vivaldi'.");
                                    }
                                }
                            } else {
                                System.out.println("No, 'Hamlet' wasn't written by '" + hamlet + "'. It was written by 'William Shakespeare'.");
                                System.out.println("The next question is who composed 'The Four Seasons'?");
                                String wrongNext = scanner.nextLine();
                                String wrongNext1 = scanner.nextLine();
                                if (wrongNext1.equals("antonio vivaldi")) {
                                    System.out.println("Correct! 'The Four Seasons' was composed by 'Antonio Vivaldi'.");
                                    System.out.println();
                                    System.out.println("And now let me ask you the last easy mode's question:");
                                    System.out.println("Who was deaf, but one of the best composer ever?");
                                    String deafOne = scanner.nextLine();
                                    String deafTwo = scanner.nextLine();
                                    if (deafTwo.equals("beethoven")) {
                                        System.out.println("Great! it's the correct answer. 'Ludwig van Beethoven' was deaf, but he was quite enough great.");
                                        System.out.println("You finished the 'easy mode'. Do you want to continue? (yes/no)");
                                        String continueGame5624 = scanner.nextLine();
                                        String continueGame27 = scanner.nextLine();
                                        if (continueGame27.equals("yes")) {
                                            return;
                                        } else if (continueGame27.equals("no")) {
                                            break;
                                        } else {
                                            System.out.println("Please choose only yes or no.");
                                        }
                                    } else if (deafTwo.equals("skip")) {
                                        System.out.println("Alright, before I ask the next question, do you want to learn previous one's answer? (yes/no)");
                                        String yesNo1 = scanner.next();
                                        if (yesNo1.equals("yes")) {
                                            System.out.println("The previous question's answer was 'Ludwig van Beethoven'.");
                                            System.out.println("You finished the 'easy mode'. Do you want to continue? (yes/no)");
                                            String continueGame349 = scanner.nextLine();
                                            String continueGame245 = scanner.nextLine();
                                            if (continueGame245.equals("yes")) {
                                                return;
                                            } else if (continueGame245.equals("no")) {
                                                break;
                                            } else {
                                                System.out.println("Please choose only yes or no.");
                                            }
                                        } else {
                                            System.out.println("No, '" + deafTwo + "' wasn't correct answer. The answer was 'Ludwig van Beethoven'.");
                                            System.out.println("You finished the 'easy mode'. Do you want to continue? (yes/no)");
                                            String continueGame = scanner.nextLine();
                                            String continueGame2 = scanner.nextLine();
                                            if (continueGame2.equals("yes")) {
                                                return;
                                            } else if (continueGame2.equals("no")) {
                                                break;
                                            } else {
                                                System.out.println("Please choose only yes or no.");
                                            }
                                        }
                                    } else {
                                        System.out.println("No, 'The Four Seasons' wasn't composed by '" + wrongNext1 + "'. It was composed by 'Antonio Vivaldi'.");
                                        System.out.println("And now let me ask you the last easy mode's question:");
                                        System.out.println("Who was deaf, but one of the best composer ever?");
                                        String whoKnows = scanner.nextLine();
                                        String iKnow = scanner.nextLine();
                                        if (iKnow.equals("beethoven")) {
                                            System.out.println("Great! it's the correct answer. 'Ludwig van Beethoven' was deaf, but he was quite enough great.");
                                        } else {
                                            System.out.println("No, '" + iKnow + "' wasn't correct answer. The answer was 'Ludwig van Beethoven'.");
                                            System.out.println("You finished the 'easy mode'. Do you want to continue? (yes/no)");
                                            String continueGame34 = scanner.nextLine();
                                            String continueGame24 = scanner.nextLine();
                                            if (continueGame24.equals("yes")) {
                                                return;
                                            } else if (continueGame24.equals("no")) {
                                                break;
                                            } else {
                                                System.out.println("Please choose only yes or no.");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
