public class Animal_Cure {
    public class Poultry{
        protected String name,illness,symptom;
        protected int age;

        public Poultry(String name, String illness, String symptom, int age) {
            this.name = name;
            this.illness = illness;
            this.symptom = symptom;
            this.age = age;
        }
        public Poultry() {
            this.name="NULL";
            this.illness="NULL";
            this.symptom="NULL";
            this.age=-1;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setIllness(String illness) {
            this.illness = illness;
        }

        public void setSymptom(String symptom) {
            this.symptom = symptom;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getIllness() {
            return illness;
        }

        public String getSymptom() {
            return symptom;
        }

        public int getAge() {
            return age;
        }

        public void showSymptom()
        {
            System.out.println("症状为:"+symptom);
        }

        public void showMsg()
        {
            System.out.println("动物种类: "+name+"  年龄: "+age);
            System.out.println("病因: "+illness);
            showSymptom();
        }

    }
    public class Duck extends Poultry{
        public Duck(String name, String illness, String symptom, int age) {
            super(name, illness, symptom, age);
        }

        public Duck() {
            this.name="Duck";
            this.illness="NULL";
            this.symptom="NULL";
            this.age=-1;
        }
    }

    public static void main(String[] args) {
        Animal_Cure animal=new Animal_Cure();
         Poultry chicken=animal.new Poultry("chicken","感冒","发烧",5);
         Duck duck=animal.new Duck("Duck","拉肚子","蹿稀",4);
         chicken.showMsg();
         duck.showMsg();

    }
}
