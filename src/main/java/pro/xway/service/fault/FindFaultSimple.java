package pro.xway.service.fault;

import javax.jws.WebService;

@WebService(name = "findFault")
public class FindFaultSimple {

    protected String code;
    protected String description;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
