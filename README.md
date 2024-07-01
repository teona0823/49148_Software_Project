# 💻 Software Project (49148) - Assignment
## 🎯 Project Goal
Implementing Pawn's Movement GUI with Java.

## 🕰️ Period
2024 Spring Semester

May. 10th. 2024 (Wed) ~ Jun. 12th. 2024 (Wed)

## ✔️ Rule of Chess
- A chess board is a board of fixed size, **8x8**, where each square initially contains an whitespace (" ").
- Chess pieces include King, Queen, Rook, Bishop, Knight, and Pawn, totaling six types.
- For this activity, we attempt to implement only the Pawn class. (You may create other piece classes if you want!)

## ⚙️ Code structure and implementation details
**1. ChessBoardUI**
- Constructor for ChessBoardUI
  - Set the title of the window to "Chess Game"
  - Ensure the application exits when the window is closed
  - Set the layout of the window to an 8x8 grid, suitable for a chessboard
  - Set the size of the window to 600x600 pixels
  - Make the window visible
  - **Hint**: use ```setTitle```, ```setDefaultCloseOperation```, ```setLayout```, ```setSize```, ```setVisible```
    
- ```initializeBoard()``` method - Method to initialize the chess board with pieces
  - Initialize the board with empty spaces (" ")
  - Place pawns on the board (Assign the string to the board in the same way as in activity 5)
  - Place other pieces on the board
    - Please refer to the execution result
      
- ```createUI()``` method – Method to create the chessboard UI
  - Create the chess board UI
    - Set the color of the squares
    - Add ActionListener to each button
      
- ```updateUI()``` method - Method to update the UI based on the current state of the board
  - set text (board) on the board (squares)
  - **Hint**: use ```setText```

**2. ButtonListener**
- ButtonListener should implement ActionListener.
- Constructor for ButtonListener
  - Initializes the x and y values

- actionPerformed method - Called when the button is clicked
  - **Piece movement logic**
    - Implement the logic to move a piece (only pawn "P")
    - In this case, if the pawn ("P") is clicked, the pawn piece will be moved
      - Checks if the pawn can move one square forward, and if possible, moves it.

  - **Update UI**: After moving the piece, updates the chessboard UI. (use updateUI method of ChessBoardUI class)

## 🖨️ Output Result of Main.java
![image](https://github.com/teona0823/49148_Software_Project/assets/129267777/12ffd517-e7cb-4f61-8add-39ac87121293)
**Initialized ChessBoardUI**

![image](https://github.com/teona0823/49148_Software_Project/assets/129267777/1be693b3-8bb1-409f-8573-d108b0804847)
**After moving pawn pieces**

## ✔️ While doing the activity, refer to and utilize the followings:
- **Practice reading the java documentation.**
- **importing external libraries and modules**
- **inheritance**
- **implementation**
- **static**
