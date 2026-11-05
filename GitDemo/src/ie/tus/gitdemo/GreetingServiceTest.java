package ie.tus.gitdemo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class GreetingServiceTest {
 @Test
 void testGreeting() {
 GreetingService service = new GreetingService();
 String result = service.getGreeting("SARA");
 assertEquals("Hello SARA!", result);
 }
 @Test
 void testGreetingWithAnotherName() {
  GreetingService service = new GreetingService();
  String result = service.getGreeting("Sam");
  assertEquals("Hello Sam!", result);
 }
}

