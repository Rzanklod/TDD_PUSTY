import kanban.Board;
import kanban.Task;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        Task task = new Task("asdasd");
        Task task2 = new Task("asdasdadasdasdsa");
        board.addTask(task);
        board.addTask(task2);
        board.print();
    }
}