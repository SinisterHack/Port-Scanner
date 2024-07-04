Sure, here is a detailed and proper README file for the Port Scanner project.

```markdown
# Port Scanner

## Description

This project is a simple Port Scanner implemented in Java. It scans a range of ports on a specified IP address to check which ports are open.

## Features

- Scans ports in the range 1-1024.
- Connects to each port and checks if it is open.
- Outputs the status of each port (open/closed).

## Usage

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/port-scanner.git
   cd port-scanner
   ```

2. Compile the Java code:
   ```bash
   javac PortScanner.java
   ```

3. Run the Port Scanner:
   ```bash
   java PortScanner <IP_ADDRESS>
   ```
   Replace `<IP_ADDRESS>` with the IP address you want to scan.

## Example

To scan the local machine:
```bash
java PortScanner 127.0.0.1
```

## Code Explanation

- **PortScanner.java**:
  - Imports necessary packages.
    ```java
    import java.net.Socket;
    import java.net.InetSocketAddress;
    ```
  - Main class and method to start the scanner.
    ```java
    public class PortScanner {
        public static void main(String[] args) {
            String ipAddress = args[0];
            scanPorts(ipAddress);
        }
    ```
  - Method to scan ports from 1 to 1024 and check if they are open.
    ```java
        public static void scanPorts(String ipAddress) {
            for (int port = 1; port <= 1024; port++) {
                try (Socket socket = new Socket()) {
                    socket.connect(new InetSocketAddress(ipAddress, port), 1000);
                    System.out.println("Port " + port + " is open.");
                } catch (Exception ex) {
                    // Port is closed or unreachable
                }
            }
        }
    }
    ```

## Dependencies

- Java Development Kit (JDK)

## Contributing

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -am 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Create a new Pull Request.

## License

This project is licensed under the MIT License.
```

This README file provides a comprehensive guide for users to understand, use, and contribute to the Port Scanner project. Feel free to adjust any details to better suit your project's specifics.
