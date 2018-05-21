package pro.xway.converter;


import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("converterAddTwoZero")
public class ConverterAddTwoZero implements Converter {
    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        return s;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        String s = o.toString();
        System.out.println(s);

        if (!s.contains(".")) return s + ".00";
        if (s.contains(".")){
            String[] part = s.split("[.]");
            System.out.println(part[1] + " ------------------- test");
            if (part[1].length() > 2) part[1] = part[1].substring(0,2);
            return part[0] + "." + part[1];
        }

        return s;
    }
}
