package Prep;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class FindingIPAddressOfMachine {
    //Program to find the IP Address of a machine
    public static void main(String[] args) {
        try{
            InetAddress ipAddr=InetAddress.getLocalHost();
            System.out.println("\nIP address of the machine:\n"+ipAddr.getHostAddress());
        }catch (UnknownHostException ex){
            ex.printStackTrace();
        }
    }
}
