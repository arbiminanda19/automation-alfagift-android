package helper;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class randomFunction {

    public String getNumberType() {

        List<String> givenList = Arrays.asList("Phone", "Member");
        Random rand = new Random();
        String numberType = givenList.get(rand.nextInt(givenList.size()));

        return numberType;
    }

}
