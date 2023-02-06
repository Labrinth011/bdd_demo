# A feature contains one or more scenarios. For simplicity, a feature with a single scenario is considered.
# Steps need to be implemented backing up the feature

Feature: Fizz-Buzz Game
    Scenario: User successfully plays Fizz-Buzz
        Given the user is logged in
        And start a fresh game
        When user plays 
        Then output a positive integer array of size 10
        And its' multiples of 3 are Fizz and multiples of 5 are Buzz