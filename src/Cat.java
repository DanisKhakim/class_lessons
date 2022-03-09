public class Cat {
    String name;
    int age;
    int weight;
    int strength;
    String color;

    public Cat(String name, String color, int age, int weight, int strength) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }
    public Cat() {

    }

    public boolean fight(Cat anotherCat) {
        int count = 0;
        int count1 = 0;

        if(this.age > anotherCat.age){
            count++;
        } else count1++;

        if(this.strength > anotherCat.strength){
            count++;
        }
        else count1++;

        if(this.weight > anotherCat.weight){
            count++;
        } else
            count1++;


        if(count >= count1) {
            return true;
        }else
            return false;
    }
    public static void main(String[] args) {
             Cat cat1 = new Cat();
             cat1.age = 8;
             cat1.weight = 8;
             cat1.strength = 8;

             Cat cat2 = new Cat();
             cat2.age = 10;
             cat2.weight = 16;
             cat2.strength = 20;

             Cat cat3 = new Cat();
             cat3.age = 12;
             cat3.weight = 14;
             cat3.strength = 11;


            if(cat1.fight(cat2)){
                 System.out.println("cat1 win, cat2 lose");
            } else if(cat2.fight(cat1)){
                System.out.println("cat2 win, cat1 lose");
            }
            if(cat1.fight(cat3)){
                System.out.println("cat1 win, cat3 lose");
            } else if(cat3.fight(cat1)){
                System.out.println("cat3 win, cat1 lose");
            }
            if(cat3.fight(cat2)){
                 System.out.println("cat3 win, cat2 lose");
            } else if(cat2.fight(cat3)){
                 System.out.println("cat2 win, cat3 lose");
            }
    }
}


