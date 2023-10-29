package com.github.hugovallada.templatecqrshexagonal.command.infra.dao.repository;

import com.github.hugovallada.templatecqrshexagonal.command.infra.dao.entity.Template;

public interface TemplateRepository {
    void execute(Template template);
}
