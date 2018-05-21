package pro.xway.service.fault;

import javax.xml.ws.WebFault;

@WebFault(name = "findFault")
public class TestFault extends Exception {

    private FindFaultSimple findFaultSimple;

    public TestFault() {
    }

    public TestFault(String message) {
        super(message);
    }

    public TestFault(String message, FindFaultSimple findFaultSimple) {
        super(message);
        this.findFaultSimple = findFaultSimple;
    }
}
