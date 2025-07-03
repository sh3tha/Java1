public class glasses {
    String lensType;
    String frameColor;
    boolean isWorn;

    public static void main(String[] args) {
        glasses myGlasses = new glasses("Prescription", "Black", false);
        myGlasses.cleanLenses();  
        myGlasses.wear();         
        myGlasses.remove();      
    }

    public glasses(String lensType, String frameColor, boolean isWorn) {
        this.lensType = lensType;
        this.frameColor = frameColor;
        this.isWorn = isWorn;
    }

    public void wear() {
        if (isWorn) {
            System.out.println("You are already wearing the glasses.");
        } else {
            isWorn = true;
            System.out.println("You put on the " + frameColor + " " + lensType + " glasses.");
        }
    }

    public void remove() {
        if (!isWorn) {
            System.out.println("You're not wearing the glasses.");
        } else {
            isWorn = false;
            System.out.println("You removed the glasses.");
        }
    }

    public void cleanLenses() {
        System.out.println("You cleaned the lenses of your " + frameColor + " " + lensType + " glasses.");
    }
}
