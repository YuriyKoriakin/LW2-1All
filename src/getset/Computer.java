package getset;

/**
 * Created by Yuriy on 15.02.2016.
 */
public class Computer {
    private String manufacturer;//проводимо інкапсуляцію LW2-1-2
    private int serialNumber;
    private float price;
    private int quantityCPU;
    private int frequencyCPU;

    //ми оголосили клас та описали необхідні поля LW2-1-1

       //Getters & Setters

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }

    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }

    public int getFrequencyCPU() {
        return frequencyCPU;
    }

    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }
    public void view() {
        System.out.println(
                "FrequencyCPU is: " + getFrequencyCPU() +
                        "/ Manufacturer by: " + getManufacturer() +
                        "/ Price is: " + getPrice() +
                        "/ QuantityCPU are: " + getQuantityCPU() +
                        "/ SerialNumber is: " + getSerialNumber());
    }



}

