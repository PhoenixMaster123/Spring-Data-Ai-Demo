package org.example.springaidemo.controller.openai;

import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/openai")
@CrossOrigin(origins = "*")
public class OpenAiController {

    private final OpenAiChatModel chatModel;

    @Autowired
    public OpenAiController(OpenAiChatModel chatModel) {
        this.chatModel = chatModel;
    }

    @GetMapping("/{message}")
    public ResponseEntity<String> getAnswer(@PathVariable String message) {

        String responseMessage = chatModel.call(message);


        return ResponseEntity.ok(responseMessage);
    }
}
