package com.github.hugovallada.templatecqrshexagonal.command.application.ports.in;

import org.jmolecules.architecture.hexagonal.PrimaryPort;

@PrimaryPort
public interface TemplateUseCase {
    void execute();
}
