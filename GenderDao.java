import java.util.*;

public class GenderDao {

    public static List<Gender> getAll() {

        List<Gender> genders = CommonDao.get("Gender.findAll");

        return genders;
    }
}