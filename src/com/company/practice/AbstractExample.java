package com.company.practice;

import java.util.ArrayList;

public class AbstractExample {

    abstract static class translate{
        abstract void doTranslate();
    }

    static class EnglishTranslate extends translate{
        @Override
        void doTranslate() {
            System.out.println("English");
        }
    }

    static class KoreanTranslate extends translate{
        @Override
        void doTranslate() {
            System.out.println("Korean");
        }
    }

    public static void main(String[] args) {
        ArrayList<translate> translates = new ArrayList<>();
        translates.add(new KoreanTranslate());
        translates.add(new EnglishTranslate());

        for(translate t : translates)
            t.doTranslate();
    }
}
