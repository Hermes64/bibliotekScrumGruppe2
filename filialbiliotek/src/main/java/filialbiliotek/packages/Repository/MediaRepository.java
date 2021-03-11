package filialbiliotek.packages.Repository;

import filialbiliotek.packages.Model.Media;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MediaRepository implements ICrudRepository<Media> {


    @Override
    public void create(Media media) {

    }

    @Override
    public List<Media> readAll() {
        return null;
    }

    @Override
    public Media read(long id) {
        return null;
    }

    @Override
    public boolean update(Media media) {
        return false;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
