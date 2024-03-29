package com.ganesh.basic.advance.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(5000)){
            while(true){
                Socket socket  = serverSocket.accept();
                System.out.println("Client Connected");
                BufferedReader input = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));
                PrintWriter output = new PrintWriter(socket.getOutputStream(),true);
                String echoString = input.readLine();
                if(echoString.equals("exit")){
                    break;
                }
                output.println("Echo From Server: "+echoString);
            }
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("Server Exception " + e.getMessage());
        }

    }
}
