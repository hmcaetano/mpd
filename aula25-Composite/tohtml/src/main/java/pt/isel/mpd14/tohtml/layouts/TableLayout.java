/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pt.isel.mpd14.tohtml.layouts;

import java.util.Map;
import pt.isel.mpd14.probe.Binder;
import pt.isel.mpd14.tohtml.AbstractHtmlLayout;
import pt.isel.mpd14.tohtml.HtmlElement;
import pt.isel.mpd14.tohtml.TextNode;

/**
 *
 * @author Miguel Gamboa at CCISEL
 */
public class TableLayout extends AbstractHtmlLayout{

    @Override
    protected HtmlElement buildHeadContent(Object o) {
        /*String res = "       <title>";
        res += o.getClass();
        res += "</title>\n";
        return res;*/
        HtmlElement title = new HtmlElement("title");
        title.add(new TextNode(o.getClass().toString()));
        return title;
    }

    @Override
    protected HtmlElement buildBodyContent(Object o) {
        /*String res = "<table>\n";
        try {
            Map<String, Object> values = Binder.getFieldsValues(o);
            for (Map.Entry<String, Object> entry : values.entrySet()) {
                String k = entry.getKey();
                Object v  = entry.getValue();
                res += "          <tr>";
                res += "<td>" + k + "</td><td>" + v + "</td>";
                res += "</tr>\n";
                
            }
        } catch (IllegalArgumentException | IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }
        res += "       </table>\n";
        return res;*/
        HtmlElement table = new HtmlElement("table");
         try {
            Map<String, Object> values = Binder.getFieldsValues(o);
            for (Map.Entry<String, Object> entry : values.entrySet()) {
                String k = entry.getKey();
                Object v  = entry.getValue();
                HtmlElement tr = new HtmlElement("tr");
                tr.add(new HtmlElement("td", k));
                tr.add(new HtmlElement("td", v.toString()));
                table.add(tr);
            }
        } catch (IllegalArgumentException | IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }
         return table;
    }
    
}
