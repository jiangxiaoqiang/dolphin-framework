package dolphin.test;

/**
 * @Author: jiangxiaoqiang
 * Created by 12/13/16 on 5:12 PM.
 */
public class TestProxy {
    public static void main(String[] args) {
        BookProxy bookProxy = new BookProxy();
        Book book = (Book) bookProxy.bind(new BookImpl());
        book.addBook();
    }

}
