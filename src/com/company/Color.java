package com.company;

public enum Color {
    RED("#ff0000"),
    GREEN("#00ff00"),
    BLUE("#0000ff"),
    WHITE(255,255,255),
    BLACK(0,0,0);
    String hex;
    int r,g,b;
    Color(int r,int g,int b){
        this.r=r;
        this.g=g;
        this.b=b;
        rgbTohex(r,g,b);

    }
    public static String check(int input){
        int stop=16;
        if(input<stop){
            return "0"+Integer.toHexString(input);
        }
        else {
            return Integer.toHexString(input);
        }
    }
    public static void rgbTohex(int r,int g,int b){
        String hex="#"+ check(r)+ check(g)+ check(b);
        System.out.println("Input rgb("+r+","+g+","+b+")"+" output: "+hex);

    }
    public static void hexTorgb(String hex){
        int r=Integer.parseInt(hex.substring(1,3),16);
        int g=Integer.parseInt(hex.substring(3,5),16);
        int b=Integer.parseInt(hex.substring(5,7),16);
        System.out.println("Input hex: "+hex+" output: "+"rgb("+r+","+g+","+b+")");
    }
    Color(String hex){
        this.hex=hex;
        hexTorgb(hex);
    }
}


