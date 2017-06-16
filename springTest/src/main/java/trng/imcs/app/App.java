package trng.imcs.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import trng.imcs.bean.Employee;
import trng.imcs.bean.MyMessage;
import trng.imcs.bean.TextEditor;
import trng.imcs.config.SpringConfig;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext appContext =  new AnnotationConfigApplicationContext(SpringConfig.class);
//        basicUsage(appContext);
        
        TextEditor  textEditor = appContext.getBean(TextEditor.class);
        textEditor.setText("How");
        System.out.println("Correct spelling? " + textEditor.checkSpelling());
        System.out.println("Employee " + appContext.getBean(Employee.class));
    }
    
    static void basicUsage(ApplicationContext appContext) {
        MyMessage messageBean = appContext.getBean(MyMessage.class);
        MyMessage messageBean2 = appContext.getBean(MyMessage.class);
        System.out.println(messageBean);
        System.out.println(messageBean2);
        System.out.println(messageBean.getMessage());
    }
}
