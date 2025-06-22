package builderpattern;
public class BuilderTest {
    public static void main(String[] args) {
        // Build a computer with all options
        Computer gamingPC = new Computer.Builder()
            .setCPU("Intel i9")
            .setRAM("32GB")
            .setStorage("1TB SSD")
            .setGraphicsCard(true)
            .setBluetooth(true)
            .build();

        System.out.println(gamingPC);

        // Build a basic computer with only CPU and RAM
        Computer officePC = new Computer.Builder()
            .setCPU("Intel i5")
            .setRAM("8GB")
            .build();

        System.out.println(officePC);
    }
}
