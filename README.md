# Tennis_Game
Write a class that can store a Tennis match’s current score.

It should be updatable by calling an update(…) function by passing the winner of the current serve as an argument.

The smallest atomic unit of a Tennis match is a point. Every tennis game is a series of points.

Points are organized into units called Games. A Game is won by any player who wins at least 4 points by a margin of at least 2. The scoring of a Game follows a progression of 15, 30, 40, and game. Due to the margin requirement, if both players reach 40, the game reaches a state known as “deuce.” Deuce can only be broken by any player winning two consecutive points. The player winning the point immediately after deuce is said to be at an “advantage.” If the same player wins the next point as well, the game is theirs; however, if the opponent wins, the game goes back to deuce.
