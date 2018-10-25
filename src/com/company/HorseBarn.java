public class HorseBarn {
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
    public void consolidate(Horse[] spaces){
        int[] empties;
        for(int i = 0; i<spaces.length; i++){
            if(i = ""){
                empties.add(i);
            }
        }
    }
}