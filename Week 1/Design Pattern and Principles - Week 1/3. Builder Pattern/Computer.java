package builderpattern;
public class Computer {
    
    private String CPU;
    private String RAM;
    private String storage;
    private boolean graphicsCard;  
    private boolean bluetooth;    

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.bluetooth = builder.bluetooth;
    }

    public String getCPU() { return CPU; }
    public String getRAM() { return RAM; }
    public String getStorage() { return storage; }
    public boolean hasGraphicsCard() { return graphicsCard; }
    public boolean hasBluetooth() { return bluetooth; }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + storage +
               ", GraphicsCard=" + graphicsCard + ", Bluetooth=" + bluetooth + "]";
    }
    
    public static class Builder {
        private String CPU;
        private String RAM;
        private String storage;
        private boolean graphicsCard;
        private boolean bluetooth;
       
        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this; 
        }
      
        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(boolean graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }
  
        public Builder setBluetooth(boolean bluetooth) {
            this.bluetooth = bluetooth;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
