package gerador.de.mac.address;

import java.util.Random;

public class Gerador {
    
    String[] hexadecimal, macValues;
    String macValue1, macValue2;
    int par1, par2;
    Random rand;
    
    public Gerador(){
        hexadecimal = new String[]{"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        macValues = new String[]{};
        rand = new Random();
        
        for(int i = 0; i < 6; i++){
            par1 = rand.nextInt(hexadecimal.length - 1);
            par2 = rand.nextInt(hexadecimal.length - 1);
            
            macValue1 = hexadecimal[par1];
            macValue2 = hexadecimal[par2];
            
            macValues[i] = macValue1+macValue2;
        }
        
        System.out.println("MAC Address gerado: "+macValues[0]+":"+macValues[1]+":"+macValues[2]+":"+macValues[3]+":"+macValues[4]+":"+macValues[5]);
    }
}
