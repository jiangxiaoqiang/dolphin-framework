package dolphin.test;

/**
 * @Author: jiangxiaoqiang
 * Created by 12/13/16 on 5:43 PM.
 */
public class TestCglib {
    public static void main(String[] args) {
        BookCglibPoxy cglib=new BookCglibPoxy();
        BookCglibImpl bookCglib=(BookCglibImpl)cglib.getInstance(new BookCglibImpl());
        bookCglib.addBook();
    }
}
