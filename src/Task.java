import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;

public class Task {
    private int value1;
    private int value2;

    public Task(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void addTask(Set<Task> tasks) {
        ArrayList<Task> tasks1 = new ArrayList<>();
        tasks1.addAll(tasks);
        int a = 0;
        for (int i = 0; i < tasks1.size(); i++) {
            if (this.getValue1() == tasks1.get(i).getValue2() && this.getValue2() == tasks1.get(i).getValue1()) {
                break;
            } else {
                a++;
            }
        }
        if (a == tasks1.size()) {
            tasks1.add(this);
        }
        tasks.addAll(tasks1);
    }


    public int getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return value1 == task.value1 && value2 == task.value2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value1, value2);
    }

    @Override
    public String toString() {
        return this.getValue1() + "*" + this.getValue2();
    }
}
