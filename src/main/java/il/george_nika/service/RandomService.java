package il.george_nika.service;

import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Created by George on 16.06.2017.
 */
@Service
public class RandomService {

    private Random random  = new Random();

    public int getRandom(int bound) {
        return random.nextInt(bound);
    }
}
