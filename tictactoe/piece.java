package tictactoe;

public class piece{
    //Stores whether piece is "x" or "o"
    private String type;

    //Validates symbol is "x" or "o". If not, throws exception
    private void symbolValidation(String symbol) throws InvalidSymbol{
        if ((symbol.toUpperCase()).equals("X") || (symbol.toUpperCase()).equals("O")){
            type = symbol.toUpperCase();
        }
        else{
            throw new InvalidSymbol("Invalid Symbol");
        }
    }
    
    //Basic constructor
    public piece(){
        type = "";
    }
    
    //Overloading constructor to take in symbol, throws invalid symbol exception if symbol is not an x or o
    public piece(String symbol) {
        try{
            symbolValidation(symbol);
        }
        catch (InvalidSymbol e){
            System.out.println("Exception: " + e);
        }
    }
    
    //Returns symbol - GETTER
    public String getSymbol(){
        return type;
    }
    
    //Sets symbol - SETTER
    public void setSymbol(String symbol){
        try{
            symbolValidation(symbol);
        }
        catch (InvalidSymbol e){
            System.out.println("Exception: " + e);
        }
    }
    
    //TESTING MAIN////////////////////////////////////////////
    // public static void main(String args[]){
        // piece x = new piece("y");
        // System.out.println("Symbol is: " + x.getSymbol());
    // }
}

//Custom invalid symbol exception
class InvalidSymbol extends Exception{  
    InvalidSymbol(String s){  
        super(s);  
    }  
}  

//To compile: javac -d . piece.java, To run: java tictactoe.piece
