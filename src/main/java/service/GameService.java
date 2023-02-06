package service;

import service.fizzBuzz.FizzBuzz;
import service.helper.ConfigurationLoader;

import java.lang.reflect.Array;

public class GameService {

    public Object[] play(){
        int arraySize = ConfigurationLoader.getUpperLimit();
        Object[] result = new Object[arraySize];
        FizzBuzz fizzBuzz = new FizzBuzz();
        for(int i = 0; i < arraySize; i++){
            result[i] = fizzBuzz.playWithNumber(i+1);
        }
        return result;
    }
}
