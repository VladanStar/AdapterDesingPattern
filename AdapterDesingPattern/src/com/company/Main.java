package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // dohvatanj klasnog adaptera
        SocketAdapter socketAdapter = new SocketClassAdapterImplement();
        Volt v3 = getVolt(socketAdapter,3);
        System.out.println("dohvatanje 3 volta upotrebom  klasnog adaptera: " + v3.getVolta());
        Volt v12 = getVolt(socketAdapter,12);
        System.out.println(" Dohvatanje 12 volti : "+ v12.getVolta());
        Volt v120 = getVolt(socketAdapter,120);
        System.out.println("Dohvatanje 120 volti " + v120.getVolta());

        // objektni sa kompozicijom
        socketAdapter = new SocketObjectAdapterImplement();
         v3 = getVolt(socketAdapter,3);
        System.out.println("Objektni adapter  3 volte "+ v3.getVolta());
    }
    public static Volt getVolt(SocketAdapter socketAdapter,int i){
        switch (i){
            case 3: return socketAdapter.get3Volt();
            case 12: return socketAdapter.get12Volt();
            case 120: return socketAdapter.get120Volt();
            default: return socketAdapter.get120Volt();
        }
    }
}
