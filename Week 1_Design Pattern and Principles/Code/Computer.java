public class Computer {
    private String CPU;
    private String RAM;
    private String Storage;

    private Computer(Builder builder)
    {
        this.CPU=builder.CPU;
        this.RAM=builder.RAM;
        this.Storage=builder.Storage;
    }


    public static class Builder
    {
        private String CPU;
        private String RAM;
        private String Storage;

        public Builder setCPU(String CPU)
        {
            this.CPU=CPU;
            return this;
        }
        public Builder setRAM(String RAM)
        {
            this.RAM=RAM;
            return this;
        }
        public Builder setStorage(String Storage)
        {
            this.Storage=Storage;
            return this;
        }
        public Computer Build()
        {
            return new Computer(this);
        }
    }

    public void display()
    {
        System.out.println("Configurations are given below...");
        System.out.println("Processor is..."+CPU);
        System.out.println("Graphics card is..."+RAM);
        System.out.println("Hard disk is..."+Storage);
    }
}
