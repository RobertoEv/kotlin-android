package com.example.roberto.startup

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()
    var activePlayer = 1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    protected fun buttonClick(view: View) {

        val buttonSelected = view as Button
        var cellId = 0
        when (buttonSelected.id) {
            R.id.button1 -> cellId = 1
            R.id.button2 -> cellId = 2
            R.id.button3 -> cellId = 3
            R.id.button4 -> cellId = 4
            R.id.button5 -> cellId = 5
            R.id.button6 -> cellId = 6
            R.id.button7 -> cellId = 7
            R.id.button8 -> cellId = 8
            R.id.button9 -> cellId = 9
        }

        playGame(cellId, buttonSelected)
        autoPlay()
    }

    fun playGame(cellId: Int, buttonSelected: Button) {

        if (activePlayer == 1) {
            buttonSelected.text = "X"
            buttonSelected.setBackgroundResource(R.color.blue)
            player1.add(cellId)
            activePlayer = 2
        } else {
            buttonSelected.text = "O"
            buttonSelected.setBackgroundResource(R.color.darkgreen)
            player2.add(cellId)
            activePlayer = 1
        }

        buttonSelected.isEnabled = false
        checkWinner()
    }

    fun checkWinner() {
        var winner = -1

        //Row 1
        if(player1.contains(1) && player1.contains(2) && player1.contains(3)){
            winner = 1
        }
        if(player2.contains(1) && player2.contains(2) && player2.contains(3)){
            winner = 2
        }

        //Row 2
        if(player1.contains(4) && player1.contains(5) && player1.contains(6)){
            winner = 1
        }
        if(player2.contains(4) && player2.contains(5) && player2.contains(6)){
            winner = 2
        }

        //Row 3
        if(player1.contains(7) && player1.contains(8) && player1.contains(9)){
            winner = 1
        }
        if(player2.contains(7) && player2.contains(8) && player2.contains(9)){
            winner = 2
        }

        //Calumn 1
        if(player1.contains(1) && player1.contains(4) && player1.contains(7)){
            winner = 1
        }
        if(player2.contains(1) && player2.contains(4) && player2.contains(7)){
            winner = 2
        }

        //Calumn 2
        if(player1.contains(2) && player1.contains(5) && player1.contains(8)){
            winner = 1
        }
        if(player2.contains(2) && player2.contains(5) && player2.contains(8)){
            winner = 2
        }

        //Calumn 3
        if(player1.contains(3) && player1.contains(6) && player1.contains(9)){
            winner = 1
        }
        if(player2.contains(3) && player2.contains(6) && player2.contains(9)){
            winner = 2
        }

        //Diagonal 1
        if(player1.contains(3) && player1.contains(5) && player1.contains(7)){
            winner = 1
        }
        if(player2.contains(3) && player2.contains(5) && player2.contains(7)){
            winner = 2
        }

        //Diagonal 2
        if(player1.contains(1) && player1.contains(5) && player1.contains(9)){
            winner = 1
        }
        if(player2.contains(1) && player2.contains(5) && player2.contains(9)){
            winner = 2
        }

        if (winner != -1) {
            if (winner == 1) {
                Toast.makeText(this, "Player 1 Win The Game", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Player 2 Win The Game", Toast.LENGTH_SHORT).show()
            }
        }

    }

    fun autoPlay() {
        var emptyCells = ArrayList<Int>()
        for (cellId in 1..9) {
            if ( !(player1.contains(cellId) || player2.contains(cellId))) {
                emptyCells.add(cellId)
            }
        }

        val r = Random()
        val randIndex = r.nextInt(emptyCells.size-0)+0
        val cellId = emptyCells[randIndex]

        var buttonSelect: Button?
        when(cellId) {
            1 -> buttonSelect = button1
            2 -> buttonSelect = button2
            3 -> buttonSelect = button3
            4 -> buttonSelect = button4
            5 -> buttonSelect = button5
            6 -> buttonSelect = button6
            7 -> buttonSelect = button7
            8 -> buttonSelect = button8
            9 -> buttonSelect = button9
            else -> buttonSelect = button1
        }

        playGame(cellId, buttonSelect)

    }

}
