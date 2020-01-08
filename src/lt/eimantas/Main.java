package lt.eimantas;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Main object = new Main();
        //object.irasymasIFaila();
        object.atidarytiFaila();
        object.skaitymasIsFailo();

    }

    private String _failoVardas = "vardai.txt";
    private FileReader _in;
    private BufferedReader _bufferis;
    private Scanner _sc;
    private FileWriter _out;


    public void atidarytiFaila() {
        try {
            _in = new FileReader(_failoVardas);
            _bufferis = new BufferedReader(_in);
        } catch (Exception e) {
        }
    }


    public void skaitymasIsFailo() {
        try {
            String eilute = _bufferis.readLine();
            while (eilute != null) {
                System.out.println(eilute);
                eilute = _bufferis.readLine();
            }
            _bufferis.close();
            _in.close();
        } catch (Exception e) {
        }
    }


    public void irasymasIFaila() {
            System.out.println("Iveskite teksta ka rasysite i faila");
            System.out.println("parasius pabaiga irasymas bus nutrauktas");
            _sc = new Scanner(System.in);
            String tekstas = _sc.nextLine();
            try {
                _out = new FileWriter(_failoVardas);
                while (!tekstas.equals("pabaiga")) {
                    _out.write(tekstas);
                    _out.write('\n');
                    tekstas = _sc.nextLine();
                }
                _out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}