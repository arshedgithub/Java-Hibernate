import java.util.*;

import org.hibernate.*;

public class CommonDao {
    
    public static List get(String nameQuery) {

        List obList = new ArrayList<>();

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            Query query = session.getNamedQuery(nameQuery);

            for (Object element : (List) query.list()) {
                obList.add(element);
            }

        } catch (HibernateException e) {
            System.out.println(e.getMessage());
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            session.close();
        }
        return obList;
    }
}
