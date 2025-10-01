class Problem {
    public int numWaterBottles(int numBottles, int numExchange) {
        int empty = numBottles;
        while (empty >= numExchange) {
            numBottles += empty / numExchange;
            empty = empty % numExchange + empty / numExchange;
        }
        return numBottles;
    }
}