package service;

public class PhaseService {
    // napisz metode która porownuje dwa stringi pod wzgledem dlugosci
    // sa 4 opcje:
    // 1 jest dluzszy, 2 jest dluzszy, sa takie same ale dluzsze niz 5, sa takie same
    public String compareStrings(String word, String word2) {
        if (word.length() > word2.length()) {
            return "word 1 is longer";
        } else if (word2.length() > word.length()) {
            return "word 2 is longer";
        }else{
            if(word.length()>5){
                return "the same longer than 5";
            }
            return "words is the same";
        }

    }
}
