package prictare;

public class Person {
    public String name;
    public int age;

    public void aa(){
        System.out.println("无语了");
    }

    public void Gg(){
        int x = 10;
        class GaoBo{
            public String GaoBoName;
            public int GaoBoAge;

            public GaoBo(){
                this.GaoBoName = "高博";
                this.GaoBoAge = 25;
                Person.this.name = "人类";
                Person.this.age = 299;

            }

            public void innt(){
                System.out.println("我叫"+GaoBoName+"我属于"+Person.this.name);
                aa();
            }
        }

        GaoBo gaoBo = new GaoBo();
        gaoBo.innt();
    }
}
