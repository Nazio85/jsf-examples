package pro.xway.dao;

import javax.xml.ws.Response;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ObjectFactory objectFactory = new ObjectFactory();
        Find find = objectFactory.createFind();
        find.setArg0("0");
        find.setArg1("1");
        find.setArg2("2");
        find.setArg3("3");
        find.setArg4("4");

        final ApiService apiService = new ApiService();
        Api api = (String arg0, String arg1, String arg2, String arg3, String arg4) ->
                apiService.getApiPort().find(arg0, arg1, arg2, arg3, arg4);


//        List<Contract> list = api.find();
        for (Contract contract : api.find("0", "1", "2", "3", "4")) {
            System.out.println(contract.getName());
        }
    }
}
