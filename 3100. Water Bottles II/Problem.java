class Prob {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int emptyBottel = 0;
        int BottelDrink = 0;
        
        while(numBottles > 0 || emptyBottel >= numExchange){
            if(numBottles > 0){
                BottelDrink += numBottles;
                emptyBottel += numBottles;
                numBottles = 0;
                continue;
            }
            
            if(emptyBottel >= numExchange){
                emptyBottel -= numExchange;
                numBottles++;
                numExchange++;
            }
        }
        return BottelDrink;
    }
}