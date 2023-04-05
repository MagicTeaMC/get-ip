package org.example.Main;

import java.net.*;
import java.io.*;

public class Main {
    public static void main(String [] args) {
        try {
            URL url_name = new URL("http://api.ipify.org");

            BufferedReader sc =
                    new BufferedReader(new InputStreamReader(url_name.openStream()));

            String ipAddress = "";

            ipAddress = sc.readLine().trim();
            System.out.println("Current IP address : " + ipAddress);
        } catch (Exception e) {
            System.out.println("Cannot execute URL. " + e.getMessage());
        }
    }
}
