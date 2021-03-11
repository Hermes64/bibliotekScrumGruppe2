package filialbiliotek.packages.Repository;

public interface IUsersRepository<T> {

    T read(long id);
}
