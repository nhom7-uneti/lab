/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B7;

import java.util.Random;

/**
 *
 * @author ASUS
 */
public class TransferMoney implements Runnable
{
 Bank bank;
 int fromAcc;
 double maxAmount;
 int delay = 1000;
 public TransferMoney(Bank bank, int fromAcc, double maxAmount) {
 this.bank = bank;
 this.fromAcc = fromAcc;
 this.maxAmount = maxAmount;
 }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 }