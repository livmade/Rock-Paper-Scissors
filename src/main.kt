import kotlin.system.exitProcess

fun main(args: Array<String>) {
    println("Rock, Paper, Scissors, Shoot! \n")


    //variable to track wins, losses, and ties

    var wins: Int = 0
    var losses: Int = 0
    var ties: Int = 0

    // variables for computer
    val randomNumber = (1..3).random()
    var computerMove = "A"




    while (true) {
        println("Enter your move: (R)ock, (P)aper, (S)cissors or ('Q' to Quit): ")

        //player function of the game
        val playerInput = readLine().toString().toUpperCase()
        //Displays the players move; draws suspense!
        if (playerInput == "Q") {
            exitProcess(1)
            break
        }
        if (playerInput == "R") {
            print("ROCK versus... ")
        } else if (playerInput == "P") {
            print("PAPER versus... ")
        } else if (playerInput == "S") {
            print("SCISSORS versus... ")
        } else {
            println("Invalid character, try again: ")
            continue
        }

        //prints computer move
        if (randomNumber == 1) {
            computerMove = "R"
            print("ROCK!")
        } else if (randomNumber == 2) {
            computerMove = "P"
            print("PAPER!")
        } else if (randomNumber == 3) {
            computerMove = "S"
            print("SCISSORS!")
        }

        //Displays, then records wins/loss/tie
        if (playerInput == computerMove) {
            println("\n It's a tie!")
            ties += 1
        } else if (playerInput == "R" && computerMove == "S") {
            println("\n You win!")
            wins += 1
        } else if (playerInput == "P" && computerMove == "R") {
            println("\n You win!")
            wins += 1
        } else if (playerInput == "S" && computerMove == "P") {
            println("\n You win!")
            wins += 1
        } else if (playerInput == "R" && computerMove == "P") {
            println("\n You lose!")
            losses += 1
        } else if (playerInput == "P" && computerMove == "S") {
            println("\n You lose!")
            losses += 1
        } else if (playerInput == "S" && computerMove == "R") {
            println("\n You lose!")
            losses += 1
        }
        println("\n Wins: $wins, Losses: $losses, Ties: $ties \n")
        continue

    }
}





