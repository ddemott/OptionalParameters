import java.util.Optional;

public class Computer {
    Optional<SoundCard> soundCard;

    public static void main(String[] args) {
        USB usb = new USB();
        Optional<USB> optionalUSB = Optional.ofNullable(usb);
        optionalUSB.ifPresent(System.out::println);

        if (optionalUSB.isPresent()) {
            System.out.println("Found USB");
        }
    }
}
