package com.zhq;

import org.apache.commons.digester.Digester;

import java.io.File;

/**
 * @author ZHQ
 * @date 2021/2/15
 */
public class XmlTest {

    public static void main(String[] args) {
        Digester digester = new Digester();
        digester.setValidating(false);

        digester.addObjectCreate("department", Department.class);
        digester.addSetProperties("department");
        digester.addObjectCreate("department/user", User.class);
        digester.addSetProperties("department/user");
        digester.addSetNext("department/user", "addUser");
        digester.addCallMethod("department/extension", "putExtension", 2);
        digester.addCallParam("department/extension/property-name", 0);
        digester.addCallParam("department/extension/property-value", 1);

        try {
            Department department = (Department) digester.parse(new File("test.xml"));
            System.out.println(department);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
