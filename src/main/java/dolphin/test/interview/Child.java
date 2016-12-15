package dolphin.test.interview;

/**
 * @Author: jiangxiaoqiang
 * Created by 12/14/16 on 9:26 PM.
 */
public class Child extends Person{
    public String grade;

    public static void main(String[] args) {
        Person person = new Child();
        System.out.print("name:"+person.name);
    }
}
