/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suhufc;

/**
 *
 * @author asus
 */
public class Suhufc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conversisuhu c = new Conversisuhu();
        Conversisuhu f = new Conversisuhu();
        c.setC(10);
        c.conversi("C2F");
        f.setF(20);
        f.conversi("F2C");
        
        System.out.println("*****************Conversi Suhu*******************");
        System.out.println("Suhu C = "+c.getC());
        System.out.println("Maka jika di conversi ke farenheit menjadi :");
        System.out.println("= (9x"+c.getC()+"/5)+32");
        System.out.println("="+c.getHASIL());
        System.out.println("\n\nSuhu c = "+f.getF());
        System.out.println("Maka jika di conversi ke celcius menjadi :");
        System.out.println("=(("+f.getF()+"-32)x5)/9");
        System.out.println("= "+f.getHASIL());
    }
}
