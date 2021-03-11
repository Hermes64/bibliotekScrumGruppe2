package filialbiliotek.packages.Repository;

import filialbiliotek.packages.Model.Members;
import org.springframework.stereotype.Repository;

@Repository
public class BorrowerRepository implements IUsersRepository<Members> {


    @Override
    public Members read(long id) {
        return null;
    }
}
