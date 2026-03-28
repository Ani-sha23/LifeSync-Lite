import java.io.Serializable;

public class Habit implements Serializable {
    private String name;
    private int streak;

    public Habit(String name) {
        this.name = name;
        this.streak = 0;
    }

    public void completeToday() {
        streak++;
    }

    public String getName() {
        return name;
    }

    public int getStreak() {
        return streak;
    }

    @Override
    public String toString() {
        return name + " | Streak: " + streak;
    }
}