public class Fish {
    private String fishName;
    private String typeOfFish;
    private int friendliness;

    // Constructor tanpa parameter
    public Fish() {
        this.fishName = "Unknown";
        this.typeOfFish = "Unknown";
        this.friendliness = 3;
    }

    // Constructor dengan parameter jenis dan keramahan
    public Fish(String typeOfFish, int friendliness) {
        this.fishName = "Unknown";
        this.typeOfFish = typeOfFish;
        this.friendliness = friendliness;
    }

    // Constructor untuk nama, jenis, dan keramahan ikan
    public Fish(String fishName, String typeOfFish, int friendliness) {
        this.fishName = fishName;
        this.typeOfFish = typeOfFish;
        this.friendliness = friendliness;
    }

    public String getFishName() {
        return fishName;
    }

    public void setFishName(String fishName) {
        this.fishName = fishName;
    }

    public String getTypeOfFish() {
        return typeOfFish;
    }

    public void setTypeOfFish(String typeOfFish) {
        this.typeOfFish = typeOfFish;
    }

    public int getFriendliness() {
        return friendliness;
    }

    public void setFriendliness(int friendliness) {
        this.friendliness = friendliness;
    }

    // Membandingkan dua ikan
    public static Fish nicestFish(Fish fish1, Fish fish2) {
        return fish1.getFriendliness() >= fish2.getFriendliness() ? fish1 : fish2;
    }

    // Variable argument method: menerima banyak ikan
    public static Fish nicestFish(Fish... fish) {
        if (fish == null || fish.length == 0) {
            throw new IllegalArgumentException("Minimal satu ikan harus diberikan.");
        }

        Fish temp = fish[0];
        for (int i = 1; i < fish.length; i++) {
            if (fish[i].getFriendliness() > temp.getFriendliness()) {
                temp = fish[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Fish amber = new Fish("Amber", "AngelFish", 5);
        Fish james = new Fish("James", "Guppy", 3);

        Fish nicest = nicestFish(amber, james);
        System.out.println("Ikan paling ramah: " + nicest.getFishName());
        System.out.println("Jenis: " + nicest.getTypeOfFish());
        System.out.println("Tingkat keramahan: " + nicest.getFriendliness());
    }
}
