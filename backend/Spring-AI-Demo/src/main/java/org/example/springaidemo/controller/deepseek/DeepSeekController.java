package org.example.springaidemo.controller.deepseek;

import org.springframework.ai.deepseek.DeepSeekChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/deepseek")
@CrossOrigin(origins = "*")
public class DeepSeekController {

    private final DeepSeekChatModel chatModel;

    @Autowired
    public DeepSeekController(DeepSeekChatModel chatModel) {
        this.chatModel = chatModel;
    }

    @GetMapping("/{message}")
    public ResponseEntity<String> getAnswer(@PathVariable String message) {

        String responseMessage = chatModel.call(message);


        return ResponseEntity.ok(responseMessage);
    }
}
