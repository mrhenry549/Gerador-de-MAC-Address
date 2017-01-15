package gerador.de.mac.address;

import java.util.Random;

public class Gerador {

    Random rand;

    public Gerador() {
        rand = new Random();
        byte[] macAddr = new byte[6];
        rand.nextBytes(macAddr);

        macAddr[0] = (byte) (macAddr[0] & (byte) 254);

        StringBuilder MAC = new StringBuilder(18);
        for (byte b : macAddr) {

            if (MAC.length() > 0) {
                MAC.append(":");
            }

            MAC.append(String.format("%02x", b));
        }

        System.out.println(MAC.toString());
    }
}
