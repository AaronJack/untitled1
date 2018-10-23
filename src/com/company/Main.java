package com.company;

public class Main {

    public static void main(String[] args) {
        class Horse {
            public String getName(){
                return name;
            }
            public int getWeight(){
                return weight;
            }
        }
        class HorseBarn {
            private Horse[] spaces;
            public  int findHorseSpace(String name){
                for(int i = 0; i<spaces.length; i++){
                    if(spaces[i].equals(name)){
                        return i;
                    } else {
                        return 0;
                    }
                }
            }
        }

    }
}
