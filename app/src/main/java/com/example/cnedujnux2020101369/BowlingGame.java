package com.example.cnedujnux2020101369;

public class BowlingGame {
    int pins[] = new int[21];

    int currentPinIndex = 0;

    public void roll(int pin) {
        pins[currentPinIndex++] = pin;
    }

    public int score() {
        int totalScore = 0;
        int strike_num = 0;

        for(int scoreIndex = 0;scoreIndex < pins.length;scoreIndex++)
        {
            totalScore += pins[scoreIndex];
            if(scoreIndex < 19)
            {
                if (isaSpare(scoreIndex)) {
                    totalScore += pins[scoreIndex + 2];

                }
                if (isaStrike(scoreIndex) && scoreIndex < 19 - strike_num )
                {
                    totalScore += pins[scoreIndex + 1];
                    totalScore += pins[scoreIndex + 2];
                    strike_num++;
                }
                if (scoreIndex >= 19 - strike_num)
                {
                    totalScore -= pins[scoreIndex+1];
                }

            }
        }
        return totalScore;
    }

    private boolean isaSpare(int scoreIndex) {
        return 10 == pins[scoreIndex] + pins[scoreIndex + 1];
    }
    private boolean isaStrike(int scoreIndex) {
        return 10 == pins[scoreIndex];
    }
}
