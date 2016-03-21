package effectivejava.creating_and_destroying_objects.use_enum_for_singleton;

public enum Elvis {
    INSTANCE;

    public void leaveTheBuilding() {
	System.out.println("Whoa baby, I'm outta here!");
    }

    // This code would normally appear outside the class!
    public static void main(String[] args) {
	Elvis elvis = Elvis.INSTANCE;
	elvis.leaveTheBuilding();
    }
}
