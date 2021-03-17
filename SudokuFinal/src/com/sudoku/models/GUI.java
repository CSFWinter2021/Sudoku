package com.sudoku.models;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class GUI extends JFrame{
//All of the GUI's components are created here, they are all used later on to create a function GUI for playing sudoku, The general layout of the GUI is that there is a main menu with buttons
//to start a new puzzle, close the game or view your score, The JButtons all have action listeners which remove and add different panels and then refresh the GUI allowing the user to navigate
//between different menus, the bulk of the GUI's content is on the panel which contains the actual sudoku puzzle itself, it uses and array of 81 textfields to create a 9x9 grid for the users
//to enter the actual numbers into and play sudoku, as well as a menu allowing the user to test their solution, have the puzzle solf itself, give up, or get the suggested entries for a selected
//spot on the grid.
	
//frame which holds GUI Components
		private JFrame guiFrame = new JFrame();
	
//objects and fonts defined here
		private MainBoard mainBoard = new MainBoard();
		private Solve solver = new Solve();
		private User user = new User();
		
		private Font sFont = new Font("Arial", Font.BOLD, 30);
		private Font sFont2 = new Font("Arial", Font.ITALIC, 30);
		
//JPanels Defined Here, panels added and removed from JFrame as buttons are pushed to navigate menus and call functions		
		private JPanel menuPanel = new JPanel(); //Main menu, holds buttons to start new game, view scores and exit the game
	//These panels are used when playing the game
		private JPanel sudokuPanelMain = new JPanel(); //Main panel holds other sudoku panels
		
		private JPanel sudokuPanelHeader = new JPanel(); //holds header at the top of the sudoku panel
		private JPanel sudokuPanelBoard = new JPanel(); //holds 9x9 grid of textfields for displaying the board
		private JPanel sudokuPanelMenu = new JPanel(); //holds menu panels for interacting with board	
		
		private JPanel sudokuHelpPanel1 = new JPanel(); //Help panels displayed when pressing the help button
		private JPanel sudokuHelpPanel2 = new JPanel(); //first help panel used for entering X/Y of where you want help, second panel displays possibe values for that location
		
		private JPanel sudokuFinishPanel = new JPanel(); //Finish panel displayed when pressing the solve button
		
	//This panel displayed when viewing total games won
		private JPanel scorePanel = new JPanel(); //panel used when displaying totals games won
	
//JButtons defined here
	//These are buttons displayed on main menu panel
		private JButton startGameB = new JButton("starte a new game"); //starts a new game with a random board from a selection of 30 boards
		private JButton viewScoresB = new JButton("view user scores"); //displays panel showing how many games the user has won
		private JButton exitGameB = new JButton("exit the game"); //closes the game
	
	//Menu options on sudoku panel for interacting with the board
		private JButton helpB = new JButton("Help"); //Shows possible entries for target location
		private JButton solveB = new JButton("solve"); //Tests to see if entered puzzle solution is valid
		private JButton solveForMeB = new JButton("Solve For Me"); //Auto-solves board and shows solution
		private JButton giveUpB = new JButton("Give up"); //gives up and changes panel back to main menu panel
		
		private JButton helpContinueB = new JButton("Continue"); //Moves to second help panel
		private JButton helpEndB = new JButton("Back to the game"); //Replaces Help panel with sudoku menu panel
	
		private JButton goToMenuB = new JButton("Go To Menu"); //goes back to main menu, used on finish panel which is shown when pressing the solve button
		
		private JButton scoreBackB = new JButton("Back to menu"); //changes panel from score display panel to main menu panel

//JLabels defined here	
		private JLabel scoreDisplay = new JLabel(""); //displays how many games the user has won										

		private JLabel sudokuHeader = new JLabel("Heres your puzzle"); //header at top of sudoku puzzle
		
		private JLabel helpHeader = new JLabel("Enter an X and Y value 1-9"); //header displayed on first help panel
		private JLabel helpDisplay = new JLabel(""); //displayed possible entries for location
		
		private JLabel finishDisplay = new JLabel(""); //displayed message based on whether user's solution is valid or invalid
		
//JTextfields defined here
		private JTextField helpFieldX = new JTextField(); //used to enter X value on help panel
		private JTextField helpFieldY = new JTextField(); //used to enter Y value on help panel
				
//defines seperate text fields for all 81 squares in sudoku, the numbers of each textfield refers to their X/Y coordinates in the grid
	private JTextField s11 = new JTextField();
	private JTextField s12 = new JTextField();
	private JTextField s13 = new JTextField();
	private JTextField s14 = new JTextField();
	private JTextField s15 = new JTextField();
	private JTextField s16 = new JTextField();
	private JTextField s17 = new JTextField();
	private JTextField s18 = new JTextField();
	private JTextField s19 = new JTextField();
	
	private JTextField s21 = new JTextField();
	private JTextField s22 = new JTextField();
	private JTextField s23 = new JTextField();
	private JTextField s24 = new JTextField();
	private JTextField s25 = new JTextField();
	private JTextField s26 = new JTextField();
	private JTextField s27 = new JTextField();
	private JTextField s28 = new JTextField();
	private JTextField s29 = new JTextField();
	
	private JTextField s31 = new JTextField();
	private JTextField s32 = new JTextField();
	private JTextField s33 = new JTextField();
	private JTextField s34 = new JTextField();
	private JTextField s35 = new JTextField();
	private JTextField s36 = new JTextField();
	private JTextField s37 = new JTextField();
	private JTextField s38 = new JTextField();
	private JTextField s39 = new JTextField();
	
	private JTextField s41 = new JTextField();
	private JTextField s42 = new JTextField();
	private JTextField s43 = new JTextField();
	private JTextField s44 = new JTextField();
	private JTextField s45 = new JTextField();
	private JTextField s46 = new JTextField();
	private JTextField s47 = new JTextField();
	private JTextField s48 = new JTextField();
	private JTextField s49 = new JTextField();
	
	private JTextField s51 = new JTextField();
	private JTextField s52 = new JTextField();
	private JTextField s53 = new JTextField();
	private JTextField s54 = new JTextField();
	private JTextField s55 = new JTextField();
	private JTextField s56 = new JTextField();
	private JTextField s57 = new JTextField();
	private JTextField s58 = new JTextField();
	private JTextField s59 = new JTextField();
	
	private JTextField s61 = new JTextField();
	private JTextField s62 = new JTextField();
	private JTextField s63 = new JTextField();
	private JTextField s64 = new JTextField();
	private JTextField s65 = new JTextField();
	private JTextField s66 = new JTextField();
	private JTextField s67 = new JTextField();
	private JTextField s68 = new JTextField();
	private JTextField s69 = new JTextField();
	
	private JTextField s71 = new JTextField();
	private JTextField s72 = new JTextField();
	private JTextField s73 = new JTextField();
	private JTextField s74 = new JTextField();
	private JTextField s75 = new JTextField();
	private JTextField s76 = new JTextField();
	private JTextField s77 = new JTextField();
	private JTextField s78 = new JTextField();
	private JTextField s79 = new JTextField();
	
	private JTextField s81 = new JTextField();
	private JTextField s82 = new JTextField();
	private JTextField s83 = new JTextField();
	private JTextField s84 = new JTextField();
	private JTextField s85 = new JTextField();
	private JTextField s86 = new JTextField();
	private JTextField s87 = new JTextField();
	private JTextField s88 = new JTextField();
	private JTextField s89 = new JTextField();
	
	private JTextField s91 = new JTextField();
	private JTextField s92 = new JTextField();
	private JTextField s93 = new JTextField();
	private JTextField s94 = new JTextField();
	private JTextField s95 = new JTextField();
	private JTextField s96 = new JTextField();
	private JTextField s97 = new JTextField();
	private JTextField s98 = new JTextField();
	private JTextField s99 = new JTextField();
	
//All textfields are added into a 2D-Array so that each textfield will correspond to one of the squares in a 9x9 sudoku board
	private JTextField[][] sudokuArray = new JTextField[][]{
		{s11, s12, s13, s14, s15, s16, s17, s18, s19},
		{s21, s22, s23, s24, s25, s26, s27, s28, s29},
		{s31, s32, s33, s34, s35, s36, s37, s38, s39},
		{s41, s42, s43, s44, s45, s46, s47, s48, s49},
		{s51, s52, s53, s54, s55, s56, s57, s58, s59},
		{s61, s62, s63, s64, s65, s66, s67, s68, s69},
		{s71, s72, s73, s74, s75, s76, s77, s78, s79},
		{s81, s82, s83, s84, s85, s86, s87, s88, s89},
		{s91, s92, s93, s94, s95, s96, s97, s98, s99},
	};

//This is the main class which contains all of the GUI components and their functions	
public GUI() {
	
//sets panels to use gridbag layout
	GridBagConstraints layout = new GridBagConstraints();

	sudokuPanelBoard.setLayout(new GridBagLayout());
	sudokuPanelMenu.setLayout(new GridBagLayout());
	sudokuPanelHeader.setLayout(new GridBagLayout());
	sudokuPanelMain.setLayout(new GridBagLayout());
	
	menuPanel.setLayout(new GridBagLayout());
	
	scorePanel.setLayout(new GridBagLayout());
	
//size and font specifications of buttons defined here
	solveB.setPreferredSize(new Dimension(150, 35));
	giveUpB.setPreferredSize(new Dimension(150, 35));
	helpB.setPreferredSize(new Dimension(150, 35));
		
	startGameB.setPreferredSize(new Dimension(150, 35));
	viewScoresB.setPreferredSize(new Dimension(150, 35));
	exitGameB.setPreferredSize(new Dimension(150, 35));
	solveForMeB.setPreferredSize(new Dimension(150, 35));
		
	helpContinueB.setPreferredSize(new Dimension(150, 35));
	helpEndB.setPreferredSize(new Dimension(150, 35));
		
	scoreBackB.setPreferredSize(new Dimension(150, 35));
		
	helpFieldX.setFont(sFont2);
	helpFieldX.setPreferredSize(new Dimension(35, 35));
	helpFieldX.setHorizontalAlignment(JTextField.CENTER);
		
	helpFieldY.setFont(sFont2);
	helpFieldY.setPreferredSize(new Dimension(35, 35));
	helpFieldY.setHorizontalAlignment(JTextField.CENTER);
	
	//defines layout of sudoku textfields within sudokuPanelBoard which holds the 81 spaces to enter numbers, 
	//and uses a counter too keep track of how many it added to creates spaces between every three components
	int sCounter = 0;
	for(int i = 0; i < 9; i++) {
		
		for(int j = 0; j < 9; j++) {
			layout = new GridBagConstraints();
			layout.gridx = i;
			layout.gridy = j + 1;
			
			int x = 0; int y = 0;
			
			if (sCounter % 9 == 2 || sCounter % 9 == 5) {
				x = 10;
				}
			if(sCounter >= 18 &&  sCounter <= 26 || sCounter >= 45 &&  sCounter <= 53) {
				y = 10;
			}
			
			layout.insets = new Insets(0 ,0 ,x ,y );
			
			sCounter++;
			sudokuPanelBoard.add(sudokuArray[i][j], layout);
		}
	}

//initial panel layouts defined here, panel layouts are changed throughout the program depending on what buttons are pushed
		
	//Components added to main sudoku panel here, main sudoku panel contains other sub-panels which are added and removed as buttons on it are pushed	
	
		//Components of sudoku menu panel added here
	
		layout = new GridBagConstraints();
		layout.gridx = 0;
		layout.gridy = 2;
		layout.insets = new Insets(5, 5, 5, 5);
		sudokuPanelMain.add(sudokuPanelMenu, layout); 
	
			layout = new GridBagConstraints();
			layout.gridx = 0;
			layout.gridy = 0;
			layout.insets = new Insets(15, 15, 15, 15);
			sudokuPanelMenu.add(solveB, layout);
		
			layout = new GridBagConstraints();
			layout.gridx = 1;
			layout.gridy = 0;
			layout.insets = new Insets(15, 15, 15, 15);
			sudokuPanelMenu.add(giveUpB, layout);
			
			layout = new GridBagConstraints();
			layout.gridx = 0;
			layout.gridy = 1;
			layout.insets = new Insets(15, 15, 15, 15);
			sudokuPanelMenu.add(helpB, layout);
			
			layout = new GridBagConstraints();
			layout.gridx = 1;
			layout.gridy = 1;
			layout.insets = new Insets(15, 15, 15, 15);
			sudokuPanelMenu.add(solveForMeB, layout);			
	
	//sudoku header panel is added here, it just contains the header of the puzzle
			
		layout = new GridBagConstraints();
		layout.gridx = 0;
		layout.gridy = 0;
		layout.insets = new Insets(5, 5, 5, 5);
		sudokuPanelMain.add(sudokuPanelHeader, layout); 
			
			layout = new GridBagConstraints();
			layout.gridx = 2;
			layout.gridy = 0;
			layout.insets = new Insets(5, 5, 5, 5);
			sudokuPanelHeader.add(sudokuHeader, layout);	
	
	//sudoku board panel added here, contains the 9x9 grid of textfields

		layout = new GridBagConstraints();
		layout.gridx = 0;
		layout.gridy = 1;
		sudokuPanelMain.add(sudokuPanelBoard, layout);
		
	//main menu panel and score panel are defined here
		
		layout = new GridBagConstraints();
		layout.gridx = 0;
		layout.gridy = 1;
		sudokuFinishPanel.add(goToMenuB, layout);	
	
		layout = new GridBagConstraints();
		layout.gridx = 0;
		layout.gridy = 0;
		layout.insets = new Insets(15, 15, 15, 15);
		menuPanel.add(startGameB, layout);	
	
		layout = new GridBagConstraints();
		layout.gridx = 0;
		layout.gridy = 1;
		layout.insets = new Insets(15, 15, 15, 15);
		menuPanel.add(viewScoresB, layout);
		
		layout = new GridBagConstraints();
		layout.gridx = 0;
		layout.gridy = 2;
		layout.insets = new Insets(15, 15, 15, 15);
		menuPanel.add(exitGameB, layout);
	
		layout = new GridBagConstraints();
		layout.gridx = 0;
		layout.gridy = 0;
		layout.insets = new Insets(15, 15, 15, 15);
		scorePanel.add(scoreDisplay, layout);
		
		layout = new GridBagConstraints();
		layout.gridx = 0;
		layout.gridy = 1;
		layout.insets = new Insets(15, 15, 15, 15);
		scorePanel.add(scoreBackB, layout);
		
		//this part adds the menu panel as the only panel initially in the frame
		layout = new GridBagConstraints();
		layout.gridx = 0;
		layout.gridy = 0;
		layout.insets = new Insets(5, 5, 5, 5);
		add(menuPanel);

	//various other sudoku main panel components are added here, these are mostly for subpanels added during certain events such as the help panels and the finish panel	
		
		layout = new GridBagConstraints();
		layout.gridx = 0;
		layout.gridy = 0;
		sudokuFinishPanel.add(finishDisplay, layout);
	
		layout = new GridBagConstraints();
		layout.gridx = 0;
		layout.gridy = 0;
		layout.insets = new Insets(5, 5, 5, 5);				
		sudokuHelpPanel1.add(helpHeader, layout);
		
		layout = new GridBagConstraints();
		layout.gridx = 0;
		layout.gridy = 1;
		layout.insets = new Insets(5, 5, 5, 5);				
		sudokuHelpPanel1.add(helpFieldX, layout);
		
		layout = new GridBagConstraints();
		layout.gridx = 1;
		layout.gridy = 1;
		layout.insets = new Insets(5, 5, 5, 5);				
		sudokuHelpPanel1.add(helpFieldY, layout);
		
		layout = new GridBagConstraints();
		layout.gridx = 1;
		layout.gridy = 2;
		layout.insets = new Insets(5, 5, 5, 5);				
		sudokuHelpPanel1.add(helpContinueB, layout);
		
		layout = new GridBagConstraints();
		layout.gridx = 0;
		layout.gridy = 0;
		layout.insets = new Insets(5, 5, 5, 5);
		sudokuHelpPanel2.add(helpDisplay, layout);
		
		layout = new GridBagConstraints();
		layout.gridx = 0;
		layout.gridy = 1;
		layout.insets = new Insets(5, 5, 5, 5);
		sudokuHelpPanel2.add(helpEndB, layout);		
		
//actions listeners defined here
		
//action listeners of menu panel buttons defined here				
		startGameB.addActionListener(//picks a random board from the presets, changes main panel from menuPanel to sudokuMainPanel
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{		
						GridBagConstraints layout = new GridBagConstraints();
						
						layout = new GridBagConstraints();
						layout.gridx = 0;
						layout.gridy = 0;
						layout.insets = new Insets(15, 15, 15, 15);
						sudokuPanelMenu.add(solveB, layout);
						
						layout = new GridBagConstraints();
						layout.gridx = 0;
						layout.gridy = 1;
						layout.insets = new Insets(15, 15, 15, 15);
						sudokuPanelMenu.add(helpB, layout);		

						resetBoard();
						mainBoard.setBoard(DefaultBoard.RandomBoard());
																		
						setBoard();
						
						remove(menuPanel);
						add(sudokuPanelMain);
						repaint();
						revalidate();
					}
				}
			);

		viewScoresB.addActionListener(//changes main panel from menuPanel to scorePanel
					new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{												
							scoreDisplay.setText("Wow! you have won " + user.getScore() + " Games!");									
							
							remove(menuPanel);
							add(scorePanel);
							repaint();
							revalidate();
						}
					}
				);

		exitGameB.addActionListener(//exit game button set here, closes the game
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{	
						dispose();
					}
				}
			);

//action listeners of sudokuMenuPanelButtons defined here
		
		solveB.addActionListener(//solve button autosolves the board and replaces the sudokuMenuPanel with the sudokuFinishPanel and increments user score if the solution was valid
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{	
						GridBagConstraints layout = new GridBagConstraints();
						
						try {//catches exception when a non-integer is entered into a textfield and the solve button is pushed
						
						if (testSolve() == true) {
							finishDisplay.setText("Good job, you solved the puzzle!");
							user.setScore();									
							
						} else {finishDisplay.setText("Sorry, that was an invalid solution"); }
						
						} catch (NumberFormatException nfe) {
							finishDisplay.setText("Sorry, that was an invalid solution");
						} 
																
						sudokuPanelMain.remove(sudokuPanelMenu);
						
						layout = new GridBagConstraints();
						layout.gridx = 0;
						layout.gridy = 2;
						layout.insets = new Insets(15, 15, 15, 15);
						sudokuPanelMain.add(sudokuFinishPanel, layout);
						
						repaint(); //repaint(); revalidate(); refresh the frame's display and are called whenever any changes are made to the GUI
						revalidate();
					}
				}
			);
		
		giveUpB.addActionListener(//exits panel without solving it, replaces sudokuPanelMain with menuPanel
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{																	
						remove(sudokuPanelMain);
						add(menuPanel);
						
						repaint();
						revalidate();
					}
				}
				);
		
		helpB.addActionListener(//replaces sudokuMenuPanel with sudokuHelpPanel1
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{	
						GridBagConstraints layout = new GridBagConstraints();
						
						sudokuPanelMain.remove(sudokuPanelMenu);
						
						layout = new GridBagConstraints();
						layout.gridx = 0;
						layout.gridy = 2;
						layout.insets = new Insets(5, 5, 5, 5);	
						sudokuPanelMain.add(sudokuHelpPanel1, layout);
						
						repaint();
						revalidate();
					}
				}
				);
		
		helpContinueB.addActionListener(//replaces sudokuHelpPanel1 with sudokuHelpPanel2 and runs movesRemaining on X/Y coordinate specified in X/Y textfields
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{	
						GridBagConstraints layout = new GridBagConstraints();
						
						sudokuPanelMain.remove(sudokuHelpPanel1);					
						
						try {//catches exception if non-integer is entered into X/Y textfields
						
						if (helpFieldX.getText() != "" && helpFieldY.getText() != "") {								
																
						int x = Integer.parseInt(helpFieldX.getText());
						int y = Integer.parseInt(helpFieldY.getText());
						
						if (x >= 1 && x <= 9 && y >= 1 && y <= 9) {
							testSolve();
							helpDisplay.setText(Help.movesRemaining(mainBoard, mainBoard.point[(x - 1)/3][(y - 1)/3].getSubboard(), mainBoard.point[x - 1][y - 1]));
						} else {
							helpDisplay.setText("That was an invalid value");
						}
						
						} else {
							helpDisplay.setText("That was an invalid value");
						}
						
						} catch (NumberFormatException nfe) {helpDisplay.setText("That was an invalid value");}
						
						layout = new GridBagConstraints();
						layout.gridx = 0;
						layout.gridy = 2;
						layout.insets = new Insets(5, 5, 5, 5);	
						sudokuPanelMain.add(sudokuHelpPanel2, layout);	
																					
						repaint();
						revalidate();
					}
				}
				);
		
		helpEndB.addActionListener(//replaces sudokuHelpPanel2 with sudokuMenuPanel
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{	
						GridBagConstraints layout = new GridBagConstraints();
						
						sudokuPanelMain.remove(sudokuHelpPanel2);
						
						helpFieldX.setText("");
						helpFieldY.setText("");
						
						layout = new GridBagConstraints();
						layout.gridx = 0;
						layout.gridy = 2;
						layout.insets = new Insets(5, 5, 5, 5);	
						sudokuPanelMain.add(sudokuPanelMenu, layout);	
						
						repaint();
						revalidate();
					}
				}
				);

		solveForMeB.addActionListener(//automatically solves the board and does not increase user score, temporarily removes help and solve options from sudokuMenuPanel
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{									
						
						solver.solve(mainBoard);
						setBoard();
						sudokuPanelMenu.remove(solveB);
						sudokuPanelMenu.remove(helpB);																
						
						repaint();
						revalidate();							
					}
				}
			);

		goToMenuB.addActionListener(//adds help and solve options back to sudokuMenuPanel and changes main panel from sudokuMainPanel to menuPanel
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{	
						GridBagConstraints layout = new GridBagConstraints();
						
						remove(sudokuPanelMain);
						add(menuPanel);
						repaint();
						revalidate();
						
						layout = new GridBagConstraints();
						layout.gridx = 0;
						layout.gridy = 0;
						layout.insets = new Insets(15, 15, 15, 15);
						sudokuPanelMenu.add(solveB, layout);
						
						layout = new GridBagConstraints();
						layout.gridx = 0;
						layout.gridy = 1;
						layout.insets = new Insets(15, 15, 15, 15);
						sudokuPanelMenu.add(helpB, layout);
						
						sudokuPanelMain.remove(sudokuFinishPanel);

						layout = new GridBagConstraints();
						layout.gridx = 0;
						layout.gridy = 2;
						layout.insets = new Insets(15, 15, 15, 15);
						sudokuPanelMain.add(sudokuPanelMenu, layout);
						
					}
				}
			);
			
//all other action listeners defined here				
				scoreBackB.addActionListener(//changes main panel from scorePanel to menuPanel
						new ActionListener()
						{
							public void actionPerformed(ActionEvent e)
							{	
								remove(scorePanel);
								add(menuPanel);
								repaint();
								revalidate();
							}
						}
					);
				}

//sets the board to the selected setup
public void setBoard() {
	
	for(int i = 0; i < 9; i++) {
		for(int j = 0; j < 9; j++) {						
			
			//0 on the sudoku board is an emtpy space, anything not zero makes the textfield non-editable and displays the number			
			if (mainBoard.point[i][j].getValue() == 0) {
				sudokuArray[i][j].setText("");
				sudokuArray[i][j].setEditable(true);
				sudokuArray[i][j].setFont(sFont);
				sudokuArray[i][j].setPreferredSize(new Dimension(35, 35));
				sudokuArray[i][j].setHorizontalAlignment(JTextField.CENTER);
				
			} else if (mainBoard.point[i][j].getValue() != 0) {
				sudokuArray[i][j].setFont(sFont2);
				sudokuArray[i][j].setPreferredSize(new Dimension(35, 35));
				sudokuArray[i][j].setHorizontalAlignment(JTextField.CENTER);
				sudokuArray[i][j].setEditable(false);
				String string = String.valueOf(mainBoard.point[i][j].getValue());
				sudokuArray[i][j].setText(string);				
			}
		}
	}			
}

//resets every space on the board to zero which
public void resetBoard() {
	for(int i = 0; i < 9; i++) {
		for(int j = 0; j < 9; j++) {						
			mainBoard.point[i][j].setValue(0);			
			}
		}
}

//tests to see if entries in textfields are a valid solution
public boolean testSolve() {		
	for(int i = 0; i < 9; i++) {
		System.out.println();
		for(int j = 0; j < 9; j++) {		
	
	if(sudokuArray[i][j].getText().isEmpty() == true) { 
		
		mainBoard.point[i][j].setValue(0);		
		
	} else if (sudokuArray[i][j].getText().isEmpty() == false) {
			mainBoard.point[i][j].setValue(0);
			mainBoard.point[i][j].setValue(Integer.parseInt(sudokuArray[i][j].getText()));											
				}	
		}
}
	if (mainBoard.valid() == true) {
		System.out.println("Solved");
		return true;	
	}
return false;
	}		
}


