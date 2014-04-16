/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pt.isel.mpd14.utestfw;

/**
 *
 * @author Miguel Gamboa at CCISEL
 */
class TestStatusFailure extends TestStatus {

    final String msg;
    
    public TestStatusFailure(String name, Throwable t) {
        super(name);
        msg = t.getMessage();
    }
    
    
    @Override
    public String toString() {
        return testName +  " FAILURE - " + msg;
    }
    
}