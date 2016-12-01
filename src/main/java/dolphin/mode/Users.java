package dolphin.mode;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by jiangxiaoqiang on 2016/12/1.
 */
@Data
public class Users implements Serializable {

    private String userName;

    private String password;

    private Boolean enabled;
}
