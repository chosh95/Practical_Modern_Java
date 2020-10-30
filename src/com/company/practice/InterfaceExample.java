package com.company.practice;

import java.util.ArrayList;

public class InterfaceExample {

    interface translate{
        void doTranslate();
    }

    static class KoreanTranslate implements translate{
        @Override
        public void doTranslate() {
            System.out.println("한국어 번역");
        }
    }
    static class EnglishTranslate implements translate{
        @Override
        public void doTranslate() {
            System.out.println("English translate");
        }
    }

    public static void main(String[] args) {
        ArrayList<translate> translates = new ArrayList<>();
        translates.add(new KoreanTranslate());
        translates.add(new EnglishTranslate());
        translates.add(new KoreanTranslate());

        for(translate t : translates)
            t.doTranslate();
    }
}
