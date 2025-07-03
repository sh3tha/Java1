public class mirror {
    double size;        
    String shape;
    boolean isFoggy;

    public static void main(String[] args) {
        mirror myMirror = new mirror(24.0, "Round", true);
        myMirror.reflect();   
        myMirror.defog();      
        myMirror.clean(); 
    }

    public mirror(double size, String shape, boolean isFoggy) {
        this.size = size;
        this.shape = shape;
        this.isFoggy = isFoggy;
    }

    public void reflect() {
        if (isFoggy) {
            System.out.println("The mirror is too foggy to reflect.");
        } else {
            System.out.println("You see your reflection in the " + size + " inch " + shape + " mirror.");
        }
    }

    public void clean() {
        if (isFoggy) {
            isFoggy = false;
            System.out.println("You cleaned the mirror. It is now clear.");
        } else {
            System.out.println("The mirror is already clean.");
        }
    }

   
    public void defog() {
        if (isFoggy) {
            isFoggy = false;
            System.out.println("Defogged the mirror. Visibility restored.");
        } else {
            System.out.println("Mirror is already clear.");
        }
    }
}