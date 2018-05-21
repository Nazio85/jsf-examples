package pro.xway.service;

import pro.xway.model.Contract;
import pro.xway.service.fault.FindFaultSimple;
import pro.xway.service.fault.TestFault;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public class Api {

    @WebMethod
    @WebResult(name = "getListContract")
    public Contract find(@WebParam(name = "contract") Long id) throws Exception {
        Contract contracts;
        if (id > 1000){
            contracts = new Contract();
        } else {
//            throw new TestFault("my exeption");
//            SOAPFactory soapFactory = SOAPFactory.newInstance();
//            SOAPFault soapFault = soapFactory.createFault("my exception", new QName("FaultTest"));

            FindFaultSimple findFaultSimple = new FindFaultSimple();
            findFaultSimple.setCode("code");
            findFaultSimple.setDescription("description");
            throw new TestFault("my exception", findFaultSimple);
        }
        return contracts;
    }

}
