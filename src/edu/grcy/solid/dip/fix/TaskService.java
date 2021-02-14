package edu.grcy.solid.dip.fix;

public class TaskService {
    Repository repository;

    /**
     * Dependency Ujection polega na wstrzyknieciu zaleznosci inaczej pol klasy
     * np. przez konstruktor
     *
     * przy DI nie uzywami w klsanie "new" do inicjowania "skladowych"
     * tylko chcemy je w jakis sposob dostac z zewnatrz
     */

    public TaskService(Repository repository){
        this.repository=repository;
    }

    public void addTask(String task) {
        repository.saveTask(task);
    }

    public void removeTask(String task){
        repository.deleteTask(task);
    }

    /**
     * Setter to tez jest sposob na depednecy injection
     */

    public void setRepository(Repository repository){
        this.repository = repository;
    }
}
