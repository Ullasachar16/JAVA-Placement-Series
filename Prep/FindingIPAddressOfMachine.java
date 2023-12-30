package Prep;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class FindingIPAddressOfMachine {
    //Program to Find the IP Address of a Machine
    public static void main(String[] args) {
        try{
            InetAddress ipAddr=InetAddress.getLocalHost();
            System.out.println("\nIP Address of the machine:\n"+ipAddr.getHostAddress());
        }catch (UnknownHostException ex){
            ex.printStackTrace();
        }
    }
}
