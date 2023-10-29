package com.github.hugovallada.templatecqrshexagonal.command.application;

import com.github.hugovallada.templatecqrshexagonal.command.application.ports.in.TemplateUseCase;
import com.github.hugovallada.templatecqrshexagonal.command.application.ports.out.GetInfoFromViaCepOutputPort;
import com.github.hugovallada.templatecqrshexagonal.command.application.ports.out.SaveTemplateOutputPort;

import javax.inject.Named;

@Named
public class Template implements TemplateUseCase {

    private final GetInfoFromViaCepOutputPort getInfoFromViaCep;

    private final SaveTemplateOutputPort saveTemplate;

    public Template(GetInfoFromViaCepOutputPort getInfoFromViaCepOutputPort, SaveTemplateOutputPort saveTemplate) {
        this.getInfoFromViaCep = getInfoFromViaCepOutputPort;
        this.saveTemplate = saveTemplate;
    }

    @Override
    public void execute() {
        final var cep = getInfoFromViaCep.execute();
        saveTemplate.execute(cep);
    }

}
