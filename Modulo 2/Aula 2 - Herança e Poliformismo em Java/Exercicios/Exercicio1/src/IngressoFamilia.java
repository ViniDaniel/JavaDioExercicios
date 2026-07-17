public non-sealed class IngressoFamilia extends Ingresso {

    private double value;

    public void familyTicket(int familyMembers){
        if(familyMembers > 3){
            double total = getPrice() * familyMembers;
            double desconto = total * 0.05;
            this.value = total - desconto;
        } else{
        this.value = getPrice() * familyMembers;}

    }

    public double getValue(){
       return value;
    }
}
