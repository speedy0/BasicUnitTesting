package com.sparta.an;

public class FilmClassifications {
    static String availableClassifications(int ageOfViewer) {
        String result;
        if (ageOfViewer < 0){
            result = "The age provided is not a valid.";
        } else if (ageOfViewer < 8){
            result = "U films are available.";
        } else if (ageOfViewer < 12){
            result = "U & PG films are available.";
        }else if (ageOfViewer >= 12 && ageOfViewer < 15) {
            result = "U, PG & 12 films are available.";
        } else if (ageOfViewer >= 15 && ageOfViewer < 18) {
            result = "U, PG, 12 & 15 films are available.";
        } else {
            result = "All films are available.";
        }
        return result;
    }
}
