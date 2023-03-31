package bai1;

import java.io.*;
public class Main {
    public static void main(String[] args) {
        String SOURCE="/Users/hai/Desktop/MD3/bai16_baiTap/src/bai1/source.txt";
        String TARGET="/Users/hai/Desktop/MD3/bai16_baiTap/src/bai1/target.txt";
        try {
            FileReader file=new FileReader(SOURCE);
            FileWriter fileWriter=new FileWriter(TARGET);
            BufferedReader br=new BufferedReader(file);
            BufferedWriter bw=new BufferedWriter(fileWriter);
            String line = "";
            while ((line = br.readLine())!=null){
                bw.write(line + "\r");
//                bw.newLine();
            }
            bw.close();
            br.close();
        }catch (Exception e){
            System.err.println("file k ton tai");
        }
    }
}
