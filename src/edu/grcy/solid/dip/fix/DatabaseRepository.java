package edu.grcy.solid.dip.fix;

public class DatabaseRepository implements Repository{
    @Override
    public void saveTask(String task) {
        System.out.println("saving to database" + task);
    }

    @Override
    public void deleteTask(String task) {
        System.out.println("removing from DB "+ task);
    }
}
