package com.linghao.domain.company;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**实体类代码
 *   除了有属性之外 还要有构造方法 getter setter方法
 *
 *
 * @author zoulinghao
 * @create 2021-09-15-19:33
 * @Description If you have any questions about my code,
 * please email to linghaozou@163.com
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {
    private String id;
    private String name;

    public static void main(String[] args) {

    }
}
