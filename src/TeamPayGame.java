// The "TeamPayGame" class.
// A game by Parsa Alipour and Youssef Asaad
// Date: January 23, 2012

import java.awt.*;
import hsa.Console;

public class TeamPayGame
{
    static Console c;
    static Console d;
    static Console e;
    static Console b;
    static Console g;
    static Console h;

    //Declared global variables so that these values can be accessed from all methods
    public static int cash = 500;
    public static int followers = 0;
    public static boolean omitIntro = false;

    public static void titleScreen ()
    {

	for (int repeat = 0 ; repeat < 10 ; repeat++)
	{
	    try
	    {
		Thread.sleep (100);
		c.clear ();
		// this is the black t
		c.setColor (Color.black);
		c.fillRect (20, 30, 130, 30);
		c.setColor (Color.black);
		c.fillRect (65, 30, 30, 130);
		//this is the black e
		c.setColor (Color.black);
		c.fillRect (170, 30, 30, 130);
		c.setColor (Color.black);
		c.fillRect (170, 30, 130, 30);
		c.setColor (Color.black);
		c.fillRect (170, 80, 130, 30);
		c.setColor (Color.black);
		c.fillRect (170, 130, 130, 30);
		//this is the black a
		c.setColor (Color.black);
		c.fillRect (320, 30, 30, 130);
		c.setColor (Color.black);
		c.fillRect (320, 30, 130, 30);
		c.setColor (Color.black);
		c.fillRect (420, 30, 30, 130);
		c.setColor (Color.black);
		c.fillRect (320, 90, 130, 30);
		//this is the black m
		c.setColor (Color.black);
		c.fillRect (470, 30, 30, 130);
		c.setColor (Color.black);
		c.fillRect (530, 30, 30, 130);
		c.setColor (Color.black);
		c.fillRect (590, 30, 30, 130);
		c.setColor (Color.black);
		c.fillRect (470, 30, 130, 30);
		//this is the red t
		c.setColor (Color.red);
		c.fillRect (20, 36, 130, 17);
		c.setColor (Color.red);
		c.fillRect (72, 40, 17, 120);
		//this is the red e
		c.setColor (Color.red);
		c.fillRect (177, 40, 17, 110);
		c.setColor (Color.red);
		c.fillRect (177, 37, 123, 17);
		c.setColor (Color.red);
		c.fillRect (177, 87, 123, 17);
		c.setColor (Color.red);
		c.fillRect (177, 137, 123, 17);
		//this is the red a
		c.setColor (Color.red);
		c.fillRect (327, 40, 17, 120);
		c.setColor (Color.red);
		c.fillRect (327, 36, 117, 17);
		c.setColor (Color.red);
		c.fillRect (427, 40, 17, 120);
		c.setColor (Color.red);
		c.fillRect (327, 96, 115, 17);
		//this is the red m
		c.setColor (Color.red);
		c.fillRect (477, 40, 17, 120);
		c.setColor (Color.red);
		c.fillRect (537, 40, 17, 120);
		c.setColor (Color.red);
		c.fillRect (597, 40, 17, 120);
		c.setColor (Color.red);
		c.fillRect (477, 36, 137, 17);
		//this is the black p
		c.setColor (Color.black);
		c.fillRect (130, 200, 30, 130);
		c.setColor (Color.black);
		c.fillRect (130, 200, 130, 30);
		c.setColor (Color.black);
		c.fillRect (230, 200, 30, 90);
		c.setColor (Color.black);
		c.fillRect (140, 260, 90, 30);
		//this is the black a
		c.setColor (Color.black);
		c.fillRect (280, 200, 30, 130);
		c.setColor (Color.black);
		c.fillRect (280, 200, 130, 30);
		c.setColor (Color.black);
		c.fillRect (380, 200, 30, 130);
		c.setColor (Color.black);
		c.fillRect (280, 260, 130, 30);
		//this is the black y
		c.setColor (Color.black);
		c.fillRect (430, 200, 30, 70);
		c.setColor (Color.black);
		c.fillRect (430, 250, 130, 30);
		c.setColor (Color.black);
		c.fillRect (530, 200, 30, 70);
		c.setColor (Color.black);
		c.fillRect (480, 250, 30, 80);
		//this is the blue p
		c.setColor (Color.blue);
		c.fillRect (136, 210, 17, 120);
		c.setColor (Color.blue);
		c.fillRect (136, 206, 118, 17);
		c.setColor (Color.blue);
		c.fillRect (237, 209, 17, 75);
		c.setColor (Color.blue);
		c.fillRect (140, 267, 98, 17);
		//this is the blue a
		c.setColor (Color.blue);
		c.fillRect (286, 206, 17, 124);
		c.setColor (Color.blue);
		c.fillRect (290, 206, 109, 17);
		c.setColor (Color.blue);
		c.fillRect (386, 206, 17, 124);
		c.setColor (Color.blue);
		c.fillRect (286, 267, 109, 17);
		//this is the blue y
		c.setColor (Color.blue);
		c.fillRect (436, 200, 17, 73);
		c.setColor (Color.blue);
		c.fillRect (437, 256, 115, 17);
		c.setColor (Color.blue);
		c.fillRect (536, 200, 17, 73);
		c.setColor (Color.blue);
		c.fillRect (486, 257, 17, 73);
	    }
	    catch (InterruptedException ei)
	    {
	    }

	}
	promptContinue ();
    }


    public static void promptContinue ()
    {
	char input = 0;
	c.setCursor (20, 30);
	c.print ("Press enter to continue.");
	while (input != 10)
	{
	    input = c.getChar ();
	}
	c.clear ();
    }


    //Delay timers ordered from most delay to least delay
    public static void delayTimer0 ()
    {
	try
	{
	    Thread.sleep (1500);
	}
	catch (InterruptedException ie)
	{
	}
    }



    public static void delayTimer1 ()
    {
	try
	{
	    Thread.sleep (700);
	}
	catch (InterruptedException ie)
	{
	}
    }


    public static void delayTimer2 ()
    {
	try
	{
	    Thread.sleep (550);
	}
	catch (InterruptedException ie)
	{
	}
    }


    public static void delayTimer3 ()
    {
	try
	{
	    Thread.sleep (400);
	}
	catch (InterruptedException ie)
	{
	}
    }


    public static void delayTimer4 ()
    {
	try
	{
	    Thread.sleep (200);
	}
	catch (InterruptedException ie)
	{
	}
    }


    public static void delayTimer5 ()
    {
	try
	{
	    Thread.sleep (100);
	}
	catch (InterruptedException ie)
	{
	}
    }


    public static void delayTimer6 ()
    {
	try
	{
	    Thread.sleep (30);
	}
	catch (InterruptedException ie)
	{
	}
    }


    public static void delayTimer7 ()
    {
	try
	{
	    Thread.sleep (20);
	}
	catch (InterruptedException ie)
	{
	}
    }


    public static void quoteIntro ()
    { // Prints the intro by making use of thread.sleep
	//change to: We Will Victor

	c.print ("'I ");
	delayTimer0 ();
	c.print ("have ");
	delayTimer0 ();
	c.print ("a ");
	delayTimer3 ();
	c.print ("dream.");
	delayTimer1 ();
	c.print (".");
	delayTimer2 ();
	c.print (".");

	for (int i = 0 ; i < 3 ; i++)
	{
	    delayTimer3 ();
	    c.print (".");
	}

	for (int i = 0 ; i < 3 ; i++)
	{
	    delayTimer4 ();
	    c.print (".");
	}

	for (int i = 0 ; i < 3 ; i++)
	{
	    delayTimer5 ();
	    c.print (".");
	}
	for (int i = 0 ; i < 20 ; i++)
	{
	    delayTimer6 ();
	    c.print (".");
	}
	for (int i = 0 ; i < 30 ; i++)
	{
	    delayTimer7 ();
	    c.print (".");
	}
	delayTimer1 ();
	c.print ("'");
	delayTimer0 ();
	c.clear ();
	delayTimer0 ();
    }


    public static void rejectNonEnterInput ()
    { //only accepts enter as user input
	char input = c.getChar ();

	while (!(input == 10))
	{
	    input = c.getChar ();
	}
    }


    public static void printIntro ()
    { //The sum of all elements necessary to create the introduction (includes quoteIntro method)

	quoteIntro ();
	c.println ("(Press enter to continue...)\n");
	c.println ("'Kill him.'\n");
	rejectNonEnterInput ();
	c.println ("'No.'\n");
	rejectNonEnterInput ();
	c.println ("'This is the last chance, the last warning that I will give you. Kill him, or    else the worst will come upon you.'\n");
	rejectNonEnterInput ();
	c.println ("'My king, I cannot kill someone who has done nothing wrong but stand up for      himself and his rights.'\n");
	rejectNonEnterInput ();
	c.println ("'So be it. Guards! Kill him!'\n");
	rejectNonEnterInput ();
	c.println ("(Narration) And then I ran. I have always been an agile man. I made use of this  skill and dodged all the guards and ran towards the exit.\n");
	rejectNonEnterInput ();
	c.println ("'Guards! KILL HIM. DON'T LET HIM ESCAPE!'\n");
	rejectNonEnterInput ();
	c.println ("(Narration) Too late.I escaped and hid among the commoners to remain undetected.\n");
	rejectNonEnterInput ();
	c.println ("I had grown sick of the King's corruption. I had to put an end to it.\n");
	rejectNonEnterInput ();
	delayTimer0 ();
	c.clear ();
	delayTimer0 ();
    }


    public static void screenTransition ()
    { //Black to white fade screen transition

	int white = 0, black = 255;
	for (int constant = 0 ; black != 0 ; constant++)
	{
	    try
	    {
		Thread.sleep (100);
		Color col = new Color (black, black, black);
		c.setColor (col);
		c.fillRect (0, 0, 800, 800);
		black = black - 15;
	    }
	    catch (InterruptedException ie)
	    {
	    }
	}

	for (int constant = 0 ; white != 255 ; constant++)
	{
	    try
	    {
		Thread.sleep (100);
		Color col = new Color (white, white, white);
		c.setColor (col);
		c.fillRect (0, 0, 800, 800);
		white = white + 15;
	    }
	    catch (InterruptedException ie)
	    {
	    }
	}
	Color col = new Color (255, 255, 255);
	c.setColor (col);
	c.fillRect (0, 0, 800, 800);
    }


    public static void storyOptions (int cash, int followers)
    { //Main menu of the entire game, allows for different options to earn money to win the game
	c.clear ();
	c.setColor (Color.black);
	c.println ("The only way I can overthrow the King is if I gather enough followers...\n");
	c.println ("I think 10 followers would be good. I would need 1000 Gs for each follower.\n\n");
	c.println ("Now, how am I going to earn all of that money?\n\n\n");
	c.println ("1. Save an innocent man from being hanged.");
	c.println ("2. Duel enemies.");
	c.println ("3. Chop some wood as a lumberjack.");
	c.println ("4. Play rock paper scissors.");
	c.println ("5. Dice gambling.\n");
	c.println ("Other Options:");
	c.println ("6. Buy a follower.");
	c.println ("7. Rebel against the king!\n\n\n");

	c.print ("My cash: " + cash + " Gs\n\n");
	c.drawLine (260, 380, 600, 380);
	c.drawLine (260, 420, 600, 420);
	c.drawLine (260, 380, 260, 420);
	c.drawLine (601, 380, 601, 420);
	c.drawString ("My progress: " + followers + "/10 followers", 260, 445);

	c.setColor (Color.green);
	if (followers <= 10)
	{
	    c.fillRect (261, 381, 34 * followers, 39);
	}

	else if (followers > 10)
	{
	    c.fillRect (261, 381, 340, 39);
	}

	char choice = 0; //initializes choices to 0

	while (choice != 49 && choice != 50 && choice != 51 && choice != 52 && choice != 53 && choice != 54 && choice != 55)
	{ //reprompts for input if input is not one of the options
	    choice = c.getChar ();
	}

	if (choice == 49)
	{
	    entireHangmanGame ();
	}
	if (choice == 50)
	{
	    duelMainMenu ();
	}
	if (choice == 51)
	{
	    lumberJackEarnings ();

	}
	if (choice == 52)
	{
	    rpsMainMenu ();
	}
	if (choice == 53)
	{
	    diceGame ();
	}
	if (choice == 54)
	{
	    if (cash < 1000)
	    {
		c.clear ();
		c.println ("You do not have enough money to purchase a follower.\n");
		c.println ("A follower costs 1000 Gs.\n\n");
		c.println ("Press any button to go back.");
		c.getChar ();
		storyOptions (cash, followers);
	    }
	    cash = cash - 1000;
	    followers = followers + 1;
	    storyOptions (cash, followers);
	}
	if (choice == 55)
	{
	    if (followers < 10)
	    {
		c.clear ();
		c.println ("You do not have enough followers to be able to overpower the guards of the      castle and overthrow the king.\n");
		c.println ("Come back when you have 10 followers.\n\n");
		c.println ("Press any button to go back.");
		c.getChar ();
		storyOptions (cash, followers);
	    }
	    finalConclusion ();
	}
    }


    public static void finalConclusion ()
    { //The conclusion to the epic story

	c.clear ();

	c.println ("(Press enter to continue...)\n\n");

	c.println ("(Narration) Me and my brave followers raided the king's castle. After a long and hard battle, all the guards were slain. Only remained the King.\n");
	rejectNonEnterInput ();
	c.println ("I approached him. \n");
	rejectNonEnterInput ();
	c.println ("'It is time for your reign of vile tyranny to end.'\n");
	rejectNonEnterInput ();
	c.println ("'Oh no.'\n");
	rejectNonEnterInput ();
	c.println ("'Goodbye King.'\n");
	rejectNonEnterInput ();
	c.println ("'No, you can't do this to me. Anyone-ANYONE but you.'\n");
	rejectNonEnterInput ();

	screenTransition ();

	c.clear ();
	c.println ("(Press enter to continue...)\n\n");
	c.println ("I'm afraid I have wronged you dear reader. I'm afraid I have lied to you. \n");
	rejectNonEnterInput ();
	c.println ("I never escaped the castle out of my own wit. The King allowed me to.\n");
	rejectNonEnterInput ();
	c.println ("Even drowned in fury, and outraged by my betrayal, he wouldn't let them hurt me.\n");
	rejectNonEnterInput ();
	c.println ("And I have killed this man.\n");
	rejectNonEnterInput ();
	c.println ("I have killed... \n\n\n\n\n\n");
	rejectNonEnterInput ();
	c.println ("My father.\n\n");
	rejectNonEnterInput ();
	c.println ("Here is the truth about what happened before:");
	rejectNonEnterInput ();

	c.clear ();

	c.println ("(Press enter to continue...)\n\n");
	rejectNonEnterInput ();
	c.println ("'Kill him.'\n");
	rejectNonEnterInput ();
	c.println ("'No.'\n");
	rejectNonEnterInput ();
	c.println ("'This is the last chance, the last warning that I will give you. Kill him, or    else the worst will come upon you.'\n");
	rejectNonEnterInput ();
	c.println ("'Father, please be reasonable. Please, I beg of you. There's no reason to kill   this man.'\n");
	rejectNonEnterInput ();
	c.println ("'So be it. Guards! Escort Persius to outside of the castle. Let it be known that I have no son.\n");
	rejectNonEnterInput ();
	c.println (" And never did.'\n");
	rejectNonEnterInput ();
	c.println ("'No! Father, please! No!'\n");
	rejectNonEnterInput ();

	c.clear ();
	c.println ("I begged while I was dragged away to be kicked out of the castle.\n");
	rejectNonEnterInput ();
	c.println ("Only after I was kicked from the castle and saw the oppression that the people  faced, did I decide to rebel against my father.\n");
	rejectNonEnterInput ();
	c.println ("I've always loved my father. Seperation from my father was very emotionally     painful for me.\n\n");
	rejectNonEnterInput ();
	c.println ("He'd always been my hero.\n");
	rejectNonEnterInput ();
	//screenTransistion2 goes here
	c.clear ();
	c.println ("'No, you can't do this to me. Anyone-ANYONE but you.'\n");
	rejectNonEnterInput ();
	c.println ("The tear in his eye and his pleading complexion scorched my heart.\n");
	rejectNonEnterInput ();
	c.println ("What pained me even more was what he said: 'I never stopped loving you.'\n");
	rejectNonEnterInput ();
	c.println ("I had no choice. With a slash, I ended it. I took his life.\n");
	rejectNonEnterInput ();
	c.println ("The pain I felt from killing him was more agony than any man being tortured     could have felt.\n");
	rejectNonEnterInput ();
	c.println ("But sometimes, for the sake of justice, we just have to make sacrifices.\n\n\n\n\n\n");
	rejectNonEnterInput ();
	c.println ("No matter how big.");
	rejectNonEnterInput ();
	delayTimer0 ();
	c.close ();
    }


    public static void lumberJackEarnings ()
    {
	c.clear ();
	c.print ("You get an axe and start chopping wood ");
	for (int delay = 0 ; delay < 5 ; delay++)
	{
	    delayTimer0 ();
	    c.print (". ");
	}
	//After completed delays, cash is given to the user
	cash = cash + 30;
	c.println ("You earned 30 Gs!\n\n");
	c.println ("Press enter to chop some more wood or backspace to go back.");

	char input = c.getChar ();

	while (input != 8 && input != 10)
	{
	    //reprompts for input if input is not valid
	    input = c.getChar ();
	}

	if (input == 10)
	{
	    lumberJackEarnings ();
	}

	else if (input == 8)
	{
	    storyOptions (cash, followers);
	}
    }


    public static void diceGame ()
    {
	c.clear ();
	c.println ("Welcome to dice gambling!\n");
	c.println ("2 dice will be rolled. If at least one of the dice rolls your selected number,  you will get 2x what you wagered.\n");
	c.println ("If both of the dice roll the number you selected, you will recieve 30x what you wagered!\n\n");
	c.print ("How much would you like to bet: ");
	int wagerCash = c.readInt ();
	while (wagerCash > cash)
	{
	    c.print ("You don't have that much money. How much would you like to bet: ");
	    wagerCash = c.readInt ();
	}
	c.print ("\nWhat number would you like to bet on: ");
	int chosenNumber = c.readInt ();
	while (chosenNumber > 6 || chosenNumber < 1)
	{
	    c.print ("\nThat wasn't a valid number. Please choose a number between 1-6 that you would   like to bet on: ");
	    chosenNumber = c.readInt ();
	}
	c.clear ();
	c.print ("Rolling Dice ");
	for (int delay = 0 ; delay < 3 ; delay++)
	{
	    c.print (". ");
	    delayTimer2 ();
	}
	int diceOneNumber = (int) ((6 - 1 + 1) * Math.random () + 1);
	int diceTwoNumber = (int) ((6 - 1 + 1) * Math.random () + 1);

	c.print ("\n\n\nDice rolls: " + diceOneNumber + " and " + diceTwoNumber);

	if (diceOneNumber == chosenNumber && diceTwoNumber == chosenNumber)
	{
	    c.println ("\n\nCONGRATULATIONS! YOU HAVE WON " + (wagerCash * 30) + " Gs!!!");
	    cash = cash + (wagerCash * 30);
	}

	else if (diceOneNumber == chosenNumber || diceTwoNumber == chosenNumber)
	{
	    c.print ("\n\nCongratulations! You have won " + (wagerCash * 2) + " Gs!");
	    cash = cash + (wagerCash * 2);
	}

	else
	{
	    c.print ("\n\nSorry, you have lost " + wagerCash + " Gs.");
	    cash = cash - wagerCash;
	}
	c.print ("\n\nPress enter to gamble again or press backspace to go back to the options.");

	char input = c.getChar ();

	while (input != 8 && input != 10)
	{
	    input = c.getChar ();
	}

	if (input == 10)
	{
	    diceGame ();
	}
	if (input == 8)
	{
	    storyOptions (cash, followers);
	}
    }


    public static void hangmanPromptScreen ()
    { //prompt screen for hangman
	c.println ("What would you like to do?\n");

	c.println ("play!-------------->1");
	c.println ("instructions!------>2");
	c.println ("quit!-------------->3\n");
	c.print ("1/2/3? ");
    }


    public static int hangmanMainMenu ()
    { // main menu for hangman
	c.clear ();
	c.println ("Welcome to hangman!\n");
	hangmanPromptScreen ();

	int mainInput = c.readInt ();

	while (mainInput != 1 && mainInput != 2 && mainInput != 3)
	{
	    c.clear ();
	    c.println ("That wasn't one of the options. Please type '1','2',or '3' to choose an option.\n");
	    hangmanPromptScreen ();
	    mainInput = c.readInt ();
	    c.println ();
	}
	return (mainInput);
    }


    public static void hangmanPrintInstructions ()
    { // hangman instructions
	c.clear ();
	c.println ("In this game, a random word will be chosen based on your chosen difficulty.\n");

	c.println ("The number of '-'s will represent the number of letters that the word contains.\n");
	c.println ("You will have to guess letters that the word contains.\n");
	c.println ("If the word contains one or more of the letters you guessed, the letter will");
	c.println ("appear above the corresponding '-'.\n");
	c.println ("However, everytime you guess a letter incorrectly, a different component of the hangman will be drawn.\n");
	c.println ("You will have 8 guesses before the hangman is complete.\n");
	c.println ("If you are able to guess all letters of the word to the point of completion");
	c.print ("BEFORE the hangman is complete,you win! :D ");
	c.println ("Otherwise if the hangman becomes \ncompleted, you lose! :( \n");
	c.println ("The collection of your chosen letters will appear at the top.This will help you refrain from repeating letters! However, if you do, it still counts! A multiple number of the same letter will appear at the top if this is the case.\n");
	c.print ("Press any button to go back to main menu...");
    }


    public static void diffDetails ()
    { //hangman difficulty screen text
	c.println ("The following difficulties are availabe.\n");
	c.println ("Easy----(4 letter words)---(Cost: 10 Gs Reward: 100 Gs)----->1");
	c.println ("Medium--(5&6 letter words)-(Cost: 20 Gs Reward: 200 Gs)----->2");
	c.println ("Hard----(7 letter words)---(Cost: 40 Gs Reward: 400 Gs)----->3");
	c.println ("Go back-------------------------->4\n");
	c.print ("Which which option would you like to choose: 1/2/3/4? ");
    }


    public static int diffScreen ()
    { //hangman entire difficulty screen with an integer return type
	c.clear ();
	diffDetails ();

	int inputDiff = c.readInt ();

	while (inputDiff != 1 && inputDiff != 2 && inputDiff != 3 && inputDiff != 4)
	{
	    c.clear ();
	    c.println ("That wasn't one of the options. Please type '1','2', '3', or '4' to choose an option.\n");
	    diffDetails ();
	    inputDiff = c.readInt ();
	}
	if (inputDiff == 4)
	{
	    entireHangmanGame (); // if they choose to quit, it goes back to main menu
	}
	return (inputDiff);
    }


    public static int randomGenerator ()
    { //randomly generates a number in the range of 0-24
	int lowNumba = 0;
	int highNumba = 24;

	int numba = (int) ((highNumba - lowNumba + 1) * Math.random () + lowNumba);
	return (numba);
    }


    public static String rejectBadInput (String noNum)
    { //only accepts valid letters or 'exit' as input
	//the name of the variable 'noNum' means that it will not accept numbers
	while (!(noNum.equalsIgnoreCase ("a")) && !(noNum.equalsIgnoreCase ("b")) && !(noNum.equalsIgnoreCase ("c")) && !(noNum.equalsIgnoreCase ("d")) && !(noNum.equalsIgnoreCase ("e")) && !(noNum.equalsIgnoreCase ("f")) && !(noNum.equalsIgnoreCase ("g")) && !(noNum.equalsIgnoreCase ("h")) && !(noNum.equalsIgnoreCase ("i")) && !(noNum.equalsIgnoreCase ("j")) && !(noNum.equalsIgnoreCase ("k")) && !(noNum.equalsIgnoreCase ("l")) && !(noNum.equalsIgnoreCase ("m")) && !(noNum.equalsIgnoreCase ("n")) && !(noNum.equalsIgnoreCase ("o")) && !(noNum.equalsIgnoreCase ("p")) && !(noNum.equalsIgnoreCase ("q")) && !(noNum.equalsIgnoreCase ("r")) && !(noNum.equalsIgnoreCase ("s")) && !(noNum.equalsIgnoreCase ("t")) && !(noNum.equalsIgnoreCase ("u")) && !(noNum.equalsIgnoreCase ("v")) && !(noNum.equalsIgnoreCase ("w")) && !(noNum.equalsIgnoreCase ("x")) && !(noNum.equalsIgnoreCase ("y")) && !(noNum.equalsIgnoreCase ("z")) && !(noNum.equalsIgnoreCase ("exit")))
	{
	    c.print ("\nNot a valid letter.\n\nPlease enter a valid letter: ");
	    noNum = c.readString ();
	}
	return (noNum);
    }


    public static String easyDiff ()
    { //words of the easy difficulty
	String[] diff = {"baby", "barn", "boss", "door", "disk", "drag", "good", "hill", "lake", "navy", "page", "read", "rice", "ribs", "yard", "sock", "work", "wall", "wind", "road", "tomb", "tire", "trap", "tool", "rope"};

	int rNum = randomGenerator ();
	String word = diff [rNum];
	c.println ("\n\nYou have paid 10 Gs to bribe the guard. Press any button to begin.");
	c.getChar ();
	delayTimer0 ();
	return (word);
    }


    public static String medDiff ()
    { //words of the medium difficulty
	String[] diff = {"knife", "sleek", "silent", "strike", "adult", "amend", "igloo", "react", "relax", "mimic", "angel", "angry", "angle", "rabbit", "night", "towel", "fight", "flight", "crane", "grape", "dough", "laptop", "mouse", "clock", "paper"};

	int rNum = randomGenerator ();
	String word = diff [rNum];
	c.println ("\n\nYou have paid 20 Gs to bribe the guard. Press any button to begin.");
	c.getChar ();
	delayTimer0 ();
	return (word);
    }


    public static String hardDiff ()
    { // words of the hard difficulty
	String[] diff = {"diamond", "erosion", "suicide", "succumb", "suffice", "succeed", "sublime", "dancing", "eminent", "emotion", "failure", "faithful", "grandma", "natural", "obscure", "octopus", "offence", "babysit", "baggage", "camping", "gambler", "hangman", "turmoil", "leprosy", "cyanide"};

	int rNum = randomGenerator ();
	String word = diff [rNum];
	c.println ("\n\nYou have paid 40 Gs to bribe the guard. Press any button to begin.");
	c.getChar ();
	delayTimer0 ();
	return (word);
    }


    public static void hangmanBase ()
    { //base of hangman
	d.setColor (Color.darkGray);
	d.fillRect (100, 100, 10, 900);
	d.setColor (Color.darkGray);
	d.fillRect (100, 100, 300, 10);
	d.setColor (Color.darkGray);
	d.fillRect (10, 490, 200, 10);
	d.setColor (Color.darkGray);
	d.fillRect (390, 100, 10, 40);
    }


    public static void hangmanHead ()
    { //head
	d.setColor (Color.black);
	d.fillOval (355, 139, 80, 80);
    }


    public static void hangmanEyes ()
    { //eyes
	d.setColor (Color.white);
	d.fillOval (375, 165, 10, 10);
	d.setColor (Color.white);
	d.fillOval (410, 165, 10, 10);
    }


    public static void hangmanDeadEyes ()
    { //left eye
	d.setColor (Color.white);
	d.drawLine (390, 160, 370, 170);
	d.setColor (Color.white);
	d.drawLine (370, 160, 390, 170);
	//right eye
	d.setColor (Color.white);
	d.drawLine (420, 160, 400, 170);
	d.setColor (Color.white);
	d.drawLine (400, 160, 420, 170);
    }


    public static void hangmanMouth ()
    { //mouth
	d.setColor (Color.red);
	d.fillArc (377, 180, 40, 40, 360, 180);
    }


    public static void hangmanBody ()
    { //body
	d.setColor (Color.black);
	d.fillOval (338, 215, 120, 180);
    }


    public static void hangmanArms ()
    { //arms
	d.setColor (Color.black);
	d.fillOval (245, 270, 100, 20);
	d.setColor (Color.black);
	d.fillOval (450, 270, 100, 20);
    }


    public static void hangmanLegs ()
    { //legs
	d.setColor (Color.black);
	d.fillOval (357, 370, 20, 120);
	d.setColor (Color.black);
	d.fillOval (420, 370, 20, 120);
    }


    public static void hangmanWordBubble ()
    { //word bubble
	d.setColor (Color.blue);
	d.drawOval (450, 80, 100, 100);
	d.drawString (" One more turn", 460, 120);
	d.drawString (" left don't let", 470, 140);
	d.drawString (" me die!!!", 480, 160);

    }


    public static boolean playHangman (String word)
    { //the actual playing portion of the hangman game

	String chosenLetters = "";
	String guessLetter = "";
	int counter = 0;
	boolean printLetter = true;
	boolean trueGuess;
	boolean win = false;

	String[] letters = new String [word.length ()];

	for (int index = 0 ; index < word.length () ; index++)
	{
	    letters [index] = word.substring (index, index + 1); // set every letter of word as a different component of array
	}

	boolean[] booleans = new boolean [word.length ()];

	for (int index = 0 ; index < word.length () ; index++)
	{
	    booleans [index] = false; //set all array values to false
	}

	c.clear ();
	d = new Console (); //create new console for hangman graphics
	for (int numGuess = 9 ; numGuess > 0 ; numGuess--)
	{
	    trueGuess = false;

	    if (!win)
	    {
		c.print ("\n\n\n\n\n\n\n\n\n\n");
	    }

	    for (int index = 0 ; index < word.length () ; index++)
	    {
		if (guessLetter.equalsIgnoreCase (letters [index]))
		{
		    booleans [index] = true; //sets all booleans corresponding with the correct guesses as true
		    trueGuess = true;
		}

		if (booleans [index])
		{
		    //draw the correctly guessed letter above the correct '---'s
		    c.drawString (letters [index].toUpperCase (), 126 + (20 * index), 140);
		}
	    }

	    if (!win)
	    {
		c.println ("Note: type exit at any time to exit.\n");
	    }

	    if (trueGuess && !win)
	    {
		numGuess++; //adds guess back if user guesses correctly
	    }

	    for (int index = 0 ; index < word.length () ; index++)
	    {
		c.setColor (Color.black);
		c.drawString ("--- ", 125 + (20 * index), 150); //draw the '---'s based on the # of letters of the word
	    }
	    for (int index = 0 ; index < word.length () ; index++)
	    {
		if (booleans [index])
		{
		    counter++; //counter is increased based on # of true booleans

		    if (counter == word.length ())
		    {
			win = true;
			d.close ();
			break;
			//if counter is equal to number of letters in word, then user wins
		    }
		}
	    }

	    //The following code draws the hangman graphics based on user's guesses

	    if (numGuess == 9 && !win)
	    {
		hangmanBase ();
	    }
	    if (numGuess == 8 && !win)
	    {
		hangmanBase ();
		hangmanHead ();
	    }
	    if (numGuess == 7 && !win)
	    {
		hangmanBase ();
		hangmanHead ();
		hangmanEyes ();
	    }
	    if (numGuess == 6 && !win)
	    {
		hangmanBase ();
		hangmanHead ();
		hangmanEyes ();
		hangmanMouth ();
	    }
	    if (numGuess == 5 && !win)
	    {
		hangmanBase ();
		hangmanHead ();
		hangmanEyes ();
		hangmanMouth ();
		hangmanBody ();
	    }
	    if (numGuess == 4 && !win)
	    {
		hangmanBase ();
		hangmanHead ();
		hangmanEyes ();
		hangmanMouth ();
		hangmanBody ();
		hangmanArms ();
	    }
	    if (numGuess == 3 && !win)
	    {
		hangmanBase ();
		hangmanHead ();
		hangmanEyes ();
		hangmanMouth ();
		hangmanBody ();
		hangmanArms ();
		hangmanLegs ();
	    }
	    if (numGuess == 2 && !win)
	    {
		hangmanBase ();
		hangmanHead ();
		hangmanEyes ();
		hangmanMouth ();
		hangmanBody ();
		hangmanArms ();
		hangmanLegs ();
		hangmanWordBubble ();
	    }
	    if (numGuess == 1 && !win)
	    {
		hangmanBase ();
		hangmanHead ();
		hangmanDeadEyes ();
		hangmanMouth ();
		hangmanBody ();
		hangmanArms ();
		hangmanLegs ();
	    }

	    if (numGuess == 1)
	    {
		break; //if user completes the word in the last guess they still win
	    }

	    guessLetter = guessLetterReturn (win);

	    if (!win)
	    { //clears the d console to allow for the hangman to be drawn again
		d.clear ();

	    }

	    if (guessLetter.equalsIgnoreCase ("exit"))
	    { //If user wishes to exit, it goes back to hangman main menu
		d.close ();
		entireHangmanGame ();
	    }
	    //resets counter that the win boolean is based on
	    counter = 0;

	    if (!win)
	    {
		c.clear ();

		for (int index = 0 ; index < chosenLetters.length () ; index++)
		{
		    if (guessLetter.equalsIgnoreCase (chosenLetters.substring (index, index + 1)))
		    {
			printLetter = false; //If the same letter is guessed, it is not written again
		    }
		}
		if (printLetter)
		{
		    chosenLetters = chosenLetters + " " + guessLetter;
		}
		printLetter = true;
		c.print ("Chosen letters: ");
		c.print (chosenLetters.toUpperCase ()); //prints chosen letters
	    }
	}
	return (win);
    }


    public static String guessLetterReturn (boolean win)
    {
	String guessLetter = "";
	if (!win)
	{
	    c.print ("Please guess a letter: ");
	    guessLetter = c.readString ();
	    guessLetter = rejectBadInput (guessLetter); //rejects non-letter input
	}
	return (guessLetter);
    }


    public static void entireHangmanGame ()
    {
	String word = "";
	boolean win = false;

	int mainInput = hangmanMainMenu ();

	while (1 != 2)
	{
	    if (mainInput == 1)
	    {
		int inputDiff = diffScreen (); //difficulty select

		if (inputDiff == 1)
		{
		    word = easyDiff ();
		}

		else if (inputDiff == 2)
		{
		    word = medDiff ();
		}

		else if (inputDiff == 3)
		{
		    word = hardDiff ();
		}

		win = playHangman (word);

		int bribeMoney = 0;

		if (inputDiff == 1)
		{
		    bribeMoney = 10;
		}
		if (inputDiff == 2)
		{
		    bribeMoney = 20;
		}
		if (inputDiff == 3)
		{
		    bribeMoney = 40;
		}

		cash = cash - bribeMoney;

		if (win)
		{
		    int gratitudeCash = 0;

		    if (inputDiff == 1)
		    {
			gratitudeCash = 100;

		    }
		    if (inputDiff == 2)
		    {
			gratitudeCash = 200;
		    }
		    if (inputDiff == 3)
		    {
			gratitudeCash = 400;
		    }
		    cash = cash + gratitudeCash;

		    c.println ("\nExcellent! I have completed the word and saved the innocent prisoner!");
		    c.println ("As a token of his gratitude, he gave me " + gratitudeCash + " Gs!\n");
		    c.println ("Press any button to continue.");
		    c.getChar ();

		}
		if (!win)
		{
		    int repeat = 0;
		    c.clear ();
		    c.print ("Oh no! The innocent man was hanged!");
		    c.print ("\n\n\n\n\nThe word was: " + word.toUpperCase () + "\n\n");
		    c.print ("would you like to play again? 1-yes 2-no ");
		    repeat = c.readInt ();
		    d.close ();
		    if (repeat == 2)
		    {
			entireHangmanGame ();
		    }
		}
	    }
	    if (mainInput == 2)
	    {
		hangmanPrintInstructions ();
		mainInput = c.getChar ();
		mainInput = hangmanMainMenu ();
	    }
	    if (mainInput == 3)
	    {
		c.clear ();
		storyOptions (cash, followers);
	    }
	}
    }


    public static void duelInstructions ()
    { //Instructions for the duel game

	c.clear ();
	c.print ("So you have decided to enter a duel eh? then be prepared to leave with riches...");
	c.println ("Or be horribly humiliated, injured and lose your cash.\n");
	c.println ("You have 3 choices of actions: load your arrow in your bow, shoot the arrow, or block.\n");
	c.println ("To be able to shoot, you must obviously have loaded your bow the turn before. Ifyou try to shoot before you have loaded your bow, you will be unable to shoot itand it will still count as a turn.\n");
	c.println ("if you get a total of 5 reloads, you will be able to use a crossbow which  will cause you to win instantly regardless of your opponent's move. Furthermore, you will get 2x the loot. The opponent will never be able to choose the crossbow.\n\n");
	c.println ("Press any button to go back to the main menu ...");

	c.getChar ();

	duelMainMenu ();
    }


    public static void duelGame ()
    {

	String computer = "", shoot = "shoot", reload = "reload", block = "block", playagain, crossbow = "crossbow", choice = "";
	double rNum;
	int move = 0, comshot = 0, shots = 0;
	boolean win = false;
	boolean lose = false;

	c.clear ();

	c.println ("Type 'reload', 'block', or 'shoot' to perform your desired action.\n");
	while (!choice.equalsIgnoreCase ("shoot") && !choice.equalsIgnoreCase ("reload") && !choice.equalsIgnoreCase ("block"))
	{ //this while statement is necessary to ensure the computer always reloads on the first turn even if user input is invalid
	    c.print ("Please enter your move: ");
	    choice = c.readString ();
	}
	choice = choice.toLowerCase ();

	do
	{
	    do
	    { //randomizer determining the enemy's move
		rNum = (int) ((3 - 1 + 1) * Math.random () + 1);
		if (rNum == 2 && move == 0)
		{
		    computer = reload;
		    move = move + 1;
		    comshot = comshot + 1;
		}
		if (rNum == 1 && comshot > 0)
		{
		    computer = shoot;
		    comshot = comshot - 1;
		}
		else if (rNum == 2)
		{
		    computer = reload;
		    comshot = comshot + 1;
		}
		else if (rNum == 3)
		{
		    computer = block;
		}
	    }

	    while (comshot < 1);

	    if (shots == 5 && choice.equals (crossbow))
	    { //If crossbow is chosen, user instantly wins

		c.clear ();
		win = true;
		c.println ("CROSSBOW!! YEAH BABY! MUHAHAHAHA!\n");
		c.println ("I have defeated the enemy!\n");
		c.println ("The enemy was then taken by doctors to be treated.\n\n");
		c.println ("Humiliated, he dropped 400 coins.\n\n");
		cash = cash + 400;
		break;

	    }

	    // The following if statements compare the user's move with randomly generated move for the enemy
	    if (shots < 1 && choice.equals (shoot) && computer.equals (shoot))
	    {
		c.clear ();
		lose = true;
		c.println ("I had not loaded my bow while trying to shoot. The enemy shot me so I've been defeated. D:");
		c.println ("I paid 50 coins to be treated by doctors.\n\n");
		cash = cash - 50;
		break;
	    }
	    if (shots < 1 && choice.equals (shoot) && computer.equals (block))
	    {
		c.clear ();
		c.println ("I had not loaded my bow, so I failed to shoot. The enemy has blocked.");
		c.println ("Ammo = " + shots + "\n");
	    }
	    if (shots < 1 && choice.equals (shoot) && computer.equals (reload))
	    {
		c.clear ();
		c.println ("I had not loaded my bow, so I failed to shoot. The enemy has loaded his bow.");
		c.println ("Ammo = " + shots + "\n");
	    }
	    if (shots > 0 && choice.equals (shoot) && computer.equals (shoot))
	    {
		c.clear ();
		shots = shots - 1;
		c.println ("Me and the enemy both shot an arrow and so, we missed each other.");
		c.println ("Ammo = " + shots + "\n");
	    }
	    if (shots > 0 && choice.equals (shoot) && computer.equals (block))
	    {
		c.clear ();
		shots = shots - 1;
		c.println ("I have shot an arrow while the enemy was blocking.");
		c.println ("Ammo = " + shots + "\n");
	    }
	    if (shots > 0 && choice.equals (shoot) && computer.equals (reload))
	    {
		c.clear ();
		c.clear ();
		shots = shots - 1;
		win = true;
		c.println ("I have defeated the enemy!\n");
		c.println ("The enemy was then taken by doctors to be treated.");
		c.println ("Humiliated, he dropped 200 coins.\n\n");
		cash = cash + 200;
		break;
	    }
	    if (choice.equals (reload) && computer.equals (shoot))
	    {
		c.clear ();
		lose = true;
		c.println ("The enemy shot me while I was loading my bow! I've been defeated. \n");
		c.println ("I paid 50 coins to be treated by doctors.\n\n");
		cash = cash - 50;
		break;
	    }
	    if (choice.equals (reload) && computer.equals (reload))
	    {
		c.clear ();
		c.println ("Both me and the enemy were loading our bow.");
		shots = shots + 1;
		c.println ("Ammo = " + shots + "\n");
	    }
	    if (choice.equals (reload) && computer.equals (block))
	    {
		c.clear ();
		c.println ("I was loading my bow while the enemy was blocking.");
		shots = shots + 1;
		c.println ("Ammo = " + shots + "\n");
	    }
	    if (choice.equals (block) && computer.equals (shoot))
	    {
		c.clear ();
		c.println ("I blocked the enemy's arrow while he shot an arrow at me! PHEW!");
		c.println ("Ammo = " + shots + "\n");
	    }
	    if (choice.equals (block) && computer.equals (reload))
	    {
		c.clear ();
		c.println ("I was blocking while the enemy was loading his bow.");
		c.println ("Ammo = " + shots + "\n");
	    }
	    if (choice.equals (block) && computer.equals (block))
	    {
		c.clear ();
		c.println ("Both me and the enemy were blocking.");
		c.println ("Ammo = " + shots + "\n");
	    }
	    if (shots >= 5)
	    {
		c.println ("CROSSBOW AVAILABLE\n");
	    }
	    c.println ("Type 'reload', 'block', or 'shoot' to perform your desired action.\n");
	    c.print ("Please enter your move: ");
	    choice = c.readString ();
	    choice = choice.toLowerCase ();
	    c.print ("\n");

	}
	while (1 != 0);

	c.print ("Press any button to go back to the menu.");
	c.getChar ();
	duelMainMenu ();
    }


    public static void duelWelcomeText ()
    { //The text component of the duel game welcome screen
	c.println ("You have entered to play a duel!\n");
	c.println ("play--------------->1");
	c.println ("Instructions------->2");
	c.println ("Quit--------------->3\n");
	c.print ("What would you like to do? ");
    }


    public static void duelMainMenu ()
    { // The method contating all of the compoenents of the duel game main menu
	int input = 0;

	while (input != 1 && input != 2 && input != 3)
	{
	    c.clear ();
	    duelWelcomeText ();
	    input = c.readInt ();
	}

	if (input == 1)
	{
	    duelGame ();
	}
	if (input == 2)
	{
	    duelInstructions ();
	}
	if (input == 3)
	{
	    c.clear ();
	    storyOptions (cash, followers);
	}
    }


    public static void playRockPaperScissors ()
    {
	String choice = "", computer = "";
	double rNum;
	int wageredCash = 0;
	boolean win = false;
	boolean lose = false;
	boolean tie = false;

	c.clear ();
	c.print ("Please enter the amount of cash that you wish to wager: ");
	wageredCash = c.readInt ();
	while (wageredCash > cash)
	{ //prevents players from wagering more than they have
	    c.print ("You do not have that much money. Please try again: ");
	    wageredCash = c.readInt ();
	}

	while (!choice.equals ("rock") && !choice.equals ("paper") && !choice.equals ("scissors"))
	{
	    //reprompts for input if input isn't rock, paper, or scissors
	    c.clear ();
	    c.print ("Please type 'rock', 'paper', or 'scissors' to choose your desired move.\n\n");
	    c.print ("Please select your move: ");
	    choice = c.readString ();
	    choice = choice.toLowerCase ();
	}

	//Determines the computer's choice
	rNum = (int) ((3 - 1 + 1) * Math.random () + 1);

	if (rNum == 1)
	{
	    computer = "rock";
	}
	else if (rNum == 2)
	{
	    computer = "scissors";
	}
	else if (rNum == 3)
	{
	    computer = "paper";
	}
	c.clear ();
	c.println ("I chose: " + choice);
	c.println ("The enemy chose: " + computer + "\n");
	//The following code compares the user's choice and the computer's choice
	if (choice.equals (computer))
	{
	    /*  if (choice.equals ("rock") && computer.equals ("rock"))
	      {
		  rockGraphics ();
		  delayTimer1 ();
		  b.close ();
		  vsGraphics ();
		  delayTimer1 ();
		  h.close ();
		  rockGraphics ();
		  delayTimer1 ();
		  b.close ();
	      }
	      if (choice.equals ("scissors") && computer.equals ("scissors"))
	      {
		  scissorsGraphics ();
		  vsGraphics ();
		  scissorsGraphics ();
		  delayTimer1 ();
		  e.close ();
		  e.close ();
		  h.close ();
	      }
	      if (choice.equals ("paper") && computer.equals ("paper"))
	      {
		  paperGraphics ();
		  vsGraphics ();
		  paperGraphics ();
		  delayTimer1 ();
		  g.close ();
		  g.close ();
		  h.close ();
	      } */

	    c.println ("So it's a tie!");
	    tie = true;
	}
	if (choice.equals ("rock") && computer.equals ("scissors"))
	{
	    /*  rockGraphics ();
	      delayTimer1 ();
	      b.close ();
	      vsGraphics ();
	      delayTimer1 ();
	      h.close ();
	      scissorsGraphics ();
	      delayTimer1 ();
	      e.close (); */

	    c.println ("So I've won!");
	    win = true;
	}
	if (choice.equals ("rock") && computer.equals ("paper"))
	{
	    /*  rockGraphics ();
	      delayTimer1 ();
	      b.close ();
	      vsGraphics ();
	      delayTimer1 ();
	      h.close ();
	      paperGraphics ();
	      delayTimer1 ();
	      g.close (); */

	    c.println ("So I've lost!");
	    lose = true;
	}
	if (choice.equals ("scissors") && computer.equals ("rock"))
	{
	    /* scissorsGraphics ();
	     delayTimer1 ();
	     e.close ();
	     vsGraphics ();
	     delayTimer1 ();
	     h.close ();
	     rockGraphics ();
	     delayTimer1 ();
	     b.close (); */

	    c.println ("So I've lost!");
	    lose = true;
	}
	if (choice.equals ("scissors") && computer.equals ("paper"))
	{
	    /* scissorsGraphics ();
	     delayTimer1 ();
	     e.close ();
	     vsGraphics ();
	     delayTimer1 ();
	     h.close ();
	     paperGraphics ();
	     delayTimer1 ();
	     g.close (); */

	    c.println ("So I've won!");
	    win = true;
	}
	if (choice.equals ("paper") && computer.equals ("rock"))
	{
	    /*  paperGraphics ();
	      delayTimer1 ();
	      g.close ();
	      vsGraphics ();
	      delayTimer1 ();
	      h.close ();
	      rockGraphics ();
	      delayTimer1 ();
	      b.close (); */

	    c.println ("So I've won!");
	    win = true;
	}
	if (choice.equals ("paper") && computer.equals ("scissors"))
	{
	    /*  paperGraphics ();
	      delayTimer1 ();
	      g.close ();
	      vsGraphics ();
	      h.close ();
	      scissorsGraphics ();
	      delayTimer1 ();
	      e.close (); */

	    c.println ("So I've lost!");
	    lose = true;
	}
	if (win)
	{ //adds wagered amount to user's total cash
	    c.print ("I won " + wageredCash + " Gs! AWESOME!");
	    cash = cash + wageredCash;
	}
	if (lose)
	{ //subtracts wagered amount from user's total cash
	    c.print ("Oh no! I lost " + wageredCash + " Gs! NOOOO!");
	    cash = cash - wageredCash;
	}
	if (tie)
	{
	    c.print ("Since it was a tie, no one won anything.");
	}

	c.print ("\n\n\n");
	c.print ("Press any button to go back to the menu.");
	c.getChar ();
	rpsMainMenu ();
    }


    public static void rpsInstructions ()
    { //simple instructions
	c.clear ();
	c.println ("Did you actually choose instructions for rock, paper, scissors?!\n");
	c.println ("Come on, everyone knows how to play this game... :D\n");
	c.println ("The rules of this game are quite simple:\n");
	c.println ("You and your opponent will choose one of either rock, paper, or scissors.\n");
	c.println ("Rock will beat scissors, scissors will beat paper, and paper will beat rock.\n");
	c.println ("If you both choose the same option, it will be a tie.\n");
	c.println ("You will choose a certain amount to wager. If you win, you will win that amount and if you lose, you will lose that amount. Good luck!\n\n");
	c.println ("Press any button to go back to the menu.");
	c.getChar ();
	rpsMainMenu ();
    }


    public static void rpsWelcomeText ()
    { //The text component of the rock paper scissors welcome screen
	c.println ("Weclome to rock, paper, scissors!\n\n");
	c.println ("1------------>Play!");
	c.println ("2------------>Instructions!");
	c.println ("3------------>Quit!\n");
	c.print ("Please enter one of the available options: ");
    }


    public static void rpsMainMenu ()
    { // The entire main menu of the rock paper scissors game
	c.clear ();
	int input = 0;

	while (input != 1 && input != 2 && input != 3)
	{
	    c.clear ();
	    rpsWelcomeText ();
	    input = c.readInt ();
	}
	if (input == 1)
	{
	    playRockPaperScissors ();
	}
	if (input == 2)
	{
	    rpsInstructions ();
	}
	if (input == 3)
	{
	    storyOptions (cash, followers);
	}
    }


    public static void scissorsGraphics ()
    {
	//scissors
	e = new Console ();
	e.setColor (Color.darkGray);
	e.drawLine (10, 165, 400, 45);
	e.drawLine (400, 45, 450, 45);
	e.drawLine (100, 160, 450, 45);
	e.drawLine (220, 120, 450, 130);
	e.drawLine (129, 150, 440, 140);
	e.drawLine (440, 140, 450, 130);
	e.drawOval (0, 155, 120, 50);
	e.drawOval (10, 165, 100, 30);
	e.drawLine (110, 110, 160, 115);
	e.drawOval (10, 90, 100, 50);
	e.drawOval (20, 100, 80, 30);
    }


    public static void rockGraphics ()
    {
	//rock
	b = new Console ();
	b.setColor (Color.darkGray);
	b.fillOval (250, 350, 100, 100);
	b.fillOval (230, 350, 100, 100);
	b.fillOval (270, 350, 100, 100);
	b.fillOval (250, 330, 100, 100);
	b.fillOval (250, 370, 100, 100);
	b.fillOval (235, 380, 100, 100);
	b.fillOval (225, 325, 50, 50);
	b.fillOval (290, 325, 60, 60);
	b.fillOval (330, 430, 30, 30);
	b.setColor (Color.black);
	b.fillOval (320, 410, 30, 30);
	b.fillOval (280, 390, 30, 30);
	b.fillOval (330, 350, 30, 30);
    }


    public static void paperGraphics ()
    {
	//paper
	g = new Console ();
	g.setColor (Color.black);
	g.drawLine (250, 340, 400, 340);
	g.drawLine (250, 340, 250, 480);
	g.setColor (Color.black);
	g.drawLine (250, 480, 400, 480);
	g.drawLine (400, 340, 400, 480);
	g.setColor (Color.red);
	g.drawLine (265, 460, 385, 460);
	g.setColor (Color.red);
	g.drawLine (265, 440, 385, 440);
	g.setColor (Color.red);
	g.drawLine (265, 420, 385, 420);
	g.setColor (Color.red);
	g.drawLine (265, 400, 385, 400);
	g.setColor (Color.red);
	g.drawLine (265, 380, 385, 380);
	g.setColor (Color.blue);
	g.drawString ("PAPER ", 300, 379);
    }


    public static void vsGraphics ()
    {
	//V.S. sign
	h = new Console ();
	h.setColor (Color.red);
	h.drawLine (200, 200, 250, 300);
	h.setColor (Color.blue);
	h.drawLine (250, 300, 300, 200);
	h.setColor (Color.red);
	h.fillOval (300, 282, 20, 20);
	h.setColor (Color.blue);
	h.drawLine (350, 300, 450, 300);
	h.setColor (Color.red);
	h.drawLine (450, 250, 450, 300);
	h.setColor (Color.blue);
	h.drawLine (350, 250, 450, 250);
	h.setColor (Color.red);
	h.drawLine (350, 200, 350, 250);
	h.setColor (Color.blue);
	h.drawLine (350, 200, 450, 200);
    }


    public static void teamPayGame ()
    {
	if (!omitIntro)
	{
	    printIntro ();
	    titleScreen ();
	    screenTransition ();
	    omitIntro = true;
	}
	storyOptions (cash, followers);
    }


    public static void main (String[] args)
    {
	c = new Console ();

	teamPayGame ();








	/*  boolean play = false;

	 while (play == false)
	 {
	     String input = c.readString ();
	     if (input.equalsIgnoreCase ("instructions"))
	     {
		 c.clear ();

		 printInstructions ();

	     }
	     else if (input.equalsIgnoreCase ("play"))
	     {
		 play = true;
	     }
	 } */



	/* c.println ("'and what would that be?'");
	 c.println ();
	 delayTimer();
	 c.println ("'To fulfill the dream of others.'");
	 c.println ();
	 delayTimer();
	 c.println ("'And tonight, that dream will come true...");
	 c.println ();
	 delayTimer();
	 c.println ("You WILL fulfill my wish.'");
	 c.println ();
	 delayTimer();
	 c.println ("'And you shall fulfill mine'");
	 c.println ();
	 delayTimer();
	 c.println ("'I'm sure I will... Goodbye Mr. Arlington.'");
	 c.println ();
	delayTimer();
	 //c.println("As king Harlow..); */


    }
}


