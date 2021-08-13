
import cn.hutool.core.date.DateUtil;
import lombok.Data;

import java.util.Date;

@Data
public class Hero {
    String name="Mr. lin";

    public static void main(String[] args) {
        System.out.println(new Hero().toString());
        String d="2021-8-13";
        Date date = DateUtil.parse(d);
        System.out.println(date);
    }
}
