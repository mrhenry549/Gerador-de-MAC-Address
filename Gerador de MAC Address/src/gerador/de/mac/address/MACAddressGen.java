package gerador.de.mac.address;

public class MACAddressGen {
    
    public static void main(String[] args) {
    /*Random rand = new Random();
    byte[] macAddr = new byte[6];
    rand.nextBytes(macAddr);

    macAddr[0] = (byte)(macAddr[0] & (byte)254);  //zeroing last 2 bytes to make it unicast and locally adminstrated

    StringBuilder sb = new StringBuilder(18);
    for(byte b : macAddr){

        if(sb.length() > 0)
            sb.append(":");

        sb.append(String.format("%02x", b));
    }
    
    System.out.println(sb.toString());*/
    
    Gerador g = new Gerador();
    }
}
