package dolphin.test.interview;

/**
 * @Author: jiangxiaoqiang
 * Created by 12/15/16 on 9:33 PM.
 */
public class HanuoTower {

    //将编号为numdisk的盘子从init杆移至desti杆
    static void moveOne(int numDisk, String init, String desti) {
        System.out.println("Move disk No. " + numDisk + " from " + init + " to " + desti);
    }

    //将numDisks个盘子从init杆借助temp杆移至desti杆
    static void move(int numDisks, String init, String temp, String desti) {
        if (numDisks == 1)
            moveOne(1, init, desti);
        else {
            move(numDisks - 1, init, desti, temp);//首先将上面的（numDisk-1）个盘子从init杆借助desti杆移至temp杆
            moveOne(numDisks, init, desti);     //然后将编号为numDisks的盘子从init杆移至desti杆
            move(numDisks - 1, temp, init, desti);//最后将上面的（numDisks-1）个盘子从temp杆借助init杆移至desti杆
        }
    }

    static void hannoi(int n, String from, String buffer, String to) {
        if (n == 1) {
            System.out.println("Move disk " + n + " from " + from + " to " + to);
        } else {
            hannoi(n - 1, from, to, buffer);
            System.out.println("Move disk " + n + " from " + from + " to " + to);
            hannoi(n - 1, buffer, from, to);
        }
    }

    public static void main(String[] args) {
        hannoi(3, "A", "B", "C");
    }

}
