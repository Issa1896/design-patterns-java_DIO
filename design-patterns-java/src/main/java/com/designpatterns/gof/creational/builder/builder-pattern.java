// Pacote para o padrão Builder
package com.designpatterns.gof.creational.builder;

/**
 * Exemplo do Padrão Builder implementando a construção de um computador
 */

// Produto complexo
class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private String gpu;
    private String motherboard;
    private boolean hasBluetooth;
    private boolean hasWifi;
    private String powerSupply;

    // Getter methods
    public String getCpu() { return cpu; }
    public String getRam() { return ram; }
    public String getStorage() { return storage; }
    public String getGpu() { return gpu; }
    public String getMotherboard() { return motherboard; }
    public boolean hasBluetooth() { return hasBluetooth; }
    public boolean hasWifi() { return hasWifi; }
    public String getPowerSupply() { return powerSupply; }

    // Package-private setter methods used by the builder
    void setCpu(String cpu) { this.cpu = cpu; }
    void setRam(String ram) { this.ram = ram; }
    void setStorage(String storage) { this.storage = storage; }
    void setGpu(String gpu) { this.gpu = gpu; }
    void setMotherboard(String motherboard) { this.motherboard = motherboard; }
    void setHasBluetooth(boolean hasBluetooth) { this.hasBluetooth = hasBluetooth; }
    void setHasWifi(boolean hasWifi) { this.hasWifi = hasWifi; }
    void setPowerSupply(String powerSupply) { this.powerSupply = powerSupply; }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", gpu='" + gpu + '\'' +
                ", motherboard='" + motherboard + '\'' +
                ", hasBluetooth=" + hasBluetooth +
                ", hasWifi=" + hasWifi +
                ", powerSupply='" + powerSupply + '\'' +
                '}';
    }
}

// Interface Builder
interface ComputerBuilder {
    ComputerBuilder setCpu(String cpu);
    ComputerBuilder setRam(String ram);
    ComputerBuilder setStorage(String storage);
    ComputerBuilder setGpu(String gpu);
    ComputerBuilder setMotherboard(String motherboard);
    ComputerBuilder setHasBluetooth(boolean hasBluetooth);
    ComputerBuilder setHasWifi(boolean hasWifi);
    ComputerBuilder setPowerSupply(String powerSupply);
    Computer build();
}

// Implementação Concreta do Builder
class ConcreteComputerBuilder implements ComputerBuilder {
    private Computer computer = new Computer();

    @Override
    public ComputerBuilder setCpu(String cpu) {
        computer.setCpu(cpu);
        return this;
    }

    @Override
    public ComputerBuilder setRam(String ram) {
        computer.setRam(ram);
        return this;
    }

    @Override
    public ComputerBuilder setStorage(String storage) {
        computer.setStorage(storage);
        return this;
    }

    @Override
    public ComputerBuilder setGpu(String gpu) {
        computer.setGpu(gpu);
        return this;
    }

    @Override
    public ComputerBuilder setMotherboard(String motherboard) {
        computer.setMotherboard(motherboard);
        return this;
    }

    @Override
    public ComputerBuilder setHasBluetooth(boolean hasBluetooth) {
        computer.setHasBluetooth(hasBluetooth);
        return this;
    }

    @Override
    public ComputerBuilder setHasWifi(boolean hasWifi) {
        computer.setHasWifi(hasWifi);
        return this;
    }

    @Override
    public ComputerBuilder setPowerSupply(String powerSupply) {
        computer.setPowerSupply(powerSupply);
        return this;
    }

    @Override
    public Computer build() {
        return computer;
    }
}

// Diretor - opcional, mas útil para construir objetos pré-configurados
class ComputerDirector {
    private ComputerBuilder builder;

    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }

    public Computer buildGamingComputer() {
        return builder.setCpu("Intel Core i9")
                .setRam("32GB DDR4