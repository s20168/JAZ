package pl.pjatk.lukcet;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homework")
public class HomeworkZjazd3 {

    @GetMapping("/getpathvariable/{someValue}")
    public ResponseEntity<String> getPathVariable(@PathVariable String someValue) {
        return ResponseEntity.ok(String.format("getPathVariable is %s", someValue));
    }

    @GetMapping("/req")
    public ResponseEntity<String> getRequestParam(@RequestParam String someValue) {
        return ResponseEntity.ok(someValue);
    }

    @PutMapping("/putpathvariable/{someValue}")
    public ResponseEntity<String> PutPathVariable(@PathVariable String someValue) {
        return ResponseEntity.ok(String.format("PutPathVariable is %s", someValue));
    }

    @PutMapping("/putrequestbody/{someValue}")
    public ResponseEntity<String> PutRequestBodyVariable(@RequestBody String someValue) {
        return ResponseEntity.ok(String.format("PutRequestBody %s", someValue));
    }

    @PostMapping("/postrequestbody/{someValue}")
    public ResponseEntity<String> PostRequestBodyVariable(@RequestBody String someValue) {
        return ResponseEntity.ok(String.format("PostRequestBody %s", someValue));
    }

    @DeleteMapping("/deletevariable/{someValue}")
    public ResponseEntity<HttpStatus> DeleteVariable(@PathVariable String someValue) {
        return ResponseEntity.ok(HttpStatus.OK);
    }

}
