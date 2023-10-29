package com.github.hugovallada.templatecqrshexagonal.command.infra.adapters.out;

import com.github.hugovallada.templatecqrshexagonal.command.application.ports.out.SaveTemplateOutputPort;
import com.github.hugovallada.templatecqrshexagonal.command.infra.dao.entity.Template;
import com.github.hugovallada.templatecqrshexagonal.command.infra.dao.repository.TemplateRepository;
import org.jmolecules.architecture.hexagonal.SecondaryAdapter;
import org.springframework.stereotype.Component;

@Component
@SecondaryAdapter
public class SaveTemplateOutputAdapter implements SaveTemplateOutputPort {
    private TemplateRepository templateDAO;

    @Override
    public void execute(String template) {
        final var templateToBePersisted = new Template(template);
        templateDAO.execute(templateToBePersisted);
    }
}
