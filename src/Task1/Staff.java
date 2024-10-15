package Task1;

 class Staff extends Person {
     private String school;
     private double pay;

     //Constructor
     public Staff (String name, String address, String school,double pay){
         super(name, address);
         this.school = school;
         this.pay = pay;
     }

     // Metoda get
     public String getSchool(){
         return school;
     }
     public double getPay(){
         return pay;
     }
     // Metoda Seter

     public void setSchool (String school) {
         this.school = school;
     }

     public void setPay(double pay) {
         this.pay = pay;
     }
     //Metoda finala din student
     @Override
     public String toString() {
         return "Pesoana - " + name + ", adresa - " + address + ", School- " + school + ", Pay - " + pay;
     }
 }
