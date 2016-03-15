package getset;

/**
 * Created by Yuriy on 26.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        Computer arr[] = new Computer[5];//створюємо масив з 5 елементів
        Computer computer1 = new Computer();//створюємо обєкти
        Computer computer2 = new Computer();
        Computer computer3 = new Computer();
        Computer computer4 = new Computer();
        Computer computer5 = new Computer();

        arr[0] = computer1;//присвоюємо кожному елементу масива обєкт
        arr[1] = computer2;
        arr[2] = computer3;
        arr[3] = computer4;
        arr[4] = computer5;

        computer1.setManufacturer("Asus");//встановлюємо значення кожного параметру вручну тому що як це зробити в циклі на жаль не розумію
        computer1.setSerialNumber(1255464565);
        computer1.setPrice(531.31f);
        computer1.setQuantityCPU(43);
        computer1.setFrequencyCPU(900);

        computer2.setManufacturer("Sony");
        computer2.setSerialNumber(943546579);
        computer2.setPrice(684.83f);
        computer2.setQuantityCPU(23);
        computer2.setFrequencyCPU(750);

        computer3.setManufacturer("Dell");
        computer3.setSerialNumber(533546578);
        computer3.setPrice(461.66f);
        computer3.setQuantityCPU(44);
        computer3.setFrequencyCPU(800);

        computer4.setManufacturer("Macy");
        computer4.setSerialNumber(88746578);
        computer4.setPrice(689.31f);
        computer4.setQuantityCPU(45);
        computer4.setFrequencyCPU(960);

        computer5.setManufacturer("Shar");
        computer5.setSerialNumber(15646578);
        computer5.setPrice(771.31f);
        computer5.setQuantityCPU(46);
        computer5.setFrequencyCPU(880);
//підіймаємо ціну на 10% використовуючи цикл
        float k;
        for (Computer incrPrice : arr) {
            k = incrPrice.getPrice();
            k = k * 1.1f;
            incrPrice.setPrice(k);
                   }
        //виводимо всі необхідні поля на консоль 2-1-5
        for (Computer iterate : arr) {
            iterate.view();
        }
           }
}

