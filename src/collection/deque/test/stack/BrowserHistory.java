package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    private Deque<String> history = new ArrayDeque<>();

    public void visitPage(String s) {
        history.push(s);
    }

    public String goBack() {
        return history.pop();
    }
}
