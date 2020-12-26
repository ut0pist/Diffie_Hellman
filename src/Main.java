public class Main {
    public static void main(String[] args) {

        User alice = new User();
        User bob = new User();
        User charlie = new User();

        Channel channel1 = new Channel(alice, bob);
        Channel channel2 = new Channel(alice, bob);
        Channel channel3 = new Channel(alice, bob);

    }
}
