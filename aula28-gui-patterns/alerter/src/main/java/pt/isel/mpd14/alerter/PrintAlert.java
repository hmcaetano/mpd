/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pt.isel.mpd14.alerter;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author HelioCaetano
 */
public class PrintAlert implements IAlert<Long>{
    private final Calendar calendar;
    
    public PrintAlert(){
        calendar = new GregorianCalendar();
    }
    
    @Override
    public void alert(Long elem) {
        calendar.setTimeInMillis(elem);
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY) + ":" +  calendar.get(Calendar.MINUTE)
                + ":" + calendar.get(Calendar.SECOND));
    }
    
}
