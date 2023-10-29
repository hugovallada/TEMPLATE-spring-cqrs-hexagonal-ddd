package com.github.hugovallada.templatecqrshexagonal.command.infra.adapters.in;

import com.github.hugovallada.templatecqrshexagonal.command.application.ports.in.TemplateUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/template")
public class TemplateController {

    private final TemplateUseCase template;

    public TemplateController(TemplateUseCase template) {
        this.template = template;
    }

    @PostMapping
    public ResponseEntity<String> postTemplate() {
        template.execute();
        return ResponseEntity.ok("template criado");
    }


}
