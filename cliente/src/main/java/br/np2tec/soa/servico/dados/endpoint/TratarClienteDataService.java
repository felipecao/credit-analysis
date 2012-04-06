package br.np2tec.soa.servico.dados.endpoint;

import br.np2tec.soa.modelo.Cliente;
import br.np2tec.soa.servico.dados.request.NovoClienteRQ;
import br.np2tec.soa.servico.dados.response.NovoClienteRS;
import org.apache.commons.beanutils.BeanUtils;

import javax.jws.WebService;
import java.lang.reflect.InvocationTargetException;

/**
 * Created with IntelliJ IDEA.
 * User: Felipe
 * Date: 06/04/12
 * Time: 01:05
 * To change this template use File | Settings | File Templates.
 */
@WebService
public class TratarClienteDataService {

    public NovoClienteRS incluir(NovoClienteRQ r) throws InvocationTargetException, IllegalAccessException {
        Cliente cliente = new Cliente();
        BeanUtils.copyProperties(cliente, r);
        return new NovoClienteRS(true, -1, null);
    }
}
