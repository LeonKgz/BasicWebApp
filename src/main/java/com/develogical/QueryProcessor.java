package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("against method")) {
            return "A 1975 book about the philosophy of science by Paul Feyerabend, in which the author argues that science is an anarchic enterprise, not a nomic (customary) one.[1] In the context of this work, the term anarchy refers to epistemological anarchy.";
        }
        if (query.toLowerCase().contains("what is your name")) {
                    return "Amor Fati";
        }
        return "";
    }
}
