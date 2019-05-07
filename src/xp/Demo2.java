package xp;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;

public class Demo2 {
    public static void main(String[] args) throws Exception{
        String path = xPDemo.class.getClassLoader().getResource("xxx.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");
        Elements select = document.select("person[birth=\"four\"] gender");
        System.out.println(select);
    }
}
