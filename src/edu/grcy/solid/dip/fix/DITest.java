package edu.grcy.solid.dip.fix;


public class DITest   {
    public static void main(String[] args) {
        Repository repository = new FileRepository();
        TaskService taskService = new TaskService(repository);

        taskService.addTask("aaaa.txt");
        taskService.removeTask("bbb.dat");

        System.out.println("klient zmienia decyzje chce korzystac z bazdy danych");
        repository= new DatabaseRepository();
        taskService.setRepository(repository);

        taskService.addTask("check DB connection");
    }
}
