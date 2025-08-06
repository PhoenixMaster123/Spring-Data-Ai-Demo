# Spring-AI-Demo

## Overview

This is a **test project** demonstrating the integration of AI models using Spring Boot. The project includes APIs for interacting with OpenAI and DeepSeek models, as well as support for Ollama, an AI that runs locally on your machine.

## Features

- RESTful API for OpenAI and DeepSeek models.
- Integration with Spring Boot for seamless development.
- Example usage of local AI models like Ollama.

## Requirements

- Java 21
- Maven
- Spring Boot 3.5.4

## Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/your-repo/Spring-AI-Demo.git
   cd Spring-AI-Demo
    ```

2. Configure your api-keys:
   - For OpenAI, sign up at [OpenAI](https://openai.com/) and obtain your API key.
   - For DeepSeek, sign up at [DeepSeek](https://deepseek.com/) and obtain your API key.
   - Ollama can be installed locally; see [Ollama Installation](https://ollama.com/docs/installation).

```bash
spring.application.name=Spring-AI-Demo

spring.ai.deepseek.api-key=sk-897258e7d65b4518bf8eea538f0dcd99
spring.ai.openai.api-key=<your-openai-api-key>
```

Note:  
For OpenAI and DeepSeek, you need to add balance to your account to use the services.

Ollama runs locally on your machine and does not require an API key.

3. Build the project:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```
   
