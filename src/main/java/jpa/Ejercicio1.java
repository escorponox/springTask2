package jpa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Carlos Coves Prieto on 2/1/15.
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring/application-context.xml");

        BeanEntityDAO dao = (BeanEntityDAO) context.getBean("dao");

        BeanEntity beanEntity1 = new BeanEntity("aaa", 1L);
        BeanEntity beanEntity2 = new BeanEntity("bbb", 2L);
        BeanEntity beanEntity3 = new BeanEntity("ccc", 3L);

        dao.addEntity(beanEntity1);
        dao.addEntity(beanEntity2);
        dao.addEntity(beanEntity3);

        System.out.println("List after 3 insert:");
        for (BeanEntity beanEntity : dao.listAll()) {
            System.out.println(beanEntity);
        }

        beanEntity3.setTitulo("modified");
        dao.updateEntity(beanEntity3);

        System.out.println("List after modifying one:");
        for (BeanEntity beanEntity : dao.listAll()) {
            System.out.println(beanEntity);
        }

        System.out.println("Deleting: Yeah I know this is fucking bad for transactionality, but this is just an exercise!!!!");
        for (BeanEntity beanEntity : dao.listAll()) {
            System.out.println(beanEntity);
            dao.deleteEntity(beanEntity);
        }

        System.out.println("List after deleting: It should be empty");
        for (BeanEntity beanEntity : dao.listAll()) {
            System.out.println(beanEntity);
        }

        ((ClassPathXmlApplicationContext) context).close();
    }
}
