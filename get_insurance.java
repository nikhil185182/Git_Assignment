    void getInsurance_Details(double insurance){

        double a = 0.6*insurance;
        System.out.println("Insurance Amount by accident =" + a);
        
        double h = 0.4*insurance;
        System.out.println("Total insurance amt by any health issue=" + h);
        if(acc == "op")
                
        double op = 0.2*h;
        System.out.println("Insurance by OP=" + op);
                
        double sur = 0.8*h;
        System.out.println("Insurance by surgery=" + sur);
        
    }
                