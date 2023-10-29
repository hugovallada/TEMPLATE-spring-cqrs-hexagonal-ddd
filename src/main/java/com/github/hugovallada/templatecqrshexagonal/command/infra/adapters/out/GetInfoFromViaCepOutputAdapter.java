package com.github.hugovallada.templatecqrshexagonal.command.infra.adapters.out;

import com.github.hugovallada.templatecqrshexagonal.command.application.ports.out.GetInfoFromViaCepOutputPort;
import org.jmolecules.architecture.hexagonal.SecondaryAdapter;
import org.springframework.stereotype.Component;

@Component
@SecondaryAdapter
public class GetInfoFromViaCepOutputAdapter implements GetInfoFromViaCepOutputPort {

    @Override
    public String execute() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'execute'");
    }

}
