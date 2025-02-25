
# 🏆 Tic-Tac-Toe with AI

Welcome to the **Tic-Tac-Toe AI Game**! This project is a **Java-based** implementation of the classic Tic-Tac-Toe game, featuring an **AI opponent** with three difficulty levels: **Easy**, **Medium**, and **Hard**. The "Hard" mode utilizes the **Minimax algorithm**, making the AI **unbeatable**. 

The game features a **graphical user interface (GUI) built with JavaFX and styled with CSS** for a modern look and smooth gameplay.

---


To incorporate the details from the screenshot and the technologies used (Java 17, JavaFX, and CSS) into your `README.md` file, you can update it as follows:

```markdown
# Tic-Tac-Toe with AI

Welcome to the Tic-Tac-Toe game with an unbeatable AI! This project is a Java implementation of the classic Tic-Tac-Toe game,
featuring an AI opponent with three difficulty levels: **Easy**, **Medium**, and **Hard**. The "Hard" difficulty uses the **Minimax algorithm** to ensure the AI is unbeatable.
The game features a graphical user interface (GUI) built with **JavaFX** and styled with **CSS**.

## Features

- **Three Difficulty Levels**:
   - **Easy**: The AI makes random moves.
   - **Medium**: The AI uses basic rules to make decisions.
   - **Hard**: The AI uses the Minimax algorithm to make optimal moves, making it unbeatable.

- **Interactive Gameplay**: Play against the AI in a visually appealing GUI.

- **Customizable Board**: The game is played on a standard 3x3 grid with a modern design.

- **Restart Option**: Easily restart the game at any time.


## How to Play

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/tic-tac-toe-ai.git
   cd tic-tac-toe-ai
   ```

2. Compile and run the game:
   ```bash
   javac --module-path /path/to/javafx-sdk-XX/lib --add-modules javafx.controls,javafx.fxml TicTacToe.java
   java --module-path /path/to/javafx-sdk-XX/lib --add-modules javafx.controls,javafx.fxml TicTacToe
   ```

   Replace `/path/to/javafx-sdk-XX` with the actual path to your JavaFX SDK and `XX` with the version number.

3. Follow the on-screen instructions to select the difficulty level and make your moves.

## Tic-Tac-Toe Board View
[![Tic-Tac-Toe Board View](src/main/resources/assets/Screenshot%20from%202025-02-25%2012-23-46.png)](src/main/resources/assets/Screenshot%20from%202025-02-25%2012-23-46.png)

## Difficulty Levels

- **Easy**: The AI selects random empty spots on the board. Perfect for beginners.
- **Medium**: The AI uses basic logic to block your wins and attempt to win.
- **Hard**: The AI uses the Minimax algorithm to always make the best possible move, ensuring it never loses.

## Minimax Algorithm

The "Hard" difficulty uses the **Minimax algorithm**, a recursive algorithm used for decision-making in game theory. It explores all possible moves and assumes the opponent will also play optimally. This ensures the AI always makes the best move to either win or force a draw.

## Technologies Used

- **Java 17**: The core programming language used for the game logic and AI.
- **JavaFX**: For building the graphical user interface.
- **CSS**: For styling the GUI components.


## Requirements

- **Java 17**: Ensure you have Java 17 or later installed on your system.
- **JavaFX SDK**: Download and configure the JavaFX SDK for your system.

To check your Java version:
```bash
java -version
```

If you don't have Java 17 installed, you can download it from the [official Oracle website](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) or use an open-source alternative like [OpenJDK](https://openjdk.org/).


## Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/YourFeatureName`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature/YourFeatureName`).
5. Open a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## References



For any inquiries, please contact Shasidu Malshan at [My Gmail](mailto:shasidumalshan9579@gmail.com).
