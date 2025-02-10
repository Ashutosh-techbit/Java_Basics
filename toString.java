class laptop {

    int price;
    String model;

    // bydeafult method
    public String toString(){
        return model +" "+ price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + price;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        laptop other = (laptop) obj;
        if (price != other.price)
            return false;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        return true;
    }

    public boolean equals(laptop B){
        if(this.model.equals(B.model) && this.price == B.price ){
            return true;
        }
        else{
            return false;
        }
    }

}

public class toString{
    public static void main(String[] args) {
        laptop obj = new laptop();
        obj.model="lenovo";
        obj.price = 12000;
        
        laptop obj1 = new laptop();
        obj1.model="lenovo";
        obj1.price = 12000;

        // System.out.println(obj.toString()); 
        // output = laptop@372f7a8d
        // toString is a bydeafult method 
        // toString returns getclass().getname() + @ + hashcode 
       System.out.println( obj.equals(obj1)) ;
        System.out.println(obj);

    }
}
