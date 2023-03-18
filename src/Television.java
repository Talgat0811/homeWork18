import java.util.Random;
import java.util.Scanner;

public class Television {
    private int currentChannel;
    private int maxChannels = 10;
    private Channel[] channels = {new Channel("Mtv"),
            new Channel("CTC"),
            new Channel("TV-3"),
            new Channel("RTR"),
            new Channel("ORT"),
            new Channel("KTRK"),
            new Channel("ELTR"),
            new Channel("2*2"),
            new Channel("Pyatnica"),
            new Channel("Nikelodion"),
            new Channel("Manas")};

    public Television(int currentChannel, int maxChannels) {
        this.currentChannel = currentChannel;
        this.maxChannels = maxChannels;
        Channel[] channels = new Channel[maxChannels];
        for (int i = 0; i < maxChannels; i++) {
            channels[i].setName(createNameChannel());
        }

    }

    public Television(int currentChannel) {
        this.currentChannel = currentChannel;
        getCurrentChannel();
    }

    public void nextChannnel() {
        this.currentChannel++;
        if(this.currentChannel>channels.length)
            setCurrentChannel(0);
        getCurrentChannel();
    }

    public void pervChannnel() {
        this.currentChannel--;
        if(this.currentChannel < 0)
            setCurrentChannel(10);
        getCurrentChannel();
    }

    public void choiseNumChannnel() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите цифрру канала: ");
        int choise = scn.nextInt();
        if (choise <= channels.length-1 && choise >= 0) {
            setCurrentChannel(choise);
            getCurrentChannel();
        }else {
            System.out.println("Введите число меньше " + (channels.length-1));
            choiseNumChannnel();
        }
    }

    public void getCurrentChannel() {
        System.out.printf("текуший канал (%d)  %s%n", this.currentChannel, channels[currentChannel].getName());
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    private String createNameChannel() {
        Random rnd = new Random();
        char[] name = new char[3];
        for (int i = 0; i < 3; i++) {
            name[i] = (char) rnd.nextInt(26);
        }
        String str = new String(name);
        return str;
    }

}
