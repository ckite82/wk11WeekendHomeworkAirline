public enum PlaneType {
    AIRBUS_A380(600,100),
    BOEING_737(400,40),
    CESSNA_182(4,8);

    // Bit like a property in a class!! its internal. final keyword like const
    public final int capacity;
    private final int totalWeight;

    // Like a constructor but not

    PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity(){
        return capacity;
    }
    public int getTotalWeight(){
        return totalWeight;
    }
}