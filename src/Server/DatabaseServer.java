package Server;

import java.io.*;
import java.net.*;
import java.sql.*;

public class DatabaseServer {
    public static void main(String[] args) {
        int port = 12345; // Port number to listen on

        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server is running on port " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket.getInetAddress().getHostAddress());

                // Create a new thread to handle client requests
                ClientHandler clientHandler = new ClientHandler(clientSocket);
                clientHandler.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ClientHandler extends Thread {
    private Socket clientSocket;
    private Connection connection;

    public ClientHandler(Socket socket) {
        this.clientSocket = socket;
    }

    public void run() {
        try {
            // Connect to the database
            connectToDatabase();

            // Create input/output streams for communication with the client
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            // Read client requests and process them
            String request;
            while ((request = in.readLine()) != null) {
                String response = processRequest(request);
                out.println(response);
            }

            // Close the streams and the client socket
            in.close();
            out.close();
            clientSocket.close();
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        } finally {
            // Disconnect from the database
            try {
				disconnectFromDatabase();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }

    private void connectToDatabase() throws SQLException {
        String jdbcUrl = "jdbc:mysql://localhost:3306/appchat";
        String username = "root";
        String password = "";

        connection = DriverManager.getConnection(jdbcUrl, username, password);
        System.out.println("Connected to the database");
    }

    private void disconnectFromDatabase() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
            System.out.println("Disconnected from the database");
        }
    }

    private String processRequest(String request) throws SQLException {
        // Process the request based on the specific commands you want to support
        // Execute SQL queries or updates using the database connection
        // Return the appropriate response to the client

        // Example: Execute a SELECT query
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(request);

        // Process the result set and build the response
        StringBuilder response = new StringBuilder();
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();

        while (resultSet.next()) {
            for (int i = 1; i <= columnCount; i++) {
                response.append(resultSet.getString(i)).append("\t");
            }
            response.append("\n");
        }

        resultSet.close();
        statement.close();

        return response.toString();
    }
}

