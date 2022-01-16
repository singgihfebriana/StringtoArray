package proyek_latihan;

/**
 *
 * @author singg
 */
public class toCharArray {
    public static void main(String[]args){
        String nama="abcdefghijklmnopqrstuvwxyz";
        char[]temp=new char[nama.length()];
        temp=nama.toCharArray();
        for(int i=0;i<=temp.length;i++){
        System.out.println("Kata ke "+i+" "+temp[i]);
        }
    }
    
}
