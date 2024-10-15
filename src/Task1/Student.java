package Task1;

class Student extends Person {
        private String program;
        private int year;
        private double fee;
//Constructor
        public Student(String name, String address, String program,int year,double fee){
            super(name, address);
            this.program = program;
            this.year = year;
            this.fee = fee;
        }
    //metodele get
    public String getProgram() { // Corrected method name
        return program;
    }

    public int getYear() {
        return year;
    }

    public double getFee() {
        return fee;
    }
    //metoda set
    public void setProgram(String program) {
        this.program = program;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

//Metoda finala din student
    @Override
    public String toString() {
        return "Pesoana - " + name + ", adresa - " + address + ", programa - " + program + ", anul - " + year + ", fee - " + fee;
    }
    }
