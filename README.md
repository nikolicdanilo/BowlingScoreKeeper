Bowling Scorekeeper
===
The objective is to develop an application that can calculate the score of a single bowling game.
- There is no graphical user interface.  
- You work only with objects and JUnit test cases in this assignment. 
- You won’t need a main method.

Project Template:
You are provided with a project template that contains three classes: `Frame`, `BowlingGame` and `BowlingException`. The template contains some fields and methods. You may add additional fields and methods. However, DO NOT CHANGE the names of the existing fields and methods. Also, the parameters and the return types of the methods in the template SHOULD NOT BE CHANGED. 
Your program should throw `BowlingException` in all error situations. 

The game consists of 10 frames as shown below. In each frame the player has two opportunities to knock down 10 pins. The score for the frame is the total number of pins knocked down, plus bonuses for strikes and spares.

A spare is when the player knocks down all 10 pins in two throws. The bonus for that frame is the number of pins knocked down by the next throw. So in frame 3 of the example game below, the score is 10 (the total number knocked down) plus a bonus of 5 (the number of pins knocked down on the next throw).

A strike is when the player knocks down all 10 pins on his first try. The bonus for that frame is the value of the next two throws. 

In the tenth frame, a player who rolls a spare or strike is allowed to have bonus throws to complete the frame. However, no more than three balls can be rolled in tenth frame.

![BSK](http://snappyimages.nextwavesrl.netdna-cdn.com/img/fc6a24b4e90cd51040712116c3e87f4e.png)

The preceding scorecard shows an example game. Each box shows a frame where the first row contain the number of pins knocked down in the first and second throws and the second row shows the game score at that point in time. (See further explanations below) 
-	In the first frame, the player knocked down 1 pin with the first throw and 4 more with the second. [1,4] denotes the pins knocked down in the first and second throw of the frame. The score of the frame is 1+4+5.
-	The score of the second frame ([4,5]) is 4+5=9. That makes the game score 14, the sum of the first two frame scores.
-	The third frame [6,4] is a spare. Frame score including the bonus points can not be calculated for this frame until the next ball is rolled. In the fourth frame [5, 5], 5 balls are knocked down in the first throw. So, the score of third frame is calculated as 10 + 5 = 15. 
-	Frame 5 [10, 0] is a strike. It’s score including the bonus points, after the next two throws can be calculated as 10 + 0 + 1 = 11.
-	Ninth frame is a strike. It’s score, after the next two throws can be calculated as 10 + 2 + 8 = 20.
-	The last frame [2,8] is a spare. Therefore, the game has one bonus throw. 6 pins are knocked down in bonus throw. So, the score of the last frame is 10 + 6 = 16.

**PLEASE TAKE THE QUESTIONNAIRE AT:** [https://goo.gl/forms/ToUMC5cqJVbRBcbk1](https://goo.gl/forms/ToUMC5cqJVbRBcbk1)
