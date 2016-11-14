Bowling Scorekeeper
===
The objective is to develop an application that can calculate the score of a single bowling game. There is no graphical user interface. You work only with objects and JUnit test cases in this assignment. You won’t need a main method.

Project Template:
You are provided with a project template that contains three classes: Frame, BowlingGame and BowlingException. The template contains some fields and methods. You may add additional fields and methods. However, DO NOT CHANGE the names of the existing fields and methods. Also, the parameters and the return types of the methods in the template SHOULD NOT BE CHANGED. 
Your program should throw BowlingException in all error situations. 

The game consists of 10 frames as shown below.  In each frame the player has two opportunities to knock down 10 pins.  The score for the frame is the total number of pins knocked down, plus bonuses for strikes and spares.

A spare is when the player knocks down all 10 pins in two throws.  The bonus for that frame is the number of pins knocked down by the next throw.  So in frame 3 of the example game below, the score is 10 (the total number knocked down) plus a bonus of 5 (the number of pins knocked down on the next throw.)

A strike is when the player knocks down all 10 pins on his first try.  The bonus for that frame is the value of the next two throws. 

In the tenth frame, a player who rolls a spare or strike is allowed to have bonus throws to complete the frame.  However, no more than three balls can be rolled in tenth frame.

![BSK](http://snappyimages.nextwavesrl.netdna-cdn.com/img/fc6a24b4e90cd51040712116c3e87f4e.png)
