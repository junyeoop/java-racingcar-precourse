package racingcar;

import java.util.Random;

public class NumberGenerator {
    private static NumberGenerator numberGenerator;
    private NumberGenerator() {

    }

    public static NumberGenerator getInstance() {
        if (numberGenerator == null) {
            numberGenerator = new NumberGenerator();
        }
        return numberGenerator;
    }
    public int createRandomGenerator(){
        Random random = new Random();
//        int randomNumber = random.nextInt(10);
        return random.nextInt(10);
    }
 }
