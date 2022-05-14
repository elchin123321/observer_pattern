public class CallbackImpl implements TaskProgressCallBack{
    private final TaskFactory taskFactory;

    public CallbackImpl(TaskFactory taskFactory) {
        this.taskFactory = taskFactory;
    }

    @Override
    public void updateTask(Task oldTask, Task newTask) {
        taskFactory.updateTask(oldTask, newTask);
    }
}
