class Rum extends Decorator{
    
    Rum(Offering offering){
        this.offering=offering;
    }
    String setname(){
        return offering.setname()+"with RUM";
    }
    int getprice(){
        return offering.getprice()+ 55;
    }
}