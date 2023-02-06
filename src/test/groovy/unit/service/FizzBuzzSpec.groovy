package unit.service

import service.fizzBuzz.FizzBuzz
import spock.lang.Specification

class FizzBuzzSpec extends Specification{
    def fizzBuzz = new FizzBuzz()
    def "Output Fizz when a multiple of 3 is provided"(){
        when: "play with a number"
            def output = fizzBuzz.playWithNumber(num)
        then: "output Fizz"
            assert output == "Fizz"
        where: "a number divisible by 3"
            num << [3, 6, 9]
    }

    def "Output Buzz when a multiple of 5 is provided"(){
        when: "play with a number"
            def output = fizzBuzz.playWithNumber(num)
        then: "output Buzz"
            assert output == "Buzz"
        where: "a number divisible by 5"
            num << [5, 10]
    }

    def "Output the number itself when neither a multiple of 5 nor 3 is provided"(){
        when: "play with a number"
            def output = fizzBuzz.playWithNumber(num)
        then: "output number"
            assert output == output
        where: "a number not divisible by 5 or 3"
            num << [1, 2, 4, 7, 8]
    }
}
