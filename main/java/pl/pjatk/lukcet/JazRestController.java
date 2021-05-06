package pl.pjatk.lukcet;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class JazRestController {

    @GetMapping("/hello")
    public ResponseEntity<String> getHelloWorld() {
        return ResponseEntity.ok("Hello world");
    }

    @GetMapping("/model")
    public ResponseEntity<Car> getCar() {
        Car car = new Car("Audi");
        return ResponseEntity.ok(car);
    }

    @GetMapping("/hello/{someValue}")
    public ResponseEntity<String> getPathVariable(@PathVariable String someValue) {
        return ResponseEntity.ok(someValue);
    }

    @GetMapping("/hello/req")
    public ResponseEntity<String> getRequestParam(@RequestParam String someValue) {
        return ResponseEntity.ok(someValue);
    }

    @GetMapping("/hello/req2")
    public ResponseEntity<List<String>> getRequestParam(@RequestParam List<String> someValue) {
        return ResponseEntity.ok(someValue);
    }

    @PostMapping("/model")
    public ResponseEntity<Car> createCar(@RequestBody Car car) {
        return ResponseEntity.ok(car);
    }

}
