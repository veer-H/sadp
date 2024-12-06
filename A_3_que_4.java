// Smaller interfaces for specific task actions
interface TaskCreation {
    void createTask();
}

interface TaskDeletion {
    void deleteTask();
}

interface TaskAssignment {
    void assignTask();
}

interface TaskCompletion {
    void markTaskAsComplete();
}

// TaskManagerImpl now implements only the relevant interfaces
class TaskManagerImpl implements TaskCreation, TaskDeletion, TaskAssignment, TaskCompletion {
    @Override
    public void createTask() {
        System.out.println("Creating task...");
    }

    @Override
    public void deleteTask() {
        System.out.println("Deleting task...");
    }

    @Override
    public void assignTask() {
        System.out.println("Assigning task...");
    }

    @Override
    public void markTaskAsComplete() {
        System.out.println("Marking task as complete...");
    }
}

class TaskAssignmentImpl implements TaskAssignment {
    @Override
    public void assignTask() {
        System.out.println("Assigning task...");
    }
}

public class A_3_que_4 {
    public static void main(String[] args) {
        TaskManagerImpl manager = new TaskManagerImpl();
        manager.createTask();
        manager.assignTask();
    }
}
