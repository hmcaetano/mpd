/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pt.isel.mpd14.alerter;

/**
 *
 * @author HelioCaetano
 */
public interface IAlert<T> {
    void alert(T elem);
}
