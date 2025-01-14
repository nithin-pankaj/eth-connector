package hyperledger.besu.java.client.ethconnecter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** Bootstrap for the Eth-Connector application. */
@SpringBootApplication
public class EthConnectorApplication {
  public static void main(String[] args) {
    SpringApplication.run(EthConnectorApplication.class, args);
  }
}
