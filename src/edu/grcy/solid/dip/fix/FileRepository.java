package edu.grcy.solid.dip.fix;

public class FileRepository implements Repository {
    @Override
    public void saveTask(String task) {
        System.out.println("save task called from FileRepository"+task);
    }

    @Override
    public void deleteTask(String task) {
        System.out.println("delete task called from fileRepository for: "+task);
    }
}
