package yahtzee;

import java.util.Random;
import java.util.Scanner;

public class Yahtzee {
	
	public static final int NUM_DICE = 5;
	public static final int NUM_FACES = 6;
	
	// "Mark" refers to user input, not location in the array
	// ie. a mark of '8' refers to 4-of-a-kind, but we should access array element [7], or in other words, element [mark - 1]
	// But we can print the numeric categories for the user as is; ie. print "13" for Chance, or in other words, "MARK_X"
	public static final int MARK_3_OF_A_KIND = NUM_FACES + 1;
	public static final int MARK_4_OF_A_KIND = NUM_FACES + 2;
	public static final int MARK_FULL_HOUSE = NUM_FACES + 3;
	public static final int MARK_SMALL_STRAIGHT = NUM_FACES + 4;
	public static final int MARK_BIG_STRAIGHT = NUM_FACES + 5;
	public static final int MARK_YAHTZEE = NUM_FACES + 6;
	public static final int MARK_CHANCE = NUM_FACES + 7;
	public static final int NUM_MARKS = NUM_FACES + 7;
	
	public static final String[] PRINT_MARK_NAME = {
			"Ones          ",
			"Twos          ",
			"Threes        ",
			"Fours         ",
			"Fives         ",
			"Sixes         ",
			"3 of a Kind   ",
			"4 of a Kind   ",
			"Full House    ",
			"Small Straight",
			"Large Straight",
			"YAHTZEE       ",
			"Chance        "
	};
	
	public static final int MAX_ROLLS = 3;

	public static final int SCORE_TOP_TOTAL_BONUS_THRESHOLD = 63;
	public static final int SCORE_TOP_TOTAL_BONUS = 35;
	public static final int SCORE_FULL_HOUSE = 25;
	public static final int SCORE_SMALL_STRAIGHT = 30;
	public static final int SCORE_BIG_STRAIGHT = 40;
	public static final int SCORE_YAHTZEE = 50;

	public static int dice[] = new int[NUM_DICE];
	public static boolean[] isHeld = new boolean[NUM_DICE];
	
	public static int markedScore[] = new int[NUM_MARKS];
	public static boolean isMarked[] = new boolean[NUM_MARKS];
	
	public static Scanner scan = new Scanner(System.in);
	public static String input = "";
	public static Random random = new Random();
	
	public static void main(String[] args) {
		
		for (int i = 0; i < NUM_MARKS; ++i) {
			markedScore[i] = 0;
			isMarked[i] = false;
		}
		
		System.out.println("YAHTZEE");
		for (int round = 0; round < NUM_MARKS; ++round) {
			System.out.println();
			
			for (int i = 0; i < NUM_DICE; ++i) {
				isHeld[i] = false;
			}
			
			System.out.println("Round " + (round + 1) + ":");
			
			boolean isReadyToMark = false;
			int roll = 0;
			while (roll < MAX_ROLLS && !isReadyToMark) {
				rollUnheldDice();
				++roll;
				System.out.println("Roll " + roll + ":");
				printDice();
				
				if (roll < MAX_ROLLS) {
					if (promptHoldDice() == NUM_DICE) {
						isReadyToMark = true;
					}
				}
			}

			printScoreBoard();
			
			int mark = -1;
			int score = 0;
			
			boolean isValidMark = false;
			while (!isValidMark) {
				
				mark = -1; // In case user tried to double-mark an already scored mark, enter loop
				while (mark <= 0 || mark >= NUM_MARKS + 1) {
					System.out.print("Choose the category #: ");
					input = scan.nextLine();
					try {
						mark = Integer.valueOf(input);
					} catch (NumberFormatException e) {
						// Not a number
					}
				}
				
				// A number
				if (mark >= 1 && mark <= NUM_FACES) {
					if (!isMarked[mark-1]) {
						for (int i = 0; i < NUM_DICE; ++i) {
							if (dice[i] == mark) {
								score += mark;
							}
						}
						isValidMark = true;
					}
				} else if (mark == MARK_3_OF_A_KIND) {
					if (!isMarked[mark-1]) {
						bubbleSortDice();
						if (dice[0] == dice[1] && dice[1] == dice[2] || 
								dice[1] == dice[2] && dice[2] == dice[3] ||
								dice[2] == dice[3] && dice[3] == dice[4] ) {
							score = sumOfDice();
						}
						isValidMark = true;
					}
				} else if (mark == MARK_4_OF_A_KIND) {
					if (!isMarked[mark-1]) {
						bubbleSortDice();
						if (dice[0] == dice[1] && dice[1] == dice[2] && dice[2] == dice[3] || 
								dice[1] == dice[2] && dice[2] == dice[3] && dice[3] == dice[4] ) {
							score = sumOfDice();
						}
						isValidMark = true;
					}
				} else if (mark == MARK_FULL_HOUSE) {
					if (!isMarked[mark-1]) {
						bubbleSortDice();
						if (dice[0] == dice[1] && dice[1] == dice[2] && dice[3] == dice[4] || 
								dice[0] == dice[1] && dice[2] == dice[3] && dice[3] == dice[4] ) {
							score = SCORE_FULL_HOUSE;
						}
						isValidMark = true;
					}
				} else if (mark == MARK_SMALL_STRAIGHT) {
					if (!isMarked[mark-1]) {
						bubbleSortDice();
						
						// Push any duplicates found to back of array
						boolean foundDuplicate = false;
						for (int i = 1; i < NUM_DICE && !foundDuplicate; ++i) {
							if (dice[i] == dice[i-1]) {
								for (; i < NUM_DICE - 1; i++) {
									dice[i] = dice[i+1];
								}
								foundDuplicate = true;
							}
						}
						
						// Check for continuity on front dice
						boolean isSmallStraight = true;
						for (int i = 1; i < NUM_DICE - 1 && isSmallStraight; ++i) {
							if (dice[i-1] != dice[i] - 1) {
								isSmallStraight = false;
							}
						}
						// Check for continuity again, on the back dice
						if (!isSmallStraight) {
							for (int i = 2; i < NUM_DICE && isSmallStraight; ++i) {
								if (dice[i-1] != dice[i] - 1) {
									isSmallStraight = false;
								}
							}
						}
						if (isSmallStraight) {
							score = SCORE_SMALL_STRAIGHT;
						}
						isValidMark = true;
					}
				} else if (mark == MARK_BIG_STRAIGHT) {
					if (!isMarked[mark-1]) {
						bubbleSortDice();
						
						// Check for continuity
						boolean isBigStraight = true;
						for (int i = 1; i < NUM_DICE && isBigStraight; ++i) {
							if (dice[i-1] != dice[i] - 1) {
								isBigStraight = false;
							}
						}
						if (isBigStraight) {
							score = SCORE_BIG_STRAIGHT;
						}
						isValidMark = true;
					}
				} else if (mark == MARK_YAHTZEE) {
					if (!isMarked[mark-1]) {
						boolean isYahtzee = true;
						for (int i = 1; i < NUM_DICE && isYahtzee; ++i) {
							if (dice[i-1] != dice[i]) {
								isYahtzee = false;
							}
						}
						if (isYahtzee) {
							score = SCORE_YAHTZEE;
						}
						isValidMark = true;
					}
				} else if (mark == MARK_CHANCE) {
					if (!isMarked[mark-1]) {
						score = sumOfDice();
						isValidMark = true;
					}
				} else {
					// Impossible
				}
			}

			markedScore[mark-1] = score;
			isMarked[mark-1] = true;
			printScoreBoard();
		}
		
		System.out.println("Final Score: " + (scoreTop() + scoreTopBonus() + scoreBottom()));
	}
	
	// Returns total of top marks
	public static int scoreTop() {
		int top = 0;
		for (int i = 0; i < NUM_FACES; ++i) {
			top += markedScore[i];
		}
		return top;
	}
	
	public static int scoreTopBonus() {
		if (scoreTop() < SCORE_TOP_TOTAL_BONUS_THRESHOLD) {
			return 0;
		}
		return SCORE_TOP_TOTAL_BONUS;
	}
	
	// Returns total of bottom marks
	public static int scoreBottom() {
		int bottom = 0;
		for (int i = NUM_FACES; i < NUM_MARKS; ++i) {
			bottom += markedScore[i];
		}
		return bottom;
	}
	
	// Returns number of dice thrown, ie. not held
	public static int rollUnheldDice() {
		int thrown = 0;
		for (int i = 0; i < NUM_DICE; ++i) {
			if (!isHeld[i]) {
				dice[i] = random.nextInt(NUM_FACES) + 1;
				++thrown;
			}
		}
		return thrown;
	}
	
	// Prints state of dice
	public static void printDice() {
		System.out.println("1st  2nd  3rd  4th  5th");
		System.out.print(" ");
		for (int i = 0; i < NUM_DICE; ++i) {
			System.out.print(dice[i] + "    ");
		}
		System.out.println();
	}

	// Ask user which dice user would like to hold
	// Returns the number of dice held by user
	public static int promptHoldDice() {
		String in = "";
		int heldDice = 0;
		
		System.out.println("Hold which dice? y/n");
		for (int i = 0; i < NUM_DICE; ++i) {
			System.out.print("Hold die #" + (i + 1) + "? :");
			in = scan.nextLine();
			if (in.equalsIgnoreCase("y")) {
				isHeld[i] = true;
				++heldDice;
			} else if (in.equalsIgnoreCase("n")){
				isHeld[i] = false;
			} else {
				--i;
			}
		}
		System.out.println();

		return heldDice;
	}
	
	public static void printScoreBoard() {
		int top = scoreTop();
		int bonus = scoreTopBonus();
		int bottom = scoreBottom();
		int total = top + bonus + bottom;
		
		printScoreBoardSeparator();
		for (int i = 1; i <= NUM_FACES; ++i) {
			printScoreBoardLine(i);
		}
		printScoreBoardSeparator();
		System.out.println("|      UPPER TOTAL    | " + (top <= 99 ? " " : "") + (top <= 9 ? " " : "") + top + " |");
		System.out.println("|      UPPER BONUS    | " + (bonus <= 9 ? "  " : " ") + bonus + " |");
		printScoreBoardSeparator();
		for (int i = NUM_FACES + 1; i <= NUM_MARKS; ++i) {
			printScoreBoardLine(i);
		}
		printScoreBoardSeparator();
		System.out.println("|      BOTTOM TOTAL   | " + (bottom <= 99 ? " " : "") + (bottom <= 9 ? " " : "") + bottom + " |");
		printScoreBoardSeparator();
		System.out.println("|      TOTAL          | " + (total <= 99 ? " " : "") + (total <= 9 ? " " : "") + total + " |");
		printScoreBoardSeparator();
	}
	
	public static void printScoreBoardSeparator() {
		// ---------------    2#   12#############   3##
		System.out.println("+----+----------------+-----+");
	}
	
	public static void printScoreBoardLine(int line) {
		// Two spaces
		String lineNumber = "| " + (line) + (line <= 9 ? " " : "");
		
		// Three spaces
		String lineScore = (isMarked[line-1] ? " " + (markedScore[line-1] <= 9 ? " " : "") + markedScore[line-1] : "   ");
		System.out.println(lineNumber + " | " + PRINT_MARK_NAME[line-1] + " | " + lineScore + " |");
	}
	
	public static int sumOfDice() {
		int sum = 0;
		for (int i = 0; i < NUM_DICE; ++i) {
			sum += dice[i];
		}
		return sum;
	}
	
	private static void bubbleSortDice() {
		for (int i = 0; i < NUM_DICE; ++i) {
			for (int j = 1; j < NUM_DICE - i; ++j) {
				if (dice[j] < dice[j-1]) {
					int t = dice[j];
					dice[j] = dice[j-1];
					dice[j-1] = t;
				}
			}
		}
	}
}
