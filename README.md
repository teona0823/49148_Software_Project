# 💻 Software Project (49148) - Assignment
## 🎯 Project Goal
Implementing Pawn's Movement with Java.

## 🕰️ Period
2024 Spring Semester

May. 10th. 2024 (Wed) ~ Jun. 12th. 2024 (Wed)

## ✔️ Rule of Chess
- A chess board is a board of fixed size, **8x8**, where each square initially contains an whitespace (" ").
- Chess pieces include King, Queen, Rook, Bishop, Knight, and Pawn, totaling six types.
- For this activity, we attempt to implement only the Pawn class. (You may create other piece classes if you want!)

## ⚙️ Functions
There are 3 classes (ChessBoardUI, Pawn, Main) and 1 interface (ChessPiece).

### 1. Code structure and implementation details
- The **Pawn class** implements the **ChessPiece interface**.
- **```setPosition()```**: Places a piece at a specific coordinate (x,y).
- **```getPossibleMoves()```**: Returns the coordinates to which the piece can move.
- **```checkMovable()```**: Verifies if there are no other pieces at the specified location, thus confirming the move's feasibility.
- **```move()```**: Moves the piece to the target coordinate.

### 2. Pawn Class Implementation Details
- ```setPosition()```: At the start of the game, Pawns are placed at coordinates (6,0), (6,1), (6,2), (6,3), (6,4), (6,5), (6,6), and (6,7).
- ```getPossibleMoves()```: Pawns can only move forward, one square at a time. (Let’s ignore the rule allowing two squares on the first move and the rule for capturing diagonally in this activity.)
- ```checkMovable()```: Checks if there are no other pieces at the target coordinates.
- ```move()```: Moves the Pawn one square forward.

### 3. Output Result of Main.java
![image](https://github.com/teona0823/49148_Software_Project/assets/129267777/cb37e780-f019-44ae-b420-df11022b4028)

### 4. While doing the activity, refer to and utilize the followings:
- **Interface**
- **Parameter polymorphism**
