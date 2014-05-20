/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pt.isel.mpd14.tohtml;

/**
 *
 * @author Miguel Gamboa at CCISEL
 */
public abstract class AbstractHtmlLayout {
    
    public final String buildPage(Object o){
    /*    String res = "<html>\n";
        res += "   <head>\n";
        res += buildHeadContent(o);
        res += "   </head>\n";
        res += "   <body>\n";
        res += buildBodyContent(o);
        res += "   </body>\n";
        res += "</html>\n";
        return res;
            */
        HtmlElement html = new HtmlElement("html"), head = new HtmlElement("head"), 
                body = new HtmlElement("body");
        html.add(head);
        head.add(buildHeadContent(o));
        html.add(body);
        body.add(buildBodyContent(o));
        return html.print();
    }
    
    protected abstract HtmlElement buildHeadContent(Object o);
    protected abstract HtmlElement buildBodyContent(Object o);   
}
