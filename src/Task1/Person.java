package Task1;

 class Person {
     public String name;
     public String address;

     // make Constructor
     public Person(String name, String address){
         this.name = name;
         this.address = address;
     }
     //metodele de returnare nume si address
    public String getName(){
         return name;
    }
    public String getAddress() {
         return address;
    }
// Metoda de setare a address
     public void setAddress(String address){
         this.address = address;
     }
//Metoda finala
 @Override
     public String toString() {
         return "Pesoana - " + name + ", adresa - " + address;
     }
}
