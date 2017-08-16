package com.company;

/**
 * Created by User on 13/8/2560.
 */
public class FizzBuzz {
    int check;

    FizzBuzz(int check) {
        this.check = check;
    }


    public String checkNumber() {

        //boolean numberIsModByFive And numberIsModByThree = check % 5 And check %3 == 0
        if (numberIsModByFive(check) && numberIsModByThree(check)) {
            return "FizzBuzz";

        } else if (numberIsModByThree(check)) {
            return "Fizz";

        } else if (numberIsModByFive(check)) {
            return "Buzz";
        }
        return "" + check;
    }

    //boolean numberIsModByFive = check % 5 == 0;
    public boolean numberIsModByFive(int check) {
        return check % 5 == 0;
    }

    //boolean numberIsModByThree = check % 3 == 0;
    public boolean numberIsModByThree(int check) {
        return check % 3 == 0;
    }
}
