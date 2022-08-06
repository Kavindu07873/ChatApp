package lk.ijse.gdse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

 public class ServerApp {
    public static void main(String[] args) throws IOException {
            int PORT = 8000;

        ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.println(PORT);

        Socket LocalSocket = serverSocket.accept();

        System.out.println(LocalSocket.getPort());
        System.out.println(LocalSocket.getInetAddress());

        InputStreamReader inputStreamReader = new InputStreamReader(LocalSocket.getInputStream());
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String ClientMsg = bufferedReader.readLine();
        System.out.println(ClientMsg);
    }
}

