package com.zeroten.classobject.sub;

//import com.zeroten.classobject.ClassStaticImport;
//import com.zeroten.classobject.ClassStaticImport;
import static com.zeroten.classobject.ClassStaticImport.println;
import static com.zeroten.classobject.ClassStaticImport.name;
import org.testng.annotations.Test;

/**
 * @author Zr
 * @create 2020-01-27 15:14
 */
public class ClassStaticImportTest {
/*    @Test
    public void testUse1() {
        System.out.println(ClassStaticImport.name);

        ClassStaticImport.println();
    }*/


    @Test
    public void testUse2() {
        //静态导入后，可以直接使用导入的变量
        System.out.println(name);
        println();
    }
}