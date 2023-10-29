package com.github.hugovallada.templatecqrshexagonal.command.application.ports.out;

import org.jmolecules.architecture.hexagonal.SecondaryPort;

@SecondaryPort
public interface SaveTemplateOutputPort {
    void execute(String template);
}
