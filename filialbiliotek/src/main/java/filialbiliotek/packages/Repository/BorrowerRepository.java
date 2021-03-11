package filialbiliotek.packages.Repository;

import filialbiliotek.packages.Model.Borrower;
import org.springframework.stereotype.Repository;

@Repository
public class BorrowerRepository implements IUsersRepository<Borrower> {


    @Override
    public Borrower read(long id) {
        return null;
    }
}
