CTC getCTC_Details(){
        double base,allowances,insurance,joining,relocation;
        base=(ctc*45)/100;
        allowances=(ctc*30)/100;
        insurance=(ctc*5)/100;
        joining=(ctc*10)/100;
        relocation=(ctc*10)/100;
        System.out.println("Base: "+base);
        System.out.println("Allowances: "+allowances);
        System.out.println("Insurance: "+ insurance);
         System.out.println("Joining_bonus: "+joining);
         System.out.println("Relocation: "+relocation);
       
       
       
        CTC k = new CTC(base,allowances,insurance,joining,relocation);
        return k;
    }